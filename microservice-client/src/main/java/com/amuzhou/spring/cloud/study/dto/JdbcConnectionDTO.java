package com.amuzhou.spring.cloud.study.dto;

import java.io.Serializable;

/**
 * @author zhoumeng750
 * @ClassName: JdbcConnectionDTO
 * @Description:
 * @date 17/6/14
 */
public class JdbcConnectionDTO implements Serializable {
    private static final long serialVersionUID = 1412159569440347101L;

    private String            driverName;
    private String            password;
    private String            url;
    private String            username;

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
