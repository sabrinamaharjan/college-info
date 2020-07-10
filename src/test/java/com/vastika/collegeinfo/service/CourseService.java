package com.vastika.collegeinfo.service;

import java.util.List;

import com.vastika.collegeinfo.model.Course;

public interface CourseService {

    Course createCourse(Course course);

    List<Course> getAllCourse();

    Course getCourseById(Long id);

    Course updateById(Long id);

    void deleteById(Long id);


}
