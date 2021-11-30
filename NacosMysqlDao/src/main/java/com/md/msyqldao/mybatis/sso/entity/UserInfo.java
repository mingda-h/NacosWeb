package com.md.msyqldao.mybatis.sso.entity;

import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2021-10-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("USER_NAME")
    private String userName;

    @TableField("PASSWORD")
    private String password;

    @TableField("OLD_PASSWORD")
    private String oldPassword;


}
