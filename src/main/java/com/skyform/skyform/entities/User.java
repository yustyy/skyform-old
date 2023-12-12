package com.skyform.skyform.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "formCreator")
    private List<Form> forms;

    @OneToMany(mappedBy = "responder")
    private List<OptionQuestionResponse> optionQuestionResponses;

    @OneToMany(mappedBy = "responder")
    private List<DateQuestionResponse> dateQuestionResponses;

    @OneToMany(mappedBy = "responder")
    private List<TextQuestionResponse> textQuestionResponses;

}
