package p000;

import android.content.Context;
import android.text.Spanned;
import java.util.List;

public class cos extends fhb implements bhi, bhj, bhm {
    private final String f8738a;
    private final long f8739b;

    public cos(bko bko, String str, long j) {
        super(bko);
        this.f8738a = str;
        this.f8739b = j;
    }

    public int mo539a(Context context, bhb bhb) {
        bxn bxn;
        Object obj;
        Throwable th;
        blo blo = new blo(context, this.f5736c.f12721a);
        bme b = blo.m6009b(this.f8739b);
        Spanned o = gwb.m2313o(b.f3931e);
        int i = b.f3924K;
        String str = b.f3916C;
        String str2 = b.f3927a;
        try {
            bxn bxn2;
            if (b.f3925L != null) {
                List b2 = gwb.m2007b(b.f3925L);
                if (b2.size() > 0) {
                    bxn2 = (bxn) b2.get(0);
                    bxn = bxn2;
                    obj = 1;
                    if (obj != null) {
                        m10574a(context, o, bxn, i, str, false, str2);
                    }
                    return bhn.f3348a;
                }
            }
            bxn2 = null;
            bxn = bxn2;
            obj = 1;
        } catch (Throwable e) {
            th = e;
            blo.m5965a(this.f8739b, fwx.FAILED_TO_SEND, glj.m17956a() * 1000);
            glk.m17980d("Babel_ConvService", "Attachment decoding failed with error:", th);
            obj = null;
            bxn = null;
            if (obj != null) {
                m10574a(context, o, bxn, i, str, false, str2);
            }
            return bhn.f3348a;
        } catch (Throwable e2) {
            th = e2;
            blo.m5965a(this.f8739b, fwx.FAILED_TO_SEND, glj.m17956a() * 1000);
            glk.m17980d("Babel_ConvService", "Attachment decoding failed with error:", th);
            obj = null;
            bxn = null;
            if (obj != null) {
                m10574a(context, o, bxn, i, str, false, str2);
            }
            return bhn.f3348a;
        }
        if (obj != null) {
            m10574a(context, o, bxn, i, str, false, str2);
        }
        return bhn.f3348a;
    }

    void m10574a(Context context, CharSequence charSequence, bxn bxn, int i, String str, boolean z, String str2) {
        if (bxn == null || !(bxn.f4741c == bxo.PLUS_PHOTO || bxn.f4741c == bxo.VIDEO)) {
            ((bhl) jyn.m25426a(context, bhl.class)).mo550a(new cor(context, this.f5736c.f12722b, this.f8738a, charSequence, bxn, i, str, false, str2, this.f8739b));
            return;
        }
        ((bhl) jyn.m25426a(context, bhl.class)).mo550a(new cot(context, this.f5736c.f12722b, this.f8738a, charSequence, bxn, i, str, false, str2, this.f8739b));
    }

    public String mo542b() {
        return this.f8738a;
    }

    public bhk mo543c() {
        return bhk.NONE;
    }
}
