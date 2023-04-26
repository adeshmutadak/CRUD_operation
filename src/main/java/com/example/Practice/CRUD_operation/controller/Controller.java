package com.example.Practice.CRUD_operation.controller;

import com.example.Practice.CRUD_operation.model.Model;
import com.example.Practice.CRUD_operation.service.Service_Turf;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
@Autowired
Service_Turf service_turf;


@PostMapping(value = "/addNewName")
    public String addName(@Valid @RequestBody Model model){
    Service_Turf.addName(model);
    return "Name Added Succesfully";
}
  @GetMapping(value = "/getAllTurf")
    public List<Model>getList(){
    return Service_Turf.getAllTurf();
  }

  @GetMapping(value = "getAllTurf/{id}")
    public Model getTurfByid(@PathVariable int id){
return  Service_Turf.getById(id);
  }

  @PutMapping(value = "/UpdateById/{id}")
    public Model update(@PathVariable int id, @RequestBody Model model) {
    return Service_Turf.Update(id,model);
  }
  @DeleteMapping(value = "/DeleteById/{id}")
    public Model delete(@PathVariable int id,@RequestBody Model model) {
    return Service_Turf.delete(id,model);
  }
}
