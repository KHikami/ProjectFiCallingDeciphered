package defpackage;

import java.util.Map;

/* renamed from: apx */
final class apx {
    final apk a;
    final ll<apg<?>> b;
    private int c;

    apx(apk apk) {
        this.b = bas.a(150, new apy(this));
        this.a = apk;
    }

    <R> apg<R> a(amk amk, Object obj, aqi aqi, anv anv, int i, int i2, Class<?> cls, Class<R> cls2, amq amq, apq apq, Map<Class<?>, aoc<?>> map, boolean z, anz anz, api<R> api_R) {
        apg apg = (apg) this.b.a();
        int i3 = this.c;
        this.c = i3 + 1;
        return apg.a(amk, obj, aqi, anv, i, i2, cls, cls2, amq, apq, map, z, anz, api_R, i3);
    }
}
