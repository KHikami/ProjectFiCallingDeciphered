package p000;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class btf {
    public long f4388a;
    public String f4389b;
    public String f4390c;
    public String f4391d;
    public String f4392e;
    public String f4393f;
    public long f4394g;
    public fwx f4395h;
    public fwy f4396i;
    public long f4397j;
    public boolean f4398k;
    public boolean f4399l;
    public String f4400m;
    public String f4401n;
    public int f4402o;
    public int f4403p;
    public int f4404q;
    public int f4405r;
    public final bta f4406s = new bta();
    public final btj f4407t = new btj();
    public final bth f4408u = new bth();
    public final bti f4409v = new bti();

    public static int m6582a(btf btf, btf btf2) {
        fwx fwx = btf.f4395h;
        fwx fwx2 = btf2.f4395h;
        int a = btf.m6583a(fwx2) - btf.m6583a(fwx);
        if (a == 0) {
            return Long.signum(btf2.f4394g - btf.f4394g);
        }
        return a;
    }

    private static int m6583a(fwx fwx) {
        switch (btg.f4410a[fwx.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    public boolean m6586a(btf btf) {
        return edo.m13605a(this.f4391d, this.f4392e, btf.f4391d, btf.f4392e);
    }

    public boolean m6585a() {
        return this.f4396i == fwy.INCOMING_USER_MESSAGE || this.f4396i == fwy.OUTGOING_USER_MESSAGE;
    }

    public long m6587b() {
        return TimeUnit.MICROSECONDS.toMillis(this.f4394g);
    }

    public boolean m6588c() {
        return this.f4396i == fwy.INCOMING_USER_MESSAGE && this.f4408u.f4411a;
    }

    public edk m6584a(cgr cgr) {
        ArrayList f = cgr.mo954k().m5599f();
        if (f != null) {
            f = f;
            int size = f.size();
            int i = 0;
            while (i < size) {
                Object obj = f.get(i);
                i++;
                edk edk = (edk) obj;
                if (edk.f11213b.m13609a(this.f4391d, this.f4392e)) {
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
        if (gwb.m2223g(Long.valueOf(this.f4388a), Long.valueOf(btf.f4388a)) && gwb.m2223g(this.f4389b, btf.f4389b) && gwb.m2223g(this.f4390c, btf.f4390c) && gwb.m2223g(this.f4391d, btf.f4391d) && gwb.m2223g(this.f4392e, btf.f4392e) && gwb.m2223g(this.f4393f, btf.f4393f) && gwb.m2223g(Long.valueOf(this.f4394g), Long.valueOf(btf.f4394g)) && gwb.m2223g(this.f4395h, btf.f4395h) && gwb.m2223g(this.f4396i, btf.f4396i) && gwb.m2223g(this.f4406s, btf.f4406s) && gwb.m2223g(this.f4407t, btf.f4407t) && gwb.m2223g(Long.valueOf(this.f4397j), Long.valueOf(btf.f4397j)) && gwb.m2223g(Boolean.valueOf(this.f4398k), Boolean.valueOf(btf.f4398k)) && gwb.m2223g(Boolean.valueOf(this.f4399l), Boolean.valueOf(btf.f4399l)) && gwb.m2223g(this.f4400m, btf.f4400m) && gwb.m2223g(this.f4401n, btf.f4401n) && gwb.m2223g(Integer.valueOf(this.f4402o), Integer.valueOf(btf.f4402o)) && gwb.m2223g(Integer.valueOf(this.f4403p), Integer.valueOf(btf.f4403p)) && gwb.m2223g(Integer.valueOf(this.f4404q), Integer.valueOf(btf.f4404q)) && gwb.m2223g(this.f4408u, btf.f4408u) && gwb.m2223g(this.f4409v, btf.f4409v) && gwb.m2223g(Integer.valueOf(this.f4405r), Integer.valueOf(btf.f4405r))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return gwb.m2074c(Long.valueOf(this.f4388a), this.f4389b, this.f4390c, this.f4391d, this.f4392e, this.f4393f, Long.valueOf(this.f4394g), this.f4395h, this.f4396i, this.f4406s, this.f4407t, Long.valueOf(this.f4397j), Boolean.valueOf(this.f4398k), Boolean.valueOf(this.f4399l), this.f4400m, this.f4401n, Integer.valueOf(this.f4402o), Integer.valueOf(this.f4403p), Integer.valueOf(this.f4404q), this.f4408u, this.f4409v, Integer.valueOf(this.f4405r));
    }

    public String toString() {
        return "ID: " + this.f4388a + "\nmessage ID: " + this.f4389b + "\ntype: " + this.f4396i + "\nstatus: " + this.f4395h + "\ntimestamp: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ").format(new Date(this.f4394g / 1000));
    }
}
