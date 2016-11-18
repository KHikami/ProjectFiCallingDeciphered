package p000;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.AsyncTask;

public final class iri {
    private static boolean f18770h = false;
    final Context f18771a;
    iti f18772b;
    ijn f18773c;
    ikc f18774d;
    final ServiceConnection f18775e = new irj(this);
    private final iko f18776f;
    private final iiv f18777g;

    public iri(Context context) {
        this.f18771a = context;
        this.f18776f = new iko();
        if (!this.f18776f.m22189a(context)) {
            itx.m23277a(6, "vclib", "Hangouts not supported by this device");
        }
        if (!f18770h) {
            jyn.m25435b(this.f18771a).m25444a(iiv.class, new iiv());
            f18770h = true;
        }
        this.f18777g = (iiv) jyn.m25435b(context).m25443a(iiv.class);
        this.f18772b = new iti(context);
    }

    public void m23043a(iti iti) {
        this.f18772b = (iti) ba.m4536a((Object) iti);
    }

    public void finalize() {
        m23039c();
    }

    private void m23039c() {
        if (this.f18773c != null) {
            this.f18773c.mo3213a(10030);
            this.f18773c = null;
        }
        m23042a();
    }

    void m23042a() {
        if (this.f18774d != null) {
            try {
                this.f18774d.m22103a();
                this.f18771a.unbindService(this.f18775e);
                this.f18774d = null;
            } catch (Throwable e) {
                itx.m23281a("vclib", "Error disconnecting CallService", e);
            }
        }
    }

    public void m23044a(String str, irl irl) {
        new irm(this, this.f18777g.m21904a(str), irl).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public ite m23041a(itf itf) {
        iil.m21872a("Expected null", this.f18773c);
        this.f18773c = new ijn(this.f18771a, this.f18772b, itf);
        this.f18773c.mo3217a(new irk(this));
        return this.f18773c;
    }

    public ite m23045b() {
        return this.f18773c;
    }

    public ijh m23040a(String str, itg itg) {
        ijh ipg = new ipg(this.f18771a, this.f18772b, null);
        ipg.m22837a(this.f18777g.m21904a(str), itg);
        return ipg;
    }
}
