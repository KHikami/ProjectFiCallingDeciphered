package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: PG */
/* renamed from: cvw */
final class cvw {
    static final ScheduledExecutorService a;

    static {
        a = new cwc(new ScheduledThreadPoolExecutor(2, new cvx(), cvu.b), cvu.a);
    }
}
