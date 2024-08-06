package com.jung.info.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequiredArgsConstructor
@RequestMapping
class HomeController {

    private Logger logger = LoggerFactory.getLogger("HomeController");

    @GetMapping
    public String index(HttpServletRequest request, Model model) {
        logger.info("index");

        return "index";
    }

}