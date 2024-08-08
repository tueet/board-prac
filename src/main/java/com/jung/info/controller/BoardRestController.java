package com.jung.info.controller;

import com.jung.info.dto.BoardDto;
import com.jung.info.service.BoardService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/board")
class BoardRestController {

    final private BoardService boardService;

    // /api/board <<<
    @GetMapping
    public List<BoardDto> list() {
        return boardService.getBoardAllSearch();
    }

    // /api/board/1123123
    @GetMapping("{boardNo}")
    public BoardDto view(@PathVariable int boardNo) {
        return boardService.getBoardSearch(boardNo);
    }

    // /api/board
    @PostMapping
    public boolean register(@RequestBody BoardDto boardDto) {
        return boardService.insertBoard(boardDto);
    }

    // /api/board/1123123
    @PutMapping("{boardNo}")
    public boolean update(@PathVariable int boardNo, @RequestBody BoardDto updates) {
        updates.setNo(boardNo);
        return boardService.updateBoard(updates);
    }

    // /api/board/1123123
    @DeleteMapping("{boardNo}")
    public boolean delete(@PathVariable int boardNo) {
        return boardService.deleteBoard(boardNo);
    }
}