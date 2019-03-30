package cn.com.yunyoutianxia.simple.domain.entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.List;

/**
 * Created by tanyp on 2019/3/18
 */
@Table(name = "tour_firm")
@Entity
@Cache(region = "firmCache", usage = CacheConcurrencyStrategy.READ_ONLY)
public class Firm extends AbstractCommon {

    @Column(name = "other_", length = 50)
    private String other;

    @Column(name = "received_source", length = 100)
    private String receivedSource;
    /**
     * 1，ERP系统；２，APP(2C)；3，APP(2B)；4，网站(2C)；5，网站(2B)；6，微站(2C)；7，微站(2B)；8，携程接口；
     */
    @ElementCollection(fetch = FetchType.LAZY, targetClass = String.class)
    @CollectionTable(name = "tour_medium",
            joinColumns = @JoinColumn(name = "med_"))
    @Column(name = "medium_", nullable = false, length = 100)
    private List<Integer> mediums;

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getReceivedSource() {
        return receivedSource;
    }

    public void setReceivedSource(String receivedSource) {
        this.receivedSource = receivedSource;
    }

    public List<Integer> getMediums() {
        return mediums;
    }

    public void setMediums(List<Integer> mediums) {
        this.mediums = mediums;
    }
}
