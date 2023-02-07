package com.example.serverdevplace.repos;

import com.example.serverdevplace.models.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<CourseModel, Long> {
    CourseModel findByFacultyAndFormat(String faculty, String format);
}
