package com.stream.app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class Course {

    @Id
    private String id;

    private String title;

//    @OneToMany(mappedBy = "course")
//    private List<Video> list = new ArrayList<>();
}
