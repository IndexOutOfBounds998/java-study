package designPatterns.proxy.staticproxy;

/**
 * @author by chu_yang_yang
 * @Classname ProxyHandle
 * @Description
 * @Date 2019/9/20 10:16
 */
public abstract class ProxyHandle implements Worker {
    private Worker worker;

    public ProxyHandle(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void playGames() {
        doBefore();
        worker.playGames();
        doAfter();
    }

    abstract void doBefore();

    abstract void doAfter();
}
