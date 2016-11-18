package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class erv implements jza, kcq {
    Class<?>[] a;
    int b;
    private final kbu c;

    public erv(kbu kbu, Class<?>[] clsArr, int i) {
        this.c = kbu;
        this.b = i;
        this.a = clsArr;
        kbu.a((kcq) this);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        erw erw = (erw) jyn.b(erw.class);
        List arrayList = new ArrayList();
        for (Class b : this.a) {
            kcq kcq = (erx) jyn.b(b);
            if (kcq != null) {
                this.c.a(kcq);
                arrayList.add(kcq);
            }
        }
        if (erw != null) {
            erw.a(jyn, this.c, arrayList, this.b);
        }
    }
}
