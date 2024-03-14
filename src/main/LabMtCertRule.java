package com.qifeng.lab.mt.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.qifeng.common.annotation.Excel;
import com.qifeng.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 证书规程管理对象 lab_mt_cert_rule
 * 
 * @author qifeng
 * @date 2023-02-16
 */
public class LabMtCertRule extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long certRuleId;

    /** $column.columnComment */
    private Long formInstrumentId;

    /** $column.columnComment */
    private String ruleUuid;

    /** 序号 */
    @Excel(name = "序号")
    private Long indexs;

    /** 标准状态 */
    @Excel(name = "标准状态")
    private Long ruleState;

    /** 标准号码 */
    @Excel(name = "标准号码")
    private String ruleCode;

    /** 标准名称 */
    @Excel(name = "标准名称")
    private String ruleName;

    /** 实施日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "实施日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date useDate;

    /** 序号标签 */
    @Excel(name = "序号标签")
    private String labelIndexs;

    /** 标准号码标签 */
    @Excel(name = "标准号码标签")
    private String labelRuleCode;

    /** 标准名称标签 */
    @Excel(name = "标准名称标签")
    private String labelRuleName;

    /** 标准状态标签 */
    @Excel(name = "标准状态标签")
    private String labelRuleState;

    /** 实施日期标签 */
    @Excel(name = "实施日期标签")
    private String labelUseDate;

    public void setCertRuleId(Long certRuleId) 
    {
        this.certRuleId = certRuleId;
    }

    public Long getCertRuleId() 
    {
        return certRuleId;
    }
    public void setFormInstrumentId(Long formInstrumentId)
    {
        this.formInstrumentId = formInstrumentId;
    }

    public Long getFormInstrumentId()
    {
        return formInstrumentId;
    }
    public void setRuleUuid(String ruleUuid) 
    {
        this.ruleUuid = ruleUuid;
    }

    public String getRuleUuid() 
    {
        return ruleUuid;
    }
    public void setIndexs(Long indexs) 
    {
        this.indexs = indexs;
    }

    public Long getIndexs() 
    {
        return indexs;
    }
    public void setRuleState(Long ruleState) 
    {
        this.ruleState = ruleState;
    }

    public Long getRuleState() 
    {
        return ruleState;
    }
    public void setRuleCode(String ruleCode) 
    {
        this.ruleCode = ruleCode;
    }

    public String getRuleCode() 
    {
        return ruleCode;
    }
    public void setRuleName(String ruleName) 
    {
        this.ruleName = ruleName;
    }

    public String getRuleName() 
    {
        return ruleName;
    }
    public void setUseDate(Date useDate) 
    {
        this.useDate = useDate;
    }

    public Date getUseDate() 
    {
        return useDate;
    }
    public void setLabelIndexs(String labelIndexs) 
    {
        this.labelIndexs = labelIndexs;
    }

    public String getLabelIndexs() 
    {
        return labelIndexs;
    }
    public void setLabelRuleCode(String labelRuleCode) 
    {
        this.labelRuleCode = labelRuleCode;
    }

    public String getLabelRuleCode() 
    {
        return labelRuleCode;
    }
    public void setLabelRuleName(String labelRuleName) 
    {
        this.labelRuleName = labelRuleName;
    }

    public String getLabelRuleName() 
    {
        return labelRuleName;
    }
    public void setLabelRuleState(String labelRuleState) 
    {
        this.labelRuleState = labelRuleState;
    }

    public String getLabelRuleState() 
    {
        return labelRuleState;
    }
    public void setLabelUseDate(String labelUseDate) 
    {
        this.labelUseDate = labelUseDate;
    }

    public String getLabelUseDate() 
    {
        return labelUseDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("certRuleId", getCertRuleId())
            .append("formInstrumentId", getFormInstrumentId())
            .append("ruleUuid", getRuleUuid())
            .append("indexs", getIndexs())
            .append("ruleState", getRuleState())
            .append("ruleCode", getRuleCode())
            .append("ruleName", getRuleName())
            .append("useDate", getUseDate())
            .append("createTime", getCreateTime())
            .append("labelIndexs", getLabelIndexs())
            .append("labelRuleCode", getLabelRuleCode())
            .append("labelRuleName", getLabelRuleName())
            .append("labelRuleState", getLabelRuleState())
            .append("labelUseDate", getLabelUseDate())
            .toString();
    }
}
