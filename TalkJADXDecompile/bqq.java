import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class bqq implements bpy, kcd, kcq {
    final Context a;
    gme b;
    private final ed c;
    private final String d;
    private gmf e;

    public bqq(Context context, kbu kbu, ed edVar) {
        this.d = getClass().getName();
        this.e = new bqr(this);
        this.a = context;
        this.c = edVar;
        kbu.a((kcq) this);
    }

    public void a(Bundle bundle) {
        a(false);
    }

    private void a(boolean z) {
        dr a = this.c.a(this.d);
        ew a2 = this.c.a();
        if (a != null) {
            a2.a(a);
        } else if (!z) {
            return;
        }
        gmg gmg = (gmg) jyn.a(this.a, gmg.class);
        String string = this.a.getResources().getString(gwb.jC);
        bko e = fde.e(((jca) jyn.a(this.a, jca.class)).a());
        List arrayList = new ArrayList();
        arrayList.add(new gmh(this.a.getResources().getString(gwb.jv), bko.A(), gwb.ju, null));
        arrayList.add(new gmh(this.a.getResources().getString(e.M() ? gwb.jx : gwb.jw), e.t(), gwb.ju, null));
        this.b = gmg.a(string, arrayList);
        this.b.a(this.e);
        this.b.a(a2, this.d);
    }

    public void a(bxt bxt, Collection<bcn> collection) {
        bpz bpz = (bpz) jyn.a(this.a, bpz.class);
        switch (bqs.a[bxt.ordinal()]) {
            case wi.j /*1*/:
            case wi.l /*2*/:
            case wi.z /*3*/:
                bpz.a(1);
            case wi.h /*4*/:
                int a = ((jca) jyn.a(this.a, jca.class)).a();
                fzw fzw = (fzw) jyn.a(this.a, fzw.class);
                if (fzw.d(a) == fzx.c) {
                    for (bcn b : collection) {
                        if (glq.d(this.a, b.b().d)) {
                            bpz.a(3);
                            return;
                        }
                    }
                }
                if (collection.size() <= 1 || fdq.A.b(a)) {
                    bko e = fde.e(a);
                    int G = e.G();
                    if (gwb.k(G)) {
                        gwb.a(e, 2511);
                        a(true);
                        return;
                    }
                    bpz.a(G);
                    return;
                }
                iil.a("Account is not carrier SMS capable", fzw.c(a));
                bpz.a(3);
            default:
                String valueOf = String.valueOf(bxt);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Unknown conversation type: ").append(valueOf).toString());
        }
    }
}
