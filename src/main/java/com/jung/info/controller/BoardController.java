package com.jung.info.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@AllArgsConstructor
@RequestMapping("/board")
class BoardController {

    @GetMapping
    public String list() {
        return "board/list";
    }

    @GetMapping("/{boardNo}")
    public void view(@PathVariable int boardNo, Model model) {

    }


}