package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Documents;

public interface DocumentDao extends JpaRepository<Documents, Long> {

}
