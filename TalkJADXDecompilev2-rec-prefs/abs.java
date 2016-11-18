package p000;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class abs {
    final /* synthetic */ RecyclerView f174a;

    public int m255a() {
        return this.f174a.getChildCount();
    }

    public void m258a(View view, int i) {
        this.f174a.addView(view, i);
        RecyclerView recyclerView = this.f174a;
        aer d = RecyclerView.m3038d(view);
        if (!(recyclerView.f1448j == null || d == null)) {
            recyclerView.f1448j.mo742b(d);
        }
        if (recyclerView.f1458t != null) {
            for (int size = recyclerView.f1458t.size() - 1; size >= 0; size--) {
                recyclerView.f1458t.get(size);
            }
        }
    }

    public int m256a(View view) {
        return this.f174a.indexOfChild(view);
    }

    public void m257a(int i) {
        View childAt = this.f174a.getChildAt(i);
        if (childAt != null) {
            this.f174a.m3092g(childAt);
        }
        this.f174a.removeViewAt(i);
    }

    public View m261b(int i) {
        return this.f174a.getChildAt(i);
    }

    public void m262b() {
        int a = m255a();
        for (int i = 0; i < a; i++) {
            this.f174a.m3092g(m261b(i));
        }
        this.f174a.removeAllViews();
    }

    public aer m260b(View view) {
        return RecyclerView.m3038d(view);
    }

    public void m259a(View view, int i, LayoutParams layoutParams) {
        aer d = RecyclerView.m3038d(view);
        if (d != null) {
            if (d.m875o() || d.m863c()) {
                d.m870j();
            } else {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + d);
            }
        }
        this.f174a.attachViewToParent(view, i, layoutParams);
    }

    public void m263c(int i) {
        View b = m261b(i);
        if (b != null) {
            aer d = RecyclerView.m3038d(b);
            if (d != null) {
                if (!d.m875o() || d.m863c()) {
                    d.m862b(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + d);
                }
            }
        }
        this.f174a.detachViewFromParent(i);
    }

    public void m264c(View view) {
        aer d = RecyclerView.m3038d(view);
        if (d != null) {
            d.f451n = oa.c(d.f438a);
            oa.c(d.f438a, 4);
        }
    }

    public void m265d(View view) {
        aer d = RecyclerView.m3038d(view);
        if (d != null) {
            oa.c(d.f438a, d.f451n);
            d.f451n = 0;
        }
    }

    public abs(RecyclerView recyclerView) {
        this.f174a = recyclerView;
    }
}
