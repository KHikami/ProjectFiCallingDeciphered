package p000;

import android.content.Context;
import android.os.Bundle;

public final class cpl {
    public ajk f8788a;
    public tz f8789b;
    private final Context f8790c;
    private String f8791d;
    private C0059g f8792e;
    private final cpg f8793f;

    cpl(Context context) {
        this.f8790c = context;
        this.f8793f = (cpg) jyn.m25433b(context, cpg.class);
    }

    ajk m10643a() {
        return this.f8788a;
    }

    void m10644b() {
        if (this.f8789b == null && this.f8793f != null) {
            this.f8791d = this.f8793f.m10623a();
            if (this.f8791d != null && this.f8792e == null) {
                this.f8792e = new C0059g();
                if (!tz.a(this.f8790c, this.f8791d, this.f8792e)) {
                    m10645c();
                }
            }
        }
    }

    public void m10645c() {
        if (this.f8792e != null) {
            this.f8790c.unbindService(this.f8792e);
            this.f8789b = null;
            this.f8788a = null;
            this.f8792e = null;
        }
    }

    public boolean m10646d() {
        if (this.f8789b == null) {
            return false;
        }
        Bundle a = this.f8789b.a("isFirstRunDone", null);
        if (a == null || !a.getBoolean("isFirstRunDone")) {
            return false;
        }
        return true;
    }

    String m10647e() {
        if (this.f8789b == null) {
            return null;
        }
        Bundle a = this.f8789b.a("getAccountName", null);
        if (a != null) {
            return a.getString("getAccountName");
        }
        return null;
    }
}
