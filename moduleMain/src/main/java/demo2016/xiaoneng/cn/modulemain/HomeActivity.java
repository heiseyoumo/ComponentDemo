package demo2016.xiaoneng.cn.modulemain;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.alibaba.android.arouter.facade.annotation.Route;

@Route(path = "/home/homeActivity")
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulemain_activity_home);
    }
}
