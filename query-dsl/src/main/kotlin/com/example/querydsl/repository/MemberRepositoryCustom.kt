package com.example.querydsl.repository

import com.example.querydsl.domain.Member
import com.example.querydsl.dto.MemberDto
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface MemberRepositoryCustom {

    fun search(username: String?, age: Int?): Member
    fun search(username: String?, age: Int?, page: Pageable): Page<MemberDto>

}