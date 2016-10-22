package defpackage;

import android.content.Context;

/* renamed from: cpn */
final class cpn implements jwm {
    final /* synthetic */ Context a;
    final /* synthetic */ cpm b;

    cpn(cpm cpm, Context context) {
        this.b = cpm;
        this.a = context;
    }

    public boolean a(jwi jwi, Object obj) {
        boolean b = gwb.b((Boolean) obj);
        ((jxk) jwi).a(b);
        this.b.a(this.a, b);
        return true;
    }
}
