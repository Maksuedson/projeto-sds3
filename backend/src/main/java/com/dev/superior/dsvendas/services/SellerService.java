package com.dev.superior.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.superior.dsvendas.dto.SellerDTO;
import com.dev.superior.dsvendas.entities.Seller;
import com.dev.superior.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repo;
	
	public List<SellerDTO> findAll(){
		List<Seller> result = repo.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}

}
