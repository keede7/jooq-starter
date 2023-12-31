package com.example.jooqstarter.entity;

import com.example.jooqstarter.dto.ModifyNameRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/member")
public class MemberController {

    private final MemberQueryRepository memberQueryRepository;

    @GetMapping("/test1")
    public void test1() {
        System.out.println("memberQueryRepository.getList1() = " + memberQueryRepository.getList1());
    }

    @GetMapping("/test2")
    public void test2() {
        memberQueryRepository.getList2("test@@@");
    }

    @GetMapping("/update")
    public void test3(@ModelAttribute ModifyNameRequest modifyNameRequest) {
        memberQueryRepository.modifyName(modifyNameRequest);
    }
}
