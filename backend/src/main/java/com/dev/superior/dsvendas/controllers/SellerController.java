package com.dev.superior.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.superior.dsvendas.dto.SellerDTO;
import com.dev.superior.dsvendas.services.SellerService;

@RestController
@RequestMapping("/sellers")
public class SellerController {
	
	@Autowired
	private SellerService service;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>>findAll(){
		List<SellerDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}

}
