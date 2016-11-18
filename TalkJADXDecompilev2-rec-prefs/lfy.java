package p000;

import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import java.util.concurrent.Executors;

public class lfy {
    private static final ThreadPolicy f24933a = new Builder().detectAll().penaltyDeath().penaltyLog().build();
    private static final ThreadPolicy f24934b = new Builder().detectNetwork().penaltyDeath().penaltyLog().build();

    static mtm m29003a(mtm mtm) {
        return lgu.m29047a(new lgl(gwb.m1718a(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors() - 2), new mtu().m32896a(true).m32893a(String.valueOf("Lite Thread").concat(" #%d")).m32895a(new lgb(f24933a, 0)).m32892a())), mtm));
    }

    static mtl m29002a() {
        return gwb.m1718a(Executors.newCachedThreadPool(new mtu().m32896a(true).m32893a("Blocking Thread #%d").m32895a(new lfz()).m32892a()));
    }

    static mtm m29004b() {
        return gwb.m1719a(Executors.newScheduledThreadPool(1, new mtu().m32893a("Scheduler Thread #%d").m32896a(true).m32892a()));
    }
}
