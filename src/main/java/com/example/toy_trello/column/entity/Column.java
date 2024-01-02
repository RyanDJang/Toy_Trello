package com.example.toy_trello.column.entity;

import com.example.toy_trello.domain.board.entity.Board;
import jakarta.persistence.*;
import lombok.Getter;


@Getter
@Entity
@Table(name = "columns")
public class Column {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Board board;

    @jakarta.persistence.Column(name = "column_order") // name은 임의대로 설정 가능.
    private Long order;

    public Column() {
    }

    // 생성자를 통해 id 할당
    public Column(Long id, String name, Board board, Long order) {
        this.id = id;
        this.name = name;
        this.board = board;
        this.order = order;
    }

    public Column(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // 보드 및 카드와 관계설정

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setOrder(Long order) {
        this.order = order;
    }
}



