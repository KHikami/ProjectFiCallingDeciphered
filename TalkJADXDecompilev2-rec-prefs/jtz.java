package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class jtz implements jty {
    private static final int f20353b = Math.max(1, Runtime.getRuntime().availableProcessors() - 1);
    final Handler b_ = new Handler(Looper.getMainLooper(), new jua(this));
    final HashMap<jtw, jtv> f20354c = new HashMap();
    private final Context f20355d;
    private final ExecutorService f20356e;
    private final jud f20357f = new jud(this);
    private juf f20358g;

    public jtz(Context context) {
        this.f20355d = context;
        this.f20356e = Executors.newFixedThreadPool(f20353b, new jub(this));
    }

    public Context mo3535l() {
        return this.f20355d;
    }

    public void m24585c(jtv jtv) {
        m24587m().m25212a(jtv);
    }

    public void mo3530a(jtv jtv, int i) {
        this.b_.sendMessage(this.b_.obtainMessage(0, i, 0, jtv));
    }

    public void mo3531a(jtv jtv, int i, int i2) {
        this.b_.sendMessage(this.b_.obtainMessage(2, i, i2, jtv));
    }

    public void mo3532a(jtv jtv, int i, Object obj) {
        this.b_.sendMessage(this.b_.obtainMessage(1, i, 0, new jue(jtv, obj)));
    }

    public void mo3534b(jtv jtv, int i) {
        this.b_.sendMessage(this.b_.obtainMessage(3, i, 0, jtv));
    }

    public void mo3533a(jtv jtv, Object obj) {
        this.f20356e.execute(new juc(this, jtv, obj));
    }

    juf m24587m() {
        if (this.f20358g == null) {
            this.f20358g = new juf();
            this.f20358g.start();
        }
        return this.f20358g;
    }

    boolean m24583a(Message message) {
        jtv jtv;
        switch (message.what) {
            case 0:
                jtv = (jtv) message.obj;
                jtv.f20090i = message.arg1;
                jtv.m24252r();
                break;
            case 1:
                jue jue = (jue) message.obj;
                jtv jtv2 = jue.f21057a;
                jtv2.f20089h = jue.f21058b;
                jtv2.f20090i = message.arg1;
                jtv2.m24252r();
                break;
            case 2:
                jtv = (jtv) message.obj;
                jtv.f20090i = message.arg1;
                jtv.f20091j = message.arg2;
                jtv.m24252r();
                break;
            case 3:
                jtv = (jtv) message.obj;
                jtv.f20092k = message.arg1;
                jtv.m24252r();
                break;
            case 4:
                ((jtv) message.obj).m24240b(this.f20357f);
                break;
        }
        return true;
    }
}
