package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.async.BackgroundTaskService;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class jgo implements jgd, jge {
    private static final ThreadFactory f20018f;
    private static final Executor f20019g;
    final Context f20020a;
    final Intent f20021b;
    jgu f20022c;
    jgc f20023d;
    final Runnable f20024e = new jgp(this);

    static {
        ThreadFactory jgq = new jgq();
        f20018f = jgq;
        f20019g = Executors.newCachedThreadPool(jgq);
    }

    jgo(Context context) {
        this.f20020a = context.getApplicationContext();
        this.f20021b = new Intent(this.f20020a, BackgroundTaskService.class);
        this.f20023d = new jgt();
    }

    public void mo3503a() {
        if (this.f20022c == null) {
            this.f20022c = (jgu) jyn.m25426a(this.f20020a, jgu.class);
        }
        while (true) {
            jgc c = this.f20022c.m24177c();
            if (c != null) {
                c.m6399a((jgd) this);
                (c.mo763a() != null ? c.mo763a() : f20019g).execute(ljy.m29195a(new jgr(this, c)));
            } else {
                this.f20020a.startService(this.f20021b);
                return;
            }
        }
    }

    public void mo3504a(jgc jgc, jgz jgz) {
        this.f20022c.m24180d().post(ljy.m29195a(new jgs(this, jgc, jgz)));
    }
}
