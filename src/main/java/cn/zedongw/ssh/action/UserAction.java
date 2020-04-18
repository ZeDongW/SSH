package cn.zedongw.ssh.action;

import cn.zedongw.ssh.entity.User;
import cn.zedongw.ssh.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @ClassName UserAction
 * @Description: 用户控制层
 * @Author ZeDongW
 * @Date 2020/4/17 0017 10:00
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class UserAction extends ActionSupport implements ModelDriven<User> {

    User user = new User();

    @Override
    public User getModel() {
        return user;
    }

    private IUserService userServiceImpl;

    public void setUserServiceImpl(IUserService userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    public String save(){
        userServiceImpl.save(user);
        return SUCCESS;
    }
}
