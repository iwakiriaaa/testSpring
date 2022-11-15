package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.SyainEntityClass;
import com.example.demo.model.SyozokuEntityClass;
import com.example.demo.repository.RepositoryClass;

@Service
public class UserService {
	
    @Autowired
    private RepositoryClass repository;
    
    public List<SyozokuEntityClass> searchAll() {
        // ユーザーTBLの内容を全検索
        return repository.find(1);
    }
}
