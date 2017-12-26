package com.arraypay.market.web.controller;

import com.arraypay.market.rest.ResultList;
import com.arraypay.market.web.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取用户列表")
    @RequestMapping("/list")
    @ResponseBody
    public ResultList indexMobile(@RequestParam("pageNumber") int pageNumber){
        return ResultList.list(userService.listUsers(pageNumber));
    }
}
