package com.stanley.techie.inventoryservice.service;

import com.stanley.techie.inventoryservice.dto.InventoryResponse;
import com.stanley.techie.inventoryservice.model.Inventory;
import com.stanley.techie.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public List<InventoryResponse> isInStock(List<String> skuCode ) {
        List<Inventory> inventoryList = inventoryRepository.findBySkuCodeIn(skuCode);
        List<InventoryResponse> inventoryResponsesList = inventoryList.stream().map(inventory ->
            InventoryResponse.builder()
                    .skuCode(inventory.getSkuCode())
                    .isInStock(inventory.getQuantity() > 0)
                    .build()
        ).toList();
        return inventoryResponsesList;
    }

}
