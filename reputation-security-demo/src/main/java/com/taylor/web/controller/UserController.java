package com.taylor.web.controller;

import com.taylor.dto.User;
import com.taylor.dto.UserQueryCondition;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author taylor
 */
@RestController
public class UserController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> query(@RequestParam(name = "username", required = false) String othername) {
        System.out.println(othername);
        List<User> lists = new ArrayList<>();
        lists.add(new User("taylor", "123456"));
        lists.add(new User("taylor", "123456"));
        lists.add(new User("taylor", "123456"));
        return lists;
    }

    /**
     * @param condition
     * @param pageable  spring data 提供的分页处理
     * @return
     */
    @RequestMapping(value = "/user2", method = RequestMethod.GET)
    public List<User> queryByObject(UserQueryCondition condition, @PageableDefault(size = 20, page = 2, sort = "age,asc") Pageable pageable) {
        System.out.println(ReflectionToStringBuilder.toString(condition, ToStringStyle.MULTI_LINE_STYLE));
        System.out.println(pageable.getPageNumber());
        System.out.println(pageable.getPageSize());
        System.out.println(pageable.getSort());
        List<User> lists = new ArrayList<>();
        lists.add(new User("taylor", "123456"));
        lists.add(new User("taylor", "123456"));
        lists.add(new User("taylor", "123456"));
        return lists;
    }

    /**
     * @PathVariable 映射url片段到java方法参数
     */
    @RequestMapping(value = "/user/{id:\\d+}", method = RequestMethod.GET)
    public User getInfo(@PathVariable int id) {
        System.out.println(id);
        User user = new User();
        user.setUsername("tom");
        return user;
    }
}
