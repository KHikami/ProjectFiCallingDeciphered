package defpackage;

import android.text.TextUtils;

/* renamed from: cfo */
final class cfo implements cgh {
    final /* synthetic */ int a;
    final /* synthetic */ cdn b;

    cfo(cdn cdn, int i) {
        this.b = cdn;
        this.a = i;
    }

    public void a(String str, cgc cgc) {
        if (!TextUtils.isEmpty(str) && !blo.a(str)) {
            this.b.a.bh = this.a;
            this.b.a.ak.a(new fko(this.b.a.av.g(), cgc.a, this.a));
            if (this.b.a.av != null) {
                this.b.a.bC.a(this.b.a.av.g(), cgc.a, false);
            }
        }
    }
}
