import android.content.Context;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

final class btp implements amm<bta>, amn<bta> {
    private final Context a;
    private final wt<btf> b;

    public /* bridge */ /* synthetic */ int[] a(Object obj, int i, int i2) {
        return null;
    }

    private ams a(bta bta) {
        return ((dex) jyn.a(this.a, dex.class)).b(bta.a(), ((dey) jyn.a(this.a, dey.class)).a(this.a.getResources().getDimensionPixelSize(gwb.ez), this.a.getResources().getDimensionPixelSize(gwb.ey)), null);
    }

    btp(Context context, wt<btf> wtVar) {
        this.a = context;
        this.b = wtVar;
    }

    public List<bta> c(int i) {
        int i2 = i - 1;
        if (i2 < 0 || i2 >= this.b.a()) {
            return Collections.emptyList();
        }
        btf btf = (btf) this.b.a(i2);
        if (!(btf.s == null || TextUtils.isEmpty(btf.s.a()))) {
            btc a = btf.s.a(this.a);
            if (a == btc.PHOTO || a == btc.VIDEO) {
                return Collections.singletonList(btf.s);
            }
        }
        return Collections.emptyList();
    }
}
