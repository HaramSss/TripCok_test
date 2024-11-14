package com.tripcok.tripcok.member.controller;

import com.tripcok.tripcok.member.dto.MemberRequestDto;
import com.tripcok.tripcok.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    /* 회원가입 */
    @PostMapping
    public ResponseEntity<?> createMember(@RequestBody MemberRequestDto.save request) {
        return memberService.createMember(request);
    }

    /* 로그인 */
    @PutMapping("/login")
    public ResponseEntity<?> login(@RequestBody MemberRequestDto.login request) {
        return memberService.loginMember(request);
    }

    /* 회원 정보 조회 */
    @GetMapping("/{memberId}")
    public ResponseEntity<?> getMemberInfo(@PathVariable Long memberId) {
        return memberService.getMemberInfo(memberId);
    }

    /* 회원 정보 수정 */
    @PutMapping("/{memberId}")
    public ResponseEntity<?> updateMember(@PathVariable Long memberId, @RequestBody MemberRequestDto.update request) {
        return memberService.updateMember(request);
    }

    @DeleteMapping("/{memberId}")
    public ResponseEntity<?> deleteMember(@PathVariable Long memberId) {
        return memberService.deleteMember(memberId);
    }

}
