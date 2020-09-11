package com.example.boardex.domain;

import lombok.*;
import org.springframework.beans.factory.annotation.Required;

import java.sql.Date;

@RequiredArgsConstructor
@ToString
public class Board{

    @NonNull
    private int boardNo;
    private String title;
    private String content;
    private String writer;
    private Date regDate;


}
