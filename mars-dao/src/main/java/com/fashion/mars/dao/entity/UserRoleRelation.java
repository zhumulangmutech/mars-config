package com.fashion.mars.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("user_role_relation")
public class UserRoleRelation implements Serializable{
    private static final long serialVersionUID = 6099317626818127004L;

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    @TableField("create_date")
    private Date createDate;

    @TableField("update_date")
    private Date updateDate;

    @TableField("user_id")
    private Long userId;

    @TableField("role_id")
    private Long roleId;

}
