/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Thomas
 */
public abstract class Programming {
    private String courseName;
    private String courseNumber;
    private double credits;

    public String getCourseName() {
        return courseName;
    }

    public abstract void setCourseName(String courseName); 
        
    

    public String getCourseNumber() {
        return courseNumber;
    }

    public abstract void setCourseNumber(String courseNumber);

    public double getCredits() {
        return credits;
    }

    public abstract void setCredits(double credits);
}

