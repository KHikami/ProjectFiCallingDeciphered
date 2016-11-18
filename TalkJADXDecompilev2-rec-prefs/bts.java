package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

final class bts implements amm<String>, amn<String> {
    private final Context f4432a;
    private final wt<btf> f4433b;
    private final cgr f4434c;
    private final int f4435d;
    private final int[] f4436e = new int[]{this.f4435d, this.f4435d};

    public /* bridge */ /* synthetic */ int[] mo706a(Object obj, int i, int i2) {
        return m6614a();
    }

    private int[] m6614a() {
        return this.f4436e;
    }

    private ams m6612a(String str) {
        dey dey = (dey) jyn.m25426a(this.f4432a, dey.class);
        return ((dex) jyn.m25426a(this.f4432a, dex.class)).mo1500a(str, (azl) dey.mo1519d(this.f4435d).m4424a(this.f4432a, new awe(this.f4432a)), (iic) dey.mo1515b().m3523a());
    }

    bts(Context context, wt<btf> wtVar, cgr cgr) {
        this.f4432a = context;
        this.f4433b = wtVar;
        this.f4434c = cgr;
        this.f4435d = ((boz) jyn.m25426a(context, boz.class)).mo636a();
    }

    private String m6613a(btf btf) {
        edk a = btf.m6584a(this.f4434c);
        if (a != null) {
            return this.f4434c.mo954k().m5594d(a.f11213b);
        }
        return null;
    }

    public List<String> mo707c(int i) {
        int i2 = i - 1;
        if (i2 < 0 || i2 >= this.f4433b.a()) {
            return Collections.emptyList();
        }
        btf btf = (btf) this.f4433b.a(i2);
        if (!btf.m6588c() || TextUtils.isEmpty(m6613a(btf))) {
            return Collections.emptyList();
        }
        return Collections.singletonList(m6613a(btf));
    }
}
