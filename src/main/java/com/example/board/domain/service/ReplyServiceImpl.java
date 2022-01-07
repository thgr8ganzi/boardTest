package com.example.board.domain.service;

import com.example.board.domain.dto.ReplyDto;
import com.example.board.domain.entity.Reply;
import com.example.board.domain.repository.BoardRepository;
import com.example.board.domain.repository.ReplyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Log4j2
public class ReplyServiceImpl implements ReplyService{

    private final BoardRepository boardRepository;

    private final ReplyRepository replyRepository;

    @Transactional
    @Override
    public void modify2(ReplyDto dto) {
        Reply reply = replyRepository.getOne(dto.getRno());

        reply.changeText(dto.getText());
        reply.changereplyer(dto.getReplyer());

        replyRepository.save(reply);
    }
}
