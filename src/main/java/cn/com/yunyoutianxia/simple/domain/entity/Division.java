package cn.com.yunyoutianxia.simple.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by tanyp on 2019/3/18
 */
@Table(name = "tour_division")
@Entity
public class Division extends AbstractCommon {
    @Column(name = "parameter_control", nullable = false)
    private Integer parameterControl;

    @Column(name = "is_org")
    private Integer isOrg;

    public Integer getParameterControl() {
        return parameterControl;
    }

    public void setParameterControl(Integer parameterControl) {
        this.parameterControl = parameterControl;
    }

    public Integer getIsOrg() {
        return isOrg;
    }

    public void setIsOrg(Integer isOrg) {
        this.isOrg = isOrg;
    }
}
