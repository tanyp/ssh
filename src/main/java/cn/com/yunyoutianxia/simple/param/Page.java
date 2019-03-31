package cn.com.yunyoutianxia.simple.param;

import java.io.Serializable;

public class Page implements Serializable {

	private static final long serialVersionUID = 8311715965150398011L;

	public static final Page DEFAULT = new Page(-1, -1);
	
	public Integer start;
	public Integer limit;

	public Page(Integer start, Integer limit) {
		this.start = start;
		this.limit = limit;
	}

	public Boolean isPaging(){
		return start != null && limit != null && start > -1 && limit > 0;
	}
}
