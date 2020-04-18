package org.cap.controller;

import java.util.List;


import org.cap.dto.ProductDto;

import org.cap.entities.Product;
import org.cap.exceptions.ProductNotFoundException;
import org.cap.service.IProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class ProductRestController {
	
	
	@Autowired
	private IProductService productService;
	
	
	
	@PostMapping("/product_details/add")
    public ResponseEntity<Product> addProduct(@RequestBody ProductDto dto) {
        Product product= convert(dto);
        product=productService.addProduct(product);
        ResponseEntity<Product> response = new ResponseEntity<>(product, HttpStatus.OK);
        return response;
    }

    Product convert(ProductDto dto) {
       Product product=new Product();
       product.setProductName(dto.getProductName());
       product.setProductPrice(dto.getProductPrice());
	return product;
       
    }
    
    
    @GetMapping("/product_details")
    public ResponseEntity<List<Product>> fetchAll() {
 List<Product> product=productService.fetchAllProduct();
        ResponseEntity<List<Product>> response = new ResponseEntity<>(product, HttpStatus.OK);
        return response;
    }
    
    
    
    @GetMapping("/product_details/find/{id}")
    		public ResponseEntity<Product> getProduct(@PathVariable("id") int productId) {
        Product product=productService.findById(productId);
        if (product==null)
        {
            ResponseEntity<Product> response= new ResponseEntity<>(HttpStatus.NOT_FOUND);
           return response;
        }
        ResponseEntity<Product> response = new ResponseEntity<>(product, HttpStatus.OK);
        return response;
    }
    
    
    
   @PutMapping("/product_details/update/{id}")
   public ResponseEntity<Product> updateProduct(@RequestBody ProductDto dto ,@PathVariable("id") int productId)
   {
	   Product product=convert(dto);
	   product.setProductId(productId);
	   productService.updateProduct(product);
	   ResponseEntity<Product> response = new ResponseEntity<>(product, HttpStatus.OK);
       return response;
	   
   }
@DeleteMapping("/product_details/delete/{id}")
public ResponseEntity<String> deleteProduct(@PathVariable("id") int productId)
{
	String result=productService.deleteProduct(productId);
	ResponseEntity<String> response=new ResponseEntity<>(result, HttpStatus.OK);
    return response;
	   
	
}
   

  @ExceptionHandler(ProductNotFoundException.class)
   public ResponseEntity<String> handleProductNotFound(ProductNotFoundException exception)
   {
	   String exceptionMsg=exception.getMessage();
	   ResponseEntity<String> response=new ResponseEntity<>(exceptionMsg, HttpStatus.NOT_FOUND);
	   return response;
	   

    

}
   @ExceptionHandler(Throwable.class)
   public ResponseEntity<String> handleaException(Throwable exception)
   {
	   String msg="something went wrong";
	   ResponseEntity<String> response=new ResponseEntity<>(msg, HttpStatus.INTERNAL_SERVER_ERROR);
	   return response;
	   
}

}
