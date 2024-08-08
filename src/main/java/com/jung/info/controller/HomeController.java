package com.jung.info.controller;

import com.jung.info.mapper.TestMapper;
import com.jung.info.service.TestService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;


@Controller
@RequiredArgsConstructor
@RequestMapping
//@AllArgsConstructor
class HomeController {

    final private TestService testService;

    private Logger logger = LoggerFactory.getLogger("HomeController");

    @GetMapping
    public String index(HttpServletRequest request, Model model) {
        Date now = testService.now();
        String s = testService.stringTest();
        logger.info("now" + now.toString());
        model.addAttribute("anna", s);
//        model.addAttribute("anna", now.toString());
        return "index";
    }

}