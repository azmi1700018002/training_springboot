package com.market.market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.market.market.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {

    
}