package com.param.Contest.FakeStoreApi;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;


@Service
public class CartService {
    private String url = "https://fakestoreapi.com/carts";
    private final RestTemplate restTemplate;

    public CartService() {
        this.restTemplate = new RestTemplate();
    }

    public List<Cart> getCarts(String startdate, String enddate){
        String callurl= url;
        if(!startdate.equals("1000-03-02")){
            callurl+="?startdate="+startdate;
        }
        if(!enddate.equals("1000-03-02")){
            callurl+="&enddate="+enddate;
        }

        Cart[] carts = restTemplate.getForObject(url, Cart[].class);
        if(carts!=null){
            return Arrays.stream(carts).collect(Collectors.toList());
        }
        return null;
    }

    public Cart getCartById(Long id){
        Cart cart= restTemplate.getForObject(url+"/"+id, Cart.class);
        return cart;
    }

    public Cart deleteCart(Long id){
        Cart cart = getCartById(id);
        if(cart != null)
            restTemplate.delete(url+"/"+id);
        return cart;
    }

    public Cart updateCart(Long id, Cart newCart){
        Cart cart = getCartById(id);
        if(cart != null) {
            restTemplate.put(url+"/"+id, newCart);
        }
        return newCart;
    }

    public Cart createCart(Cart newCart){
        return restTemplate.postForObject(url, newCart, Cart.class);
    }

    public List<Cart> getCartByUserId(Long userId){
        Cart[] carts = restTemplate.getForObject(url+"/user/"+userId, Cart[].class);
        assert carts != null;
        return  Arrays.stream(carts).collect(Collectors.toList());
    }
}
