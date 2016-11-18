package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.AsyncTask;

public final class iri {
    private static boolean h = false;
    final Context a;
    iti b;
    ijn c;
    ikc d;
    final ServiceConnection e = new irj(this);
    private final iko f;
    private final iiv g;

    public iri(Context context) {
        this.a = context;
        this.f = new iko();
        if (!this.f.a(context)) {
            itx.a(6, "vclib", "Hangouts not supported by this device");
        }
        if (!h) {
            jyn.b(this.a).a(iiv.class, new iiv());
            h = true;
        }
        this.g = (iiv) jyn.b(context).a(iiv.class);
        this.b = new iti(context);
    }

    public void a(iti iti) {
        this.b = (iti) ba.a((Object) iti);
    }

    public void finalize() {
        c();
    }

    private void c() {
        if (this.c != null) {
            this.c.a(10030);
            this.c = null;
        }
        a();
    }

    void a() {
        if (this.d != null) {
            try {
                this.d.a();
                this.a.unbindService(this.e);
                this.d = null;
            } catch (Throwable e) {
                itx.a("vclib", "Error disconnecting CallService", e);
            }
        }
    }

    public void a(String str, irl irl) {
        new irm(this, this.g.a(str), irl).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public ite a(itf itf) {
        iil.a("Expected null", this.c);
        this.c = new ijn(this.a, this.b, itf);
        this.c.a(new irk(this));
        return this.c;
    }

    public ite b() {
        return this.c;
    }

    public ijh a(String str, itg itg) {
        ijh ipg = new ipg(this.a, this.b, null);
        ipg.a(this.g.a(str), itg);
        return ipg;
    }
}
