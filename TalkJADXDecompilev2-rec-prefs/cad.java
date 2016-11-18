package p000;

import android.content.Context;
import java.util.ArrayList;

final class cad implements byp {
    private final Context f4903a;
    private final kbu f4904b;
    private final jyn f4905c;

    public cad(Context context, kbu kbu, jyn jyn) {
        this.f4903a = context;
        this.f4904b = kbu;
        this.f4905c = jyn;
    }

    private byo m7077b(Iterable<byn> iterable) {
        return new cac(this.f4903a, this.f4904b, iterable);
    }

    public byo mo799a(Iterable<Class<?>> iterable) {
        Iterable arrayList = new ArrayList();
        for (Class b : iterable) {
            byn byn = (byn) this.f4905c.m25454b(b);
            if (byn != null) {
                arrayList.add(byn);
            }
        }
        return m7077b(arrayList);
    }
}
