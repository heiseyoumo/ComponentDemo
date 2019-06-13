package demo2016.xiaoneng.cn.modulemain;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * @author pengkuanwang
 * @date 2019-06-12
 */
public class MainFragment extends Fragment {
    String token;
    String userName;

    public static MainFragment newInstance(String userName) {
        MainFragment mainFragment = new MainFragment();
        Bundle bundle = new Bundle();
        bundle.putString("userName", userName);
        mainFragment.setArguments(bundle);
        return mainFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        token = getTag();
        Bundle arguments = getArguments();
        if (arguments != null) {
            userName = arguments.getString("userName");
        }
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.modulemain_fragment_module_a, null);
        TextView userNameTv = view.findViewById(R.id.userName);
        TextView userToken = view.findViewById(R.id.userToken);
        userNameTv.setText("用户名:" + userName);
        userToken.setText("token:" + token);
        return view;
    }
}
