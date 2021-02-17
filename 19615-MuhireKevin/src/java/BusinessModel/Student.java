/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel;

import java.io.Serializable;
import java.text.DecimalFormat; 
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;

/**
 *
 * @author alice
 */
@Entity
public class Student implements Serializable{
    @Id
    @Column(unique = true, nullable = false)
    private String studentId;
    private String name;
    
    @Enumerated(EnumType.STRING)
    private Gender gender;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateofbirth;
    
    @ManyToMany(cascade = CascadeType.ALL, fetch= FetchType.EAGER)
    @JoinTable(name="STUDENT_REGISTRATION", joinColumns={@JoinColumn(name="STUDENT_ID")}, inverseJoinColumns = @JoinColumn(name = "COURSE_ID"))
    private List<Course> courses = new ArrayList<>();

    public Student() {
    }

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public Student(String studentId, String name, Gender gender, Date dateofbirth) {
        this.studentId = studentId;
        this.name = name;
        this.gender = gender;
        this.dateofbirth = dateofbirth;
    }
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    
    public void registerCourse(Course course){
        courses.add(course);
    }
    public void removeCourse(Course course){
        courses.remove(course);
    }
    public boolean isExist(String code){
        boolean isexist = false;
        for (Course c: courses){
            if(c.getCode().equals(code))
                isexist = true;
        }
        return isexist;
    }
    public  int numberOfCourses(){
        return courses.size();
    }
    
    public  int TotalnumberOfCredits(){
        int total = 0;
        for (Course course : courses){
            total += course.getCredits();
        }
        return total;
    }
    public String totalPayment(){
        double fee = 0.0;
        for(Course course : courses) {
            fee += course.getCourseFee();
        }
        DecimalFormat formatter = new DecimalFormat("###,###,###.##Frw");
        return formatter.format(fee);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.studentId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.studentId, other.studentId)) {
            return false;
        }
        return true;
    }
    
    
}
