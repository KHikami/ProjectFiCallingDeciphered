package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.async.BackgroundTaskService;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class jgo implements jgd, jge {
    private static final ThreadFactory f;
    private static final Executor g;
    final Context a;
    final Intent b;
    jgu c;
    jgc d;
    final Runnable e = new jgp(this);

    static {
        ThreadFactory jgq = new jgq();
        f = jgq;
        g = Executors.newCachedThreadPool(jgq);
    }

    jgo(Context context) {
        this.a = context.getApplicationContext();
        this.b = new Intent(this.a, BackgroundTaskService.class);
        this.d = new jgt();
    }

    public void a() {
        if (this.c == null) {
            this.c = (jgu) jyn.a(this.a, jgu.class);
        }
        while (true) {
            jgc c = this.c.c();
            if (c != null) {
                c.a((jgd) this);
                (c.a() != null ? c.a() : g).execute(ljy.a(new jgr(this, c)));
            } else {
                this.a.startService(this.b);
                return;
            }
        }
    }

    public void a(jgc jgc, jgz jgz) {
        this.c.d().post(ljy.a(new jgs(this, jgc, jgz)));
    }
}
