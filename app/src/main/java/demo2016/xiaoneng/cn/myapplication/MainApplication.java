package demo2016.xiaoneng.cn.myapplication;

import android.util.Log;
import com.alibaba.android.arouter.launcher.ARouter;
import demo2016.xiaoneng.cn.common.AppConfig;
import demo2016.xiaoneng.cn.common.BaseApp;

/**
 * @author pengkuanwang
 * @date 2019-06-12
 */
public class MainApplication extends BaseApp {

    @Override
    public void onCreate() {
        super.onCreate();
        initModuleApplication();
        initRouter();
    }

    private void initRouter() {
        if (BuildConfig.DEBUG) {
            //打印日志
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
    }

    @Override
    public void initModuleApplication() {
        for (String moduleApp : AppConfig.moduleApp) {
            try {
                Log.d("MainApplication", moduleApp);
                Class clazz = Class.forName(moduleApp);
                BaseApp baseApp = (BaseApp) clazz.newInstance();
                baseApp.initModuleApplication();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
