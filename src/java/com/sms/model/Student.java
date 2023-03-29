/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author t
 */
@Entity
@Table(name = "students_table")
public class Student implements Serializable {
    @Id
    private String national_id;
    private String first_name;
    private String last_name;
    private String gender;
    private Date dob;
    private byte[] photo;
    private String nationality;
    private String tel_number;
    private String parent_contact;
    private byte[] high_school_certificate;
    private String faculty;
    private String department;
    private Boolean admitted;
    private String email;

    public Student() {
    }

    public Student(String national_id, String first_name, String last_name, String gender, Date dob, byte[] photo, String nationality, String tel_number, String parent_contact, byte[] high_school_certificate, String faculty, String department, Boolean admitted, String email) {
        this.national_id = national_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.dob = dob;
        this.photo = photo;
        this.nationality = nationality;
        this.tel_number = tel_number;
        this.parent_contact = parent_contact;
        this.high_school_certificate = high_school_certificate;
        this.faculty = faculty;
        this.department = department;
        this.admitted = admitted;
        this.email = email;
    }

    public Student(String national_id) {
        this.national_id = national_id;
    }

   

    public String getNational_id() {
        return national_id;
    }

    public void setNational_id(String national_id) {
        this.national_id = national_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getTel_number() {
        return tel_number;
    }

    public void setTel_number(String tel_number) {
        this.tel_number = tel_number;
    }

    public String getParent_contact() {
        return parent_contact;
    }

    public void setParent_contact(String parent_contact) {
        this.parent_contact = parent_contact;
    }

    public byte[] getHigh_school_certificate() {
        return high_school_certificate;
    }

    public void setHigh_school_certificate(byte[] high_school_certificate) {
        this.high_school_certificate = high_school_certificate;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Boolean getAdmitted() {
        return admitted;
    }

    public void setAdmitted(Boolean admitted) {
        this.admitted = admitted;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
