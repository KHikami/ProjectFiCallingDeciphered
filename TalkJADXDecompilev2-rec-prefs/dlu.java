package p000;

import android.content.Context;
import com.google.android.apps.hangouts.R$drawable;
import java.util.ArrayList;
import java.util.List;

public final class dlu extends dga {
    final dgg f10091a = dgg.m11692a();
    private List<dhw> f10092b = new ArrayList();

    public List<dhw> mo1600a(Context context, dhu dhu, itl itl, did did) {
        this.f10092b.clear();
        if (!itl.m23242f()) {
            Object obj;
            dhw dhw;
            boolean n = this.f10091a.m11711d().m23253n();
            boolean j = itl.m23249j();
            boolean z = !itl.m23249j();
            Object obj2 = this.f10091a.m11726r() != null ? 1 : null;
            Object obj3 = !j ? 1 : null;
            obj2 = (j || n || obj2 != null) ? null : 1;
            if (j || !n) {
                obj = null;
            } else {
                obj = 1;
            }
            if (obj2 != null) {
                dhw = new dhw(context, itl, ba.f2706q, R$drawable.bW, gwb.eu, true, !itl.m23251l(), context.getString(bc.di, new Object[]{itl.m23232b()}), new dlv(this, dhu, itl));
                dhw.m11869a(new dlw(this, z, dhw));
                this.f10092b.add(dhw);
            }
            if (obj3 != null) {
                dhw = new dhw(context, itl, ba.f2706q, gwb.qa, gwb.eu, true, !itl.m23238d(), context.getString(bc.dk, new Object[]{itl.m23232b()}), new dlx(this, itl));
                dhw.m11869a(new dly(this, dhw));
                this.f10092b.add(dhw);
            }
            if (j) {
                this.f10092b.add(new dhw(context, itl, ba.f2706q, gwb.pY, gwb.eu, true, !itl.m23238d(), context.getString(bc.dh, new Object[]{itl.m23232b()}), new dlz(this, dhu, itl)));
            }
            if (obj != null) {
                dhw = new dhw(context, itl, ba.f2706q, gwb.pZ, gwb.eu, true, true, context.getString(bc.dj, new Object[]{itl.m23232b()}), new dma(this, dhu, itl));
                dhw.m11869a(new dmb(this));
                this.f10092b.add(dhw);
            }
        }
        return this.f10092b;
    }

    public int mo1599a() {
        return 1000;
    }
}
