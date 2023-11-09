package com.chilan.demo.Inventory;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class inventoryservice {
    private final InventoryRepository inventoryRepository;

    public inventoryservice(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public List<InventoryItem> getInventoryItem() {
      return inventoryRepository.findAll();


    }
}
