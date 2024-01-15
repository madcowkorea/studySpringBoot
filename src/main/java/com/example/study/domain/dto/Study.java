package com.example.study.domain.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Entity
@NoArgsConstructor
@Table(name = "study_tb")
public class Study {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String data;

    public Study(String data) throws IllegalArgumentException {
        if(data == null || data.isBlank()){
            throw new IllegalArgumentException(String.format("data 가 비어있습니다"));
        }
        this.data = data;
    }

    public void updateData(String data){
        this.data = data;
    }
}
