package p000;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class erv implements jza, kcq {
    Class<?>[] f12143a;
    int f12144b;
    private final kbu f12145c;

    public erv(kbu kbu, Class<?>[] clsArr, int i) {
        this.f12145c = kbu;
        this.f12144b = i;
        this.f12143a = clsArr;
        kbu.m25514a((kcq) this);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        erw erw = (erw) jyn.m25454b(erw.class);
        List arrayList = new ArrayList();
        for (Class b : this.f12143a) {
            kcq kcq = (erx) jyn.m25454b(b);
            if (kcq != null) {
                this.f12145c.m25514a(kcq);
                arrayList.add(kcq);
            }
        }
        if (erw != null) {
            erw.mo1941a(jyn, this.f12145c, arrayList, this.f12144b);
        }
    }
}
