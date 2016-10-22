package defpackage;

import android.content.res.Resources;
import java.util.List;

/* renamed from: dcb */
final class dcb extends dbz {
    final /* synthetic */ dca a;
    private final List<Integer> b;
    private final int c;

    public dcb(dca dca, Resources resources, List<Integer> list, int i) {
        this.a = dca;
        super(resources, dca.c);
        this.b = list;
        this.c = i;
    }

    public int getCount() {
        return Math.min(this.a.d, this.b.size() - (this.c * this.a.d));
    }

    public long getItemId(int i) {
        return (long) gwb.a((Integer) this.b.get((this.c * this.a.d) + i));
    }
}
