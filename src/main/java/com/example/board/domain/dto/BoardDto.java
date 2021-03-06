package com.example.board.domain.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDto {

    private Long bno;

    private String title;

    private String content;

    private String writerEmail;

    private String WriterName;

    private LocalDateTime regDate;

    private LocalDateTime modDate;

    private int replyCount;
}
