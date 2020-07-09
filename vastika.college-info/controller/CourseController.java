package controller;

import model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.CourseService;

import java.util.List;

@Controller
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping
    public String findAllCourse(Model model) {
        final List<Course> courses = courseService.getAllCourse();
        model.addAttribute("courses", courses);
        return "list-course";
    }

    @PostMapping
    public String createCourse(@RequestBody Course Course) {
        final Course returnedCourse = courseService.createCourse(Course);
        return "redirect:courses";
    }

    @PutMapping
    public String updateCourse(@RequestParam Long id) {
        final Course returnedCourse = courseService.updateById(id);
        return "redirect:courses";
    }

    @DeleteMapping
    public String deleteCourse(@RequestParam Long id) {
        courseService.deleteById(id);
        return "redirect:courses";
    }

}
