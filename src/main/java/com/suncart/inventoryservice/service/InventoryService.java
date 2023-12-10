package com.suncart.inventoryservice.service;

import com.suncart.inventoryservice.model.Inventory;
import com.suncart.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    public boolean isInStock(String skuCode){
        return inventoryRepository.findBySkuCode().isPresent();
    }
}
