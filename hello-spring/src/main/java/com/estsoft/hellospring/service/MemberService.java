package com.estsoft.hellospring.service;

import com.estsoft.hellospring.controller.Member;
import com.estsoft.hellospring.controller.MemberDTO;
import com.estsoft.hellospring.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class MemberService {
        @Autowired
        private MemberRepository memberRepository;  // 빈 주입

        public List<MemberDTO> getAllMembers() {
            List<Member> memberList = memberRepository.findAll();
            System.out.println(memberList);
            List<MemberDTO> resultList = memberList.stream()
                    .map(member -> new MemberDTO(member.getId(),member.getName())).toList();
            return resultList;    // 멤버 목록 얻기
        }
    }

