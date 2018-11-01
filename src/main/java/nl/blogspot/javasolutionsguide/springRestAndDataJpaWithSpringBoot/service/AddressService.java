package nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.service;

import nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.entity.Address;
import org.springframework.web.bind.annotation.PostMapping;

public interface AddressService {
	public void saveAddress(Address address);
}
