package com.skyform.skyform.dataAccess.abstracts;

import com.skyform.skyform.entities.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormDao extends JpaRepository<Form,Integer> {
}
