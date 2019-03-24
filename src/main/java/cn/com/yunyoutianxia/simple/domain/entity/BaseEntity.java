package cn.com.yunyoutianxia.simple.domain.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.io.Serializable;

@MappedSuperclass
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_", nullable = false, length = 20, updatable = false)
	private String id;
	@Version
	@Column(name="version_", nullable = false)
	private Integer version;
	
	public void init() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getVersion() {
		return version;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		BaseEntity other = (BaseEntity) obj;
		if(id != null && other.id != null){
			return id.equals(other.id);
		}else{
			return false;
		}
	}
	
}
