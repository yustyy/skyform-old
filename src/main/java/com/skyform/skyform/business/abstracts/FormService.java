package com.skyform.skyform.business.abstracts;

import com.skyform.skyform.entities.Form;
import com.skyform.skyform.entities.dtos.form.GetAllFormsResponse;

import java.util.List;

public interface FormService {

    void addForm(Form form);

    List<Form> getForms();


}
