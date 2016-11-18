package defpackage;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class btf {
    public long a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public fwx h;
    public fwy i;
    public long j;
    public boolean k;
    public boolean l;
    public String m;
    public String n;
    public int o;
    public int p;
    public int q;
    public int r;
    public final bta s = new bta();
    public final btj t = new btj();
    public final bth u = new bth();
    public final bti v = new bti();

    public static int a(btf btf, btf btf2) {
        fwx fwx = btf.h;
        fwx fwx2 = btf2.h;
        int a = btf.a(fwx2) - btf.a(fwx);
        if (a == 0) {
            return Long.signum(btf2.g - btf.g);
        }
        return a;
    }

    private static int a(fwx fwx) {
        switch (btg.a[fwx.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    public boolean a(btf btf) {
        return edo.a(this.d, this.e, btf.d, btf.e);
    }

    public boolean a() {
        return this.i == fwy.INCOMING_USER_MESSAGE || this.i == fwy.OUTGOING_USER_MESSAGE;
    }

    public long b() {
        return TimeUnit.MICROSECONDS.toMillis(this.g);
    }

    public boolean c() {
        return this.i == fwy.INCOMING_USER_MESSAGE && this.u.a;
    }

    public edk a(cgr cgr) {
        ArrayList f = cgr.k().f();
        if (f != null) {
            f = f;
            int size = f.size();
            int i = 0;
            while (i < size) {
                Object obj = f.get(i);
                i++;
                edk edk = (edk) obj;
                if (edk.b.a(this.d, this.e)) {
                    return edk;
                }
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        btf btf = (btf) obj;
        if (gwb.g(Long.valueOf(this.a), Long.valueOf(btf.a)) && gwb.g(this.b, btf.b) && gwb.g(this.c, btf.c) && gwb.g(this.d, btf.d) && gwb.g(this.e, btf.e) && gwb.g(this.f, btf.f) && gwb.g(Long.valueOf(this.g), Long.valueOf(btf.g)) && gwb.g(this.h, btf.h) && gwb.g(this.i, btf.i) && gwb.g(this.s, btf.s) && gwb.g(this.t, btf.t) && gwb.g(Long.valueOf(this.j), Long.valueOf(btf.j)) && gwb.g(Boolean.valueOf(this.k), Boolean.valueOf(btf.k)) && gwb.g(Boolean.valueOf(this.l), Boolean.valueOf(btf.l)) && gwb.g(this.m, btf.m) && gwb.g(this.n, btf.n) && gwb.g(Integer.valueOf(this.o), Integer.valueOf(btf.o)) && gwb.g(Integer.valueOf(this.p), Integer.valueOf(btf.p)) && gwb.g(Integer.valueOf(this.q), Integer.valueOf(btf.q)) && gwb.g(this.u, btf.u) && gwb.g(this.v, btf.v) && gwb.g(Integer.valueOf(this.r), Integer.valueOf(btf.r))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return gwb.c(Long.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, Long.valueOf(this.g), this.h, this.i, this.s, this.t, Long.valueOf(this.j), Boolean.valueOf(this.k), Boolean.valueOf(this.l), this.m, this.n, Integer.valueOf(this.o), Integer.valueOf(this.p), Integer.valueOf(this.q), this.u, this.v, Integer.valueOf(this.r));
    }

    public String toString() {
        return "ID: " + this.a + "\nmessage ID: " + this.b + "\ntype: " + this.i + "\nstatus: " + this.h + "\ntimestamp: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ").format(new Date(this.g / 1000));
    }
}
