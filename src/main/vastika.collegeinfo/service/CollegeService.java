package service;

import model.College;

import java.util.List;

public interface CollegeService {

    College createCollege(College college);

    List<College> getAllCollege();

    College getCollegeById(Long id);

    College updateById(Long id);

    void deleteById(Long id);


}
