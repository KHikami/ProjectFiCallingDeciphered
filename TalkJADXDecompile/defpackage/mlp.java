package defpackage;

import java.util.Iterator;

/* renamed from: mlp */
final class mlp extends mnw<F, T> {
    final /* synthetic */ met a;

    mlp(Iterator it, met met) {
        this.a = met;
        super(it);
    }

    T a(F f) {
        return this.a.a(f);
    }
}
