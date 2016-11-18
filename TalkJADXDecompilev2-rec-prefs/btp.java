package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

final class btp implements amm<bta>, amn<bta> {
    private final Context f4429a;
    private final wt<btf> f4430b;

    public /* bridge */ /* synthetic */ int[] mo706a(Object obj, int i, int i2) {
        return null;
    }

    private ams m6605a(bta bta) {
        return ((dex) jyn.m25426a(this.f4429a, dex.class)).mo1508b(bta.m6574a(), ((dey) jyn.m25426a(this.f4429a, dey.class)).mo1514a(this.f4429a.getResources().getDimensionPixelSize(gwb.ez), this.f4429a.getResources().getDimensionPixelSize(gwb.ey)), null);
    }

    btp(Context context, wt<btf> wtVar) {
        this.f4429a = context;
        this.f4430b = wtVar;
    }

    public List<bta> mo707c(int i) {
        int i2 = i - 1;
        if (i2 < 0 || i2 >= this.f4430b.a()) {
            return Collections.emptyList();
        }
        btf btf = (btf) this.f4430b.a(i2);
        if (!(btf.f4406s == null || TextUtils.isEmpty(btf.f4406s.m6574a()))) {
            btc a = btf.f4406s.m6573a(this.f4429a);
            if (a == btc.PHOTO || a == btc.VIDEO) {
                return Collections.singletonList(btf.f4406s);
            }
        }
        return Collections.emptyList();
    }
}
