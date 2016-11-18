package p000;

import android.content.res.Resources;
import java.util.List;

final class dcb extends dbz {
    final /* synthetic */ dca f9499a;
    private final List<Integer> f9500b;
    private final int f9501c;

    public dcb(dca dca, Resources resources, List<Integer> list, int i) {
        this.f9499a = dca;
        super(resources, dca.f9492c);
        this.f9500b = list;
        this.f9501c = i;
    }

    public int getCount() {
        return Math.min(this.f9499a.f9493d, this.f9500b.size() - (this.f9501c * this.f9499a.f9493d));
    }

    public long getItemId(int i) {
        return (long) gwb.m1507a((Integer) this.f9500b.get((this.f9501c * this.f9499a.f9493d) + i));
    }
}
