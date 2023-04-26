package com.example.Practice.CRUD_operation.dao;

import com.example.Practice.CRUD_operation.model.Model;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class Dao {
static List<Model>list=new ArrayList<>();
    public static void addNamee(Model model) {
 list.add(model);
    }

    public static List<Model> getList() {
        return list;
    }

    public static Model getById(int id) {
 for(Model res: list) {
     if(id==res.getTurfID()){
         return res;
     }
 }
 return  null;
    }

    public static Model updateById(int id, Model model) {

 Model model1=getById(id);
 model1.setNumber(model.getNumber());
 model1.setOwnerName(model.getOwnerName());
 model1.setTurfAddress(model.getTurfAddress());
 model1.setTurfName(model.getTurfName());
return  model1;


    }

    public static Model delete(int id, Model model) {
Model model1=getById(id);
Boolean remove=list.remove(model);
if(remove ){
    return model1;
}else {
    return null;
}
    }
}
