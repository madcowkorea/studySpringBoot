package com.example.study.service;

import com.example.study.domain.dto.Study;
import com.example.study.domain.request.StudyRequest;
import com.example.study.domain.request.StudyUpdateRequest;
import com.example.study.domain.response.StudyResponse;
import com.example.study.repository.StudyRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudyService {
    private final StudyRepository studyRepository;

    public StudyService(StudyRepository studyRepository){
        this.studyRepository = studyRepository;
    }

    @Transactional(readOnly = true)
    public List<StudyResponse> getStudy(){
        return studyRepository.findAll().stream()
                .map(StudyResponse::new)
                .collect(Collectors.toList());
    }
    @Transactional
    public StudyRequest saveStudy(
            StudyRequest request
    )throws IllegalArgumentException {
        studyRepository.save(new Study(request.getData()));
        return request;
    }
    @Transactional
    public StudyUpdateRequest updateStudy(
            StudyUpdateRequest updateRequest
    )throws IllegalArgumentException{
        Study study = studyRepository.findById(updateRequest.getId())
                .orElseThrow(IllegalArgumentException::new);
        study.updateData(updateRequest.getData());
        return updateRequest;
    }
    @Transactional
    public String deleteStudy(
            String data
    )throws IllegalArgumentException{
        Study study = studyRepository.findByData(data)
                .orElseThrow(IllegalArgumentException::new);
        studyRepository.delete(study);
        return data;
    }
}
