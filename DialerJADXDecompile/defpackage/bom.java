package defpackage;

import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bom */
public final class bom {
    private final bnp a;
    private volatile Boolean b;
    private String c;
    private Set d;

    protected bom(bnp bnp) {
        buf.A((Object) bnp);
        this.a = bnp;
    }

    public static boolean b() {
        return ((Boolean) boq.a.a()).booleanValue();
    }

    public static int c() {
        return ((Integer) boq.r.a()).intValue();
    }

    public static long d() {
        return ((Long) boq.f.a()).longValue();
    }

    public static long e() {
        return ((Long) boq.g.a()).longValue();
    }

    public static int f() {
        return ((Integer) boq.i.a()).intValue();
    }

    public static int g() {
        return ((Integer) boq.j.a()).intValue();
    }

    public static String h() {
        return (String) boq.l.a();
    }

    public static String i() {
        return (String) boq.k.a();
    }

    public static String j() {
        return (String) boq.m.a();
    }

    public static long l() {
        return ((Long) boq.y.a()).longValue();
    }

    public final boolean a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    ApplicationInfo applicationInfo = this.a.a.getApplicationInfo();
                    String m = buf.m(this.a.a, Process.myPid());
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = str != null && str.equals(m);
                        this.b = Boolean.valueOf(z);
                    }
                    if ((this.b == null || !this.b.booleanValue()) && "com.google.android.gms.analytics.analytics".equals(m)) {
                        this.b = Boolean.TRUE;
                    }
                    if (this.b == null) {
                        this.b = Boolean.TRUE;
                        this.a.a().f("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.b.booleanValue();
    }

    public final Set k() {
        String str = (String) boq.u.a();
        if (this.d == null || this.c == null || !this.c.equals(str)) {
            String[] split = TextUtils.split(str, ",");
            Set hashSet = new HashSet();
            for (String parseInt : split) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(parseInt)));
                } catch (NumberFormatException e) {
                }
            }
            this.c = str;
            this.d = hashSet;
        }
        return this.d;
    }
}
