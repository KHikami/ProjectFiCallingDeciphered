package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class abs {
    final /* synthetic */ RecyclerView a;

    public int a() {
        return this.a.getChildCount();
    }

    public void a(View view, int i) {
        this.a.addView(view, i);
        RecyclerView recyclerView = this.a;
        aer d = RecyclerView.d(view);
        if (!(recyclerView.j == null || d == null)) {
            recyclerView.j.b(d);
        }
        if (recyclerView.t != null) {
            for (int size = recyclerView.t.size() - 1; size >= 0; size--) {
                recyclerView.t.get(size);
            }
        }
    }

    public int a(View view) {
        return this.a.indexOfChild(view);
    }

    public void a(int i) {
        View childAt = this.a.getChildAt(i);
        if (childAt != null) {
            this.a.g(childAt);
        }
        this.a.removeViewAt(i);
    }

    public View b(int i) {
        return this.a.getChildAt(i);
    }

    public void b() {
        int a = a();
        for (int i = 0; i < a; i++) {
            this.a.g(b(i));
        }
        this.a.removeAllViews();
    }

    public aer b(View view) {
        return RecyclerView.d(view);
    }

    public void a(View view, int i, LayoutParams layoutParams) {
        aer d = RecyclerView.d(view);
        if (d != null) {
            if (d.o() || d.c()) {
                d.j();
            } else {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + d);
            }
        }
        this.a.attachViewToParent(view, i, layoutParams);
    }

    public void c(int i) {
        View b = b(i);
        if (b != null) {
            aer d = RecyclerView.d(b);
            if (d != null) {
                if (!d.o() || d.c()) {
                    d.b(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + d);
                }
            }
        }
        this.a.detachViewFromParent(i);
    }

    public void c(View view) {
        aer d = RecyclerView.d(view);
        if (d != null) {
            d.n = oa.c(d.a);
            oa.c(d.a, 4);
        }
    }

    public void d(View view) {
        aer d = RecyclerView.d(view);
        if (d != null) {
            oa.c(d.a, d.n);
            d.n = 0;
        }
    }

    public abs(RecyclerView recyclerView) {
        this.a = recyclerView;
    }
}
