/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBL;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Shenal Manelka
 */
public class DBConnection {
    public DBConnection(CityNursingDB obj){
        
        String fileName = "";
        
        if ("Manager".equalsIgnoreCase(obj.getRole())) {
            fileName = "Manager.txt";
        }else if ("Cashier".equalsIgnoreCase(obj.getRole())){
            fileName = "Cashier.txt";
        } else{
            fileName = "CityNursingDB.txt";
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))){
            writer.write("Name: " +obj.getName() + "\n");
            writer.write("Email:" +obj.getEmail() + "\n");
            writer.write("Contact Number: " +obj.getContactNumber()+ "\n");
            writer.write("Password:" +obj.getPassword()+ "\n");
            writer.write("Role: " +obj.getRole()+ "\n");
            writer.write("=======================\n");
            JOptionPane.showMessageDialog(null, "Account Create Successfully");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Failed to Save Data!", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    public DBConnection(PatientBookingDB patient){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("Patient.txt", true))){
            writer.write("Name: " +patient.getName() + "\n");
            writer.write("Age: " +patient.getAge() + "\n");
            writer.write("Contact Number: " +patient.getContactNumber() +"\n");
            writer.write("Gender: " +patient.getGender() + "\n");
            writer.write("Category: " + patient.getCategory() +"\n");
            writer.write("=======================\n");
            JOptionPane.showMessageDialog(null, "Data save Successfully");
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Failed to Save Data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public DBConnection(ConsultantDB consultant){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Consultant.txt", true))){
            writer.write("Name: " +consultant.getName() + "\n");
            writer.write("Email: " +consultant.getEmail()+ "\n");
            writer.write("Contact Number: " +consultant.getContactNumber() +"\n");
            writer.write("Category: " +consultant.getCategory() +"\n");
            writer.write("=======================\n");
            JOptionPane.showMessageDialog(null, "Data save Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed to Save Data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
