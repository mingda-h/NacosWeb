package com.md.mysqldao.mybatis.vocabulary.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.md.mysqldao.mybatis.vocabulary.entity.Cet6;
import com.md.mysqldao.mybatis.vocabulary.mapper.Cet6Mapper;
import com.md.mysqldao.mybatis.vocabulary.service.ICet6Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author md
 * @since 2021-12-02
 */
@Service
public class Cet6ServiceImpl extends ServiceImpl<Cet6Mapper, Cet6> implements ICet6Service {
    @Resource
    private Cet6Mapper cet6Mapper;

    // 通过日期获得单词
    public List<String> getAllWord(LocalDate date) {
        QueryWrapper<Cet6> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("WORD");
        queryWrapper.eq("IMPORT_DATE", date);
        List<String> wordlist = (List<String>) ((Object) cet6Mapper.selectObjs(queryWrapper));
        return wordlist;
    }

    // 添加单词
    public boolean setWord(Cet6 cet6) {
        if(getVocabularyByWord(cet6.getWord())==null){
            if (cet6Mapper.insert(cet6) == 1) {
                return true;
            } else {
                return false;
            }
        }else{
            if (cet6Mapper.updateById(cet6) == 1) {
                return true;
            } else {
                return false;
            }
        }

    }

    // 得到单词的全部信息
    public List<Cet6> getAllVocabularyByDate(LocalDate date) {
        QueryWrapper<Cet6> queryWrapper = new QueryWrapper<>();
        queryWrapper.select();
        queryWrapper.eq("IMPORT_DATE", date);
        List<Cet6> wordlist = cet6Mapper.selectList(queryWrapper);
        return wordlist;
    }

    // 通过单词得到该单词所有的信息
    public Cet6 getVocabularyByWord(String word) {
        QueryWrapper<Cet6> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("WORD",word);
        if(cet6Mapper.selectList(queryWrapper).size()<1){
            return null;
        }else{
            return cet6Mapper.selectList(queryWrapper).get(0);
        }
    }
}
