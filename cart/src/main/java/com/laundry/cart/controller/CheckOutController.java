package com.laundry.cart.controller;

import com.laundry.cart.model.Checkout;
import com.laundry.cart.model.Item;
import com.laundry.cart.repository.CheckOutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class CheckOutController {
    @Autowired
    private CheckOutRepository checkOutRepository;

    @PostMapping("/checkout")
    Checkout newCheckOut(@RequestBody Checkout newCheckout) {
        return checkOutRepository.save(newCheckout);
    }
    @GetMapping("/checkouts")
    List<Checkout> getAllCheckouts(){
        return checkOutRepository.findAll();
    }
}
