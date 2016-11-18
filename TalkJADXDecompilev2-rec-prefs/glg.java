package p000;

import android.content.Context;
import java.util.ArrayList;

public final class glg extends iis {
    private ArrayList<String> f15540a;

    public glg(Context context, int[] iArr, ArrayList<String> arrayList) {
        super(context, iArr);
        this.f15540a = arrayList;
    }

    protected void mo1404a(mdg mdg) {
        super.mo1404a(mdg);
        ith h = dgg.m11692a().m11716h();
        if (h != null) {
            itf a = h.m23201a();
            if (a != null) {
                mdg.f27451e = a.m23169d();
            }
            if (mdg.f27447a == null) {
                mdg.f27447a = new mcv();
            }
            mcv mcv = mdg.f27447a;
            mcv.f27386a = new mcu();
            mcv.f27386a.f27384k = h.m23211c();
            mcv.f27386a.f27378e = h.m23214f();
            mcv.f27386a.f27375b = h.m23212d();
            mcv.f27392g = new lkz();
            mcv.f27392g.f25295d = Integer.valueOf(h.m23215g());
        }
    }

    public void m17953a(String str) {
        this.f15540a.add(str);
    }
}
