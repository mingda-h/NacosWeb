package com.md.consumer.api.cet6;

import com.md.consumer.api.vo.cet6vo.Cet6VO;
import com.md.consumer.client.mysqldao.Cet6Infra;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Slf4j
@RestController
public class Cet6 {
    @Autowired
    private Cet6Infra cet6Infra;
    //    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @GetMapping(value = "/consumer/mysql/vocabulary/cet6/all", produces = {"application/json;charset=UTF-8"})
    public List<Cet6VO> getAllWorldbyData(@RequestParam(value = "date",required = true)@DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date) {
        log.info("进入Consumer,查询单词详情列表");
        return cet6Infra.getAllWorldbyData(date);
    }

    @PostMapping(value = "/consumer/mysql/vocabulary/cet6/set", produces = {"application/json;charset=UTF-8"})
    public boolean setworld(@RequestBody Cet6VO cet6) {
        log.info("进入Consumer,插入单词");
        return cet6Infra.setworld(cet6);
    }
    // 通过日期获得单词
    @GetMapping(value = "/consumer/mysql/vocabulary/cet6/allword", produces = {"application/json;charset=UTF-8"})
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    List<String> getAllWord(@RequestParam(value = "date",required = true)@DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date){
        log.info("进入Consumer,获得单词列表");
        return cet6Infra.getAllWord(date);
    }

    // 通过单词得到该单词所有的信息
    @GetMapping(value = "/consumer/mysql/vocabulary/cet6/fullword", produces = {"application/json;charset=UTF-8"})
    Cet6VO getVocabularyByWord(@RequestParam(value = "word") String word){
        log.info("进入Consumer,得到指定单词详细");
        return cet6Infra.getVocabularyByWord(word);
    }
}
