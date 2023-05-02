/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it2344assignment02;

/**
 *
 * @author jbcan
 */
public class ManagementEngineeringStud extends Student {
    
    private boolean inProbation; // set this boolean to be used for identifying if the student is in probation
    private boolean hasFailingGrade; // set this boolean to be used for identifying if the student has a failing grade
    
    // this is a constructor
    public ManagementEngineeringStud(boolean inProbation, boolean hasFailingGrade, double wpa){
        super(wpa);  // Call the constructor of the superclass with the given wpa value
        this.wpa = wpa; // Set the wpa instance variable to the given wpa value      
        this.inProbation = inProbation; // Set the inProbation instance variable to the given inProbation value 
        this.hasFailingGrade = hasFailingGrade; // Set the hasFailingGrade instance variable to the given hasFailingGrade value 
    }
    
    @Override
    public String status() {
        
        // if the student has a wpa above 89, student will be retained in the program
        if(wpa > 89 && hasFailingGrade == false && inProbation == false){
            return "retained";
        }
        // if the student has a wpa in between 87 and 88.9, student will be in probation
        else if(wpa >= 87 && wpa <= 88.9 && hasFailingGrade == false && inProbation == false){
            return "under_probation";
        }
        // if the student has a wpa below 87 they will be advised to shift and if they have a failing grade
        else if((hasFailingGrade == true) || (wpa <= 87) || (wpa >= 87 && wpa <= 88.9 && inProbation == true)){
            return "advised_to_shift";
        }
        else{
            return "advised_to_shift";
        }
    }
}
