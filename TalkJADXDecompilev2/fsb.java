package defpackage;

import android.text.TextUtils;

public final class fsb {
    private static volatile boolean e;
    private static volatile boolean f;
    private static volatile String g;
    private static volatile String h;
    final fsg a;
    hwl b;
    hwq c;
    boolean d;
    private final gui i;
    private final bko j;
    private final String k;
    private final guq<hrx> l;
    private final guq<hsb> m;

    static void a() {
        boolean z;
        boolean z2 = true;
        g = gwb.b(gwb.H(), "babel_local_contact_roster_mode", "default");
        h = gwb.b(gwb.H(), "babel_local_contact_search_mode", "default");
        if (TextUtils.equals(g, "always_disable")) {
            glk.a("Babel", "Force disable local contact roster", new Object[0]);
            e = true;
            z = true;
        } else if (TextUtils.equals(g, "always_enable")) {
            glk.a("Babel", "Force enable local contact roster", new Object[0]);
            e = false;
            z = true;
        } else {
            z = false;
        }
        if (TextUtils.equals(h, "always_disable")) {
            glk.a("Babel", "Force disable local contact search", new Object[0]);
            f = true;
        } else if (TextUtils.equals(h, "always_enable")) {
            glk.a("Babel", "Force enable local contact search", new Object[0]);
            f = false;
        } else {
            z2 = false;
        }
        if (!z) {
            glk.a("Babel", "Enable local contact roster by default.", new Object[0]);
            e = false;
        }
        if (!z2) {
            glk.a("Babel", "Enable local contact search by default.", new Object[0]);
            f = false;
        }
    }

    static {
        gwb.a(new fsc());
    }

    public fsb(gui gui, bko bko, fsg fsg) {
        this(gui, null, fsg, null);
    }

    public fsb(gui gui, bko bko, fsg fsg, String str) {
        this.l = new fse(this);
        this.m = new fsf(this);
        this.i = gui;
        this.j = bko;
        this.a = fsg;
        this.k = str;
    }

    public void b() {
        if (!this.d) {
            if (TextUtils.isEmpty(this.k)) {
                if (e) {
                    e();
                } else {
                    d();
                }
            } else if (f) {
                e();
            } else {
                d();
            }
        }
    }

    private String c() {
        if (this.j == null) {
            return "fake_account";
        }
        return this.j.a();
    }

    private void d() {
        if (this.i.e()) {
            hrw hrw = new hrw();
            hrw.a(this.k);
            hrw.a(true);
            hsj.e.a(this.i, c(), null, hrw).a(this.l);
            return;
        }
        glk.d("Babel", "Google API client not connected. Skip loading aggregated people", new Object[0]);
    }

    private void e() {
        if (this.i.e()) {
            hsa hsa = new hsa();
            hsa.a(true);
            if (!TextUtils.isEmpty(this.k)) {
                hsa.a(this.k);
            }
            hsj.e.a(this.i, c(), null, hsa).a(this.m);
            return;
        }
        glk.d("Babel", "Google API client not connected. Skip loading people", new Object[0]);
    }
}
