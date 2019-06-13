package demo2016.xiaoneng.cn.componentservice;

/**
 * @author pengkuanwang
 * @date 2019-06-12
 */
public class ComponentServiceFactory {

    IComponentService mainService;
    ILoginService iLoginService;


    private ComponentServiceFactory() {
    }

    static ComponentServiceFactory instance;

    public static ComponentServiceFactory getInstance() {
        if (instance == null) {
            synchronized (ComponentServiceFactory.class) {
                if (instance == null) {
                    instance = new ComponentServiceFactory();
                }
            }
        }
        return instance;
    }

    public void setMainService(IComponentService service) {
        this.mainService = service;
    }

    public IComponentService getMainService() {
        return mainService;
    }

    public ILoginService getiLoginService() {
        return iLoginService;
    }

    public void setLoginService(ILoginService iLoginService) {
        this.iLoginService = iLoginService;
    }
}
