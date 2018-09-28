package com.qfedu.springcloud2provider.manager;

import com.qfedu.springcloud2provider.domain.User;
import com.qfedu.springcloud2provider.mapper.UserMapper;
import com.qfedu.springcloud2provider.service.UserService;
import com.qfedu.springcloud2provider.vo.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    @Override
    public R save(User user) {
        if (userMapper.insert(user) > 0) {
            return new R(200,"OK");
        } else {
            return new R(404,"error");
        }
    }

    @Override
    public List<User> queryByUsername(String username) {
        return userMapper.selectAll(username);
    }
}
