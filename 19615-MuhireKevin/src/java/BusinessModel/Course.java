/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


/**
 *
 * @author alice
 */
@Entity
public class Course  implements Serializable{
    @Id
    @Column(unique = true, nullable = false)
    private String code;
//    @Column(unique = true, nullable = false)
    private String Names;
    @Column(nullable = false)
    private int credits;
    
    private double courseFee;
    
    @ManyToMany(mappedBy= "courses", cascade= CascadeType.ALL)
    private List<Student> students = new ArrayList<>();
    
    // Default constructor
    public Course() {
    }
    
    // Parameterized constructor
    public Course(String code, String Names, int credits, double courseFee) {
        this.code = code;
        this.Names = Names;
        this.credits = credits;
        this.courseFee = courseFee;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.code);
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
        final Course other = (Course) obj;
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
        return true;
    }
   
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNames() {
        return Names;
    }

    public void setNames(String Names) {
        this.Names = Names;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    
}
