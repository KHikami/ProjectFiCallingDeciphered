package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import wt;

/* renamed from: bts */
final class bts implements amm<String>, amn<String> {
    private final Context a;
    private final wt<btf> b;
    private final cgr c;
    private final int d;
    private final int[] e;

    public /* bridge */ /* synthetic */ int[] a(Object obj, int i, int i2) {
        return a();
    }

    private int[] a() {
        return this.e;
    }

    private ams a(String str) {
        dey dey = (dey) jyn.a(this.a, dey.class);
        return ((dex) jyn.a(this.a, dex.class)).a(str, (azl) dey.d(this.d).a(this.a, new awe(this.a)), (iic) dey.b().a());
    }

    bts(Context context, wt<btf> wtVar, cgr cgr) {
        this.a = context;
        this.b = wtVar;
        this.c = cgr;
        this.d = ((boz) jyn.a(context, boz.class)).a();
        this.e = new int[]{this.d, this.d};
    }

    private String a(btf btf) {
        edk a = btf.a(this.c);
        if (a != null) {
            return this.c.k().d(a.b);
        }
        return null;
    }

    public List<String> c(int i) {
        int i2 = i - 1;
        if (i2 < 0 || i2 >= this.b.a()) {
            return Collections.emptyList();
        }
        btf btf = (btf) this.b.a(i2);
        if (!btf.c() || TextUtils.isEmpty(a(btf))) {
            return Collections.emptyList();
        }
        return Collections.singletonList(a(btf));
    }
}
