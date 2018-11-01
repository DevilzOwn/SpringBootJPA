package nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.service;

import nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.entity.Address;
import nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressRepository addressRepository;

	@Override
	public void saveAddress(Address address) {
		addressRepository.save(address);
	}
}
