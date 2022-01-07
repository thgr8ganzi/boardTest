package com.example.board.domain.service;

import com.example.board.domain.dto.BoardDto;
import com.example.board.domain.entity.Board;
import com.example.board.domain.entity.Member;

public interface BoardService {

//    입력
    Long register(BoardDto dto);

//    삭제
    void removeWithReplies(Long bno);

//    수정
    void modify(BoardDto dto);

    default Board dtoToEntity(BoardDto dto){
        Member member = Member.builder().email(dto.getWriterEmail()).build();

        Board board = Board.builder()
                .bno(dto.getBno())
                .title(dto.getTitle())
                .content(dto.getContent())
                .writer(member)
                .build();
        return board;
    }



}
