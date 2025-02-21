package com.example.quiz.service;

import com.example.quiz.entity.Quiz;

import java.util.Optional;

/**
 * PackageName  : com.example.quiz.service
 * Author       : shlim
 * Date         : 2025-02-21
 * Description  : Quiz 서비스: Service
 */


public interface QuizService {

    /** 등록된 모든 퀴즈 정보를 가져옵니다. */
    Iterable<Quiz> selectAll();

    /** id를 키로 사용해 퀴즈 정보를 한 건 가져옵니다. */
    Optional<Quiz> selectOneById(Integer id);

    /** 퀴즈 정보를 랜덤으로 한 건 가져옵니다. */
    Optional<Quiz> selectOneRandomQuiz();

    /** 퀴즈의 정답/오답 여부를 판단합니다. */
    Boolean checkQuiz(Integer id, Boolean myAnswer);

    /** 퀴즈를 등록합니다. */
    void insertQuiz(Quiz quiz);

    /** 퀴즈를 변경합니다. */
    void updateQuiz(Quiz quiz);

    /** 퀴즈를 삭제합니다. */
    void deleteQuizById(Integer id);

}
