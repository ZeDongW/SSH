package cn.zedongw.ssh.service.impl;

import cn.zedongw.ssh.dao.IUserDao;
import cn.zedongw.ssh.entity.User;
import cn.zedongw.ssh.service.IUserService;

/**
 * @ClassName UserServiceImpl
 * @Description: 用户业务逻辑层接口实现类
 * @Author ZeDongW
 * @Date 2020/4/17 0017 9:58
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class UserServiceImpl implements IUserService {

    private IUserDao userDaoImpl;

    public void setUserDaoImpl(IUserDao userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }

    /**
     * Description: 保存用户
     *
     * @param user 1
     * @throws
     * @methodName: save
     * @return: void
     * @author: ZeDongW
     * @date: 2020/4/17 0017 12:11
     */
    @Override
    public void save(User user) {
        userDaoImpl.save(user);
    }
}
