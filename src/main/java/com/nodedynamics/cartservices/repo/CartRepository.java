package com.nodedynamics.cartservices.repo;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.nodedynamics.cartservices.model.cart.CartModel;



public interface CartRepository  extends MongoRepository<CartModel, String>{
	
	CartModel findTopByOrderByCreatedDesc();
	

}

