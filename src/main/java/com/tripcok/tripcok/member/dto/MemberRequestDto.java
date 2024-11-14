package com.tripcok.tripcok.member.dto;

import com.tripcok.tripcok.member.entity.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class MemberRequestDto {

    @Data
    public static class save {
        private String email;
        private String name;
        private String password;
        private LocalDate birthday;
        private String phone;
        private Gender gender;
    }

    @Data
    public static class login {
        private String email;
        private String password;
    }

    @Data
    public static class update {
        private String email;
        private String name;
        private String password;
        private LocalDate birthday;
        private String phone;
        private Gender gender;
    }
}