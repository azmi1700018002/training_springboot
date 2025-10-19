package com.market.market.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "listings")
public class Listing {
    // atribut
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String judul;
    private String deskripsi;
    private double harga;
    private String kategori;
    private String username;
    private String nohp;

    // @Lob
    // private byte[] foto;

}
