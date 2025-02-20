package com.example.quiz.repository;

import com.example.quiz.entity.Quiz;
import org.springframework.data.repository.CrudRepository;

/**
 * PackageName  : com.example.quiz.repository
 * Author       : shlim
 * Date         : 2025-02-20
 * Description  : Quiz 테이블: RepositoryImpl
 */

public interface QuizRepository extends CrudRepository<Quiz, Integer> {

}
