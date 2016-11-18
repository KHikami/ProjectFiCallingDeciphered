package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class hey extends hfc {
    final /* synthetic */ hes a;
    private final ArrayList<gug> c;

    public hey(hes hes, ArrayList<gug> arrayList) {
        this.a = hes;
        super(hes);
        this.c = arrayList;
    }

    public void a() {
        Set emptySet;
        hfe hfe = this.a.a.i;
        hes hes = this.a;
        if (hes.k == null) {
            emptySet = Collections.emptySet();
        } else {
            Set hashSet = new HashSet(hes.k.c());
            Map e = hes.k.e();
            for (gtz gtz : e.keySet()) {
                if (!hes.a.c.containsKey(gtz.c())) {
                    hashSet.addAll(((gwb) e.get(gtz)).k);
                }
            }
            emptySet = hashSet;
        }
        hfe.e = emptySet;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((gug) obj).a(this.a.h, this.a.a.i.e);
        }
    }
}
