package com.estsoft.hellospring.controller;

import com.estsoft.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    public class MemberController {

        @Autowired
        private MemberService memberService;	    // 빈 주입

        @GetMapping("/members")
        @ResponseBody
        public List<MemberDTO> getAllMembers() {
            return memberService.getAllMembers();
        }
    }

