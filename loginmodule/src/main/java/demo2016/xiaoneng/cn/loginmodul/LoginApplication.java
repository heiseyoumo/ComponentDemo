package demo2016.xiaoneng.cn.loginmodul;

import com.alibaba.android.arouter.launcher.ARouter;
import demo2016.xiaoneng.cn.common.BaseApp;
import demo2016.xiaoneng.cn.componentservice.ComponentServiceFactory;

/**
 * @author pengkuanwang
 * @date 2019-06-12
 */
public class LoginApplication extends BaseApp {
    @Override
    public void initModuleApplication() {
        if (BuildConfig.DEBUG){
            //打印日志
            ARouter.openLog();
            ARouter.openDebug();
        }
        //ARouter.init(this);
        ComponentServiceFactory.getInstance().setLoginService(new LoginServiceImpl());
    }
}
