package p000;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class bqq implements bpy, kcd, kcq {
    final Context f4249a;
    gme f4250b;
    private final ed f4251c;
    private final String f4252d = getClass().getName();
    private gmf f4253e = new bqr(this);

    public bqq(Context context, kbu kbu, ed edVar) {
        this.f4249a = context;
        this.f4251c = edVar;
        kbu.m25514a((kcq) this);
    }

    public void mo643a(Bundle bundle) {
        m6453a(false);
    }

    private void m6453a(boolean z) {
        dr a = this.f4251c.mo1844a(this.f4252d);
        ew a2 = this.f4251c.mo1845a();
        if (a != null) {
            a2.mo1527a(a);
        } else if (!z) {
            return;
        }
        gmg gmg = (gmg) jyn.m25426a(this.f4249a, gmg.class);
        String string = this.f4249a.getResources().getString(gwb.jC);
        bko e = fde.m15018e(((jca) jyn.m25426a(this.f4249a, jca.class)).mo2317a());
        List arrayList = new ArrayList();
        arrayList.add(new gmh(this.f4249a.getResources().getString(gwb.jv), bko.m5608A(), gwb.ju, null));
        arrayList.add(new gmh(this.f4249a.getResources().getString(e.m5626M() ? gwb.jx : gwb.jw), e.m5651t(), gwb.ju, null));
        this.f4250b = gmg.mo2296a(string, arrayList);
        this.f4250b.mo2297a(this.f4253e);
        this.f4250b.m7000a(a2, this.f4252d);
    }

    public void mo669a(bxt bxt, Collection<bcn> collection) {
        bpz bpz = (bpz) jyn.m25426a(this.f4249a, bpz.class);
        switch (bqs.f4255a[bxt.ordinal()]) {
            case 1:
            case 2:
            case 3:
                bpz.mo661a(1);
                return;
            case 4:
                int a = ((jca) jyn.m25426a(this.f4249a, jca.class)).mo2317a();
                fzw fzw = (fzw) jyn.m25426a(this.f4249a, fzw.class);
                if (fzw.mo2153d(a) == fzx.f14515c) {
                    for (bcn b : collection) {
                        if (glq.m18019d(this.f4249a, b.m4893b().f12669d)) {
                            bpz.mo661a(3);
                            return;
                        }
                    }
                }
                if (collection.size() <= 1 || fdq.f12759A.m14370b(a)) {
                    bko e = fde.m15018e(a);
                    int G = e.m5620G();
                    if (gwb.m2280k(G)) {
                        gwb.m1823a(e, 2511);
                        m6453a(true);
                        return;
                    }
                    bpz.mo661a(G);
                    return;
                }
                iil.m21874a("Account is not carrier SMS capable", fzw.mo2152c(a));
                bpz.mo661a(3);
                return;
            default:
                String valueOf = String.valueOf(bxt);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Unknown conversation type: ").append(valueOf).toString());
        }
    }
}
