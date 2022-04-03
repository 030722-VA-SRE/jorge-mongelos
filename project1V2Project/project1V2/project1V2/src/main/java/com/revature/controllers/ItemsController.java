package com.revature.controllers;

import org.jboss.logging.MDC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.revature.DTOs.ItemsDTO;
import com.revature.DTOs.UsersDTO;
import com.revature.models.Items;
import com.revature.models.Users;
import com.revature.services.ItemsServices;

@RestController
@RequestMapping("/items")
public class ItemsController {
	
	private ItemsServices ir;
	private static Logger log =LoggerFactory.getLogger(ItemsController.class);
	
	@Autowired
	public ItemsController(ItemsServices ir) {
		super();
		this.ir = ir;
	}
	
	@GetMapping
	public ResponseEntity<List<Items>> getAll(){
		
		log.info((String) MDC.get("userToken"));
		return new ResponseEntity<>(ir.getAll(), HttpStatus.OK);
		
	}//End getAll()
	
	@GetMapping("/{id}")
	public ResponseEntity<ItemsDTO> getById(@PathVariable("id") int id){
		
		if(id == -1) {
			
			return new ResponseEntity<>(HttpStatus.FORBIDDEN);
			
		}//End if
		
		ItemsDTO u = ir.getItemsById(id);
		
		log.info((String) MDC.get("userToken"));
		return new ResponseEntity<>(u, HttpStatus.OK);
		
	}//End getById()
	
	@PostMapping
	public ResponseEntity<String> createUser(@RequestBody Items item){
		
		Items i = ir.createItems(item);
		return new ResponseEntity<>("User " + i.getItemName() + " has been created", HttpStatus.CREATED);
		
	}//End createUser()
	
	@PutMapping("/{id}")
	public ResponseEntity<Items> updateItems(@RequestBody Items item, @PathVariable("id") int id){
		
		log.warn("[insert user info here] tried to access endpoint /users/id");
		return new ResponseEntity<>(ir.updateItems(id,  item), HttpStatus.CREATED);
		
	}//End updateUser()
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> DeleteById(@PathVariable("id") int id){
		
		ir.deleteItems(id);
		return new ResponseEntity<>("Item was deleted", HttpStatus.OK);
		
	}//End DeleteById
	
	
	
	

}
