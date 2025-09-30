/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBL;

/**
 *
 * @author Shenal Manelka
 */
public class PatientBookingDB {
    private String name;
    private String age;
    private String contactNumber;
    private String gender;
    private String city;
    private String category;
    
    public String getName(){
       return name;
    }
    public void setName (String name){
       this.name=name;
    }
    
    public String getAge(){
        return age;
    }
    public  void setAge(String age){
        this.age =age;
    }
    public String getContactNumber(){
       return contactNumber;
    }
    public void setContactNumber (String contactNumber){
       this.contactNumber=contactNumber;
    }
    
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    
    public String getCity(){
        return city;
    }
    public void setCity (String city){
        this.city = city;
    }
    
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category=category;
    }
}
