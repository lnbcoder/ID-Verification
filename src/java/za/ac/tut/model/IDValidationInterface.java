/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model;

/**
 *
 * @author loveness
 */
public interface IDValidationInterface {
    public String determineDateOfBirth();
    public String determineGender();
    public String determineCitizenshipStatus();
    public String verificationOutcome();
    public String validateId();
}
