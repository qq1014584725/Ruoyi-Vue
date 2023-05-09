package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysOptionInfoMapper;
import com.ruoyi.system.domain.SysOptionInfo;
import com.ruoyi.system.service.ISysOptionInfoService;

/**
 * 资产信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-09
 */
@Service
public class SysOptionInfoServiceImpl implements ISysOptionInfoService 
{
    @Autowired
    private SysOptionInfoMapper sysOptionInfoMapper;

    /**
     * 查询资产信息
     * 
     * @param optionId 资产信息主键
     * @return 资产信息
     */
    @Override
    public SysOptionInfo selectSysOptionInfoByOptionId(Long optionId)
    {
        return sysOptionInfoMapper.selectSysOptionInfoByOptionId(optionId);
    }

    /**
     * 查询资产信息列表
     * 
     * @param sysOptionInfo 资产信息
     * @return 资产信息
     */
    @Override
    public List<SysOptionInfo> selectSysOptionInfoList(SysOptionInfo sysOptionInfo)
    {
        return sysOptionInfoMapper.selectSysOptionInfoList(sysOptionInfo);
    }

    /**
     * 新增资产信息
     * 
     * @param sysOptionInfo 资产信息
     * @return 结果
     */
    @Override
    public int insertSysOptionInfo(SysOptionInfo sysOptionInfo)
    {
        return sysOptionInfoMapper.insertSysOptionInfo(sysOptionInfo);
    }

    /**
     * 修改资产信息
     * 
     * @param sysOptionInfo 资产信息
     * @return 结果
     */
    @Override
    public int updateSysOptionInfo(SysOptionInfo sysOptionInfo)
    {
        return sysOptionInfoMapper.updateSysOptionInfo(sysOptionInfo);
    }

    /**
     * 批量删除资产信息
     * 
     * @param optionIds 需要删除的资产信息主键
     * @return 结果
     */
    @Override
    public int deleteSysOptionInfoByOptionIds(Long[] optionIds)
    {
        return sysOptionInfoMapper.deleteSysOptionInfoByOptionIds(optionIds);
    }

    /**
     * 删除资产信息信息
     * 
     * @param optionId 资产信息主键
     * @return 结果
     */
    @Override
    public int deleteSysOptionInfoByOptionId(Long optionId)
    {
        return sysOptionInfoMapper.deleteSysOptionInfoByOptionId(optionId);
    }
}
