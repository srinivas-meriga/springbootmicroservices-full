package com.stanley.techie.inventoryservice.controller;

import com.stanley.techie.inventoryservice.dto.InventoryResponse;
import com.stanley.techie.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    //http://localhost:8082/api/inventory/iphone_15,iphone_15_blue
    //http://localhost:8082/api/inventory/?sku-code=iphone_15&sku-code=iphone_15_blue
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode) {
        return inventoryService.isInStock(skuCode);
    }


}
