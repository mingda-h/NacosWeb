package com.md.consumer.client.mysqldao;

import com.md.consumer.api.vo.cet6vo.Cet6VO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

// 微服务的调用
@FeignClient(value = "cloud-NacosMysqlDao", contextId = "cloud-NacosMysqlDao-cet6")
public interface Cet6Infra {
    //    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")

    @GetMapping(value = "/mysql/vocabulary/cet6/all", produces = {"application/json;charset=UTF-8"})
    List<Cet6VO> getAllWorldbyData(@RequestParam(value = "date",required = true)@DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date);

    @PostMapping(value = "/mysql/vocabulary/cet6/set", produces = {"application/json;charset=UTF-8"})
    boolean setworld(@RequestBody Cet6VO cet6) ;
    // 通过日期获得单词
    @GetMapping(value = "/mysql/vocabulary/cet6/allword", produces = {"application/json;charset=UTF-8"})
    List<String> getAllWord(@RequestParam(value = "date",required = true) @DateTimeFormat(pattern = "yyyy-MM-dd")LocalDate date);

    // 通过单词得到该单词所有的信息
    @GetMapping(value = "/mysql/vocabulary/cet6/fullword", produces = {"application/json;charset=UTF-8"})
    Cet6VO getVocabularyByWord(@RequestParam(value = "word") String word);
}
