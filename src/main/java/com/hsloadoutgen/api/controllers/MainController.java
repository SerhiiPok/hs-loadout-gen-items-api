package com.hsloadoutgen.api.controllers;

import com.hsloadoutgen.api.config.ItemsConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hs-loadout-gen")
public class MainController {

    @Autowired
    private ItemsConfig itemsConfig;

    @GetMapping(value = "/get-all-items")
    public String getAllItems() {
        if (itemsConfig.getItemsXMLString() == null) {
            return "error: could not load items";
        } else {
            return itemsConfig.getItemsXMLString();
        }
    }

}
