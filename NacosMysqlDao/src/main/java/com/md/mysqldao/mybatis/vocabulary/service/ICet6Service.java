package com.md.mysqldao.mybatis.vocabulary.service;

import com.md.mysqldao.mybatis.vocabulary.entity.Cet6;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author md
 * @since 2021-12-02
 */
public interface ICet6Service extends IService<Cet6> {
    // 通过日期获得单词
    List<String> getAllWord(LocalDate date);
    // 添加单词
    boolean setWord(Cet6 cet6);
    // 得到单词的全部信息
    List<Cet6> getAllVocabularyByDate(LocalDate date);
    // 通过单词得到该单词所有的信息
    Cet6 getVocabularyByWord(String word);

}
