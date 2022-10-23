package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.EntityClass;

public interface RepositoryClass extends JpaRepository <EntityClass, Long> {

}
//変更