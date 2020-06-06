package com.clinicmanagementsystem.dao.repository;

import com.clinicmanagementsystem.dao.config.DaoConfig;
import com.clinicmanagementsystem.dao.entity.Address;
import com.clinicmanagementsystem.dao.entity.Patient;
import com.clinicmanagementsystem.dao.entity.PatientDetails;
import com.clinicmanagementsystem.dao.entity.Person;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.time.LocalDate;

@RunWith (SpringRunner.class)
@ContextConfiguration (classes = {DaoConfig.class})
@Transactional
public class PatientRepositoryTest {

    @Autowired
    private PatientRepository patientRepository;

    @Before
    public void setData() {
        Person personOne = new Person();
        personOne.setFirstName("firstNameOne");
        personOne.setLastName("lastNameOne");
        personOne.setBirthday(LocalDate.parse("01.11.1983"));
        personOne.setGender("male");
        personOne.setEmail("email.one@mail.com");

        Person personTwo = new Person();
        personTwo.setFirstName("firstNameTwo");
        personTwo.setLastName("lastNameTwo");
        personTwo.setBirthday(LocalDate.parse("12.05.1993"));
        personTwo.setGender("female");
        personTwo.setEmail("email.two@mail.com");

        Address addressOne = new Address();
        addressOne.setCountry("CountryOne");
        addressOne.setCity("CityOne");

        Address addressTwo = new Address();
        addressTwo.setCountry("CountryTwo");
        addressTwo.setCity("CityTwo");
        addressTwo.setStreet("StreetTwo");
        addressTwo.setBuilding("BuildingTwo");

        createPatient(personOne, addressOne);
        createPatient(personTwo, addressTwo);

        PatientDetails patientDetailsOne = new PatientDetails();
        patientDetailsOne.setPassportNumber("passportNumberOne");
        patientDetailsOne.setSecurityNumber("securityNumberOne");
        patientDetailsOne.setId((long) 1);

    }

    private Patient createPatient(Person person, Address address) {
        Patient patient = new Patient();
        patient.setPerson(person);
        patient.setAddress(address);
        return patient;
    }

    @Test
    public void deletePatient() {
        Patient patient = new Patient();
        Long id = new Long(1);
        PatientDetails patientDetails = new PatientDetails();
        Address address = new Address();
        Person person = new Person();
        patient.setId(id);
        patient.setPatientDetails(patientDetails);
        patient.setAddress(address);
        patient.setPerson(person);
        patientRepository.deletePatient(id);
    }
}