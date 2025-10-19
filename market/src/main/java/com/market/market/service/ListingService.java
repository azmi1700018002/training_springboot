package com.market.market.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.market.market.dto.ListingRequest;
import com.market.market.dto.ListingResponse;
import com.market.market.model.Listing;
import com.market.market.repository.ListingRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ListingService {
    
    //repo
    private final ListingRepository listingRepository;

    // fungsi tambah data
    @Transactional
    public String tambahListing(ListingRequest request) {
        Listing baru = new Listing();
        baru.setJudul(request.judul());
        baru.setDeskripsi(request.deskripsi());
        baru.setHarga(request.harga());
        baru.setKategori(request.kategori());
        baru.setUsername(request.username());
        baru.setNohp(request.nohp());

        //simpan ke db
        listingRepository.save(baru);

        return "Berhasil menambahkan listing";
    }

    // ambil data listing
    @Transactional
    public ListingResponse tampilListing() {
        Optional<Listing> listing = listingRepository.findAll().stream().findFirst();
        return listing.map( val ->new ListingResponse(val.getJudul(),
        val.getDeskripsi(), val.getHarga())).orElse(null);  
    }
}
