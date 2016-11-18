package p000;

import java.lang.reflect.Field;
import java.util.Locale;

final class ipk<T extends nzf> implements ioq, Runnable {
    private final ipg f18659a;
    private final String f18660b;
    private final nzf f18661c;
    private final Class<T> f18662d;
    private final ijl<T> f18663e;
    private final int f18664f;
    private long f18665g;
    private final int f18666h;
    private int f18667i = 0;

    ipk(ipg ipg, String str, nzf nzf, Class<T> cls, ijl<T> ijl_T, int i, long j, int i2) {
        this.f18659a = ipg;
        this.f18660b = str;
        this.f18661c = nzf;
        this.f18662d = cls;
        this.f18663e = ijl_T;
        this.f18664f = i;
        this.f18665g = j;
        this.f18666h = i2;
    }

    public void run() {
        try {
            Field field = this.f18661c.getClass().getField("requestHeader");
            nzf nzf = this.f18661c;
            lup lup = new lup();
            lup.f26506a = this.f18659a.f18649f;
            lup.f26507b = this.f18659a.f18650g;
            lup.f26511f = Integer.valueOf(this.f18667i);
            String language = Locale.getDefault().getLanguage();
            if (!language.isEmpty()) {
                lup.f26509d = language;
            }
            lup.f26512g = this.f18659a.f18651h;
            field.set(nzf, lup);
            itx.m23279a(3, "vclib", "Issuing %s request attempt %d (%s)", this.f18660b, Integer.valueOf(this.f18667i), this.f18661c);
            this.f18659a.f18646c.mo3350a(String.valueOf(this.f18660b).concat("?alt=proto"), nzf.m1029a(this.f18661c), this.f18664f, (ioq) this);
        } catch (Throwable e) {
            itx.m23281a("vclib", "Failed to issue mesi request", e);
            this.f18663e.mo1432b(null);
        }
    }

    public void mo3258a(long j, String str) {
    }

    public void mo3257a(long j) {
        m22848a(null, null);
    }

    public void mo3259a(long j, byte[] bArr) {
        try {
            nzf nzf = (nzf) this.f18662d.newInstance();
            nzf.m1027a(nzf, bArr);
            luq luq = (luq) this.f18662d.getField("responseHeader").get(nzf);
            if (luq == null || luq.f26515a.intValue() != 1) {
                m22848a(nzf, luq);
                return;
            }
            itx.m23279a(3, "vclib", "%s request succeeded (%s)", this.f18660b, nzf);
            this.f18663e.mo1431a(nzf);
        } catch (Throwable e) {
            itx.m23281a("vclib", "Failed to process mesi response", e);
            this.f18663e.mo1432b(null);
        }
    }

    private void m22848a(T t, luq luq) {
        int i = (t == null || luq == null || luq.f26515a.intValue() == 3 || luq.f26515a.intValue() == 2) ? 1 : 0;
        if (i == 0 || this.f18667i == this.f18666h) {
            itx.m23288c("vclib", "%s request failed after %d retries (%s)", this.f18660b, Integer.valueOf(this.f18667i), t);
            this.f18663e.mo1432b(t);
            return;
        }
        this.f18667i++;
        long longValue = (luq == null || luq.f26522h == null) ? 0 : luq.f26522h.longValue();
        longValue = Math.max(longValue, this.f18665g);
        this.f18665g <<= 1;
        itx.m23279a(3, "vclib", "Will retry %s request after %d milliseconds", this.f18660b, Long.valueOf(longValue));
        gwb.m1864a((Runnable) this, longValue);
    }
}
