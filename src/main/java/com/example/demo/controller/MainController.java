package com.example.demo.controller;

import javax.xml.stream.events.Comment;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org. springframework.validation. annotation. Validated;
import org. springframework.web.bind.annotation.GetMapping;
import org. springframework.web.bind.annotation.ModelAttribute;
import org. springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.EntityClass;
import com.example.demo.repository.RepositoryClass;

public class MainController {
	
	private RepositoryClass repository;
	
    //@Autowired ← コンストラクタが１つの場合、@Autowiredは省略できます
    public void RepositoryClass(RepositoryClass repository) {
        this.repository = repository;
    }
    
    @GetMapping("/home")
    public String getAllImages(@ModelAttribute EntityClass entity, Model model) {
        // COMMENTテーブル：レコード全件取得
        model.addAttribute("image", repository.findAll());
        return "ImageView";
    }
}
//aafewfewf

