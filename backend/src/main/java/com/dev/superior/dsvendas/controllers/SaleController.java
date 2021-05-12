package com.dev.superior.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.superior.dsvendas.dto.SaleDTO;
import com.dev.superior.dsvendas.dto.SaleSuccessDTO;
import com.dev.superior.dsvendas.dto.SaleSumDTO;
import com.dev.superior.dsvendas.services.SaleService;

@RestController
@RequestMapping("/sales")
public class SaleController {

	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>>findAll(Pageable pageable){
		Page<SaleDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
		
	}
	
	@GetMapping("/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupBySeller(){
		List<SaleSumDTO> list = service.amountGroupBySeller();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupBySeller(){
		List<SaleSuccessDTO> list = service.successGroupBySeller();
		return ResponseEntity.ok(list);
	}	
}
