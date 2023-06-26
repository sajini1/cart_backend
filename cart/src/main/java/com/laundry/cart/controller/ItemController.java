package com.laundry.cart.controller;

import com.laundry.cart.model.Item;
import com.laundry.cart.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;

    @PostMapping("/item")
    Item newItem(@RequestBody Item newItem){
        return itemRepository.save(newItem);
    }
    @GetMapping("/items")
    List<Item> getAllItems(){
        return itemRepository.findAll();
    }

}
