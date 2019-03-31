package cn.com.yunyoutianxia.simple.param;

import java.io.Serializable;

public class QueryParam implements Serializable {
    private static final long serialVersionUID = 1L;

    protected String strategy;

    protected Integer start;

    protected Integer limit;
    /** -2=不需要总数 -1=需要总数 大于等于0=总数 */
    protected Integer total = -2;
    /** 是否有下一页 */
    protected boolean hasNextPage = false;
    /** 获取总数的SQL/HQL语句 */
    protected String totalQL = null;
    /** totalQL是否为SQL语句 */
    protected boolean sql = false;
    /** 查询总数的方式 1=游标 2=SELECT子句替换 */
    protected Integer totalWay = 1;

    public final Page getPage(){
        return new Page(start, limit);
    }

    public boolean isHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public final boolean needTotal(){
        return total == -1;
    }

    public final void setNeedTotal(){
        total = -1;
    }

    public final void setNotNeedTotal(){
        total = -2;
    }

    public final void setTotal(Integer total){
        this.total = total;
    }

    public final String getStrategy() {
        return strategy;
    }

    public final void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public final Integer getStart() {
        return start;
    }

    public final void setStart(Integer start) {
        this.start = start;
    }

    public final Integer getLimit() {
        return limit;
    }

    public final void setLimit(Integer limit) {
        this.limit = limit;
    }

    public final Integer getTotal() {
        return total;
    }

    /**
     * @return the totalQL
     */
    public String getTotalQL() {
        return totalQL;
    }

    /**
     * @param totalQL the totalQL to set
     */
    public void setTotalQL(String totalQL) {
        this.totalQL = totalQL;
    }

    /**
     * @return the sql
     */
    public boolean isSql() {
        return sql;
    }

    /**
     * @param sql the sql to set
     */
    public void setSql(boolean sql) {
        this.sql = sql;
    }

    /**
     * @return the totalWay
     */
    public Integer getTotalWay() {
        return totalWay;
    }

    /**
     * @param totalWay the totalWay to set
     */
    public void setTotalWay(Integer totalWay) {
        this.totalWay = totalWay;
    }

    public void scroll(){
        this.totalWay = 1;
    }
    public boolean ifScroll(){
        return this.totalWay == 1;
    }
    public void replaceSelect(){
        this.totalWay = 2;
    }
    public boolean ifReplaceSelect(){
        return this.totalWay == 2;
    }
}
