package com.app.inventory.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.inventory.model.Item;
import com.app.inventory.service.InventoryService;

@RestController
//url default
@RequestMapping("/api/internal")
public class internalController {
    // service
    private final InventoryService inventoryService;

    // konstruktor
    public internalController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    // get data inventory
    @GetMapping
    public List<Item> getInventory() {
        return inventoryService.getAllItems();
    }

    // post data inventory
    @PostMapping
    public Item addItem(Item item) {
        return inventoryService.addItem(item);
    }

    //getById
    @GetMapping("/{id}")
    public Item getItemById(@PathVariable Long id) {
        return inventoryService.getItemById(id);
    }
}
