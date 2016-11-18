package p000;

import android.os.Handler;
import java.util.concurrent.Executor;

public class alv {
    final Executor f1256a;

    public void m2875a(alo<?> alo_, als<?> als_) {
        m2876a(alo_, als_, null);
    }

    public void m2876a(alo<?> alo_, als<?> als_, Runnable runnable) {
        alo_.m2862r();
        alo_.m2843a("post-response");
        this.f1256a.execute(new alk(this, alo_, als_, runnable));
    }

    public void m2877a(alo<?> alo_, alx alx) {
        alo_.m2843a("post-error");
        this.f1256a.execute(new alk(this, alo_, als.m2870a(alx), null));
    }

    public alv(Handler handler) {
        this.f1256a = new alj(this, handler);
    }
}
