package com.example.boardex.domain;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class Member {
    private final String userId;
    private final String password;
    private String userName;
}
