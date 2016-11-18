package p000;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class fgq extends evz {
    private static final long serialVersionUID = 1;
    public final Map<String, fgr> f13016g;
    kng f13017h;

    private fgq(kng kng) {
        super(kng, kng.apiHeader);
        this.f13017h = kng;
        Map hashMap = new HashMap();
        for (klj klj : kng.f22420a.f22932a) {
            if (TextUtils.isEmpty(klj.f22198c) || !klj.f22198c.startsWith("c")) {
                fgr fgr = new fgr();
                fgr.f13018a = false;
                for (kkq kkq : klj.ab) {
                    if (gwb.m1507a(kkq.f22083b) == 1 && gwb.m1507a(kkq.f22084c) == 1) {
                        fgr.f13018a = true;
                        break;
                    }
                }
                fgr.f13019b = klj.f22199d.f22252q;
                for (kln kln : klj.f22201f) {
                    fgr.f13020c = kln.f22270b;
                    if (gwb.m2061b(kln.f22271c)) {
                        break;
                    }
                }
                klb[] klbArr = klj.f22200e;
                if (klbArr.length > 0) {
                    fgr.f13021d = klbArr[0].f22118b;
                }
                for (kjm kjm : klj.f22199d.f22242g) {
                    if (gwb.m1507a(kjm.f21949a) == 3) {
                        fgr.f13022e = kjm.f21951c;
                        fgr.f13023f = (float) gwb.m1473a(kjm.f21950b);
                        break;
                    }
                }
                if (!(klj.f22199d.f22250o == null || klj.f22199d.f22250o.f22062b == null)) {
                    for (Object put : klj.f22199d.f22250o.f22062b) {
                        hashMap.put(put, fgr);
                    }
                }
            }
        }
        this.f13016g = Collections.unmodifiableMap(hashMap);
    }

    public static evz m15269a(kng kng) {
        if (!evz.m8119a(kng.apiHeader)) {
            return new fgq(kng);
        }
        String valueOf = String.valueOf(kng);
        glk.m17981d("Babel", new StringBuilder(String.valueOf(valueOf).length() + 65).append("OzMergedPersonLookupResponse.processResponse: request failed for ").append(valueOf).toString(), new Object[0]);
        return new ewv((nzf) kng, kng.apiHeader);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f13016g);
        return new StringBuilder(String.valueOf(valueOf).length() + 37).append("OzMergedPersonLookupResponse{people=").append(valueOf).append("}").toString();
    }
}
