package com.skyform.skyform.business.concretes;

import com.skyform.skyform.business.abstracts.FormService;
import com.skyform.skyform.dataAccess.abstracts.FormDao;
import com.skyform.skyform.entities.Form;
import com.skyform.skyform.entities.dtos.form.GetAllFormsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FormManager implements FormService {

    private FormDao formDao;

    @Autowired
    public FormManager(FormDao formDao){
        this.formDao = formDao;
    }

    @Override
    public void addForm(Form form) {
        formDao.save(form);
    }

    @Override
    public List<Form> getForms() {
        var result = formDao.findAll();

        return result;
    }
}
