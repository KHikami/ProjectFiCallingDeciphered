package defpackage;

import java.lang.reflect.Field;
import java.util.Locale;

final class ipk<T extends nzf> implements ioq, Runnable {
    private final ipg a;
    private final String b;
    private final nzf c;
    private final Class<T> d;
    private final ijl<T> e;
    private final int f;
    private long g;
    private final int h;
    private int i = 0;

    ipk(ipg ipg, String str, nzf nzf, Class<T> cls, ijl<T> ijl_T, int i, long j, int i2) {
        this.a = ipg;
        this.b = str;
        this.c = nzf;
        this.d = cls;
        this.e = ijl_T;
        this.f = i;
        this.g = j;
        this.h = i2;
    }

    public void run() {
        try {
            Field field = this.c.getClass().getField("requestHeader");
            nzf nzf = this.c;
            lup lup = new lup();
            lup.a = this.a.f;
            lup.b = this.a.g;
            lup.f = Integer.valueOf(this.i);
            String language = Locale.getDefault().getLanguage();
            if (!language.isEmpty()) {
                lup.d = language;
            }
            lup.g = this.a.h;
            field.set(nzf, lup);
            itx.a(3, "vclib", "Issuing %s request attempt %d (%s)", this.b, Integer.valueOf(this.i), this.c);
            this.a.c.a(String.valueOf(this.b).concat("?alt=proto"), nzf.a(this.c), this.f, (ioq) this);
        } catch (Throwable e) {
            itx.a("vclib", "Failed to issue mesi request", e);
            this.e.b(null);
        }
    }

    public void a(long j, String str) {
    }

    public void a(long j) {
        a(null, null);
    }

    public void a(long j, byte[] bArr) {
        try {
            nzf nzf = (nzf) this.d.newInstance();
            nzf.a(nzf, bArr);
            luq luq = (luq) this.d.getField("responseHeader").get(nzf);
            if (luq == null || luq.a.intValue() != 1) {
                a(nzf, luq);
                return;
            }
            itx.a(3, "vclib", "%s request succeeded (%s)", this.b, nzf);
            this.e.a(nzf);
        } catch (Throwable e) {
            itx.a("vclib", "Failed to process mesi response", e);
            this.e.b(null);
        }
    }

    private void a(T t, luq luq) {
        int i = (t == null || luq == null || luq.a.intValue() == 3 || luq.a.intValue() == 2) ? 1 : 0;
        if (i == 0 || this.i == this.h) {
            itx.c("vclib", "%s request failed after %d retries (%s)", this.b, Integer.valueOf(this.i), t);
            this.e.b(t);
            return;
        }
        this.i++;
        long longValue = (luq == null || luq.h == null) ? 0 : luq.h.longValue();
        longValue = Math.max(longValue, this.g);
        this.g <<= 1;
        itx.a(3, "vclib", "Will retry %s request after %d milliseconds", this.b, Long.valueOf(longValue));
        gwb.a((Runnable) this, longValue);
    }
}
