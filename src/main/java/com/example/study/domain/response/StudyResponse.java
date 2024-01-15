package com.example.study.domain.response;

import com.example.study.domain.dto.Study;
import lombok.Getter;

@Getter
public class StudyResponse {
    private long id;

    private String data;

    public StudyResponse(Study study) {
        this.id = study.getId();
        this.data = study.getData();
    }
}
