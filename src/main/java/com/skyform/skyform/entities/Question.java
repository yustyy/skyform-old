package com.skyform.skyform.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    private Form form;

    @Column(name = "question_text")
    private String questionText;

    @ManyToOne
    private QuestionType questionType;

    @Column(name = "question_order")
    private int questionOrder;

    @OneToMany(mappedBy = "question")
    private List<QuestionOption> questionOptions;

    @OneToMany(mappedBy = "question")
    private List<TextQuestionResponse> textQuestionResponses;

    @OneToMany(mappedBy = "question")
    private List<DateQuestionResponse> dateQuestionResponses;

    @OneToMany(mappedBy = "question")
    private List<OptionQuestionResponse> optionQuestionResponses;
}
