package com.app.inventory.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.app.inventory.model.Item;

@Repository
public class InventoryRepository {
 // data
 private final Map<Long, Item> items = new HashMap<>(); 
 // counter untuk ID
 private Long idCounter = 1L;
 
 // method akses ke database
 public List<Item> ambilSemua(){
    return new ArrayList<>(items.values());
 }

 // simpan data 
    public Item simpan(Item item){
        item.setId(idCounter++);
        items.put(item.getId(), item);
        return item;
    }

    public Item getItemById(Long id) {
        return items.get(id);
    }   

}
