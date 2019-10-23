package com.gameley.demo.user;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by B038 on 2018/1/26 0026.
 */
@RestController
@RequestMapping(value="/users")     // 通过这里配置使下面的映射都在/users下，可去除
public class UserController {

    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());
    static {
        User user1 = new User();
        user1.setId(1L);
        user1.setAge(10);
        user1.setName("user1");
        users.put(user1.getId(), user1);
        User user2 = new User();
        user2.setId(2L);
        user2.setAge(20);
        user2.setName("user2");
        users.put(user2.getId(), user2);
    }

    @ApiOperation(value="ユーザーリスト取得", notes="")
    @RequestMapping(value={""}, method=RequestMethod.GET)
    public List<User> getUserList() {
        List<User> r = new ArrayList<>(users.values());
        return r;
    }

    @ApiOperation(value="ユーザー作成", notes="Userオブジェクトよりユーザーを作成する")
    @ApiImplicitParam(name = "user", value = "userオブジェクト", required = true, dataType = "User")
    @RequestMapping(value="", method=RequestMethod.POST)
    public String postUser(@RequestBody User user) {
        users.put(user.getId(), user);
        return "success";
    }

    @ApiOperation(value="ユーザー詳細情報取得", notes="urlのidよりユーザー詳細を取得")
    @ApiImplicitParam(name = "id", value = "ユーザーID", required = true, dataType = "Long", paramType="path")
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        return users.get(id);
    }

    @ApiOperation(value="ユーザー情報更新", notes="urlのidで更新対象を特定する；userオブジェクトの内容でユーザー情報を更新する")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "ユーザーID", required = true, dataType = "Long", paramType="path"),
            @ApiImplicitParam(name = "user", value = "userオブジェクト", required = true, dataType = "User")
    })
    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public String putUser(@PathVariable Long id, @RequestBody User user) {
        User u = users.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id, u);
        return "success";
    }

    @ApiOperation(value="ユーザー削除", notes="urlのidで削除対象を特定する")
    @ApiImplicitParam(name = "id", value = "ユーザーID", required = true, dataType = "Long", paramType="path")
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id) {
        users.remove(id);
        return "success";
    }

}