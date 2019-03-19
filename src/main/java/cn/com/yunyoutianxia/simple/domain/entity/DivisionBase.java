package cn.com.yunyoutianxia.simple.domain.entity;

import javax.persistence.*;

/**
 * Created by tanyp on 2019/3/19
 */
@Table(name = "tour_division_base")
@Entity
public class DivisionBase extends AbstractBase {

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "db_", nullable = false)
    private DivisionBase base;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "df_", nullable = false)
    private DivisionFlow flow;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "dw_", nullable = false)
    private DivisionWechat wechat;

    public DivisionBase getBase() {
        return base;
    }

    public void setBase(DivisionBase base) {
        this.base = base;
    }

    public DivisionFlow getFlow() {
        return flow;
    }

    public void setFlow(DivisionFlow flow) {
        this.flow = flow;
    }

    public DivisionWechat getWechat() {
        return wechat;
    }

    public void setWechat(DivisionWechat wechat) {
        this.wechat = wechat;
    }
}
