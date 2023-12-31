package model;
// Generated 13-Nov-2023 11:42:54 by Hibernate Tools 4.3.1



/**
 * Student generated by hbm2java
 */
public class Student  implements java.io.Serializable {


     private Integer id;
     private String givenName;
     private String lastName;
     private String gender;
     private String subject;

    public Student() {
    }

    public Student(String givenName, String lastName, String gender, String subject) {
       this.givenName = givenName;
       this.lastName = lastName;
       this.gender = gender;
       this.subject = subject;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getGivenName() {
        return this.givenName;
    }
    
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getSubject() {
        return this.subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }




}


