package demo2016.xiaoneng.cn.loginmodul;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * @author pengkuanwang
 * @date 2019-06-12
 */
@Route(path = "/login/loginActivity")
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initClick();
    }

    private void initClick() {
        findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AccountUtils.getInstance().setAccountStatus(true);
                Toast.makeText(LoginActivity
                        .this, "登录成功", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

