package com.niit.RestDemo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.HBSpringDemo.*;
import com.niit.HBSpringDemo.service.ItemService;
import com.niit.HBSpringDemo.model.*;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/item")   
@CrossOrigin(origins = "http://localhost:4200")

public class ItemController {



	@Autowired
	private ItemService itemService;
	
	
	
	@GetMapping
	public List<Item> listAllItem() {
		
		  List<Item> item=itemService.findAllItems();//
		//, HttpStatus.CREATED);
		  return item;
	}
	
	
	@PostMapping
	public ResponseEntity<Void> addItem(@RequestBody Item item) {
		
			itemService.addItem(item);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}
	
	
	

	
}
