package cn.zedongw.ssh.dao.impl;

import cn.zedongw.ssh.dao.IUserDao;
import cn.zedongw.ssh.entity.User;
import org.springframework.orm.hibernate5.HibernateTemplate;

/**
 * @ClassName UserDaoImpl
 * @Description: 用户数据访问层接口实现
 * @Author ZeDongW
 * @Date 2020/4/17 0017 9:51
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class UserDaoImpl implements IUserDao {

    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    /**
     * Description: 保存用户
     *
     * @throws
     * @methodName: save
     * @return: void
     * @author: ZeDongW
     * @date: 2020/4/17 0017 12:07
     */
    @Override
    public void save(User user) {
        hibernateTemplate.save(user);
    }
}
