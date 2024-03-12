package com.param.Contest.FakeStoreApi;


import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/carts")
public class CartController {
    private final CartService fakeservice;

    public CartController(CartService fakeservice) {
        this.fakeservice = fakeservice;
    }

    @GetMapping("")
    public List<Cart> getCarts(@RequestParam Map<String,String> params){
        String startdate= "1000-03-02";
        String enddate = "1000-03-02";
        if (params.containsKey("startdate")){
            startdate=params.get("startdate");
        }
        if (params.containsKey("enddate")){
            enddate=params.get("enddate");
        }
        return fakeservice.getCarts(startdate, enddate);
    }

    @GetMapping("/{id}")
    public Cart getCartById(@PathVariable Long id){
        return fakeservice.getCartById(id);
    }

    @DeleteMapping("/{id}")
    public Cart deleteCart(@PathVariable Long id){
        return fakeservice.deleteCart(id);
    }

    @PutMapping("/{id}")
    public Cart updateCart(@PathVariable Long id, @RequestBody Cart newCart){
        return fakeservice.updateCart(id, newCart);
    }

    @PostMapping("")
    public Cart createCart(@RequestBody Cart newCart){
        return fakeservice.createCart(newCart);
    }

    @GetMapping("/user/{userId}")
    public List<Cart> getCartByUserId(@PathVariable Long userId){
        return fakeservice.getCartByUserId(userId);
    }


}
