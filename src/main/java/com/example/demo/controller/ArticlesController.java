package com.example.demo.controller;

import com.example.demo.pojo.Articles;
import com.example.demo.service.ArticlesService;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/7/16.
 */
@Controller
@RequestMapping("/")
public class ArticlesController {

    private static final Logger logger = LoggerFactory.getLogger(ArticlesController.class);

    @Autowired
    private ArticlesService articlesService;

    @RequestMapping("hello")
    private String getHellowWorld(){

        return "index";
    }
    @ResponseBody
    @RequestMapping("get")
    private String getArticles(){
        Articles articles = articlesService.getArticles(1l);


        return articles.toString();
    }
    @ResponseBody
    @RequestMapping("list")
    private List<Articles> getArticlesList(){
        //配置分页查询
        PageHelper.startPage(1,2);
        List<Articles> articles = articlesService.getArticlesList();


        return articles;
    }
}
