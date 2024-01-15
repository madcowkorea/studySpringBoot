package com.example.study.domain.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class StudyUpdateRequest {
    private long id;
    private String data;

    public StudyUpdateRequest(long id , String data){
        this.id = id;
        this.data = data;
    }
}
