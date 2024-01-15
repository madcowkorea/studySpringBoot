package com.example.study.controller;

import com.example.study.domain.request.StudyRequest;
import com.example.study.domain.request.StudyUpdateRequest;
import com.example.study.domain.response.StudyResponse;
import com.example.study.service.StudyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudyController {

    private final StudyService studyService;

    public StudyController(StudyService studyService){
        this.studyService = studyService;
    }

    @GetMapping("/study")
    public List<StudyResponse> getStudy(){
        return studyService.getStudy();
    }

    @PostMapping("/post/study")
    public StudyRequest saveStudy(
            @RequestBody StudyRequest request
    )throws IllegalArgumentException {
        return studyService.saveStudy(request);
    }

    @PutMapping("/put/study")
    public StudyUpdateRequest updateStudy(
            @RequestBody StudyUpdateRequest updateRequest
    )throws IllegalArgumentException{
        return studyService.updateStudy(updateRequest);
    }

    @DeleteMapping("/delete/study")
    public String deleteStudy(
            @RequestParam("data") String data
    )throws IllegalArgumentException{
       return studyService.deleteStudy(data);
    }
}
