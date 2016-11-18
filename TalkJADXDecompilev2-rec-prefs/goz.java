package p000;

import android.content.Context;
import java.util.List;

public final class goz extends eo {
    private final int f15840a;
    private final int f15841b = 2;
    private final Context f15842c;
    private final List<goy> f15843d;

    public goz(ed edVar, Context context, int i, List<goy> list, int i2) {
        super(edVar);
        this.f15842c = context;
        this.f15843d = list;
        this.f15840a = i;
    }

    public boolean m18244a(Class cls) {
        for (goy goy : this.f15843d) {
            if (cls.equals(goy.f15839e)) {
                return true;
            }
        }
        return false;
    }

    public goy m18247d(int i) {
        return (goy) this.f15843d.get(i);
    }

    public int m18242a(String str) {
        for (int size = this.f15843d.size() - 1; size >= 0; size--) {
            if (((goy) this.f15843d.get(size)).f15838d.equals(str)) {
                return size;
            }
        }
        return -1;
    }

    public CharSequence m18246c(int i) {
        return this.f15842c.getString(m18247d(i).f15835a);
    }

    public dr mo1005a(int i) {
        return dr.instantiate(this.f15842c, m18247d(i).f15839e.getName());
    }

    public long mo2313b(int i) {
        return (long) ((this.f15840a * this.f15841b) + i);
    }

    public int m18241a() {
        return this.f15843d.size();
    }
}
