package com.infosys.OMS.UserService.service;

import java.util.List;

import com.infosys.OMS.UserService.dto.BuyerDTO;
import com.infosys.OMS.UserService.dto.CartDTO;
import com.infosys.OMS.UserService.dto.SellerDTO;
import com.infosys.OMS.UserService.dto.WishlistDTO;
import com.infosys.OMS.UserService.exception.UserMSException;

public interface UserService {
    
	public String buyerRegistration(BuyerDTO buyerDTO) throws UserMSException;
	public String buyerLogin(String email, String password) throws UserMSException;
	public String sellerRegistration(SellerDTO sellerDTO) throws UserMSException;
	public String sellerLogin(String email, String password) throws UserMSException;
	public String deleteBuyer(String id) throws UserMSException;
	public String deleteSeller(String id) throws UserMSException;
	public String addProductsToWishList(WishlistDTO wishlist) throws UserMSException;
	public void deleteProductFromWishlist(WishlistDTO wishlist) throws UserMSException;
	public String moveToCart(WishlistDTO wishlist,Integer quantity) throws UserMSException;
	public String addToCart(String prodId, String buyerId, Integer quantity)throws UserMSException;
	public void removeFromCart(String buyerId,String productId) throws UserMSException;
	public List<WishlistDTO> getAllProductsFromWishlist(String buyerId) throws UserMSException;
	public List<CartDTO> getAllProductsFromCart(String buyerId) throws UserMSException;
	public String updateRewardPoint(String buyerId, Integer rewPoints) throws UserMSException ;
}
