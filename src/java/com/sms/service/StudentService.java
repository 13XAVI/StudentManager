/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.service;

import com.sms.dao.StudentDao;
import com.sms.model.Student;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author t
 */
public class StudentService extends UnicastRemoteObject implements StudentInterface {

    StudentDao studDao = new StudentDao();

    public StudentService() throws RemoteException {
        super();
    }

    @Override
    public boolean createStudent(Student student) throws RemoteException {
        return studDao.createStudent(student);
    }

    @Override
    public void updateStudent(Student student) throws RemoteException {
        studDao.updateStudent(student);
    }

    @Override
    public List<Student> findAll() throws RemoteException {
        return studDao.findAll();
    }

    @Override
    public void deleteStudent(Student student) throws RemoteException {
        studDao.deleteStudent(student);
    }

    @Override
    public Student findStudent(String nationalId) throws RemoteException {
        return studDao.findStudent(nationalId);
    }
}
