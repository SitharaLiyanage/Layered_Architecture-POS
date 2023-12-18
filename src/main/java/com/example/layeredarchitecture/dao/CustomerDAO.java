package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerDAO  {


    ArrayList<CustomerDTO> getAllCustomer()throws SQLException,ClassNotFoundException;

    boolean saveCustomer(CustomerDTO customerDTO)throws SQLException,ClassNotFoundException;

    boolean updateCustomer(CustomerDTO customerDTO)throws SQLException,ClassNotFoundException;
    boolean delete(String id)throws SQLException , ClassNotFoundException;


    String generateNewId()throws SQLException,ClassNotFoundException;

    boolean existCustomer(String id)throws SQLException ,ClassNotFoundException;
}
