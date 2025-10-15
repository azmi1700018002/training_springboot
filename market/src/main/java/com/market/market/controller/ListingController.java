package com.market.market.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.market.market.dto.ListingRequest;
import com.market.market.service.ListingService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/listing")
@AllArgsConstructor
public class ListingController {
    // service listing
    ListingService listingService;

    // post data
    @PostMapping
    public ResponseEntity simpanListing(@RequestBody ListingRequest entity){
        return ResponseEntity.ok(listingService.tambahListing(entity));
    }

    // get data
    @GetMapping
    public ResponseEntity<?> tampilListing(){
        return ResponseEntity.ok(listingService.tampilListing());
    }
}
