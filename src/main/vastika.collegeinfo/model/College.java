package model;

import java.util.Date;
import java.util.List;

public class College {
    private Long id;
    private String name;
    private String phonr;
    private String deanName;
    private Date estd;

    private Address address;
    private List<Course> courses;

    public College() {
    }

    public College(Long id, String name, String phonr, String deanName, Date estd) {
        this.id = id;
        this.name = name;
        this.phonr = phonr;
        this.deanName = deanName;
        this.estd = estd;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getPhonr() {
        return phonr;
    }

    public void setPhonr(String phonr) {
        this.phonr = phonr;
    }

    public String getDeanName() {
        return deanName;
    }

    public void setDeanName(String deanName) {
        this.deanName = deanName;
    }

    public Date getEstd() {
        return estd;
    }

    public void setEstd(Date estd) {
        this.estd = estd;
    }

    @Override
    public String toString() {
        return "College{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phonr='" + phonr + '\'' +
                ", deanName='" + deanName + '\'' +
                ", estd=" + estd +
                '}';
    }
}
