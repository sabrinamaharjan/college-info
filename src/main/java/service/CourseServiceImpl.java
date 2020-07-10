package service;

import model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import repository.CourseRepository;

import java.util.List;

public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository CourseRepository;

    @Override
    public Course createCourse(Course Course) {
        final Course returnedCourse = CourseRepository.createCourse(Course);
        return returnedCourse;
    }

    @Override
    public List<Course> getAllCourse() {
        final List<Course> CourseList = CourseRepository.getAllCourse();

        return CourseList;
    }

    @Override
    public Course getCourseById(Long id) {
        final Course CourseById = CourseRepository.getCourseById(id);

        return CourseById;
    }

    @Override
    public Course updateById(Long id) {
        final Course updateById = CourseRepository.updateById(id);
        return updateById;
    }

    @Override
    public void deleteById(Long id) {
        CourseRepository.deleteById(id);

    }
}
