package com.chilan.demo.Inventory;

import jakarta.persistence.SqlResultSetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/InventoryItem")
public class InventoryController {

    private final inventoryservice inventoryservice;
@Autowired
    public InventoryController(com.chilan.demo.Inventory.inventoryservice inventoryservice) {
        this.inventoryservice = inventoryservice;
    }

    @GetMapping
    public List<InventoryItem> getInventoryItem() {

return inventoryservice.getInventoryItem();

    }
}
