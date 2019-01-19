package com.mine.warriorswaruser.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mine.warriorsservercommon.pojo.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description: 【用户】交互层
 * @author: Generated by Mine.Lee
 * @create: 2019-01-19
 * @version: v1.0
 */
@Data
@ApiModel(value = "【用户】交互层")
public class SysUserDTO extends BaseDTO {

    @ApiModelProperty(value = "主键ID")
    private Long id;

    @ApiModelProperty(value = "UUID")
    private String no;

    @ApiModelProperty(value = "姓名")
    private String userName;

    @ApiModelProperty(value = "手机号")
    private String userMobile;

    @ApiModelProperty(value = "密码")
    private String passWord;

    @ApiModelProperty(value = "地址")
    private String userAddress;

    @ApiModelProperty(value = "个性签名")
    private String signature;

    @ApiModelProperty(value = "token")
    private String token;

    @ApiModelProperty(value = "创建时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    @ApiModelProperty(value = "版本号")
    private Long version;

    @ApiModelProperty(value = "逻辑删除 0 存在 1 删除")
    private Integer deleteFlag;

}
