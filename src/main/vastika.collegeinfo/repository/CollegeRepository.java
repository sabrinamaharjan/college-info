package repository;

import model.College;

import java.util.List;

public interface CollegeRepository {

    //crud
    College createCollege(College college);

    List<College> getAllCollege();

    College getCollegeById(Long id);

    College updateById(Long id);

    void deleteById(Long id);


}
