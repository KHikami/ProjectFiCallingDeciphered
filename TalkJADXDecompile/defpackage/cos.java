package defpackage;

import android.content.Context;
import android.text.Spanned;
import java.util.List;

/* renamed from: cos */
public class cos extends fhb implements bhi, bhj, bhm {
    private final String a;
    private final long b;

    public cos(bko bko, String str, long j) {
        super(bko);
        this.a = str;
        this.b = j;
    }

    public int a(Context context, bhb bhb) {
        bxn bxn;
        Object obj;
        Throwable th;
        blo blo = new blo(context, this.c.a);
        bme b = blo.b(this.b);
        Spanned o = gwb.o(b.e);
        int i = b.K;
        String str = b.C;
        String str2 = b.a;
        try {
            bxn bxn2;
            if (b.L != null) {
                List b2 = gwb.b(b.L);
                if (b2.size() > 0) {
                    bxn2 = (bxn) b2.get(0);
                    bxn = bxn2;
                    obj = 1;
                    if (obj != null) {
                        a(context, o, bxn, i, str, false, str2);
                    }
                    return bhn.a;
                }
            }
            bxn2 = null;
            bxn = bxn2;
            obj = 1;
        } catch (Throwable e) {
            th = e;
            blo.a(this.b, fwx.FAILED_TO_SEND, glj.a() * 1000);
            glk.d("Babel_ConvService", "Attachment decoding failed with error:", th);
            obj = null;
            bxn = null;
            if (obj != null) {
                a(context, o, bxn, i, str, false, str2);
            }
            return bhn.a;
        } catch (Throwable e2) {
            th = e2;
            blo.a(this.b, fwx.FAILED_TO_SEND, glj.a() * 1000);
            glk.d("Babel_ConvService", "Attachment decoding failed with error:", th);
            obj = null;
            bxn = null;
            if (obj != null) {
                a(context, o, bxn, i, str, false, str2);
            }
            return bhn.a;
        }
        if (obj != null) {
            a(context, o, bxn, i, str, false, str2);
        }
        return bhn.a;
    }

    void a(Context context, CharSequence charSequence, bxn bxn, int i, String str, boolean z, String str2) {
        if (bxn == null || !(bxn.c == bxo.PLUS_PHOTO || bxn.c == bxo.VIDEO)) {
            ((bhl) jyn.a(context, bhl.class)).a(new cor(context, this.c.b, this.a, charSequence, bxn, i, str, false, str2, this.b));
            return;
        }
        ((bhl) jyn.a(context, bhl.class)).a(new cot(context, this.c.b, this.a, charSequence, bxn, i, str, false, str2, this.b));
    }

    public String b() {
        return this.a;
    }

    public bhk c() {
        return bhk.NONE;
    }
}
