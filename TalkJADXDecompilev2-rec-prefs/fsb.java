package p000;

import android.text.TextUtils;

public final class fsb {
    private static volatile boolean f13875e;
    private static volatile boolean f13876f;
    private static volatile String f13877g;
    private static volatile String f13878h;
    final fsg f13879a;
    hwl f13880b;
    hwq f13881c;
    boolean f13882d;
    private final gui f13883i;
    private final bko f13884j;
    private final String f13885k;
    private final guq<hrx> f13886l;
    private final guq<hsb> f13887m;

    static void m16114a() {
        boolean z;
        boolean z2 = true;
        f13877g = gwb.m1998b(gwb.m1400H(), "babel_local_contact_roster_mode", "default");
        f13878h = gwb.m1998b(gwb.m1400H(), "babel_local_contact_search_mode", "default");
        if (TextUtils.equals(f13877g, "always_disable")) {
            glk.m17970a("Babel", "Force disable local contact roster", new Object[0]);
            f13875e = true;
            z = true;
        } else if (TextUtils.equals(f13877g, "always_enable")) {
            glk.m17970a("Babel", "Force enable local contact roster", new Object[0]);
            f13875e = false;
            z = true;
        } else {
            z = false;
        }
        if (TextUtils.equals(f13878h, "always_disable")) {
            glk.m17970a("Babel", "Force disable local contact search", new Object[0]);
            f13876f = true;
        } else if (TextUtils.equals(f13878h, "always_enable")) {
            glk.m17970a("Babel", "Force enable local contact search", new Object[0]);
            f13876f = false;
        } else {
            z2 = false;
        }
        if (!z) {
            glk.m17970a("Babel", "Enable local contact roster by default.", new Object[0]);
            f13875e = false;
        }
        if (!z2) {
            glk.m17970a("Babel", "Enable local contact search by default.", new Object[0]);
            f13876f = false;
        }
    }

    static {
        gwb.m1835a(new fsc());
    }

    public fsb(gui gui, bko bko, fsg fsg) {
        this(gui, null, fsg, null);
    }

    public fsb(gui gui, bko bko, fsg fsg, String str) {
        this.f13886l = new fse(this);
        this.f13887m = new fsf(this);
        this.f13883i = gui;
        this.f13884j = bko;
        this.f13879a = fsg;
        this.f13885k = str;
    }

    public void m16118b() {
        if (!this.f13882d) {
            if (TextUtils.isEmpty(this.f13885k)) {
                if (f13875e) {
                    m16117e();
                } else {
                    m16116d();
                }
            } else if (f13876f) {
                m16117e();
            } else {
                m16116d();
            }
        }
    }

    private String m16115c() {
        if (this.f13884j == null) {
            return "fake_account";
        }
        return this.f13884j.m5629a();
    }

    private void m16116d() {
        if (this.f13883i.mo2524e()) {
            hrw hrw = new hrw();
            hrw.m20736a(this.f13885k);
            hrw.m20737a(true);
            hsj.f17168e.m20734a(this.f13883i, m16115c(), null, hrw).mo2419a(this.f13886l);
            return;
        }
        glk.m17981d("Babel", "Google API client not connected. Skip loading aggregated people", new Object[0]);
    }

    private void m16117e() {
        if (this.f13883i.mo2524e()) {
            hsa hsa = new hsa();
            hsa.m20751a(true);
            if (!TextUtils.isEmpty(this.f13885k)) {
                hsa.m20750a(this.f13885k);
            }
            hsj.f17168e.m20735a(this.f13883i, m16115c(), null, hsa).mo2419a(this.f13887m);
            return;
        }
        glk.m17981d("Babel", "Google API client not connected. Skip loading people", new Object[0]);
    }
}
