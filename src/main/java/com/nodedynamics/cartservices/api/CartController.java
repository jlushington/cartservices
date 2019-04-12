package com.nodedynamics.cartservices.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import com.nodedynamics.cartservices.model.cart.CartModel;
import com.nodedynamics.cartservices.service.cart.CartService;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/api/cart")
public class CartController {
	
	Logger log = LoggerFactory.getLogger(CartController.class);
	
	@Autowired
	Gson gson;
	
	@Autowired
	CartService service;
	
	@PostMapping(value = "/addtocart", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<String> AddLocation(@RequestBody String request){
    	return service.Store(gson.fromJson(request, CartModel.class));
    }
	

	@PostMapping(value = "/updatecart", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<String> UpdateCart(@RequestBody String request){
    	return service.Update(gson.fromJson(request, CartModel.class));
    }
	
	@PostMapping(value = "/getcart", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<String> GetCart(@RequestBody String request){
    	return service.Get(gson.fromJson(request, CartModel.class));
    }


}
