package com.md.mysqldao.mybatis.sso.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author md
 * @since 2021-11-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class AuthorCheck implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("USER_NAME")
    private String userName;

    @TableField("SESSION_ID")
    private String sessionId;

    @TableField("TOKEN")
    private String token;

    @TableField("START_TIME")
    private LocalDateTime startTime;

    @TableField("END_TIME")
    private LocalDateTime endTime;


}
