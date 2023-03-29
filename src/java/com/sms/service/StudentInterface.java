/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.service;

import com.sms.model.Student;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author t
 */
public interface StudentInterface extends Remote{
    public boolean createStudent(Student student) throws RemoteException;
    
    public void updateStudent(Student student) throws RemoteException;
    
    public List<Student> findAll() throws RemoteException;
    
    public void deleteStudent(Student student) throws RemoteException;
    
    public Student findStudent(String nationalId) throws RemoteException;
}
