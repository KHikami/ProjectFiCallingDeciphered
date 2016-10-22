import android.support.v7.widget.RecyclerView;
import android.widget.AbsListView.OnScrollListener;

public final class ano extends aei {
    private final OnScrollListener a;
    private int b;
    private int c;
    private int d;

    public ano(OnScrollListener onScrollListener) {
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.a = onScrollListener;
    }

    public void a(RecyclerView recyclerView, int i) {
        int i2;
        switch (i) {
            case wi.w /*0*/:
                i2 = 0;
                break;
            case wi.j /*1*/:
                i2 = 1;
                break;
            case wi.l /*2*/:
                i2 = 2;
                break;
            default:
                i2 = nzf.UNSET_ENUM_VALUE;
                break;
        }
        this.a.onScrollStateChanged(null, i2);
    }

    public void a(RecyclerView recyclerView, int i, int i2) {
        acx acx = (acx) recyclerView.c();
        int p = acx.p();
        int abs = Math.abs(p - acx.r());
        int a = recyclerView.b().a();
        if (p != this.b || abs != this.c || a != this.d) {
            this.a.onScroll(null, p, abs, a);
            this.b = p;
            this.c = abs;
            this.d = a;
        }
    }
}
