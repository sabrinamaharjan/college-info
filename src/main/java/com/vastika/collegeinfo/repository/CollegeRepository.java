package com.vastika.collegeinfo.repository;

import java.util.List;

import com.vastika.collegeinfo.model.College;

public interface CollegeRepository {

    //crud
    void createCollege(College college);

    List<College> getAllCollege();

    College getCollegeById(Long id);

    College updateById(Long id);

    void deleteById(Long id);


}
