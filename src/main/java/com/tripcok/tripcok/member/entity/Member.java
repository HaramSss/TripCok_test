package com.tripcok.tripcok.member.entity;

import com.tripcok.tripcok.member.dto.MemberRequestDto;
import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;

@Table(name = "member")
@Getter
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String name;

    private String password;

    private LocalDate birthday;

    private String phone;

    @Enumerated(EnumType.STRING)
    private Gender gender;

//    @OneToMany(mappedBy = "member", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private List<Board> board;

    public Member(MemberRequestDto.save member) {
        this.email = member.getEmail();
        this.name = member.getName();
        this.password = member.getPassword();
        this.birthday = member.getBirthday();
        this.phone = member.getPhone();
        this.gender = member.getGender();
    }

    public Member() {
    }

    public Member update(MemberRequestDto.update memberRequest) {
        this.email = memberRequest.getEmail();
        this.name = memberRequest.getName();
        this.password = memberRequest.getPassword();
        this.birthday = memberRequest.getBirthday();
        this.phone = memberRequest.getPhone();
        this.gender = memberRequest.getGender();
        return this;
    }
}