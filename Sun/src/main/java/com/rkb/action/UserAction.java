package com.rkb.action;

import com.rkb.biz.UserBiz;
import com.rkb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description:
 * @Author: Aisake
 * @Date: 19-3-11 下午3:40
 */
@Controller
public class UserAction {
    @Autowired
    UserBiz userBiz;

    @PostMapping("/user")
    public String addUser(User user){
        userBiz.addUser(user);
        return "";
    }
    @PutMapping("/user/{id}")
    public String edit(@PathVariable("id") Long id, Model model){
        User user = userBiz.editUser(id);
        model.addAttribute("user",user);
        return "";
    }
    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable("id") Long id){
        userBiz.deleteUser(id);
        return "";
    }
    @GetMapping("/users")
    public String manage(){
        List<User> users = userBiz.showUserList();
        return users.toString();
    }
    @GetMapping("/user/{id}")
    public String get(@PathVariable("id") Long id){
        User user = userBiz.findUser(id);
        return user.toString();
    }
    @RequestMapping("/success")
    public String success(Model model){
        model.addAttribute("s","成功");
        return "success";
    }
}
