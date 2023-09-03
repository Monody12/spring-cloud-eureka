package org.example.cloud.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.cloud.user.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
