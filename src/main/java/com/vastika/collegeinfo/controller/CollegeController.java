package com.vastika.collegeinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vastika.collegeinfo.model.College;
import com.vastika.collegeinfo.service.CollegeService;

import java.util.List;

@Controller
public class CollegeController {
	
	@Autowired
	private CollegeService collegeService;

	@RequestMapping("/add_college")
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

	@GetMapping
	public String findAllCollege(Model model) {
		final List<College> colleges = collegeService.getAllCollege();
		model.addAttribute("colleges", colleges);
		return "list-college";
	}

}
