package cn.com.yunyoutianxia.simple.domain.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by tanyp on 2019/3/19
 */
@MappedSuperclass
public class AbstractCommon implements Serializable {
    @Id
    @Column(name = "id_", nullable = false, length = 27, updatable = false)
    private String id;

    @Column(name = "name_", nullable = false, length = 50)
    private String name;

    @Column(name = "status_", nullable = false)
    private Integer status;

    @Column(name = "english_name", length = 50)
    private String englishName;

    @Column(name = "short_name", length = 50)
    private String shortName;

    @Column(name = "email_", length = 50)
    private String email;

    @Column(name = "code_", nullable = false, length = 50)
    private String code;

    @Column(name = "city_id", nullable = false, length = 50)
    private String cityId;

    @Column(name = "city_name", nullable = false, length = 50)
    private String cityName;

    @Column(name = "mobile_", length = 50)
    private String mobile;

    @Column(name = "address_", length = 50)
    private String address;

    @Column(name = "fax_", length = 50)
    private String fax;

    @Column(name = "remark_", length = 200)
    private String remark;

    @Column(name = "license_", nullable = false, length = 50)
    private String license;

    @Column(name = "business_certificate", length = 50)
    private String businessCertificate;

    @Column(name = "postal_code", length = 50)
    private String postalCode;

    @Column(name = "complaint_call", length = 50)
    private String complaintCall;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getBusinessCertificate() {
        return businessCertificate;
    }

    public void setBusinessCertificate(String businessCertificate) {
        this.businessCertificate = businessCertificate;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getComplaintCall() {
        return complaintCall;
    }

    public void setComplaintCall(String complaintCall) {
        this.complaintCall = complaintCall;
    }
}
