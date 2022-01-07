package com.example.board.service;

import com.example.board.domain.dto.BoardDto;
import com.example.board.domain.service.BoardService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardServiceTests {

    @Autowired
    private BoardService boardService;

    @Test
    public void testRegister(){

        BoardDto dto = BoardDto.builder()
                .title("Test")
                .content("test")
                .writerEmail("user55@aaa.com")
                .build();

        Long bno = boardService.register(dto);
    }

    @Test
    public void testRemove(){
        Long bno = 95L;

        boardService.removeWithReplies(bno);
    }

    @Test
    public void testModify(){
        BoardDto boardDto = BoardDto.builder()
                .bno(2L)
                .title("제목 변경")
                .content("내용 변경")
                .build();

        boardService.modify(boardDto);
    }
}
