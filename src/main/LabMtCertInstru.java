package com.qifeng.lab.mt.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.qifeng.common.annotation.Excel;
import com.qifeng.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 证书标准器管理对象 lab_mt_cert_instru
 * 
 * @author qifeng
 * @date 2023-02-16
 */
public class LabMtCertInstru extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long certInstruId;

    /** $column.columnComment */
    private Long formInstrumentId;

    /** $column.columnComment */
    private String deviceUuid;

    /** 序号 */
    @Excel(name = "序号")
    private Long indexs;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String deviceName;

    /** 型号规格 */
    @Excel(name = "型号规格")
    private String model;

    /** 出厂编号 */
    @Excel(name = "出厂编号")
    private String deviceProcode;

    /** 证书编号 */
    @Excel(name = "证书编号")
    private String funCertno;

    /** 检定日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "检定日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date funCheckDate;

    /** 有效日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "有效日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date funEffectDate;

    /** 检定机构 */
    @Excel(name = "检定机构")
    private String funCompany;

    /** 技术指标 */
    @Excel(name = "技术指标")
    private String standardCert;

    /** 序号标签 */
    @Excel(name = "序号标签")
    private String labelIndexs;

    /** 设备名称标签 */
    @Excel(name = "设备名称标签")
    private String labelDeviceName;

    /** 型号规格标签 */
    @Excel(name = "型号规格标签")
    private String labelModel;

    /** 出厂编号标签 */
    @Excel(name = "出厂编号标签")
    private String labelDeviceProcode;

    /** 证书编号标签 */
    @Excel(name = "证书编号标签")
    private String labelFunCertno;

    /** 检定日期标签 */
    @Excel(name = "检定日期标签")
    private String labelFunCheckDate;

    /** 有效日期标签 */
    @Excel(name = "有效日期标签")
    private String labelFunEffectDate;

    /** 检定机构标签 */
    @Excel(name = "检定机构标签")
    private String labelFunCompany;

    /** 技术指标标签 */
    @Excel(name = "技术指标标签")
    private String labelStandardCert;

    public void setCertInstruId(Long certInstruId) 
    {
        this.certInstruId = certInstruId;
    }

    public Long getCertInstruId() 
    {
        return certInstruId;
    }
    public void setFormInstrumentId(Long formInstrumentId)
    {
        this.formInstrumentId = formInstrumentId;
    }

    public Long getFormInstrumentId()
    {
        return formInstrumentId;
    }
    public void setDeviceUuid(String deviceUuid) 
    {
        this.deviceUuid = deviceUuid;
    }

    public String getDeviceUuid() 
    {
        return deviceUuid;
    }
    public void setIndexs(Long indexs) 
    {
        this.indexs = indexs;
    }

    public Long getIndexs() 
    {
        return indexs;
    }
    public void setDeviceName(String deviceName) 
    {
        this.deviceName = deviceName;
    }

    public String getDeviceName() 
    {
        return deviceName;
    }
    public void setModel(String model) 
    {
        this.model = model;
    }

    public String getModel() 
    {
        return model;
    }
    public void setDeviceProcode(String deviceProcode) 
    {
        this.deviceProcode = deviceProcode;
    }

    public String getDeviceProcode() 
    {
        return deviceProcode;
    }
    public void setFunCertno(String funCertno) 
    {
        this.funCertno = funCertno;
    }

    public String getFunCertno() 
    {
        return funCertno;
    }
    public void setFunCheckDate(Date funCheckDate) 
    {
        this.funCheckDate = funCheckDate;
    }

    public Date getFunCheckDate() 
    {
        return funCheckDate;
    }
    public void setFunEffectDate(Date funEffectDate) 
    {
        this.funEffectDate = funEffectDate;
    }

    public Date getFunEffectDate() 
    {
        return funEffectDate;
    }
    public void setFunCompany(String funCompany) 
    {
        this.funCompany = funCompany;
    }

    public String getFunCompany() 
    {
        return funCompany;
    }
    public void setStandardCert(String standardCert) 
    {
        this.standardCert = standardCert;
    }

    public String getStandardCert() 
    {
        return standardCert;
    }
    public void setLabelIndexs(String labelIndexs) 
    {
        this.labelIndexs = labelIndexs;
    }

    public String getLabelIndexs() 
    {
        return labelIndexs;
    }
    public void setLabelDeviceName(String labelDeviceName) 
    {
        this.labelDeviceName = labelDeviceName;
    }

    public String getLabelDeviceName() 
    {
        return labelDeviceName;
    }
    public void setLabelModel(String labelModel) 
    {
        this.labelModel = labelModel;
    }

    public String getLabelModel() 
    {
        return labelModel;
    }
    public void setLabelDeviceProcode(String labelDeviceProcode) 
    {
        this.labelDeviceProcode = labelDeviceProcode;
    }

    public String getLabelDeviceProcode() 
    {
        return labelDeviceProcode;
    }
    public void setLabelFunCertno(String labelFunCertno) 
    {
        this.labelFunCertno = labelFunCertno;
    }

    public String getLabelFunCertno() 
    {
        return labelFunCertno;
    }
    public void setLabelFunCheckDate(String labelFunCheckDate) 
    {
        this.labelFunCheckDate = labelFunCheckDate;
    }

    public String getLabelFunCheckDate() 
    {
        return labelFunCheckDate;
    }
    public void setLabelFunEffectDate(String labelFunEffectDate) 
    {
        this.labelFunEffectDate = labelFunEffectDate;
    }

    public String getLabelFunEffectDate() 
    {
        return labelFunEffectDate;
    }
    public void setLabelFunCompany(String labelFunCompany) 
    {
        this.labelFunCompany = labelFunCompany;
    }

    public String getLabelFunCompany() 
    {
        return labelFunCompany;
    }
    public void setLabelStandardCert(String labelStandardCert) 
    {
        this.labelStandardCert = labelStandardCert;
    }

    public String getLabelStandardCert() 
    {
        return labelStandardCert;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("certInstruId", getCertInstruId())
            .append("formInstrumentId", getFormInstrumentId())
            .append("deviceUuid", getDeviceUuid())
            .append("indexs", getIndexs())
            .append("deviceName", getDeviceName())
            .append("model", getModel())
            .append("deviceProcode", getDeviceProcode())
            .append("funCertno", getFunCertno())
            .append("funCheckDate", getFunCheckDate())
            .append("funEffectDate", getFunEffectDate())
            .append("funCompany", getFunCompany())
            .append("standardCert", getStandardCert())
            .append("createTime", getCreateTime())
            .append("labelIndexs", getLabelIndexs())
            .append("labelDeviceName", getLabelDeviceName())
            .append("labelModel", getLabelModel())
            .append("labelDeviceProcode", getLabelDeviceProcode())
            .append("labelFunCertno", getLabelFunCertno())
            .append("labelFunCheckDate", getLabelFunCheckDate())
            .append("labelFunEffectDate", getLabelFunEffectDate())
            .append("labelFunCompany", getLabelFunCompany())
            .append("labelStandardCert", getLabelStandardCert())
            .toString();
    }
}
