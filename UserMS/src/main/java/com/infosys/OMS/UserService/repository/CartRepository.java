package com.infosys.OMS.UserService.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.infosys.OMS.UserService.entity.Cart;
import com.infosys.OMS.UserService.entity.WishListId;

public interface CartRepository extends CrudRepository<Cart, WishListId>{
	public Optional<Cart> findByBuyerIdAndProductId(String buyerId, String prodId);
	List<Cart> findByBuyerId(String buyerId);
}
