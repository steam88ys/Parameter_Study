package kr.hs.study.Parameter_Study.controller;

import kr.hs.study.Parameter_Study.dto.study;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class studyController {
    @PostMapping("/test1")
    public String test1(@ModelAttribute study t) {
        System.out.println("id: " + t.getId());
        System.out.println("pass: " + t.getPass());
        System.out.println("name: " + t.getName());
        System.out.println("content: " + t.getContent());
        return "result";
    }
}
