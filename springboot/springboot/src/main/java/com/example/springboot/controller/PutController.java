package com.example.springboot.controller;


import com.example.springboot.dto.MemberDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {

    @PutMapping("/member")
    public String putMember(@RequestBody Map<String, Object> putData){
        StringBuilder sb = new StringBuilder();

        putData.entrySet().forEach(map->{
            sb.append(map.getKey() + " : " + map.getValue()+ "\n");
        });

        return sb.toString();
    }

    public String putMemberDto1(@RequestBody MemberDTO memberDTO){
        return memberDTO.toString();
    }

    public MemberDTO putMemberDto2(@RequestBody MemberDTO memberDTO) {
        return memberDTO;
    }

    public ResponseEntity<MemberDTO> putMemberDto3(@RequestBody MemberDTO memberDTO){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(memberDTO);
    }
}
