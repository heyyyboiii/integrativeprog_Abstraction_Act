/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it2344assignment02;

/**
 *
 * @author jbcan
 */
public class OtherStud extends Student {
    
    private boolean inProbation; // set this boolean to be used for identifying if the student is in probation
    
    // this is a constructor that has the boolean inProbation and double wpa that
    public OtherStud(boolean inProbation, double wpa){
        super(wpa);  // Call the constructor of the superclass with the given wpa value
        this.wpa = wpa; // Set the wpa instance variable to the given wpa value
        this.inProbation = inProbation; // Set the inProbation instance variable to the given inProbation value
    }

    @Override
    public String status() {
        
        // if the student has a wpa below 75 and is in probation, student will be advised to shift
        if(wpa < 75 && inProbation == true){
            return "advised_to_shift";
        }
        // if the student has a wpa below 75 and is not in probation, student will be in probation
        else if(wpa < 75 && inProbation == false){
            return "under_probation";
        }
        // if the student does not have a wpa below 75 and is not in probation, student will be retained
        else{
            return "retained";
        }
    }
}
