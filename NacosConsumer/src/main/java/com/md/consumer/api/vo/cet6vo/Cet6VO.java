package com.md.consumer.api.vo.cet6vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class Cet6VO {
    private static final long serialVersionUID = 1L;

    private String word;
    private String phoneticSymbol;
    private String wordExplain;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate importDate;
}
