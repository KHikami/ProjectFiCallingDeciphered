package io.grpc.internal;

import bm;
import java.nio.charset.Charset;
import mes;
import okw;
import olc;
import olf;
import olv;

public abstract class bn extends a<Integer> {
    private static final olc<Integer> a;
    private static final olf<Integer> b;
    private olv c;
    private okw d;
    private Charset e;
    private boolean f;

    static {
        a = new bo();
        b = olf.a(":status", a);
    }

    public bn(dn dnVar, int i) {
        super(dnVar, i);
        this.e = mes.c;
    }

    public void b(okw okw) {
        bm.a((Object) okw, (Object) "headers");
        if (this.c != null) {
            this.c = this.c.b(okw.toString());
            return;
        }
        olv d = d(okw);
        if (d == null) {
            this.c = olv.p.a("received non-terminal headers with no :status");
        } else if (d.d()) {
            this.c = e(okw);
        } else {
            this.c = d;
        }
        if (this.c != null) {
            d = this.c;
            String valueOf = String.valueOf(okw);
            this.c = d.b(new StringBuilder(String.valueOf(valueOf).length() + 1).append("\n").append(valueOf).toString());
            this.d = okw;
            this.e = f(okw);
            return;
        }
        g(okw);
        a(okw);
    }

    public void b(cm cmVar, boolean z) {
        if (this.c == null && this.i == i.HEADERS) {
            this.c = olv.p.a("no headers received prior to data");
            this.d = new okw();
        }
        if (this.c != null) {
            olv olv = this.c;
            String str = "DATA-----------------------------\n";
            String valueOf = String.valueOf(cn.a(cmVar, this.e));
            this.c = olv.b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            cmVar.close();
            if (this.c.b().length() > 1000 || z) {
                a(this.c, this.d);
                a(olv.c);
                return;
            }
            return;
        }
        a(cmVar);
        if (z) {
            this.c = olv.p.a("Received EOS on DATA frame");
            this.d = new okw();
            a(this.c, this.d);
        }
    }

    public void c(okw okw) {
        bm.a((Object) okw, (Object) "trailers");
        if (this.c != null) {
            this.c = this.c.b(okw.toString());
        } else {
            this.c = e(okw);
            this.d = okw;
        }
        if (this.c != null) {
            a(this.c, this.d);
            a(olv.c);
            return;
        }
        olv a;
        olv olv = (olv) okw.b(olv.s);
        if (olv == null) {
            olv = d(okw);
            a = (olv == null || olv.d()) ? olv.d.a("missing GRPC status in response") : olv.a("missing GRPC status, inferred error from HTTP status code");
        } else {
            a = olv;
        }
        String str = (String) okw.b(olv.t);
        if (str != null) {
            a = a.b(str);
        }
        g(okw);
        a(okw, a);
    }

    private static olv d(okw okw) {
        Integer num = (Integer) okw.b(b);
        if (num == null) {
            return null;
        }
        olv a = bi.a(num.intValue());
        if (a.d()) {
            return a;
        }
        String valueOf = String.valueOf(num);
        return a.b(new StringBuilder(String.valueOf(valueOf).length() + 35).append("extracted status from HTTP :status ").append(valueOf).toString());
    }

    private olv e(okw okw) {
        if (this.f) {
            return null;
        }
        this.f = true;
        String str = (String) okw.b(bi.e);
        if (bi.a(str)) {
            return null;
        }
        olv olv = olv.p;
        String str2 = "Invalid content-type: ";
        str = String.valueOf(str);
        return olv.a(str.length() != 0 ? str2.concat(str) : new String(str2));
    }

    private static Charset f(okw okw) {
        String str = (String) okw.b(bi.e);
        if (str != null) {
            String[] split = str.split("charset=");
            try {
                return Charset.forName(split[split.length - 1].trim());
            } catch (Exception e) {
            }
        }
        return mes.c;
    }

    private static void g(okw okw) {
        okw.c(b);
        okw.c(olv.s);
        okw.c(olv.t);
    }
}
