package kr.hs.study.JPAPRAC.controller;

import kr.hs.study.JPAPRAC.dto.myuserDTO;
import kr.hs.study.JPAPRAC.service.myuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TestController {
    @Autowired
    private myuserService service;

    @GetMapping("/write")
    public String write() {
        return "write_form";
    }

    @PostMapping("/add_done")
    public String add_done(myuserDTO dto) {
        service.insert(dto);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        service.delete(id);
        return "redirect:/";
    }
}
