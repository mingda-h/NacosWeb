package com.md.dao.util;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("USER")
public class USER {
    @TableId("USER_NAME")
    private String userName;


}
