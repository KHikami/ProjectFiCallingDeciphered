package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

public class alv {
    final Executor a;

    public void a(alo<?> alo_, als<?> als_) {
        a(alo_, als_, null);
    }

    public void a(alo<?> alo_, als<?> als_, Runnable runnable) {
        alo_.r();
        alo_.a("post-response");
        this.a.execute(new alk(this, alo_, als_, runnable));
    }

    public void a(alo<?> alo_, alx alx) {
        alo_.a("post-error");
        this.a.execute(new alk(this, alo_, als.a(alx), null));
    }

    public alv(Handler handler) {
        this.a = new alj(this, handler);
    }
}
