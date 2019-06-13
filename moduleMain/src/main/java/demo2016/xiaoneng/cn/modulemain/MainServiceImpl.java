package demo2016.xiaoneng.cn.modulemain;

import android.support.v4.app.Fragment;
import demo2016.xiaoneng.cn.componentservice.IComponentService;

/**
 * @author pengkuanwang
 * @date 2019-06-12
 */
public class MainServiceImpl implements IComponentService {
    @Override
    public Fragment getFragment() {
        return MainFragment.newInstance();
    }
}
