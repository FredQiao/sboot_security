package com.arraypay.market.dao;

import com.arraypay.market.dto.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PermissionRepository extends JpaRepository<Permission, String> {

    @Query(value = "SELECT p.id, p.name, p.description, p.url, p.method, p.pid FROM sys_user u LEFT JOIN sys_role_user sru ON u.id = sru.sys_user_id LEFT JOIN sys_role r ON sru.sys_role_id = r.id LEFT JOIN sys_permission_role spr ON spr.sys_role_id = r.id LEFT JOIN sys_permission p ON p.id = spr.sys_permission_id WHERE u.id =?1", nativeQuery = true)
    List<Permission> findByAdminUserId(Integer userId);

}
