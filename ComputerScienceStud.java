/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it2344assignment02;

/**
 *
 * @author jbcan
 */
public class ComputerScienceStud extends Student{
    
    private boolean inProbation; // set this boolean to be used for identifying if the student is in probation
    private double msca;
    
    // this is a constructor
    public ComputerScienceStud(boolean inProbation, double wpa, double msca){
        super(wpa);  // Call the constructor of the superclass with the given wpa value
        this.wpa = wpa; // Set the wpa instance variable to the given wpa value
        this.inProbation = inProbation; // Set the inProbation instance variable to the given inProbation value  
        this.msca = msca; // Set the msca instance variable to the given msca value
    }

    @Override
    public String status() {
        
        // if the student has a wpa and msca of at least 80 the student will be retained
        if(wpa >= 80 && msca >= 80){
            return "retained";
        }
        // if the student has at least passed one of the criteria and are not in probation the student will be put in probation
        else if((wpa >= 80 && msca < 80 && inProbation == false) || (wpa < 80 && msca >= 80 && inProbation == false)){
            return "under_probation";
        }
        // if the student is in probation and has failed at least one of the criteria the student will be advised to shift
        else if((wpa < 80 && msca >= 80 && inProbation == true) || (wpa >= 80 && msca < 80 && inProbation == true)){
            return "advised_to_shift";
        }
        // if the student failed both criteria they will be advised to shift
        else{
           return "advised_to_shift"; 
        }
    }    

}
