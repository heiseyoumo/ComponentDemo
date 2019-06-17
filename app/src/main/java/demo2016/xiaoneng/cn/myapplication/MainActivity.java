package demo2016.xiaoneng.cn.myapplication;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavCallback;
import com.alibaba.android.arouter.launcher.ARouter;
import demo2016.xiaoneng.cn.componentservice.ComponentServiceFactory;
import demo2016.xiaoneng.cn.componentservice.IComponentService;

/**
 * @author pengkuanwang
 * @date 2019-06-12
 */
public class MainActivity extends FragmentActivity {
    private String token = "我是主app中传过来的token";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        IComponentService mainService = ComponentServiceFactory.getInstance().getMainService();
        if (mainService != null) {
            supportFragmentManager.beginTransaction().add(R.id.container, mainService.getFragment("pengkuanwang"), token).commit();
        }
        findViewById(R.id.textView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/home/homeActivity").navigation(MainActivity.this, new NavCallback() {
                    @Override
                    public void onArrival(Postcard postcard) {
                    }

                    @Override
                    public void onFound(Postcard postcard) {
                    }

                    @Override
                    public void onLost(Postcard postcard) {
                    }

                    @Override
                    public void onInterrupt(Postcard postcard) {
                    }
                });
            }
        });
    }
}
