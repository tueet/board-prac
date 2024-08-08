package com.jung.info.service;

import com.jung.info.dto.BoardDto;
import com.jung.info.mapper.BoardMapper;
import com.jung.info.mapper.TestMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {
    private BoardMapper boardMapper;

    @Override
    public List<BoardDto> getBoardAllSearch() {
        return boardMapper.getBoardAllSearch();
    }

    @Override
    public BoardDto getBoardSearch(int no) {
        return boardMapper.getBoardSearch(no);
    }

    @Override
    public boolean deleteBoard(int no) {
        return boardMapper.deleteBoard(no) == 1;
    }

    @Override
    public boolean updateBoard(BoardDto boardDto) {
        return boardMapper.updateBoard(boardDto) == 1;
    }

    @Override
    public boolean insertBoard(BoardDto boardDto) {
        return boardMapper.insertBoard(boardDto) == 1;
    }
}
