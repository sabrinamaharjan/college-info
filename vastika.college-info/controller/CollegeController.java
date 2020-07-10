package controller;

import model.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.CollegeService;

import java.util.List;

@Controller
@RequestMapping("/colleges")
public class CollegeController {
	@Autowired
	private CollegeService collegeService;

	@GetMapping
	public String findAllCollege(Model model) {
		final List<College> colleges = collegeService.getAllCollege();
		model.addAttribute("colleges", colleges);
		return "list-college";
	}

	@RequestMapping(value = "/add_college")
	public String createCollege() {
		return "addCollege";
	}

	@RequestMapping(value = "/save_college", method = RequestMethod.POST)
	public String saveCollege(@ModelAttribute College college) {
		collegeService.createCollege(college);
		return "addCollege";
	}

	@PutMapping
	public String updateCollege(@RequestParam Long id) {
		final College returnedCollege = collegeService.updateById(id);
		return "redirect:colleges";
	}

	@DeleteMapping
	public String deleteCollege(@RequestParam Long id) {
		collegeService.deleteById(id);
		return "redirect:colleges";
	}

}
