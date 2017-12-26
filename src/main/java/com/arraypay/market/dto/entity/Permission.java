package com.arraypay.market.dto.entity;

import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sys_permission")
public class Permission {

    @Id
    @NonNull
    private Integer id;

    /**
     * 编号
     */


    /**
     * 用户名
     */
    @Column
    @NonNull
    private String name;

    /**
     * 用户名
     */
    @Column
    @NonNull
    private String description;
    /**
     * 用户名
     */
    @Column
    @NonNull
    private String url;

    @Column
    private String method;
    /**
     * 用户名
     */
    @Column
    @NonNull
    private Integer pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
