package com.market.market.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.market.market.dto.MemberRequest;
import com.market.market.service.MemberService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/member")
@AllArgsConstructor
public class MemberController {
    // service member
    MemberService memberService;

    // post data
    @PostMapping
    public ResponseEntity simpanMember(@RequestBody MemberRequest entity){
        return ResponseEntity.ok(memberService.tambahMember(entity));
    }

    
}
