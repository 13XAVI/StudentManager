/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.service;

import com.sms.dao.LoginDao;
import com.sms.model.Login;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author t
 */
public class LoginService extends UnicastRemoteObject implements LoginInterface{
    LoginDao loginDao = new LoginDao();
    
    public LoginService() throws RemoteException {
        super();
    }

    @Override
    public void createLogin(Login login) throws RemoteException {
        loginDao.createLogin(login);
    }

    @Override
    public void updateLogin(Login login) throws RemoteException {
        loginDao.updateLogin(login);
    }

    @Override
    public List<Login> findAll() throws RemoteException {
        return loginDao.findAll();
    }

    @Override
    public void deleteLogin(Login login) throws RemoteException {
        loginDao.deleteLogin(login);
    }

    @Override
    public Login findLogin(String email) throws RemoteException {
        return loginDao.findLogin(email);
    }
    
    
}
