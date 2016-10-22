import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import java.util.List;

public final class aml<T> implements OnScrollListener {
    private final int a;
    private final amp b;
    private final amu c;
    private final amm<T> d;
    private final amn<T> e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;

    public aml(amu amu, amm<T> amm_T, amn<T> amn_T, int i) {
        this.j = true;
        this.c = amu;
        this.d = amm_T;
        this.e = amn_T;
        this.a = i;
        this.b = new amp(i + 1);
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        this.i = i3;
        if (i > this.h) {
            a(i + i2, true);
        } else if (i < this.h) {
            a(i, false);
        }
        this.h = i;
    }

    private void a(int i, boolean z) {
        int i2;
        int max;
        if (this.j != z) {
            this.j = z;
            for (i2 = 0; i2 < this.a; i2++) {
                this.c.a(this.b.a(0, 0));
            }
        }
        if (z) {
            i2 = this.a;
        } else {
            i2 = -this.a;
        }
        int i3 = i + i2;
        if (i < i3) {
            max = Math.max(this.f, i);
            i2 = i3;
        } else {
            i2 = Math.min(this.g, i);
            max = i3;
        }
        int min = Math.min(this.i, i2);
        max = Math.min(this.i, Math.max(0, max));
        if (i < i3) {
            for (i2 = max; i2 < min; i2++) {
                a(this.d.c(i2), i2, true);
            }
        } else {
            for (i2 = min - 1; i2 >= max; i2--) {
                a(this.d.c(i2), i2, false);
            }
        }
        this.g = max;
        this.f = min;
    }

    private void a(List<T> list, int i, boolean z) {
        int size = list.size();
        int i2;
        if (z) {
            for (i2 = 0; i2 < size; i2++) {
                a(list.get(i2), i, i2);
            }
            return;
        }
        for (i2 = size - 1; i2 >= 0; i2--) {
            a(list.get(i2), i, i2);
        }
    }

    private void a(T t, int i, int i2) {
        int[] a = this.e.a(t, i, i2);
        if (a != null) {
            this.d.a(t).a(this.b.a(a[0], a[1]));
        }
    }
}
