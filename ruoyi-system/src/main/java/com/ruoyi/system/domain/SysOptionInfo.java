package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 资产信息对象 sys_option_info
 * 
 * @author ruoyi
 * @date 2023-05-09
 */
public class SysOptionInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 资产信息id */
    private Long optionId;

    /** 提交操作类型 */
    @Excel(name = "提交操作类型")
    private String assetUseType;

    /** 资产信息id */
    @Excel(name = "资产信息id")
    private Long assetInfo;

    /** 所属人 */
    @Excel(name = "所属人")
    private String assetOwner;

    /** 所属地点 */
    @Excel(name = "所属地点")
    private String assetLocation;

    /** 时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date assetUseTime;

    /** 所属人 */
    @Excel(name = "所属人")
    private String assetFile;

    /** 审批人 */
    @Excel(name = "审批人")
    private String assetAllow;

    /** 是否同意 */
    @Excel(name = "是否同意")
    private Integer isAllow;

    /** 驳回意见 */
    @Excel(name = "驳回意见")
    private String disagreeReason;

    /** 是否完成审批 */
    @Excel(name = "是否完成审批")
    private Integer isComplete;

    public void setOptionId(Long optionId) 
    {
        this.optionId = optionId;
    }

    public Long getOptionId() 
    {
        return optionId;
    }
    public void setAssetUseType(String assetUseType) 
    {
        this.assetUseType = assetUseType;
    }

    public String getAssetUseType() 
    {
        return assetUseType;
    }
    public void setAssetInfo(Long assetInfo) 
    {
        this.assetInfo = assetInfo;
    }

    public Long getAssetInfo() 
    {
        return assetInfo;
    }
    public void setAssetOwner(String assetOwner) 
    {
        this.assetOwner = assetOwner;
    }

    public String getAssetOwner() 
    {
        return assetOwner;
    }
    public void setAssetLocation(String assetLocation) 
    {
        this.assetLocation = assetLocation;
    }

    public String getAssetLocation() 
    {
        return assetLocation;
    }
    public void setAssetUseTime(Date assetUseTime) 
    {
        this.assetUseTime = assetUseTime;
    }

    public Date getAssetUseTime() 
    {
        return assetUseTime;
    }
    public void setAssetFile(String assetFile) 
    {
        this.assetFile = assetFile;
    }

    public String getAssetFile() 
    {
        return assetFile;
    }
    public void setAssetAllow(String assetAllow) 
    {
        this.assetAllow = assetAllow;
    }

    public String getAssetAllow() 
    {
        return assetAllow;
    }
    public void setIsAllow(Integer isAllow) 
    {
        this.isAllow = isAllow;
    }

    public Integer getIsAllow() 
    {
        return isAllow;
    }
    public void setDisagreeReason(String disagreeReason) 
    {
        this.disagreeReason = disagreeReason;
    }

    public String getDisagreeReason() 
    {
        return disagreeReason;
    }
    public void setIsComplete(Integer isComplete) 
    {
        this.isComplete = isComplete;
    }

    public Integer getIsComplete() 
    {
        return isComplete;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("optionId", getOptionId())
            .append("assetUseType", getAssetUseType())
            .append("assetInfo", getAssetInfo())
            .append("assetOwner", getAssetOwner())
            .append("assetLocation", getAssetLocation())
            .append("assetUseTime", getAssetUseTime())
            .append("assetFile", getAssetFile())
            .append("assetAllow", getAssetAllow())
            .append("isAllow", getIsAllow())
            .append("disagreeReason", getDisagreeReason())
            .append("isComplete", getIsComplete())
            .toString();
    }
}
