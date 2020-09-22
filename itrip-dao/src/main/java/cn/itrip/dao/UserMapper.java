package cn.itrip.dao;

import cn.itrip.beans.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
     * 根据参数查询
     * @param params
     * @return
     */
    List<User> getUsersByWord(Map<String,Object> params);

    /**
     * 根据参数查询个数
     * @param params
     * @return
     */
    int getUserCountByWord(Map<String ,Object> params);

}
