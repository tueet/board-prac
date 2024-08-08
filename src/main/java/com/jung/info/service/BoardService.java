package com.jung.info.service;

import com.jung.info.dto.BoardDto;

import java.util.List;

public interface BoardService {
    List<BoardDto> getBoardAllSearch();
    BoardDto getBoardSearch(int no);
    boolean deleteBoard(int no);
    boolean updateBoard(BoardDto boardDto);
    boolean insertBoard(BoardDto boardDto);
}
