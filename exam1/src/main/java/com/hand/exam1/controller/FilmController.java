package com.hand.exam1.controller;

import com.hand.exam1.aop.logno;
import com.hand.exam1.entity.Film;
import com.hand.exam1.service.IFilmService;
import com.hand.exam1.service.imp.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class FilmController {

    @Autowired
    private IFilmService filmService;


    @RequestMapping("get")
    @logno(operaterType = "插入了一条数据")//自定义注解
    public Boolean saveData(Film film){
        film=new Film();
        film.setLanguage_id(1);
        film.setLast_update(new Date());
        film.setLength(10);
        film.setOriginal_language_id(50);
        film.setRating(null);
        film.setSpecial_features(null);
        film.setReplacement_cost(100.0);
        film.setRental_duration(4000);
        film.setRental_rate(41.0);
        return filmService.inseartData(film);
    }
}
