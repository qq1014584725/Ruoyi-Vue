package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysAssetInfoMapper;
import com.ruoyi.system.domain.SysAssetInfo;
import com.ruoyi.system.service.ISysAssetInfoService;

/**
 * 资产信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-09
 */
@Service
public class SysAssetInfoServiceImpl implements ISysAssetInfoService 
{
    @Autowired
    private SysAssetInfoMapper sysAssetInfoMapper;

    /**
     * 查询资产信息
     * 
     * @param infoId 资产信息主键
     * @return 资产信息
     */
    @Override
    public SysAssetInfo selectSysAssetInfoByInfoId(Long infoId)
    {
        return sysAssetInfoMapper.selectSysAssetInfoByInfoId(infoId);
    }

    /**
     * 查询资产信息列表
     * 
     * @param sysAssetInfo 资产信息
     * @return 资产信息
     */
    @Override
    public List<SysAssetInfo> selectSysAssetInfoList(SysAssetInfo sysAssetInfo)
    {
        return sysAssetInfoMapper.selectSysAssetInfoList(sysAssetInfo);
    }

    /**
     * 查询资产信息列表
     *
     * @param isComplete 资产确认信息
     * @return 资产信息
     */
    @Override
    public List<SysAssetInfo> selectSysAssetInfoListByComplete(Boolean isComplete) {
        return sysAssetInfoMapper.selectSysAssetInfoByInfoComplete(isComplete);
    }

    /**
     * 新增资产信息
     * 
     * @param sysAssetInfo 资产信息
     * @return 结果
     */
    @Override
    public int insertSysAssetInfo(SysAssetInfo sysAssetInfo)
    {
        return sysAssetInfoMapper.insertSysAssetInfo(sysAssetInfo);
    }

    /**
     * 修改资产信息
     * 
     * @param sysAssetInfo 资产信息
     * @return 结果
     */
    @Override
    public int updateSysAssetInfo(SysAssetInfo sysAssetInfo)
    {
        return sysAssetInfoMapper.updateSysAssetInfo(sysAssetInfo);
    }

    /**
     * 批量删除资产信息
     * 
     * @param infoIds 需要删除的资产信息主键
     * @return 结果
     */
    @Override
    public int deleteSysAssetInfoByInfoIds(Long[] infoIds)
    {
        return sysAssetInfoMapper.deleteSysAssetInfoByInfoIds(infoIds);
    }

    /**
     * 删除资产信息信息
     * 
     * @param infoId 资产信息主键
     * @return 结果
     */
    @Override
    public int deleteSysAssetInfoByInfoId(Long infoId)
    {
        return sysAssetInfoMapper.deleteSysAssetInfoByInfoId(infoId);
    }
}
