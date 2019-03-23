package cn.com.yunyoutianxia.simple.domain.entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by tanyp on 2019/3/23
 */
@Table(name = "tour_simple")
@Entity
@Cache(region = "simpleCache", usage = CacheConcurrencyStrategy.READ_ONLY)
public class Simple implements Serializable {

    @Id
    @Column(name = "id_", nullable = false, length = 27)
    private String id;

    @Column(name = "name_", nullable = false, length = 50)
    private String name;

    @Column(name = "status_", nullable = false)
    private Integer status;

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
}
