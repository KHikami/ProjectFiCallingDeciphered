package defpackage;

import android.content.Context;
import android.os.Bundle;
import tz;

/* renamed from: cpl */
public final class cpl {
    public ajk a;
    public tz b;
    private final Context c;
    private String d;
    private g e;
    private final cpg f;

    cpl(Context context) {
        this.c = context;
        this.f = (cpg) jyn.b(context, cpg.class);
    }

    ajk a() {
        return this.a;
    }

    void b() {
        if (this.b == null && this.f != null) {
            this.d = this.f.a();
            if (this.d != null && this.e == null) {
                this.e = new g();
                if (!tz.a(this.c, this.d, this.e)) {
                    c();
                }
            }
        }
    }

    public void c() {
        if (this.e != null) {
            this.c.unbindService(this.e);
            this.b = null;
            this.a = null;
            this.e = null;
        }
    }

    public boolean d() {
        if (this.b == null) {
            return false;
        }
        Bundle a = this.b.a("isFirstRunDone", null);
        if (a == null || !a.getBoolean("isFirstRunDone")) {
            return false;
        }
        return true;
    }

    String e() {
        if (this.b == null) {
            return null;
        }
        Bundle a = this.b.a("getAccountName", null);
        if (a != null) {
            return a.getString("getAccountName");
        }
        return null;
    }
}
