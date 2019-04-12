package com.nodedynamics.cartservices.service.cart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.WebSession;

import com.google.gson.Gson;
import com.nodedynamics.cartservices.model.cart.CartModel;
import com.nodedynamics.cartservices.repo.CartRepository;
import com.nodedynamics.cartservices.service.BaseService;
import com.nodedynamics.cartservices.common.Global;
import com.nodedynamics.cartservices.model.common.ResponseModel;

import reactor.core.publisher.Mono;

@Service
public class CartService implements BaseService<CartModel>{

Logger log = LoggerFactory.getLogger(CartService.class);
	
	//private WebSession Session;
	
	@Autowired
	private CartRepository repo;
	
	@Autowired
	Gson gson = new Gson();
	
	
	@Override
	public void Init(WebSession session) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mono<String> Store(CartModel Model) {
		
		//RETURN RESPONSE MODEL
		String ReturnMessage = null;
		
		//SAVE MODEL
		repo.save(Model);
		
		ReturnMessage=gson.toJson(repo.findTopByOrderByCreatedDesc());
		
		return Mono.just(ReturnMessage);
	}

	@Override
	public Mono<String> Update(CartModel Model) {
		repo.save(Model);
		return Mono.just(gson.toJson(Model));
	}

	@Override
	public Mono<String> DeleteAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<String> Delete(CartModel Model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<String> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<String> Get(CartModel Model) {
		// TODO Auto-generated method stub
		return null;
	}

}
