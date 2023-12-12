package com.skyform.skyform.entities.dtos.form;

import com.skyform.skyform.entities.Event;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllFormsResponse {

    private String creatorFullName;

    private String creatorEmail;

    private String creatorPhoneNumber;

    private String eventName;

    private String name;

    private String description;

    private Date startDate;

    private Date endDate;

}
