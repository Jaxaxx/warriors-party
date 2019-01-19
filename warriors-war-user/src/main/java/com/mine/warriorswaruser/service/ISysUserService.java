package com.mine.warriorswaruser.service;

import com.baomidou.mybatisplus.service.IService;
import com.mine.warriorsservercommon.pojo.ResultVO;
import com.mine.warriorswaruser.dto.SysUserDTO;
import com.mine.warriorswaruser.entity.SysUser;

/**
 * @description: 【用户】代理层
 * @author: Generated by Mine.Lee
 * @create: 2019-01-19
 * @version: v1.0
 */
public interface ISysUserService extends IService<SysUser> {

   public ResultVO<?> searchSysUserList(SysUserDTO dto);

   public ResultVO<?> searchSysUserListPage(SysUserDTO dto);

   public ResultVO<?> searchSysUserOne(SysUserDTO dto);

   public ResultVO<?> addSysUser(SysUserDTO dto);

   public ResultVO<?> updateSysUser(SysUserDTO dto);

   public ResultVO<?> deleteSysUser(SysUserDTO dto);

}