import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import java.util.concurrent.Executors;

public class lfy {
    private static final ThreadPolicy a;
    private static final ThreadPolicy b;

    static {
        a = new Builder().detectAll().penaltyDeath().penaltyLog().build();
        b = new Builder().detectNetwork().penaltyDeath().penaltyLog().build();
    }

    static mtm a(mtm mtm) {
        return lgu.a(new lgl(gwb.a(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors() - 2), new mtu().a(true).a(String.valueOf("Lite Thread").concat(" #%d")).a(new lgb(a, 0)).a())), mtm));
    }

    static mtl a() {
        return gwb.a(Executors.newCachedThreadPool(new mtu().a(true).a("Blocking Thread #%d").a(new lfz()).a()));
    }

    static mtm b() {
        return gwb.a(Executors.newScheduledThreadPool(1, new mtu().a("Scheduler Thread #%d").a(true).a()));
    }
}
