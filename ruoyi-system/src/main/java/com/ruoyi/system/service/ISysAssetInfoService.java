package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysAssetInfo;

/**
 * 资产信息Service接口
 * 
 * @author ruoyi
 * @date 2023-05-09
 */
public interface ISysAssetInfoService 
{
    /**
     * 查询资产信息
     * 
     * @param infoId 资产信息主键
     * @return 资产信息
     */
    public SysAssetInfo selectSysAssetInfoByInfoId(Long infoId);

    /**
     * 查询资产信息列表
     * 
     * @param sysAssetInfo 资产信息
     * @return 资产信息集合
     */
    public List<SysAssetInfo> selectSysAssetInfoList(SysAssetInfo sysAssetInfo);

    /**
     * 查询资产信息列表byComplete
     *
     * @param isComplete 资产确认信息
     * @return 资产信息集合
     */
    public List<SysAssetInfo> selectSysAssetInfoListByComplete(Boolean isComplete);

    /**
     * 新增资产信息
     * 
     * @param sysAssetInfo 资产信息
     * @return 结果
     */
    public int insertSysAssetInfo(SysAssetInfo sysAssetInfo);

    /**
     * 修改资产信息
     * 
     * @param sysAssetInfo 资产信息
     * @return 结果
     */
    public int updateSysAssetInfo(SysAssetInfo sysAssetInfo);

    /**
     * 批量删除资产信息
     * 
     * @param infoIds 需要删除的资产信息主键集合
     * @return 结果
     */
    public int deleteSysAssetInfoByInfoIds(Long[] infoIds);

    /**
     * 删除资产信息信息
     * 
     * @param infoId 资产信息主键
     * @return 结果
     */
    public int deleteSysAssetInfoByInfoId(Long infoId);
}
