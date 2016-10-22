package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

/* renamed from: bpa */
public final class bpa extends bpb {
    public boolean a;
    public int b;
    public boolean c;
    public boolean d;
    private String e;
    private String g;
    private int h;

    public bpa(bnp bnp) {
        super(bnp);
    }

    protected final void a() {
        ApplicationInfo applicationInfo;
        Context g = g();
        try {
            applicationInfo = g.getPackageManager().getApplicationInfo(g.getPackageName(), 129);
        } catch (NameNotFoundException e) {
            d("PackageManager doesn't know about the app package", e);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            e("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null) {
            int i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource");
            if (i > 0) {
                bpi bpi = (bpi) new bpd(this.f).a(i);
                if (bpi != null) {
                    boolean z;
                    String str;
                    int i2;
                    b("Loading global XML config values");
                    if (bpi.a != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        str = bpi.a;
                        this.g = str;
                        b("XML config - app name", str);
                    }
                    if (bpi.b != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        str = bpi.b;
                        this.e = str;
                        b("XML config - app version", str);
                    }
                    if (bpi.c != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        str = bpi.c.toLowerCase();
                        i2 = "verbose".equals(str) ? 0 : "info".equals(str) ? 1 : "warning".equals(str) ? 2 : "error".equals(str) ? 3 : -1;
                        if (i2 >= 0) {
                            this.h = i2;
                            a("XML config - log level", Integer.valueOf(i2));
                        }
                    }
                    if (bpi.d >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i2 = bpi.d;
                        this.b = i2;
                        this.a = true;
                        b("XML config - dispatch period (sec)", Integer.valueOf(i2));
                    }
                    if (bpi.e != -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        boolean z2;
                        if (bpi.e == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.d = z2;
                        this.c = true;
                        b("XML config - dry run", Boolean.valueOf(z2));
                    }
                }
            }
        }
    }

    public final String b() {
        o();
        return this.e;
    }

    public final String c() {
        o();
        return this.g;
    }
}
