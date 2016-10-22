package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.util.Map;

/* renamed from: bsi */
final class bsi extends bso {
    final /* synthetic */ bsf a;
    private final Map b;

    public bsi(bsf bsf, Map map) {
        this.a = bsf;
        super(bsf);
        this.b = map;
    }

    public final void a() {
        int a = this.a.d.a(this.a.c);
        if (a != 0) {
            this.a.a.a(new bsj(this, this.a, new ConnectionResult(a, null)));
            return;
        }
        if (this.a.f) {
            this.a.e.i();
        }
        for (bra bra : this.b.keySet()) {
            bra.a((brh) this.b.get(bra));
        }
    }
}
