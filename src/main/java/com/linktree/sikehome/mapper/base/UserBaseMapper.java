package com.linktree.sikehome.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.linktree.sikehome.entity.User;
/**
*  @author author
*/
public interface UserBaseMapper {

    int insertUser(User object);

    int updateUser(User object);

    List<User> queryUser(User object);

    User queryUserLimit1(User object);

}