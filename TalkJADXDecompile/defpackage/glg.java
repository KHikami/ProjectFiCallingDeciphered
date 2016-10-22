package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: glg */
public final class glg extends iis {
    private ArrayList<String> a;

    public glg(Context context, int[] iArr, ArrayList<String> arrayList) {
        super(context, iArr);
        this.a = arrayList;
    }

    protected void a(mdg mdg) {
        super.a(mdg);
        ith h = dgg.a().h();
        if (h != null) {
            itf a = h.a();
            if (a != null) {
                mdg.e = a.d();
            }
            if (mdg.a == null) {
                mdg.a = new mcv();
            }
            mcv mcv = mdg.a;
            mcv.a = new mcu();
            mcv.a.k = h.c();
            mcv.a.e = h.f();
            mcv.a.b = h.d();
            mcv.g = new lkz();
            mcv.g.d = Integer.valueOf(h.g());
        }
    }

    public void a(String str) {
        this.a.add(str);
    }
}
