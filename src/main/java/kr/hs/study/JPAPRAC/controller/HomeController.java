package kr.hs.study.JPAPRAC.controller;

import kr.hs.study.JPAPRAC.dto.myuserDTO;
import kr.hs.study.JPAPRAC.service.myuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private myuserService service;

    @GetMapping("/")
    public String list_All(Model model) {
        List<myuserDTO> list2 = service.list();
        System.out.println("size: "+list2.size());
        model.addAttribute("list1", list2);
        return "result";
    }
}
