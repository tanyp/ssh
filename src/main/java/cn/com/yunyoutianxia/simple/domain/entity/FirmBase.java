package cn.com.yunyoutianxia.simple.domain.entity;

import javax.persistence.*;

/**
 * Created by tanyp on 2019/3/18
 */
@Table(name = "tour_firm_base")
@Entity
public class FirmBase extends AbstractBase {

    @Column(name = "cid_", nullable = false, length = 50)
    private String cid; //分公司本位币

    @Column(name = "cName_", nullable = false, length = 50)
    private String cName; //分公司本位币

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "fb_", nullable = false)
    private FirmBase fb;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ff_", nullable = false)
    private FirmFlow ff;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "fw_", nullable = false)
    private FirmWechat fw;

    public FirmBase getFb() {
        return fb;
    }

    public void setFb(FirmBase fb) {
        this.fb = fb;
    }

    public FirmFlow getFf() {
        return ff;
    }

    public void setFf(FirmFlow ff) {
        this.ff = ff;
    }

    public FirmWechat getFw() {
        return fw;
    }

    public void setFw(FirmWechat fw) {
        this.fw = fw;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }
}
