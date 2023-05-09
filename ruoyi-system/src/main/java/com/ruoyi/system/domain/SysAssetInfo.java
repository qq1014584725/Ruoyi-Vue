package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 资产信息对象 sys_asset_info
 * 
 * @author ruoyi
 * @date 2023-05-09
 */
public class SysAssetInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 资产信息id */
    private Long infoId;

    /** 资产类型 */
    @Excel(name = "资产类型")
    private String assetType;

    /** 资产子类型 */
    @Excel(name = "资产子类型")
    private String assetSubType;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String assetName;

    /** 国别 */
    @Excel(name = "国别")
    private String assetNation;

    /** 生产厂家 */
    @Excel(name = "生产厂家")
    private String assetFactory;

    /** 是否外贸进口 */
    @Excel(name = "是否外贸进口")
    private Integer assetIsImport;

    /** 采购项目编号 */
    @Excel(name = "采购项目编号")
    private String assetBugId;

    /** 规格型号 */
    @Excel(name = "规格型号")
    private String assetModel;

    /** 性能参数 */
    @Excel(name = "性能参数")
    private String assetParam;

    /** 设备数量 */
    @Excel(name = "设备数量")
    private Long assetNum;

    /** 设备单价 */
    @Excel(name = "设备单价")
    private BigDecimal assetPerPrice;

    /** 设备总价 */
    @Excel(name = "设备总价")
    private BigDecimal assetTotalPrice;

    /** 到货时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "到货时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date assetArriveTime;

    /** 保修时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "保修时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date assetHoldTime;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String projectName;

    /** 经费卡号 */
    @Excel(name = "经费卡号")
    private String projectId;

    /** 资产编号 */
    @Excel(name = "资产编号")
    private String assetId;

    /** 现在所属人 */
    @Excel(name = "现在所属人")
    private String assetCurrentOwner;

    /** 现在所属地点 */
    @Excel(name = "现在所属地点")
    private String assetCurrentLocation;

    /** 资产用途 */
    @Excel(name = "资产用途")
    private String assetUseTo;

    /** 外协外购申请单 */
    @Excel(name = "外协外购申请单")
    private String assetApplyList;

    /** 验收单 */
    @Excel(name = "验收单")
    private String assetAcceptList;

    /** 实物图 */
    @Excel(name = "实物图")
    private String assetObjectImg;

    /** 附件 */
    @Excel(name = "附件")
    private String assetOtherFile;

    /** 现在使用情况 */
    @Excel(name = "现在使用情况")
    private String assetUseState;

    /** 现在使用状态 */
    @Excel(name = "现在使用状态")
    private String assetUseSituation;

    /** 资产是否完成录入 */
    @Excel(name = "资产是否完成录入")
    private Integer assetIsComplete;

    public void setInfoId(Long infoId) 
    {
        this.infoId = infoId;
    }

    public Long getInfoId() 
    {
        return infoId;
    }
    public void setAssetType(String assetType) 
    {
        this.assetType = assetType;
    }

    public String getAssetType() 
    {
        return assetType;
    }
    public void setAssetSubType(String assetSubType) 
    {
        this.assetSubType = assetSubType;
    }

    public String getAssetSubType() 
    {
        return assetSubType;
    }
    public void setAssetName(String assetName) 
    {
        this.assetName = assetName;
    }

    public String getAssetName() 
    {
        return assetName;
    }
    public void setAssetNation(String assetNation) 
    {
        this.assetNation = assetNation;
    }

    public String getAssetNation() 
    {
        return assetNation;
    }
    public void setAssetFactory(String assetFactory) 
    {
        this.assetFactory = assetFactory;
    }

    public String getAssetFactory() 
    {
        return assetFactory;
    }
    public void setAssetIsImport(Integer assetIsImport) 
    {
        this.assetIsImport = assetIsImport;
    }

    public Integer getAssetIsImport() 
    {
        return assetIsImport;
    }
    public void setAssetBugId(String assetBugId) 
    {
        this.assetBugId = assetBugId;
    }

    public String getAssetBugId() 
    {
        return assetBugId;
    }
    public void setAssetModel(String assetModel) 
    {
        this.assetModel = assetModel;
    }

    public String getAssetModel() 
    {
        return assetModel;
    }
    public void setAssetParam(String assetParam) 
    {
        this.assetParam = assetParam;
    }

    public String getAssetParam() 
    {
        return assetParam;
    }
    public void setAssetNum(Long assetNum) 
    {
        this.assetNum = assetNum;
    }

    public Long getAssetNum() 
    {
        return assetNum;
    }
    public void setAssetPerPrice(BigDecimal assetPerPrice) 
    {
        this.assetPerPrice = assetPerPrice;
    }

    public BigDecimal getAssetPerPrice() 
    {
        return assetPerPrice;
    }
    public void setAssetTotalPrice(BigDecimal assetTotalPrice) 
    {
        this.assetTotalPrice = assetTotalPrice;
    }

    public BigDecimal getAssetTotalPrice() 
    {
        return assetTotalPrice;
    }
    public void setAssetArriveTime(Date assetArriveTime) 
    {
        this.assetArriveTime = assetArriveTime;
    }

    public Date getAssetArriveTime() 
    {
        return assetArriveTime;
    }
    public void setAssetHoldTime(Date assetHoldTime) 
    {
        this.assetHoldTime = assetHoldTime;
    }

    public Date getAssetHoldTime() 
    {
        return assetHoldTime;
    }
    public void setProjectName(String projectName) 
    {
        this.projectName = projectName;
    }

    public String getProjectName() 
    {
        return projectName;
    }
    public void setProjectId(String projectId) 
    {
        this.projectId = projectId;
    }

    public String getProjectId() 
    {
        return projectId;
    }
    public void setAssetId(String assetId) 
    {
        this.assetId = assetId;
    }

    public String getAssetId() 
    {
        return assetId;
    }
    public void setAssetCurrentOwner(String assetCurrentOwner) 
    {
        this.assetCurrentOwner = assetCurrentOwner;
    }

    public String getAssetCurrentOwner() 
    {
        return assetCurrentOwner;
    }
    public void setAssetCurrentLocation(String assetCurrentLocation) 
    {
        this.assetCurrentLocation = assetCurrentLocation;
    }

    public String getAssetCurrentLocation() 
    {
        return assetCurrentLocation;
    }
    public void setAssetUseTo(String assetUseTo) 
    {
        this.assetUseTo = assetUseTo;
    }

    public String getAssetUseTo() 
    {
        return assetUseTo;
    }
    public void setAssetApplyList(String assetApplyList) 
    {
        this.assetApplyList = assetApplyList;
    }

    public String getAssetApplyList() 
    {
        return assetApplyList;
    }
    public void setAssetAcceptList(String assetAcceptList) 
    {
        this.assetAcceptList = assetAcceptList;
    }

    public String getAssetAcceptList() 
    {
        return assetAcceptList;
    }
    public void setAssetObjectImg(String assetObjectImg) 
    {
        this.assetObjectImg = assetObjectImg;
    }

    public String getAssetObjectImg() 
    {
        return assetObjectImg;
    }
    public void setAssetOtherFile(String assetOtherFile) 
    {
        this.assetOtherFile = assetOtherFile;
    }

    public String getAssetOtherFile() 
    {
        return assetOtherFile;
    }
    public void setAssetUseState(String assetUseState) 
    {
        this.assetUseState = assetUseState;
    }

    public String getAssetUseState() 
    {
        return assetUseState;
    }
    public void setAssetUseSituation(String assetUseSituation) 
    {
        this.assetUseSituation = assetUseSituation;
    }

    public String getAssetUseSituation() 
    {
        return assetUseSituation;
    }
    public void setAssetIsComplete(Integer assetIsComplete) 
    {
        this.assetIsComplete = assetIsComplete;
    }

    public Integer getAssetIsComplete() 
    {
        return assetIsComplete;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("infoId", getInfoId())
            .append("assetType", getAssetType())
            .append("assetSubType", getAssetSubType())
            .append("assetName", getAssetName())
            .append("assetNation", getAssetNation())
            .append("assetFactory", getAssetFactory())
            .append("assetIsImport", getAssetIsImport())
            .append("assetBugId", getAssetBugId())
            .append("assetModel", getAssetModel())
            .append("assetParam", getAssetParam())
            .append("assetNum", getAssetNum())
            .append("assetPerPrice", getAssetPerPrice())
            .append("assetTotalPrice", getAssetTotalPrice())
            .append("assetArriveTime", getAssetArriveTime())
            .append("assetHoldTime", getAssetHoldTime())
            .append("projectName", getProjectName())
            .append("projectId", getProjectId())
            .append("assetId", getAssetId())
            .append("assetCurrentOwner", getAssetCurrentOwner())
            .append("assetCurrentLocation", getAssetCurrentLocation())
            .append("assetUseTo", getAssetUseTo())
            .append("assetApplyList", getAssetApplyList())
            .append("assetAcceptList", getAssetAcceptList())
            .append("assetObjectImg", getAssetObjectImg())
            .append("assetOtherFile", getAssetOtherFile())
            .append("assetUseState", getAssetUseState())
            .append("assetUseSituation", getAssetUseSituation())
            .append("assetIsComplete", getAssetIsComplete())
            .toString();
    }
}
