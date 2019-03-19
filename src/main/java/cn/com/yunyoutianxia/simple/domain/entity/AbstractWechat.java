package cn.com.yunyoutianxia.simple.domain.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by tanyp on 2019/3/19
 */
@MappedSuperclass
public class AbstractWechat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chat_id", nullable = false, length = 50)
    private Integer chatId;

    @Column(name = "corp_id", nullable = false, length = 50)
    private String corpId;//

    @Column(name = "qy_qr_code_path", nullable = false, length = 50)
    private String qyQrCodePath;

    @Column(name = "app_id", nullable = false, length = 50)
    private String appId;

    @Column(name = "secret_", nullable = false, length = 50)
    private String secret;

    @Column(name = "wx_no", nullable = false, length = 50)
    private String wxNo;

    @Column(name = "token_", nullable = false, length = 50)
    private String token;

    @Column(name = "aes_key", nullable = false, length = 50)
    private String aesKey;

    @Column(name = "qy_helper_id", nullable = false, length = 50)
    private String qyHelperId;

    @Column(name = "qy_helper_secret", nullable = false, length = 50)
    private String qyHelperSecret;

    @Column(name = "qy_helper_name", nullable = false, length = 50)
    private String qyHelperName;

    @Column(name = "contract_manager_id", nullable = false, length = 50)
    private String contractManagerId;

    @Column(name = "contract_manager_secret", nullable = false, length = 50)
    private String contractManagerSecret;

    @Column(name = "contract_manager_name", nullable = false, length = 50)
    private String contractManagerName;

    @Column(name = "notices_manager_id", nullable = false, length = 50)
    private String noticesManagerId;

    @Column(name = "notices_manager_secret", nullable = false, length = 50)
    private String noticesManagerSecret;

    @Column(name = "notices_manager_name", nullable = false, length = 50)
    private String noticesManagerName;

    @Column(name = "order_manager_id", nullable = false, length = 50)
    private String orderManagerId;

    @Column(name = "order_manager_secret", nullable = false, length = 50)
    private String orderManagerSecret;

    @Column(name = "order_manager_name", nullable = false, length = 50)
    private String orderManagerName;

    public Integer getChatId() {
        return chatId;
    }

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public String getQyQrCodePath() {
        return qyQrCodePath;
    }

    public void setQyQrCodePath(String qyQrCodePath) {
        this.qyQrCodePath = qyQrCodePath;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getWxNo() {
        return wxNo;
    }

    public void setWxNo(String wxNo) {
        this.wxNo = wxNo;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAesKey() {
        return aesKey;
    }

    public void setAesKey(String aesKey) {
        this.aesKey = aesKey;
    }

    public String getQyHelperId() {
        return qyHelperId;
    }

    public void setQyHelperId(String qyHelperId) {
        this.qyHelperId = qyHelperId;
    }

    public String getQyHelperSecret() {
        return qyHelperSecret;
    }

    public void setQyHelperSecret(String qyHelperSecret) {
        this.qyHelperSecret = qyHelperSecret;
    }

    public String getQyHelperName() {
        return qyHelperName;
    }

    public void setQyHelperName(String qyHelperName) {
        this.qyHelperName = qyHelperName;
    }

    public String getContractManagerId() {
        return contractManagerId;
    }

    public void setContractManagerId(String contractManagerId) {
        this.contractManagerId = contractManagerId;
    }

    public String getContractManagerSecret() {
        return contractManagerSecret;
    }

    public void setContractManagerSecret(String contractManagerSecret) {
        this.contractManagerSecret = contractManagerSecret;
    }

    public String getContractManagerName() {
        return contractManagerName;
    }

    public void setContractManagerName(String contractManagerName) {
        this.contractManagerName = contractManagerName;
    }

    public String getNoticesManagerId() {
        return noticesManagerId;
    }

    public void setNoticesManagerId(String noticesManagerId) {
        this.noticesManagerId = noticesManagerId;
    }

    public String getNoticesManagerSecret() {
        return noticesManagerSecret;
    }

    public void setNoticesManagerSecret(String noticesManagerSecret) {
        this.noticesManagerSecret = noticesManagerSecret;
    }

    public String getNoticesManagerName() {
        return noticesManagerName;
    }

    public void setNoticesManagerName(String noticesManagerName) {
        this.noticesManagerName = noticesManagerName;
    }

    public String getOrderManagerId() {
        return orderManagerId;
    }

    public void setOrderManagerId(String orderManagerId) {
        this.orderManagerId = orderManagerId;
    }

    public String getOrderManagerSecret() {
        return orderManagerSecret;
    }

    public void setOrderManagerSecret(String orderManagerSecret) {
        this.orderManagerSecret = orderManagerSecret;
    }

    public String getOrderManagerName() {
        return orderManagerName;
    }

    public void setOrderManagerName(String orderManagerName) {
        this.orderManagerName = orderManagerName;
    }
}
