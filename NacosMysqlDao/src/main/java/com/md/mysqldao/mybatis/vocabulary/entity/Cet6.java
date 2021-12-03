package com.md.mysqldao.mybatis.vocabulary.entity;

import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDate;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 
 * </p>
 *
 * @author md
 * @since 2021-12-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Cet6 implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("WORD")
    private String word;

    @TableField("PHONETIC_SYMBOL")
    private String phoneticSymbol;

    @TableField("WORD_EXPLAIN")
    private String wordExplain;

    @TableField("IMPORT_DATE")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate importDate;


}
