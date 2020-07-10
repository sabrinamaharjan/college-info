package com.vastika.collegeinfo.model;

public class Course {
	private Long id;
	private String courseName;
	private int courseNumber;
	private String description;

	public Course() {
	}

	public Course(Long id, String courseName, int courseNumber, String description) {
		this.id = id;
		this.courseName = courseName;
		this.courseNumber = courseNumber;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Course{" + "id=" + id + ", courseName='" + courseName + '\'' + ", courseNumber=" + courseNumber
				+ ", description='" + description + '\'' + '}';
	}
}