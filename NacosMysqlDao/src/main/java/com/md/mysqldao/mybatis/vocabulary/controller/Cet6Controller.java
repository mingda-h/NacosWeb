package com.md.mysqldao.mybatis.vocabulary.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.md.mysqldao.mybatis.vocabulary.entity.Cet6;
import com.md.mysqldao.mybatis.vocabulary.mapper.Cet6Mapper;
import com.md.mysqldao.mybatis.vocabulary.service.ICet6Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author md
 * @since 2021-12-02
 */
@RestController
@Slf4j
public class Cet6Controller {
    @Autowired
    private ICet6Service iCet6Service;
//    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
//    private LocalDate localDate;

//    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @GetMapping(value = "/mysql/vocabulary/cet6/all", produces = {"application/json;charset=UTF-8"})
    public List<Cet6> getAllWorldbyData(@RequestParam(value = "date",required = true)@DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date) {
        log.info("进入MysqlDao,查询单词详情列表");
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate localDate = LocalDate.parse(date,df);
        return iCet6Service.getAllVocabularyByDate(date);
    }

    @PostMapping(value = "/mysql/vocabulary/cet6/set", produces = {"application/json;charset=UTF-8"})
    public boolean setworld(@RequestBody Cet6 cet6) {
        log.info("进入MysqlDAO,添加单词");
        return iCet6Service.setWord(cet6);
    }
    // 通过日期获得单词
    @GetMapping(value = "/mysql/vocabulary/cet6/allword", produces = {"application/json;charset=UTF-8"})
    List<String> getAllWord(@RequestParam(value = "date",required = true)@DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date){
        log.info("进入MysqlDao,查询单词列表");
        return iCet6Service.getAllWord(date);
    }

    // 通过单词得到该单词所有的信息
    @GetMapping(value = "/mysql/vocabulary/cet6/fullword", produces = {"application/json;charset=UTF-8"})
    Cet6 getVocabularyByWord(@RequestParam(value = "word") String word){
        log.info("进入MysqlDao,查询指定单词详情");
        return iCet6Service.getVocabularyByWord(word);
    }


}
