package com.nodedynamics.cartservices.model.cart;

import com.nodedynamics.cartservices.model.CoreModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@Builder
public class CartProductModel extends CoreModel{
	
	private String cartTaxID;
	private String cartSubTotal;
	private String cartTotal;
	private String productID;

}
