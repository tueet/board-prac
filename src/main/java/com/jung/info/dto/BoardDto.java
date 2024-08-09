package com.jung.info.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class BoardDto {
    private int no;
    private String title;
    private String content;
    private String writer;
}
