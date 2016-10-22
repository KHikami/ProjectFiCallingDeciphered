package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: exj */
public class exj extends evz {
    private static final long serialVersionUID = 1;
    private final List<gkv<fbt, edk[]>> g;

    exj(lre lre) {
        List list = null;
        super(lre, lre.responseHeader, -1);
        lrf[] lrfArr = lre.b;
        if (lrfArr != null) {
            List arrayList = new ArrayList();
            for (lrf lrf : lrfArr) {
                lqd lqd = lrf.a;
                fbt fbt = new fbt(lqd.a, lqd.e, lqd.c, lqd.d, gwb.b(lqd.f));
                edk[] b = gwb.b(gwb.H(), lrf.b, fbt);
                if (b != null) {
                    Object obj;
                    if (!TextUtils.isEmpty(fbt.c)) {
                        obj = fbt.c;
                    } else if (TextUtils.isEmpty(fbt.d)) {
                        obj = null;
                    } else {
                        obj = fbt.d;
                    }
                    if (!TextUtils.isEmpty(obj)) {
                        for (int i = 0; i < b.length; i++) {
                            if (b[i] != null) {
                                b[i].c(obj);
                            }
                        }
                    }
                }
                arrayList.add(new gkv(fbt, b));
            }
            list = arrayList;
        }
        this.g = list;
        if (evz.a) {
            new StringBuilder(50).append("GetEntityByIdResponse: Number of specs=").append(this.g.size());
            for (gkv gkv : this.g) {
                if (!(gkv == null || gkv.b == null)) {
                    int i2;
                    if (gkv.b == null) {
                        i2 = 0;
                    } else {
                        i2 = ((edk[]) gkv.b).length;
                    }
                    new StringBuilder(55).append("- GetEntityByIdResponse: Number of entities=").append(i2);
                    for (edk edk : (edk[]) gkv.b) {
                        if (edk != null) {
                            String valueOf = String.valueOf(edk.e);
                            String valueOf2 = String.valueOf(edk.f);
                            String valueOf3 = String.valueOf(edk.h);
                            String valueOf4 = String.valueOf(edk.b);
                            String valueOf5 = String.valueOf(edk.d);
                            new StringBuilder(((((String.valueOf(valueOf).length() + 70) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()).append("-- entity: displayName ").append(valueOf).append(",firstName ").append(valueOf2).append(",avatarUrl ").append(valueOf3).append(",participantId ").append(valueOf4).append(",circleId ").append(valueOf5);
                        }
                    }
                }
            }
        }
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        if (glk.a("Babel", 3)) {
            if (this.b != null) {
                String valueOf = String.valueOf(l());
                glk.b("Babel", new StringBuilder(String.valueOf(valueOf).length() + 24).append("GEBI Response for: ").append(valueOf).append(" tag.").toString(), new Object[0]);
            } else {
                glk.b("Babel", "GEBI Response with null request!", new Object[0]);
            }
        }
        if (!m() && this.g != null) {
            fqu.a(blo.g(), this);
        }
    }

    public List<gkv<fbt, edk[]>> k() {
        return this.g;
    }

    public String l() {
        return ((eux) this.b).d;
    }

    public boolean m() {
        return ((eux) this.b).f;
    }

    public boolean n() {
        return ((eux) this.b).e;
    }
}
