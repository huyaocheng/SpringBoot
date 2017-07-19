package com.example.demo.service;

/**
 * Created by Administrator on 2017/7/16.
 */

import com.example.demo.mapper.ArticlesMapper;
import com.example.demo.pojo.Articles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticlesService {
    @Autowired
    private ArticlesMapper articlesMapper;

    public Articles getArticles(Long id){
        return articlesMapper.getArticles(id);
    }

    public List<Articles> getArticlesList(){
        return articlesMapper.getArticlesList();
    }
}
