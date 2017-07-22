package com.example.demo.controller;

import com.example.demo.pojo.Articles;
import com.example.demo.service.ArticlesService;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/7/16.
 */
@RestController
@RequestMapping("/")
public class ArticlesController {

    private static final Logger logger = LoggerFactory.getLogger(ArticlesController.class);

    @Autowired
    private ArticlesService articlesService;

    @RequestMapping("hello")
    private String getHellowWorld(){

        return "hello-world my jenkins and git and docker is work oh year!!";
    }

    @RequestMapping("get")
    private String getArticles(){
        Articles articles = articlesService.getArticles(1l);


        return articles.toString();
    }

    @RequestMapping("list")
    private List<Articles> getArticlesList(){
        //配置分页查询
        PageHelper.startPage(1,2);
        List<Articles> articles = articlesService.getArticlesList();


        return articles;
    }
}
