package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* compiled from: PG */
/* renamed from: ws */
public class ws {
    final /* synthetic */ RecyclerView a;

    public int a() {
        return this.a.getChildCount();
    }

    public void a(View view, int i) {
        this.a.addView(view, i);
        RecyclerView recyclerView = this.a;
        zk b = RecyclerView.b(view);
        if (recyclerView.j != null && b != null) {
            recyclerView.j.b(b);
        }
    }

    public int a(View view) {
        return this.a.indexOfChild(view);
    }

    public void a(int i) {
        View childAt = this.a.getChildAt(i);
        if (childAt != null) {
            this.a.e(childAt);
        }
        this.a.removeViewAt(i);
    }

    public View b(int i) {
        return this.a.getChildAt(i);
    }

    public void b() {
        int a = a();
        for (int i = 0; i < a; i++) {
            this.a.e(b(i));
        }
        this.a.removeAllViews();
    }

    public zk b(View view) {
        return RecyclerView.b(view);
    }

    public void a(View view, int i, LayoutParams layoutParams) {
        zk b = RecyclerView.b(view);
        if (b != null) {
            if (b.n() || b.b()) {
                b.i();
            } else {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + b);
            }
        }
        this.a.attachViewToParent(view, i, layoutParams);
    }

    public void c(int i) {
        View b = b(i);
        if (b != null) {
            zk b2 = RecyclerView.b(b);
            if (b2 != null) {
                if (!b2.n() || b2.b()) {
                    b2.b(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + b2);
                }
            }
        }
        this.a.detachViewFromParent(i);
    }

    public void c(View view) {
        zk b = RecyclerView.b(view);
        if (b != null) {
            b.l = kn.d(b.a);
            kn.c(b.a, 4);
        }
    }

    public void d(View view) {
        zk b = RecyclerView.b(view);
        if (b != null) {
            kn.c(b.a, b.l);
            b.l = 0;
        }
    }

    public ws(RecyclerView recyclerView) {
        this.a = recyclerView;
    }
}
