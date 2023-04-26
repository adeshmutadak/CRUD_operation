package com.example.Practice.CRUD_operation.service;

import com.example.Practice.CRUD_operation.dao.Dao;
import com.example.Practice.CRUD_operation.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Service_Turf {
    @Autowired
    Dao dao;


    public static void addName(Model model) {

  Dao.addNamee(model);
    }

    public static List<Model> getAllTurf() {
         return Dao.getList();

    }

    public static Model getById(int id) {
        return Dao.getById(id);

    }

    public static Model Update(int id, Model model) {
        return Dao.updateById(id,model);
    }

    public static Model delete(int id, Model model) {
        return Dao.delete(id,model);
    }
}
