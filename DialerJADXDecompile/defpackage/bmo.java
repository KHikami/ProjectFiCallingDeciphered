package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: bmo */
public final class bmo extends bmb {
    private static List j;
    public boolean c;
    Set d;
    public boolean e;
    public boolean f;
    volatile boolean g;

    static {
        j = new ArrayList();
    }

    public bmo(bnp bnp) {
        super(bnp);
        this.d = new HashSet();
    }

    public static bmo a(Context context) {
        return bnp.a(context).d();
    }

    public static void a() {
        synchronized (bmo.class) {
            if (j != null) {
                for (Runnable run : j) {
                    run.run();
                }
                j = null;
            }
        }
    }

    public static void a(Runnable runnable) {
        buf.A((Object) runnable);
        synchronized (bmo.class) {
            if (j == null) {
                runnable.run();
            } else {
                j.add(runnable);
            }
        }
    }

    public final bmx a(int i) {
        bmx bmx;
        synchronized (this) {
            bmx = new bmx(this.a, null, null);
            if (i > 0) {
                bpp bpp = (bpp) new bpd(this.a, (byte) 0).a(i);
                if (bpp != null) {
                    Object obj;
                    String str;
                    boolean z;
                    bmx.b("Loading Tracker config values");
                    bmx.e = bpp;
                    if (bmx.e.a != null) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    if (obj != null) {
                        str = bmx.e.a;
                        bmx.a("&tid", str);
                        bmx.a("trackingId loaded", str);
                    }
                    if (bmx.e.b >= 0.0d) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    if (obj != null) {
                        str = Double.toString(bmx.e.b);
                        bmx.a("&sf", str);
                        bmx.a("Sample frequency loaded", str);
                    }
                    if (bmx.e.c >= 0) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    if (obj != null) {
                        int i2 = bmx.e.c;
                        long j = (long) i2;
                        bmz bmz = bmx.d;
                        bmz.b = j * 1000;
                        bmz.c();
                        bmx.a("Session timeout loaded", Integer.valueOf(i2));
                    }
                    if (bmx.e.d != -1) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    if (obj != null) {
                        if (bmx.e.d == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bmz bmz2 = bmx.d;
                        bmz2.a = z;
                        bmz2.c();
                        bmx.a("Auto activity tracking loaded", Boolean.valueOf(z));
                    }
                    if (bmx.e.e != -1) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    if (obj != null) {
                        if (bmx.e.e == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            bmx.a("&aip", "1");
                        }
                        bmx.a("Anonymize ip loaded", Boolean.valueOf(z));
                    }
                    if (bmx.e.f == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bmx.a(z);
                }
            }
            bmx.p();
        }
        return bmx;
    }

    public final void a(Activity activity) {
        for (bmp a : this.d) {
            a.a(activity);
        }
    }

    public final void b(Activity activity) {
        for (bmp h_ : this.d) {
            h_.h_();
        }
    }
}
