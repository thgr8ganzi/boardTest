package com.example.board.domain.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReplyDto {

    private Long rno;

    private String text;

    private String replyer;

    private Long bno;

    private LocalDateTime redate;

    private LocalDateTime modDate;
}
