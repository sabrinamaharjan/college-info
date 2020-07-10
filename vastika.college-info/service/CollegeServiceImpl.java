package service;

import model.College;
import org.springframework.beans.factory.annotation.Autowired;
import repository.CollegeRepository;

import java.util.List;

public class CollegeServiceImpl implements CollegeService {
	@Autowired
	private CollegeRepository CollegeRepository;

	@Override
	public void createCollege(College College) {
		CollegeRepository.createCollege(College);

	}

	@Override
	public List<College> getAllCollege() {
		final List<College> CollegeList = CollegeRepository.getAllCollege();

		return CollegeList;
	}

	@Override
	public College getCollegeById(Long id) {
		final College CollegeById = CollegeRepository.getCollegeById(id);

		return CollegeById;
	}

	@Override
	public College updateById(Long id) {
		final College updateById = CollegeRepository.updateById(id);
		return updateById;
	}

	@Override
	public void deleteById(Long id) {
		CollegeRepository.deleteById(id);

	}
}
