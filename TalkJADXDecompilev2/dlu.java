package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.R$drawable;
import java.util.ArrayList;
import java.util.List;

public final class dlu extends dga {
    final dgg a = dgg.a();
    private List<dhw> b = new ArrayList();

    public List<dhw> a(Context context, dhu dhu, itl itl, did did) {
        this.b.clear();
        if (!itl.f()) {
            Object obj;
            dhw dhw;
            boolean n = this.a.d().n();
            boolean j = itl.j();
            boolean z = !itl.j();
            Object obj2 = this.a.r() != null ? 1 : null;
            Object obj3 = !j ? 1 : null;
            obj2 = (j || n || obj2 != null) ? null : 1;
            if (j || !n) {
                obj = null;
            } else {
                obj = 1;
            }
            if (obj2 != null) {
                dhw = new dhw(context, itl, ba.q, R$drawable.bW, gwb.eu, true, !itl.l(), context.getString(bc.di, new Object[]{itl.b()}), new dlv(this, dhu, itl));
                dhw.a(new dlw(this, z, dhw));
                this.b.add(dhw);
            }
            if (obj3 != null) {
                dhw = new dhw(context, itl, ba.q, gwb.qa, gwb.eu, true, !itl.d(), context.getString(bc.dk, new Object[]{itl.b()}), new dlx(this, itl));
                dhw.a(new dly(this, dhw));
                this.b.add(dhw);
            }
            if (j) {
                this.b.add(new dhw(context, itl, ba.q, gwb.pY, gwb.eu, true, !itl.d(), context.getString(bc.dh, new Object[]{itl.b()}), new dlz(this, dhu, itl)));
            }
            if (obj != null) {
                dhw = new dhw(context, itl, ba.q, gwb.pZ, gwb.eu, true, true, context.getString(bc.dj, new Object[]{itl.b()}), new dma(this, dhu, itl));
                dhw.a(new dmb(this));
                this.b.add(dhw);
            }
        }
        return this.b;
    }

    public int a() {
        return 1000;
    }
}
