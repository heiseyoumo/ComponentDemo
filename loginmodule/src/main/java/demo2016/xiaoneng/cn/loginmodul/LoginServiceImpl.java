package demo2016.xiaoneng.cn.loginmodul;

import demo2016.xiaoneng.cn.componentservice.ILoginService;

/**
 * @author pengkuanwang
 * @date 2019-06-12
 */
class LoginServiceImpl implements ILoginService {
    @Override
    public boolean getLoginStatus() {
        return AccountUtils.getInstance().isAccountStatus();
    }
}
