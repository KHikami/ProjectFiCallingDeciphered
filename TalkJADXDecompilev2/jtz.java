package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class jtz implements jty {
    private static final int b = Math.max(1, Runtime.getRuntime().availableProcessors() - 1);
    final Handler b_ = new Handler(Looper.getMainLooper(), new jua(this));
    final HashMap<jtw, jtv> c = new HashMap();
    private final Context d;
    private final ExecutorService e;
    private final jud f = new jud(this);
    private juf g;

    public jtz(Context context) {
        this.d = context;
        this.e = Executors.newFixedThreadPool(b, new jub(this));
    }

    public Context l() {
        return this.d;
    }

    public void c(jtv jtv) {
        m().a(jtv);
    }

    public void a(jtv jtv, int i) {
        this.b_.sendMessage(this.b_.obtainMessage(0, i, 0, jtv));
    }

    public void a(jtv jtv, int i, int i2) {
        this.b_.sendMessage(this.b_.obtainMessage(2, i, i2, jtv));
    }

    public void a(jtv jtv, int i, Object obj) {
        this.b_.sendMessage(this.b_.obtainMessage(1, i, 0, new jue(jtv, obj)));
    }

    public void b(jtv jtv, int i) {
        this.b_.sendMessage(this.b_.obtainMessage(3, i, 0, jtv));
    }

    public void a(jtv jtv, Object obj) {
        this.e.execute(new juc(this, jtv, obj));
    }

    juf m() {
        if (this.g == null) {
            this.g = new juf();
            this.g.start();
        }
        return this.g;
    }

    boolean a(Message message) {
        jtv jtv;
        switch (message.what) {
            case 0:
                jtv = (jtv) message.obj;
                jtv.i = message.arg1;
                jtv.r();
                break;
            case 1:
                jue jue = (jue) message.obj;
                jtv jtv2 = jue.a;
                jtv2.h = jue.b;
                jtv2.i = message.arg1;
                jtv2.r();
                break;
            case 2:
                jtv = (jtv) message.obj;
                jtv.i = message.arg1;
                jtv.j = message.arg2;
                jtv.r();
                break;
            case 3:
                jtv = (jtv) message.obj;
                jtv.k = message.arg1;
                jtv.r();
                break;
            case 4:
                ((jtv) message.obj).b(this.f);
                break;
        }
        return true;
    }
}