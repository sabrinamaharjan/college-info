package service;

import model.Course;

import java.util.List;

public interface CourseService {

    Course createCourse(Course course);

    List<Course> getAllCourse();

    Course getCourseById(Long id);

    Course updateById(Long id);

    void deleteById(Long id);


}
