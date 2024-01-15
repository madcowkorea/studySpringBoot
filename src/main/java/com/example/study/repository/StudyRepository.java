package com.example.study.repository;

import com.example.study.domain.dto.Study;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudyRepository extends JpaRepository<Study , Long>{
    Optional<Study> findByData(String data);
}
