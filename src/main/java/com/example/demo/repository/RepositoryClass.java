package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.SyainEntityClass;
import com.example.demo.model.SyozokuEntityClass;

@Repository
public interface RepositoryClass extends JpaRepository <SyozokuEntityClass, Integer> {
    @Query(value = "SELECT syain_entity_class.syain_id, syain_entity_class.name, syain_entity_class.age, syozoku_entity_class.syozoku_name, syozoku_entity_class.syozoku_id from syozoku_entity_class INNER JOIN syain_entity_class WHERE syain_entity_class.syain_id = :syainId",nativeQuery=true)
    List<SyozokuEntityClass> find(@Param("syainId") Integer syainId);
    
}