package com.vastika.collegeinfo.repository;

import java.util.List;

import com.vastika.collegeinfo.model.Course;

public interface CourseRepository {

    //crud
    Course createCourse(Course course);

    List<Course> getAllCourse();

    Course getCourseById(Long id);

    Course updateById(Long id);

    void deleteById(Long id);


}
