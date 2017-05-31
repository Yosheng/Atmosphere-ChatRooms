package com.question;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {
    
    @RequestMapping("/")
    public String toIndex(Model model, HttpServletRequest request) {
        return "index";
    }
}
