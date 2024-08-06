package com.jung.info.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/api/board")
class BoardRestController {

    static List<Map<String, String>> boardList = new ArrayList<>();
    static int boardNo = 0;



    static {
        for (int i = 0; i < 3; i++) {
            Map<String, String> board = new HashMap<>();
            board.put("boardNo", boardNo + "");
            board.put("title", "title" + boardNo);
            board.put("content", "content" + boardNo);
            board.put("writer", "writer" + boardNo);

            boardNo++;

            boardList.add(board);
        }
    }

    // /api/board <<<
    @GetMapping
    public List<Map<String, String>> list() {
        return boardList;
    }

    // /api/board/1123123
    @GetMapping("{boardNo}")
    public Map<String, String> view(@PathVariable int boardNo) {
        System.out.println(boardNo);
        return null;
    }

    // /api/board
    @PostMapping
    public Map<String, String> register(@RequestBody Map<String, String> body) {

        return null;
    }

    // /api/board/1123123
    @PutMapping("{boardNo}")
    public String update(@PathVariable int boardNo, @RequestBody Map<String, String> body) {
        return null;
    }

    // /api/board/1123123
    @DeleteMapping("{boardNo}")
    public String delete(@PathVariable int boardNo) {
        return null;
    }

    
}