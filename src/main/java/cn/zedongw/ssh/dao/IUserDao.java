package cn.zedongw.ssh.dao;

import cn.zedongw.ssh.entity.User;

/**
 * @InterfaceName IUserDao
 * @Description: 用户数据访问层接口
 * @Author ZeDongW
 * @Date 2020/4/17 0017 9:49
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public interface IUserDao {
    /**
     * Description: 保存用户
     * @methodName: save
     * @param user 1
     * @throws
     * @return: void
     * @author: ZeDongW
     * @date: 2020/4/17 0017 12:08
     */
    void save(User user);
}
