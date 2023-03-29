/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.service;

import com.sms.model.Login;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author t
 */
public interface LoginInterface extends Remote{
    public void createLogin(Login login) throws RemoteException;
    
    public void updateLogin(Login login) throws RemoteException;
    
    public List<Login> findAll() throws RemoteException;
    
    public void deleteLogin(Login login) throws RemoteException;
    
    public Login findLogin(String email) throws RemoteException;
}
