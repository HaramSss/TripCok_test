package com.tripcok.tripcok.member.dto;

import com.tripcok.tripcok.member.entity.Gender;
import com.tripcok.tripcok.member.entity.Member;
import lombok.Data;
import lombok.Getter;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
public class MemberResponseDto {

    @Data
    public static class Member {
        private String email;
        private String name;
        private String password;
        private LocalDate birthday;
        private String phone;
        private Gender gender;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        public Member(Member member) {
            this.email = member.getEmail();
            this.name = member.getName();
            this.password = member.getPassword();
            this.birthday = member.getBirthday();
            this.phone = member.getPhone();
            this.gender = member.getGender();
            this.createdAt = member.getCreatedAt();
            this.updatedAt = member.getUpdatedAt();
        }

        public Member(com.tripcok.tripcok.member.entity.Member updateMember) {
        }
    }
}
