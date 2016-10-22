package io.grpc.internal;

import cyg;
import dgr;
import dgx;
import dha;
import dhn;
import java.nio.charset.Charset;

/* compiled from: PG */
public abstract class aw extends a {
    private static final dgx p;
    private static final dha q;
    public dhn m;
    public dgr n;
    public Charset o;
    private boolean r;

    static {
        p = new ax();
        q = dha.a(":status", p);
    }

    public aw(cp cpVar, int i) {
        super(cpVar, i);
        this.o = cyg.b;
    }

    public static dhn a(dgr dgr) {
        Integer num = (Integer) dgr.a(q);
        if (num == null) {
            return null;
        }
        dhn a = ar.a(num.intValue());
        if (a.a()) {
            return a;
        }
        String valueOf = String.valueOf(num);
        return a.b(new StringBuilder(String.valueOf(valueOf).length() + 35).append("extracted status from HTTP :status ").append(valueOf).toString());
    }

    public final dhn b(dgr dgr) {
        if (this.r) {
            return null;
        }
        this.r = true;
        String str = (String) dgr.a(ar.d);
        if (ar.a(str)) {
            return null;
        }
        dhn dhn = dhn.i;
        String str2 = "Invalid content-type: ";
        str = String.valueOf(str);
        return dhn.a(str.length() != 0 ? str2.concat(str) : new String(str2));
    }

    public static Charset c(dgr dgr) {
        String str = (String) dgr.a(ar.d);
        if (str != null) {
            String[] split = str.split("charset=");
            try {
                return Charset.forName(split[split.length - 1].trim());
            } catch (Exception e) {
            }
        }
        return cyg.b;
    }

    public static void d(dgr dgr) {
        dgr.b(q);
        dgr.b(dhn.k);
        dgr.b(dhn.l);
    }
}
