package com.app.inventory.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//url default
@RequestMapping("/api/external")
public class externalController {
    
    //Gunakan bean
    private final String appPesan;

    // bean diambil berdasarkan tipe data
    public externalController(@Qualifier("appPesan") String appPesan) {
        this.appPesan = appPesan;
    }

    @GetMapping
    public String getPesan() {
        return appPesan;
    }

}
