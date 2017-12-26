package com.arraypay.market.dto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NonNull;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "sys_user")
public class User implements UserDetails{

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
    private String username;

    /**
     * 密码
     */
    @JsonIgnore
    @Column
    @NonNull
    private String password;

    @ManyToMany(cascade={CascadeType.PERSIST,CascadeType.PERSIST,CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinTable(name="sys_role_user",
            joinColumns={
                    @JoinColumn(name="sys_user_id",referencedColumnName="id")
            },
            inverseJoinColumns={
                    @JoinColumn(name="sys_role_id",referencedColumnName="id")
            }
    )
    private List<Role> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
