package nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.controller;

import nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.entity.Address;
import nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {


	@Autowired
	AddressService addressService;

	@PostMapping("/api/address")
	public void saveAddress(@RequestBody Address address){
		addressService.saveAddress((address));
	}
}
