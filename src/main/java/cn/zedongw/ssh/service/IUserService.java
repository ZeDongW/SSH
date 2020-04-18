package cn.zedongw.ssh.service;

import cn.zedongw.ssh.entity.User;

/**
 * @InterfaceName IUserService
 * @Description: 用户业务逻辑层接口
 * @Author ZeDongW
 * @Date 2020/4/17 0017 9:57
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public interface IUserService {
    /**
     * Description: 保存用户
     * @methodName: save
     * @param user 1
     * @throws
     * @return: void
     * @author: ZeDongW
     * @date: 2020/4/17 0017 12:11
     */
    void save(User user);
}
