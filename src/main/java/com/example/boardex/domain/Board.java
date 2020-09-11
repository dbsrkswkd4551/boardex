package com.example.boardex.domain;

import lombok.*;
import org.springframework.beans.factory.annotation.Required;

import java.sql.Date;

@Getter
@Setter
@EqualsAndHashCode(of = "boardNo")
public class Board{

    private int boardNo;
    private String title;
    private String content;
    private String writer;
    private Date regDate;


}
