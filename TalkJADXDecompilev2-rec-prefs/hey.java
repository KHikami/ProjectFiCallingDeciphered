package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class hey extends hfc {
    final /* synthetic */ hes f16792a;
    private final ArrayList<gug> f16793c;

    public hey(hes hes, ArrayList<gug> arrayList) {
        this.f16792a = hes;
        super(hes);
        this.f16793c = arrayList;
    }

    public void mo2501a() {
        Set emptySet;
        hfe hfe = this.f16792a.f16760a.f16835i;
        hes hes = this.f16792a;
        if (hes.f16770k == null) {
            emptySet = Collections.emptySet();
        } else {
            Set hashSet = new HashSet(hes.f16770k.m18757c());
            Map e = hes.f16770k.m18759e();
            for (gtz gtz : e.keySet()) {
                if (!hes.f16760a.f16829c.containsKey(gtz.m18606c())) {
                    hashSet.addAll(((gwb) e.get(gtz)).f897k);
                }
            }
            emptySet = hashSet;
        }
        hfe.f16803e = emptySet;
        ArrayList arrayList = this.f16793c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((gug) obj).m18613a(this.f16792a.f16767h, this.f16792a.f16760a.f16835i.f16803e);
        }
    }
}
