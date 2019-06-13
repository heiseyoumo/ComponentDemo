package demo2016.xiaoneng.cn.modulemain;

import android.content.Context;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.alibaba.android.arouter.launcher.ARouter;
import demo2016.xiaoneng.cn.componentservice.ComponentServiceFactory;

/**
 * @author pengkuanwang
 * @date 2019-06-12
 */
@Interceptor(priority = 1, name = "homeInterceptor")
public class MineInterceptor implements IInterceptor {
    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {
        switch (postcard.getPath()) {
            case "/home/homeActivity":
                if (ComponentServiceFactory.getInstance().getiLoginService().getLoginStatus()) {
                    callback.onContinue(postcard);
                } else {
                    ARouter.getInstance().build("/login/loginActivity").navigation();
                }
                break;
            default:
                callback.onContinue(postcard);
                break;
        }
    }

    @Override
    public void init(Context context) {

    }
}
