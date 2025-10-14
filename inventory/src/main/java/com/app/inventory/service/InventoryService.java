package com.app.inventory.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.inventory.model.Item;
import com.app.inventory.repository.InventoryRepository;

@Service
public class InventoryService {
    // DI
    private final InventoryRepository inventoryRepository;

    // konstruktor
    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    // method getItem
    public List<Item> getAllItems(){
        return inventoryRepository.ambilSemua();
    }

    // simpan
    public Item addItem(Item item){
        return inventoryRepository.simpan(item);
    }

    public Item getItemById(Long id) {
        return inventoryRepository.getItemById(id);
    }
}
