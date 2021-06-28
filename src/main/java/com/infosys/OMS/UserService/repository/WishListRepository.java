package com.infosys.OMS.UserService.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.infosys.OMS.UserService.entity.WishList;
import com.infosys.OMS.UserService.entity.WishListId;

public interface WishListRepository extends CrudRepository<WishList, WishListId>{
	
	public Optional<WishList> findByBuyerIdAndProductId(String buyerId, String productId);

	List<WishList> findByBuyerId(String buyerId);
}
