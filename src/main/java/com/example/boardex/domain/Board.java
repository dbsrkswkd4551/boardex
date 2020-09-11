package com.example.boardex.domain;

import lombok.*;
import org.springframework.beans.factory.annotation.Required;

import java.sql.Date;

@NoArgsConstructor
@RequiredArgsConstructor
public class Board{

    private int boardNo;
    @NonNull
    private String title;
    private String content;
    private String writer;
    private Date regDate;


}
