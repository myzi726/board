package com.study.board.service;

import com.study.board.entity.Board;
import com.study.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired //DI, 스프링 빈이 알아서 읽어와서 주입해준다
    private BoardRepository boardRepository;

    public void write(Board board) {

        boardRepository.save(board);
    }
}
