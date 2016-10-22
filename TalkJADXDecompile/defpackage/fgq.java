package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fgq */
public final class fgq extends evz {
    private static final long serialVersionUID = 1;
    public final Map<String, fgr> g;
    kng h;

    private fgq(kng kng) {
        super(kng, kng.apiHeader);
        this.h = kng;
        Map hashMap = new HashMap();
        for (klj klj : kng.a.a) {
            if (TextUtils.isEmpty(klj.c) || !klj.c.startsWith("c")) {
                fgr fgr = new fgr();
                fgr.a = false;
                for (kkq kkq : klj.ab) {
                    if (gwb.a(kkq.b) == 1 && gwb.a(kkq.c) == 1) {
                        fgr.a = true;
                        break;
                    }
                }
                fgr.b = klj.d.q;
                for (kln kln : klj.f) {
                    fgr.c = kln.b;
                    if (gwb.b(kln.c)) {
                        break;
                    }
                }
                klb[] klbArr = klj.e;
                if (klbArr.length > 0) {
                    fgr.d = klbArr[0].b;
                }
                for (kjm kjm : klj.d.g) {
                    if (gwb.a(kjm.a) == 3) {
                        fgr.e = kjm.c;
                        fgr.f = (float) gwb.a(kjm.b);
                        break;
                    }
                }
                if (!(klj.d.o == null || klj.d.o.b == null)) {
                    for (Object put : klj.d.o.b) {
                        hashMap.put(put, fgr);
                    }
                }
            }
        }
        this.g = Collections.unmodifiableMap(hashMap);
    }

    public static evz a(kng kng) {
        if (!evz.a(kng.apiHeader)) {
            return new fgq(kng);
        }
        String valueOf = String.valueOf(kng);
        glk.d("Babel", new StringBuilder(String.valueOf(valueOf).length() + 65).append("OzMergedPersonLookupResponse.processResponse: request failed for ").append(valueOf).toString(), new Object[0]);
        return new ewv((nzf) kng, kng.apiHeader);
    }

    public String toString() {
        String valueOf = String.valueOf(this.g);
        return new StringBuilder(String.valueOf(valueOf).length() + 37).append("OzMergedPersonLookupResponse{people=").append(valueOf).append("}").toString();
    }
}
