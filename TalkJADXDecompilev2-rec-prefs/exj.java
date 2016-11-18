package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public class exj extends evz {
    private static final long serialVersionUID = 1;
    private final List<gkv<fbt, edk[]>> f12440g;

    exj(lre lre) {
        List list = null;
        super(lre, lre.responseHeader, -1);
        lrf[] lrfArr = lre.f26209b;
        if (lrfArr != null) {
            List arrayList = new ArrayList();
            for (lrf lrf : lrfArr) {
                lqd lqd = lrf.f26211a;
                fbt fbt = new fbt(lqd.f26079a, lqd.f26083e, lqd.f26081c, lqd.f26082d, gwb.m2061b(lqd.f26084f));
                edk[] b = gwb.m2066b(gwb.m1400H(), lrf.f26212b, fbt);
                if (b != null) {
                    Object obj;
                    if (!TextUtils.isEmpty(fbt.f12660c)) {
                        obj = fbt.f12660c;
                    } else if (TextUtils.isEmpty(fbt.f12661d)) {
                        obj = null;
                    } else {
                        obj = fbt.f12661d;
                    }
                    if (!TextUtils.isEmpty(obj)) {
                        for (int i = 0; i < b.length; i++) {
                            if (b[i] != null) {
                                b[i].m13593c(obj);
                            }
                        }
                    }
                }
                arrayList.add(new gkv(fbt, b));
            }
            list = arrayList;
        }
        this.f12440g = list;
        if (evz.f5798a) {
            new StringBuilder(50).append("GetEntityByIdResponse: Number of specs=").append(this.f12440g.size());
            for (gkv gkv : this.f12440g) {
                if (!(gkv == null || gkv.f15525b == null)) {
                    int i2;
                    if (gkv.f15525b == null) {
                        i2 = 0;
                    } else {
                        i2 = ((edk[]) gkv.f15525b).length;
                    }
                    new StringBuilder(55).append("- GetEntityByIdResponse: Number of entities=").append(i2);
                    for (edk edk : (edk[]) gkv.f15525b) {
                        if (edk != null) {
                            String valueOf = String.valueOf(edk.f11216e);
                            String valueOf2 = String.valueOf(edk.f11217f);
                            String valueOf3 = String.valueOf(edk.f11219h);
                            String valueOf4 = String.valueOf(edk.f11213b);
                            String valueOf5 = String.valueOf(edk.f11215d);
                            new StringBuilder(((((String.valueOf(valueOf).length() + 70) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()).append("-- entity: displayName ").append(valueOf).append(",firstName ").append(valueOf2).append(",avatarUrl ").append(valueOf3).append(",participantId ").append(valueOf4).append(",circleId ").append(valueOf5);
                        }
                    }
                }
            }
        }
    }

    public void mo1047a(blo blo, fhc fhc) {
        super.mo1047a(blo, fhc);
        if (glk.m17973a("Babel", 3)) {
            if (this.b != null) {
                String valueOf = String.valueOf(m14748l());
                glk.m17976b("Babel", new StringBuilder(String.valueOf(valueOf).length() + 24).append("GEBI Response for: ").append(valueOf).append(" tag.").toString(), new Object[0]);
            } else {
                glk.m17976b("Babel", "GEBI Response with null request!", new Object[0]);
            }
        }
        if (!m14749m() && this.f12440g != null) {
            fqu.m16001a(blo.m6056g(), this);
        }
    }

    public List<gkv<fbt, edk[]>> m14747k() {
        return this.f12440g;
    }

    public String m14748l() {
        return ((eux) this.b).f12332d;
    }

    public boolean m14749m() {
        return ((eux) this.b).f12334f;
    }

    public boolean m14750n() {
        return ((eux) this.b).f12333e;
    }
}
