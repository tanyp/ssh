package cn.com.yunyoutianxia.simple.domain.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by tanyp on 2019/3/19
 */
@MappedSuperclass
public class AbstractBase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "base_id", nullable = false, length = 50)
    private Integer baseId;
    @Column(name = "invoice_", nullable = false)
    @Type(type = "yes_no")
    private Boolean invoice; //是否管理发票号

    @Column(name = "line_contain", nullable = false)
    @Type(type = "yes_no")
    private Boolean lineContain; //线路订单开发票含保险金额

    @Column(name = "monthly_", nullable = false)
    private Integer monthly; //月度结转日期

    @Column(name = "freeze_", nullable = false)
    @Type(type = "yes_no")
    private Boolean freeze; //订单审批超时是否财务冻结

    @Column(name = "profits_", nullable = false)
    @Type(type = "yes_no")
    private Boolean profits;//返还冻结利润

    @Column(name = "standard_", nullable = false)
    private Integer standard;//订单结转参照标准

    @Column(name = "deduction_", nullable = false)
    private Integer deduction;//订单风险管理扣款方式

    @Column(name = "negative_", nullable = false)
    @Type(type = "yes_no")
    private Boolean negative;//临时额度扣除允许扣负

    @Column(name = "pmd_id", nullable = false, length = 50)
    private String pmdId; //采购管理部门

    @Column(name = "pmd_name", nullable = false, length = 50)
    private String pmdName;//采购管理部门

    @Column(name = "pic_id", nullable = false, length = 50)
    private String picId; //采购负责人

    @Column(name = "pic_name", nullable = false, length = 50)
    private String picName;//采购负责人

    @Column(name = "line_time", nullable = false, length = 50)
    private String lineTime; //线路团队预留保持时间

    @Column(name = "flight_time", nullable = false, length = 50)
    private String flightTime;//航班预留保持时间

    @Column(name = "hotel_time", nullable = false, length = 50)
    private String hotelTime;//酒店房间保持时间

    @Column(name = "banner_", nullable = false, length = 50)
    private String banner;//线路团队接团旗号

    @Column(name = "sign_contract", nullable = false)
    @Type(type = "yes_no")
    private Boolean signContract;//线路订单需签订合同

    @Column(name = "cnmm_", nullable = false)
    private Integer cnmm;//线路团队合同号管理模式

    @Column(name = "deduct_", nullable = false)
    private Integer deduct;//线路定金尾款扣除条件

    @Column(name = "cash_id", nullable = false, length = 50)
    private String cashId; //现付代理渠道设置

    @Column(name = "cash_name", nullable = false, length = 50)
    private String cashName;//现付代理渠道设置

    @Column(name = "signet_", nullable = false, length = 50)
    private String signet;//电子合同章

    @Column(name = "access_id", nullable = false, length = 50)
    private String accessId; //电子合同连接参数

    @Column(name = "access_key", nullable = false, length = 50)
    private String accessKey;//电子合同连接参数

    @Column(name = "contracts_num", nullable = false)
    private Integer contractsNum;//可签合同数

    @Column(name = "instance_id", nullable = false, length = 50)
    private String instanceId; //电子合同

    @Column(name = "agency_name", nullable = false, length = 50)
    private String agencyName;//旅行社名称

    @Column(name = "business_license", nullable = false, length = 50)
    private String businessLicense;//旅行社统一社会信用代码/工商注册号

    @Column(name = "travel_agency_license", nullable = false, length = 50)
    private String travelAgencyLicense;//旅行社许可证号

    @Column(name = "open_api_app_id", nullable = false, length = 50)
    private String openApiAppId;//国家旅游监管平台连接参数

    @Column(name = "open_api_sign_key", nullable = false, length = 50)
    private String openApiSignKey;//国家旅游监管平台连接参数

    public Integer getBaseId() {
        return baseId;
    }

    public void setBaseId(Integer baseId) {
        this.baseId = baseId;
    }

    public Boolean getInvoice() {
        return invoice;
    }

    public void setInvoice(Boolean invoice) {
        this.invoice = invoice;
    }

    public Boolean getLineContain() {
        return lineContain;
    }

    public void setLineContain(Boolean lineContain) {
        this.lineContain = lineContain;
    }

    public Integer getMonthly() {
        return monthly;
    }

    public void setMonthly(Integer monthly) {
        this.monthly = monthly;
    }

    public Boolean getFreeze() {
        return freeze;
    }

    public void setFreeze(Boolean freeze) {
        this.freeze = freeze;
    }

    public Boolean getProfits() {
        return profits;
    }

    public void setProfits(Boolean profits) {
        this.profits = profits;
    }

    public Integer getStandard() {
        return standard;
    }

    public void setStandard(Integer standard) {
        this.standard = standard;
    }

    public Integer getDeduction() {
        return deduction;
    }

    public void setDeduction(Integer deduction) {
        this.deduction = deduction;
    }

    public Boolean getNegative() {
        return negative;
    }

    public void setNegative(Boolean negative) {
        this.negative = negative;
    }

    public String getPmdId() {
        return pmdId;
    }

    public void setPmdId(String pmdId) {
        this.pmdId = pmdId;
    }

    public String getPmdName() {
        return pmdName;
    }

    public void setPmdName(String pmdName) {
        this.pmdName = pmdName;
    }

    public String getPicId() {
        return picId;
    }

    public void setPicId(String picId) {
        this.picId = picId;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    public String getLineTime() {
        return lineTime;
    }

    public void setLineTime(String lineTime) {
        this.lineTime = lineTime;
    }

    public String getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    public String getHotelTime() {
        return hotelTime;
    }

    public void setHotelTime(String hotelTime) {
        this.hotelTime = hotelTime;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public Boolean getSignContract() {
        return signContract;
    }

    public void setSignContract(Boolean signContract) {
        this.signContract = signContract;
    }

    public Integer getCnmm() {
        return cnmm;
    }

    public void setCnmm(Integer cnmm) {
        this.cnmm = cnmm;
    }

    public Integer getDeduct() {
        return deduct;
    }

    public void setDeduct(Integer deduct) {
        this.deduct = deduct;
    }

    public String getCashId() {
        return cashId;
    }

    public void setCashId(String cashId) {
        this.cashId = cashId;
    }

    public String getCashName() {
        return cashName;
    }

    public void setCashName(String cashName) {
        this.cashName = cashName;
    }

    public String getSignet() {
        return signet;
    }

    public void setSignet(String signet) {
        this.signet = signet;
    }

    public String getAccessId() {
        return accessId;
    }

    public void setAccessId(String accessId) {
        this.accessId = accessId;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public Integer getContractsNum() {
        return contractsNum;
    }

    public void setContractsNum(Integer contractsNum) {
        this.contractsNum = contractsNum;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public String getTravelAgencyLicense() {
        return travelAgencyLicense;
    }

    public void setTravelAgencyLicense(String travelAgencyLicense) {
        this.travelAgencyLicense = travelAgencyLicense;
    }

    public String getOpenApiAppId() {
        return openApiAppId;
    }

    public void setOpenApiAppId(String openApiAppId) {
        this.openApiAppId = openApiAppId;
    }

    public String getOpenApiSignKey() {
        return openApiSignKey;
    }

    public void setOpenApiSignKey(String openApiSignKey) {
        this.openApiSignKey = openApiSignKey;
    }
}
