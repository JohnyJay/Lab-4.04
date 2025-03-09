package com.labs.lab402.controller.interfaces;

import com.labs.lab402.model.Patient;

import java.time.LocalDate;
import java.util.List;

public interface IPatientController {
    List<Patient> getAllPatients();
    Patient getPatientById(Integer id);
    List<Patient> getAllPatientsByDateOfBirthRange(LocalDate startDate, LocalDate finishDate);
    List<Patient> getAllPatientsByAdmittingDoctorDepartment(String department);
    List<Patient> getAllPatientsWhoseDoctorsStatusIsOff();
    void savePatient(Patient patient);
    void updatePatient(Patient patient, Integer id);
}
