package com.academy.service;


import com.academy.model.entity.Model;
import java.util.ArrayList;
import java.util.List;

public class ModelService {
    public List<Model> getModels(){
        var models = new ArrayList<Model>();
        var model = new Model("X3");
        var model1 = new Model("C220");
        var model2 = new Model("RX-8");

        models.add(model);
        models.add(model1);
        models.add(model2);


        return models;
    }
}
