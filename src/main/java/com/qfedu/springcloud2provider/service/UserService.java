package com.qfedu.springcloud2provider.service;

import com.qfedu.springcloud2provider.domain.User;
import com.qfedu.springcloud2provider.vo.R;

import java.util.List;

public interface UserService {

    R save(User user);

    List<User> queryByUsername(String username);
}
