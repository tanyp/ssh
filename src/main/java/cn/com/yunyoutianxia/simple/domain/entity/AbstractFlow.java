package cn.com.yunyoutianxia.simple.domain.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by tanyp on 2019/3/19
 */
@MappedSuperclass
public class AbstractFlow implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flow_id", nullable = false, length = 50)
    private Integer flowId;

    @Column(name = "line_enable", nullable = false)
    @Type(type = "yes_no")
    private Boolean lineEnable; //审批线路档案启用
    @Column(name = "line_approve_id", nullable = false, length = 50)
    private String lineApproveId;//审批线路档案启用
    @Column(name = "line_approve_name", nullable = false, length = 50)
    private String lineApproveName;//审批线路档案启用

    @Column(name = "line_release", nullable = false)
    @Type(type = "yes_no")
    private Boolean lineRelease;//审批线路团队发布
    @Column(name = "lineRelease_approve_id", nullable = false, length = 50)
    private String lineReleaseApproveId;//审批线路团队发布
    @Column(name = "lineRelease_approve_name", nullable = false, length = 50)
    private String lineReleaseApproveName;//审批线路团队发布

    @Column(name = "line_empty", nullable = false)
    @Type(type = "yes_no")
    private Boolean lineEmpty;//审批线路团队修改空位数
    @Column(name = "lineEmpty_approve_id", nullable = false, length = 50)
    private String lineEmptyApproveId;//审批线路团队修改空位数
    @Column(name = "lineEmpty_approve_name", nullable = false, length = 50)
    private String lineEmptyApproveName;//审批线路团队修改空位数

    @Column(name = "line_dq", nullable = false)
    @Type(type = "yes_no")
    private Boolean lineDQ;//审批线路团队修改分销报价
    @Column(name = "lineDQ_approve_id", nullable = false, length = 50)
    private String lineDQApproveId;//审批线路团队修改分销报价
    @Column(name = "lineDQ_approve_name", nullable = false, length = 50)
    private String lineDQApproveName;//审批线路团队修改分销报价

    @Column(name = "line_tqb", nullable = false)
    @Type(type = "yes_no")
    private Boolean lineTQB;//审批线路团队临时额度报名
    @Column(name = "lineTQB_approve_id", nullable = false, length = 50)
    private String lineTQBApproveId;//审批线路团队临时额度报名
    @Column(name = "lineTQB_approve_name", nullable = false, length = 50)
    private String lineTQBApproveName;//审批线路团队临时额度报名

    @Column(name = "line_tc", nullable = false)
    @Type(type = "yes_no")
    private Boolean lineTC;//审批线路团队游客退订
    @Column(name = "lineTC_approve_id", nullable = false, length = 50)
    private String lineTCApproveId;//审批线路团队游客退订
    @Column(name = "lineTC_approve_name", nullable = false, length = 50)
    private String lineTCApproveName;//审批线路团队游客退订

    @Column(name = "line_cancel", nullable = false)
    @Type(type = "yes_no")
    private Boolean lineCancel;//审批线路团队取消
    @Column(name = "lineCancel_approve_id", nullable = false, length = 50)
    private String lineCancelApproveId;//审批线路团队取消
    @Column(name = "lineCancel_approve_name", nullable = false, length = 50)
    private String lineCancelApproveName;//审批线路团队取消

    @Column(name = "line_extra", nullable = false)
    @Type(type = "yes_no")
    private Boolean lineExtra;//审批线路销售订单修改附加服务
    @Column(name = "lineExtra_approve_id", nullable = false, length = 50)
    private String lineExtraApproveId;//审批线路销售订单修改附加服务
    @Column(name = "lineExtra_approve_name", nullable = false, length = 50)
    private String lineExtraApproveName;//审批线路销售订单修改附加服务

    @Column(name = "line_osp", nullable = false)
    @Type(type = "yes_no")
    private Boolean lineOSP;//审批线路销售订单修改销售价格
    @Column(name = "lineOSP_approve_id", nullable = false, length = 50)
    private String lineOSPApproveId;//审批线路销售订单修改销售价格
    @Column(name = "lineOSP_approve_name", nullable = false, length = 50)
    private String lineOSPApproveName;//审批线路销售订单修改销售价格

    @Column(name = "line_ose", nullable = false)
    @Type(type = "yes_no")
    private Boolean lineOSE;//审批线路销售订单修改销售费用
    @Column(name = "lineOSE_approve_id", nullable = false, length = 50)
    private String lineOSEApproveId;//审批线路销售订单修改销售费用
    @Column(name = "lineOSE_approve_name", nullable = false, length = 50)
    private String lineOSEApproveName;//审批线路销售订单修改销售费用

    @Column(name = "line_ocp", nullable = false)
    @Type(type = "yes_no")
    private Boolean lineOCP;//审批线路销售订单修改成本价格
    @Column(name = "lineOCP_approve_id", nullable = false, length = 50)
    private String lineOCPApproveId;//审批线路销售订单修改成本价格
    @Column(name = "lineOCP_approve_name", nullable = false, length = 50)
    private String lineOCPApproveName;//审批线路销售订单修改成本价格

    @Column(name = "line_oce", nullable = false)
    @Type(type = "yes_no")
    private Boolean lineOCE;//审批线路销售订单修改成本费用
    @Column(name = "lineOCE_approve_id", nullable = false, length = 50)
    private String lineOCEApproveId;//审批线路销售订单修改成本费用
    @Column(name = "lineOCE_approve_name", nullable = false, length = 50)
    private String lineOCEApproveName;//审批线路销售订单修改成本费用

    @Column(name = "line_pcp", nullable = false)
    @Type(type = "yes_no")
    private Boolean linePCP;//审批线路采购订单修改成本价格
    @Column(name = "linePCP_approve_id", nullable = false, length = 50)
    private String linePCPApproveId;//审批线路采购订单修改成本价格
    @Column(name = "linePCP_approve_name", nullable = false, length = 50)
    private String linePCPApproveName;//审批线路采购订单修改成本价格

    @Column(name = "line_pce", nullable = false)
    @Type(type = "yes_no")
    private Boolean linePCE;//审批线路采购订单修改成本费用
    @Column(name = "linePCE_approve_id", nullable = false, length = 50)
    private String linePCEApproveId;//审批线路采购订单修改成本费用
    @Column(name = "linePCE_approve_name", nullable = false, length = 50)
    private String linePCEApproveName;//审批线路采购订单修改成本费用

    @Column(name = "line_otbc", nullable = false)
    @Type(type = "yes_no")
    private Boolean lineOTBC;//审批线路待确认销售订单
    @Column(name = "lineOTBC_approve_id", nullable = false, length = 50)
    private String lineOTBCApproveId;//审批线路待确认销售订单
    @Column(name = "lineOTBC_approve_name", nullable = false, length = 50)
    private String lineOTBCApproveName;//审批线路待确认销售订单

    @Column(name = "line_citi", nullable = false)
    @Type(type = "yes_no")
    private Boolean lineCITI;//审批线路预订游客资料变更
    @Column(name = "lineCITI_approve_id", nullable = false, length = 50)
    private String lineCITIApproveId;//审批线路预订游客资料变更
    @Column(name = "lineCITI_approve_name", nullable = false, length = 50)
    private String lineCITIApproveName;//审批线路预订游客资料变更

    @Column(name = "line_ap", nullable = false)
    @Type(type = "yes_no")
    private Boolean lineAP;//审批渠道自动充款
    @Column(name = "lineAP_approve_id", nullable = false, length = 50)
    private String lineAPApproveId;//审批渠道自动充款
    @Column(name = "lineAP_approve_name", nullable = false, length = 50)
    private String lineAPApproveName;//审批渠道自动充款

    @Column(name = "line_oat", nullable = false)
    @Type(type = "yes_no")
    private Boolean lineOAT;//审批销售订单增加游客
    @Column(name = "lineOAT_approve_id", nullable = false, length = 50)
    private String lineOATApproveId;//审批销售订单增加游客
    @Column(name = "lineOAT_approve_name", nullable = false, length = 50)
    private String lineOATApproveName;//审批销售订单增加游客

    public Integer getFlowId() {
        return flowId;
    }

    public void setFlowId(Integer flowId) {
        this.flowId = flowId;
    }

    public Boolean getLineEnable() {
        return lineEnable;
    }

    public void setLineEnable(Boolean lineEnable) {
        this.lineEnable = lineEnable;
    }

    public String getLineApproveId() {
        return lineApproveId;
    }

    public void setLineApproveId(String lineApproveId) {
        this.lineApproveId = lineApproveId;
    }

    public String getLineApproveName() {
        return lineApproveName;
    }

    public void setLineApproveName(String lineApproveName) {
        this.lineApproveName = lineApproveName;
    }

    public Boolean getLineRelease() {
        return lineRelease;
    }

    public void setLineRelease(Boolean lineRelease) {
        this.lineRelease = lineRelease;
    }

    public String getLineReleaseApproveId() {
        return lineReleaseApproveId;
    }

    public void setLineReleaseApproveId(String lineReleaseApproveId) {
        this.lineReleaseApproveId = lineReleaseApproveId;
    }

    public String getLineReleaseApproveName() {
        return lineReleaseApproveName;
    }

    public void setLineReleaseApproveName(String lineReleaseApproveName) {
        this.lineReleaseApproveName = lineReleaseApproveName;
    }

    public Boolean getLineEmpty() {
        return lineEmpty;
    }

    public void setLineEmpty(Boolean lineEmpty) {
        this.lineEmpty = lineEmpty;
    }

    public String getLineEmptyApproveId() {
        return lineEmptyApproveId;
    }

    public void setLineEmptyApproveId(String lineEmptyApproveId) {
        this.lineEmptyApproveId = lineEmptyApproveId;
    }

    public String getLineEmptyApproveName() {
        return lineEmptyApproveName;
    }

    public void setLineEmptyApproveName(String lineEmptyApproveName) {
        this.lineEmptyApproveName = lineEmptyApproveName;
    }

    public Boolean getLineDQ() {
        return lineDQ;
    }

    public void setLineDQ(Boolean lineDQ) {
        this.lineDQ = lineDQ;
    }

    public String getLineDQApproveId() {
        return lineDQApproveId;
    }

    public void setLineDQApproveId(String lineDQApproveId) {
        this.lineDQApproveId = lineDQApproveId;
    }

    public String getLineDQApproveName() {
        return lineDQApproveName;
    }

    public void setLineDQApproveName(String lineDQApproveName) {
        this.lineDQApproveName = lineDQApproveName;
    }

    public Boolean getLineTQB() {
        return lineTQB;
    }

    public void setLineTQB(Boolean lineTQB) {
        this.lineTQB = lineTQB;
    }

    public String getLineTQBApproveId() {
        return lineTQBApproveId;
    }

    public void setLineTQBApproveId(String lineTQBApproveId) {
        this.lineTQBApproveId = lineTQBApproveId;
    }

    public String getLineTQBApproveName() {
        return lineTQBApproveName;
    }

    public void setLineTQBApproveName(String lineTQBApproveName) {
        this.lineTQBApproveName = lineTQBApproveName;
    }

    public Boolean getLineTC() {
        return lineTC;
    }

    public void setLineTC(Boolean lineTC) {
        this.lineTC = lineTC;
    }

    public String getLineTCApproveId() {
        return lineTCApproveId;
    }

    public void setLineTCApproveId(String lineTCApproveId) {
        this.lineTCApproveId = lineTCApproveId;
    }

    public String getLineTCApproveName() {
        return lineTCApproveName;
    }

    public void setLineTCApproveName(String lineTCApproveName) {
        this.lineTCApproveName = lineTCApproveName;
    }

    public Boolean getLineCancel() {
        return lineCancel;
    }

    public void setLineCancel(Boolean lineCancel) {
        this.lineCancel = lineCancel;
    }

    public String getLineCancelApproveId() {
        return lineCancelApproveId;
    }

    public void setLineCancelApproveId(String lineCancelApproveId) {
        this.lineCancelApproveId = lineCancelApproveId;
    }

    public String getLineCancelApproveName() {
        return lineCancelApproveName;
    }

    public void setLineCancelApproveName(String lineCancelApproveName) {
        this.lineCancelApproveName = lineCancelApproveName;
    }

    public Boolean getLineExtra() {
        return lineExtra;
    }

    public void setLineExtra(Boolean lineExtra) {
        this.lineExtra = lineExtra;
    }

    public String getLineExtraApproveId() {
        return lineExtraApproveId;
    }

    public void setLineExtraApproveId(String lineExtraApproveId) {
        this.lineExtraApproveId = lineExtraApproveId;
    }

    public String getLineExtraApproveName() {
        return lineExtraApproveName;
    }

    public void setLineExtraApproveName(String lineExtraApproveName) {
        this.lineExtraApproveName = lineExtraApproveName;
    }

    public Boolean getLineOSP() {
        return lineOSP;
    }

    public void setLineOSP(Boolean lineOSP) {
        this.lineOSP = lineOSP;
    }

    public String getLineOSPApproveId() {
        return lineOSPApproveId;
    }

    public void setLineOSPApproveId(String lineOSPApproveId) {
        this.lineOSPApproveId = lineOSPApproveId;
    }

    public String getLineOSPApproveName() {
        return lineOSPApproveName;
    }

    public void setLineOSPApproveName(String lineOSPApproveName) {
        this.lineOSPApproveName = lineOSPApproveName;
    }

    public Boolean getLineOSE() {
        return lineOSE;
    }

    public void setLineOSE(Boolean lineOSE) {
        this.lineOSE = lineOSE;
    }

    public String getLineOSEApproveId() {
        return lineOSEApproveId;
    }

    public void setLineOSEApproveId(String lineOSEApproveId) {
        this.lineOSEApproveId = lineOSEApproveId;
    }

    public String getLineOSEApproveName() {
        return lineOSEApproveName;
    }

    public void setLineOSEApproveName(String lineOSEApproveName) {
        this.lineOSEApproveName = lineOSEApproveName;
    }

    public Boolean getLineOCP() {
        return lineOCP;
    }

    public void setLineOCP(Boolean lineOCP) {
        this.lineOCP = lineOCP;
    }

    public String getLineOCPApproveId() {
        return lineOCPApproveId;
    }

    public void setLineOCPApproveId(String lineOCPApproveId) {
        this.lineOCPApproveId = lineOCPApproveId;
    }

    public String getLineOCPApproveName() {
        return lineOCPApproveName;
    }

    public void setLineOCPApproveName(String lineOCPApproveName) {
        this.lineOCPApproveName = lineOCPApproveName;
    }

    public Boolean getLineOCE() {
        return lineOCE;
    }

    public void setLineOCE(Boolean lineOCE) {
        this.lineOCE = lineOCE;
    }

    public String getLineOCEApproveId() {
        return lineOCEApproveId;
    }

    public void setLineOCEApproveId(String lineOCEApproveId) {
        this.lineOCEApproveId = lineOCEApproveId;
    }

    public String getLineOCEApproveName() {
        return lineOCEApproveName;
    }

    public void setLineOCEApproveName(String lineOCEApproveName) {
        this.lineOCEApproveName = lineOCEApproveName;
    }

    public Boolean getLinePCP() {
        return linePCP;
    }

    public void setLinePCP(Boolean linePCP) {
        this.linePCP = linePCP;
    }

    public String getLinePCPApproveId() {
        return linePCPApproveId;
    }

    public void setLinePCPApproveId(String linePCPApproveId) {
        this.linePCPApproveId = linePCPApproveId;
    }

    public String getLinePCPApproveName() {
        return linePCPApproveName;
    }

    public void setLinePCPApproveName(String linePCPApproveName) {
        this.linePCPApproveName = linePCPApproveName;
    }

    public Boolean getLinePCE() {
        return linePCE;
    }

    public void setLinePCE(Boolean linePCE) {
        this.linePCE = linePCE;
    }

    public String getLinePCEApproveId() {
        return linePCEApproveId;
    }

    public void setLinePCEApproveId(String linePCEApproveId) {
        this.linePCEApproveId = linePCEApproveId;
    }

    public String getLinePCEApproveName() {
        return linePCEApproveName;
    }

    public void setLinePCEApproveName(String linePCEApproveName) {
        this.linePCEApproveName = linePCEApproveName;
    }

    public Boolean getLineOTBC() {
        return lineOTBC;
    }

    public void setLineOTBC(Boolean lineOTBC) {
        this.lineOTBC = lineOTBC;
    }

    public String getLineOTBCApproveId() {
        return lineOTBCApproveId;
    }

    public void setLineOTBCApproveId(String lineOTBCApproveId) {
        this.lineOTBCApproveId = lineOTBCApproveId;
    }

    public String getLineOTBCApproveName() {
        return lineOTBCApproveName;
    }

    public void setLineOTBCApproveName(String lineOTBCApproveName) {
        this.lineOTBCApproveName = lineOTBCApproveName;
    }

    public Boolean getLineCITI() {
        return lineCITI;
    }

    public void setLineCITI(Boolean lineCITI) {
        this.lineCITI = lineCITI;
    }

    public String getLineCITIApproveId() {
        return lineCITIApproveId;
    }

    public void setLineCITIApproveId(String lineCITIApproveId) {
        this.lineCITIApproveId = lineCITIApproveId;
    }

    public String getLineCITIApproveName() {
        return lineCITIApproveName;
    }

    public void setLineCITIApproveName(String lineCITIApproveName) {
        this.lineCITIApproveName = lineCITIApproveName;
    }

    public Boolean getLineAP() {
        return lineAP;
    }

    public void setLineAP(Boolean lineAP) {
        this.lineAP = lineAP;
    }

    public String getLineAPApproveId() {
        return lineAPApproveId;
    }

    public void setLineAPApproveId(String lineAPApproveId) {
        this.lineAPApproveId = lineAPApproveId;
    }

    public String getLineAPApproveName() {
        return lineAPApproveName;
    }

    public void setLineAPApproveName(String lineAPApproveName) {
        this.lineAPApproveName = lineAPApproveName;
    }

    public Boolean getLineOAT() {
        return lineOAT;
    }

    public void setLineOAT(Boolean lineOAT) {
        this.lineOAT = lineOAT;
    }

    public String getLineOATApproveId() {
        return lineOATApproveId;
    }

    public void setLineOATApproveId(String lineOATApproveId) {
        this.lineOATApproveId = lineOATApproveId;
    }

    public String getLineOATApproveName() {
        return lineOATApproveName;
    }

    public void setLineOATApproveName(String lineOATApproveName) {
        this.lineOATApproveName = lineOATApproveName;
    }
}
