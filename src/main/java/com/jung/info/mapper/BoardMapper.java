package com.jung.info.mapper;

import com.jung.info.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardDto> getBoardAllSearch();
    BoardDto getBoardSearch(int no);
    int deleteBoard(int no);
    int updateBoard(BoardDto boardDto);
    int insertBoard(BoardDto boardDto);
}
