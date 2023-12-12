package com.skyform.skyform.webAPI.controllers;

import com.skyform.skyform.business.abstracts.FormService;
import com.skyform.skyform.entities.Form;
import com.skyform.skyform.entities.dtos.form.GetAllFormsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/forms")
public class FormController {

    private FormService formService;

    @Autowired
    FormController(FormService formService){
        this.formService = formService;
    }

    @PostMapping("/addform")
    public void addForm(@RequestBody Form form){
        formService.addForm(form);
    }

    @GetMapping("/getforms")
    public List<Form> getForms(){
        return formService.getForms();
    }

}
