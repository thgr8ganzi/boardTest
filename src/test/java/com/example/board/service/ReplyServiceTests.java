package com.example.board.service;

import com.example.board.domain.dto.ReplyDto;
import com.example.board.domain.service.ReplyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ReplyServiceTests {

    @Autowired
    private ReplyService replyService;

    @Test
    public void testModify2(){
        ReplyDto replyDto = ReplyDto.builder()
                .rno(300L)
                .text("테스트")
                .replyer("손님")
                .build();

        replyService.modify2(replyDto);
    }
}
