package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysOptionInfo;

/**
 * 资产信息Mapper接口
 * 
 * @author ruoyi
 * @date 2023-05-09
 */
public interface SysOptionInfoMapper 
{
    /**
     * 查询资产信息
     * 
     * @param optionId 资产信息主键
     * @return 资产信息
     */
    public SysOptionInfo selectSysOptionInfoByOptionId(Long optionId);

    /**
     * 查询资产信息列表
     * 
     * @param sysOptionInfo 资产信息
     * @return 资产信息集合
     */
    public List<SysOptionInfo> selectSysOptionInfoList(SysOptionInfo sysOptionInfo);

    /**
     * 新增资产信息
     * 
     * @param sysOptionInfo 资产信息
     * @return 结果
     */
    public int insertSysOptionInfo(SysOptionInfo sysOptionInfo);

    /**
     * 修改资产信息
     * 
     * @param sysOptionInfo 资产信息
     * @return 结果
     */
    public int updateSysOptionInfo(SysOptionInfo sysOptionInfo);

    /**
     * 删除资产信息
     * 
     * @param optionId 资产信息主键
     * @return 结果
     */
    public int deleteSysOptionInfoByOptionId(Long optionId);

    /**
     * 批量删除资产信息
     * 
     * @param optionIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysOptionInfoByOptionIds(Long[] optionIds);
}
