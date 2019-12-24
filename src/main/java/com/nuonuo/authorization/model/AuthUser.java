package com.nuonuo.authorization.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by admin on 2019/12/22 0:54:30.
 */
@Entity(name = "auth_user")
public class AuthUser {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String userId;
    
    private String appKey;
    
    private String thirdUserId;
    
    private Date createDate;
    
    private Date updateDate;
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getAppKey() {
        return appKey;
    }
    
    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }
    
    public String getThirdUserId() {
        return thirdUserId;
    }
    
    public void setThirdUserId(String thirdUserId) {
        this.thirdUserId = thirdUserId;
    }
    
    public Date getCreateDate() {
        return createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    
    public Date getUpdateDate() {
        return updateDate;
    }
    
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
