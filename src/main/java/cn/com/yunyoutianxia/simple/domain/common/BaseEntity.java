package cn.com.yunyoutianxia.simple.domain.common;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.io.Serializable;

/**
 * Created by tanyp on 2019/3/24
 */
@MappedSuperclass
public class BaseEntity implements Serializable {
    @Id
    @Column(name="id_", nullable = false, length = 20, updatable = false)
    private String id;
    @Version
    @Column(name="version_", nullable = false)
    private Integer version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
