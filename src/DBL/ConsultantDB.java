/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBL;

/**
 *
 * @author Shenal Manelka
 */
public class ConsultantDB {
    private  String name;
    private  String email;
    private  String contactNumber;
    private  String category;
    
   public String getName(){
       return name;
    }
    public void setName (String name){
       this.name=name;
    }
    
    public String getEmail(){
       return email;
   }
    public void setEmail (String email){
       this.email= email;
   }
    
    public String getContactNumber(){
       return contactNumber;
    }
    public void setContactNumber (String contactNumber){
       this.contactNumber=contactNumber;
    }
    
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category=category;
    }
}


