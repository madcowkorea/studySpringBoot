package com.example.study.domain.request;

import com.example.study.domain.dto.Study;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public class StudyRequest {
    private String data;

    public StudyRequest(String data){
        this.data = data;
    }
}
