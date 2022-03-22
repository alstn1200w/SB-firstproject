package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Getter
public class Article {

    @Id // 대표값을 지정! Like a 주민등록번호
    @GeneratedValue // 1, 2, 3 ....자동 생성 어노테이션
    private Long id;

    @Column
    private String title;

    @Column
    private String content;
}
