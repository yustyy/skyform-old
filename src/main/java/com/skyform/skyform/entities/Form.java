package com.skyform.skyform.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "forms")
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private int id;

    @ManyToOne
    private User formCreator;

    @ManyToOne
    private Event event;

    @Column(name ="name")
    private String name;

    @Column(name ="description")
    private String description;

    @Column(name ="creation_date")
    private Date creationDate;

    @Column(name ="start_date")
    private Date startDate;

    @Column(name ="end_date")
    private Date endDate;

    @OneToMany(mappedBy = "form")
    private List<Question> questions;
}
