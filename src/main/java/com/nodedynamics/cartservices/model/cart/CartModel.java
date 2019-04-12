package com.nodedynamics.cartservices.model.cart;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nodedynamics.cartservices.model.CoreModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@Builder
public class CartModel  extends CoreModel{
	
	
	 @Id
	 private String cartID;
	 private LocalDateTime created;
	 private String dateUpdated;
	 private String cartStatus;
	 private String userID;
	 private List<CartProductModel>cartProducts;//this is used to store the products in the cart

}
