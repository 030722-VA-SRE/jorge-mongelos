package com.revature.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.revature.DTOs.ItemsDTO;
import com.revature.models.Items;
import com.revature.persistence.ItemsRepository;
import com.revature.persistence.UsersRepository;

@Service
public class ItemsServices {
	
	private ItemsRepository ir;
	private UsersRepository ur;
	private static Logger log = LoggerFactory.getLogger(ItemsServices.class);
	
	@Autowired
	public ItemsServices(ItemsRepository ir, UsersRepository ur) {
		super();
		this.ir = ir;
		this.ur = ur;
	}
	
	public ItemsDTO getItemsById(int id){
		
		Items item = ir.getById(id);
		log.info(MDC.get("userToken"));
		return ItemsDTO(item);
	}//End getItemById()

	private ItemsDTO ItemsDTO(Items item) {
		
		log.info(MDC.get("userToken"));
		return ItemsDTO(item);
	}
	
	@Transactional
	public Items createItems(Items newItem) {
		
		return ir.save(newItem);
		
	}//End createItems
	
	public List<Items> getAll(){
		
		log.info(MDC.get("userToken"));
		return ir.findAll();
		
	}//End getAll()
	
	@Transactional
	public Items updateItems(int id, Items item) {
		
		return ir.save(item);
		
	}//End updateItems()
	
	@Transactional
	public void deleteItems(int id) {
		
		getItemsById(id);
		
		ir.deleteById(id);
		
	}//End deleteItems()
	
	
	
	
	
	

}
