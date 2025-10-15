package com.market.market.service;

import org.springframework.stereotype.Service;

import com.market.market.dto.MemberRequest;
import com.market.market.model.Member;
import com.market.market.repository.MemberRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MemberService {
    //repo
    private final MemberRepository memberRepository;

    //fungsi tambah data
    @Transactional
    public String tambahMember(MemberRequest request) {
        Member baru = new Member();
        baru.setNama(request.nama());
        baru.setAlamat(request.alamat());
        baru.setFavorit(request.favorit());
        baru.setNohp(request.nohp());

        //simpan ke db
        return "Berhasil menambahkan member";
    }
    
}
