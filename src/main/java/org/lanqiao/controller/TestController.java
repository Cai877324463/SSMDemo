package org.lanqiao.controller;

import org.lanqiao.bean.RtnObj;
import org.lanqiao.bean.User;
import org.lanqiao.bean.UserList;
import org.lanqiao.service.IUService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 卢勇全 on 2017/9/2.
 */
@Controller
@RequestMapping("/user")
public class TestController {
    @Autowired
    IUService iuService;

    //自定义对象类型
    @RequestMapping("/reg.do")
    public String reg(User user){
        System.out.println(user);
        return "hello";
    }

    @RequestMapping("/baseType.do")
    @ResponseBody//该注解指的是将内容或对象作为HTTP 相应正文返回 便于测试用
    public String baseType(Integer userid){
        return userid+"";
    }

    //自定义混合对象
    @RequestMapping("/myFixObj.do")
    @ResponseBody
    public String myFixObj(RtnObj rtn){
        return rtn.toString();
    }

    //List绑定
    @RequestMapping("/myList.do")
    @ResponseBody
    public String myList(UserList userList){
        return userList.toString();
    }

    /**
     * 赠删改查
     * @return
     */
    @RequestMapping(value = "",method = RequestMethod.GET)
    @ResponseBody
    public List<User> getAllUser(){
        List<User> list = iuService.getAllUser();
        return list;
    }
    @RequestMapping(value = "/{userid}",method = RequestMethod.DELETE)
    @ResponseBody
    public int delUser(@PathVariable Integer userid){
        return iuService.delUser(userid);
    }
    @RequestMapping(value = "",method = RequestMethod.PUT)
    @ResponseBody
    public int updateUser(@RequestBody User user){
        return iuService.updateUser(user);
    }
    @RequestMapping(value = "",method = RequestMethod.POST)
    @ResponseBody
    public int addUser(@RequestBody User user){
        return iuService.addUser(user);
    }
    @RequestMapping(value = "/{userid}",method = RequestMethod.GET)
    @ResponseBody
    public User getOneUser(@PathVariable Integer userid){
        User user = iuService.getOneUser(userid);
        return user;
    }

    @RequestMapping("/condition.do")
    public ModelAndView getUserByCondition(User user){
        List<User> list = iuService.getUserByCondition(user);
        Map map = new HashMap();
        map.put("userList",list);
        return new ModelAndView("showUser",map);
    }
    @RequestMapping("/findcondition.do")
    public ModelAndView findUserByCondition(User user){
        List<User> list = iuService.findUserByCondition(user);
        Map map = new HashMap();
        map.put("userList",list);
        return new ModelAndView("showUser",map);
    }
}
