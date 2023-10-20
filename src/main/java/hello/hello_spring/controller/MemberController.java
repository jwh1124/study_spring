package hello.hello_spring.controller;

import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService MemberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.MemberService = memberService;
    }
}