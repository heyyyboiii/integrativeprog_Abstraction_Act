/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package it2344assignment02;

/**
 *
 * @author jbcan
 */
public class IT2344Assignment02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // test the OtherStud class, to know if it works
        OtherStud ostudent1 = new OtherStud(true, 90);
        System.out.println("Other Student: " + ostudent1.status());
        OtherStud ostudent2 = new OtherStud(false, 74);
        System.out.println("Other Student: " + ostudent2.status());
        OtherStud ostudent3 = new OtherStud(true, 70);
        System.out.println("Other Student: " + ostudent3.status());

        
        // test the ManagementEngineeringStud class, , to know if it works
        ManagementEngineeringStud mestudent1 = new ManagementEngineeringStud(false, false, 90);
        System.out.println("Management Engineering Student: " + mestudent1.status()); 
        ManagementEngineeringStud mestudent2 = new ManagementEngineeringStud(false, false, 87.6);
        System.out.println("Management Engineering Student: " + mestudent2.status()); 
        ManagementEngineeringStud mestudent3 = new ManagementEngineeringStud(true, true, 70);
        System.out.println("Management Engineering Student: " + mestudent3.status());         
        
        // test the ComputerScienceStud class, , to know if it works
        ComputerScienceStud csstudent1 = new ComputerScienceStud(true, 85.5, 90);
        System.out.println("Computer Science Student: " + csstudent1.status()); 
        ComputerScienceStud csstudent2 = new ComputerScienceStud(false, 79, 81.5);
        System.out.println("Computer Science Student: " + csstudent2.status());  
        ComputerScienceStud csstudent3 = new ComputerScienceStud(true, 79, 81.5);
        System.out.println("Computer Science Student: " + csstudent3.status());  
    }
    
}
