package com.example.serverdevplace.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "devplace_courses")
public class CourseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "facul")
    private String faculty;

    @Column(name = "format")
    private String format;

    @Column(name = "start")
    private String start;

    @Column(name = "grafic")
    private String grafic;

    @Column(name = "places")
    private String places;

}
