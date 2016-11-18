package p000;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

public final class abq {
    final abs f169a;
    final abr f170b = new abr();
    final List<View> f171c = new ArrayList();

    public abq(abs abs) {
        this.f169a = abs;
    }

    private void m228g(View view) {
        this.f171c.add(view);
        this.f169a.m264c(view);
    }

    private boolean m229h(View view) {
        if (!this.f171c.remove(view)) {
            return false;
        }
        this.f169a.m265d(view);
        return true;
    }

    public void m236a(View view, boolean z) {
        m235a(view, -1, true);
    }

    void m235a(View view, int i, boolean z) {
        int a;
        if (i < 0) {
            a = this.f169a.m255a();
        } else {
            a = m227e(i);
        }
        this.f170b.m250a(a, z);
        if (z) {
            m228g(view);
        }
        this.f169a.m258a(view, a);
    }

    private int m227e(int i) {
        if (i < 0) {
            return -1;
        }
        int a = this.f169a.m255a();
        int i2 = i;
        while (i2 < a) {
            int e = i - (i2 - this.f170b.m254e(i2));
            if (e == 0) {
                while (this.f170b.m252c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += e;
        }
        return -1;
    }

    void m233a(View view) {
        int a = this.f169a.m256a(view);
        if (a >= 0) {
            if (this.f170b.m253d(a)) {
                m229h(view);
            }
            this.f169a.m257a(a);
        }
    }

    void m232a(int i) {
        int e = m227e(i);
        View b = this.f169a.m261b(e);
        if (b != null) {
            if (this.f170b.m253d(e)) {
                m229h(b);
            }
            this.f169a.m257a(e);
        }
    }

    public View m239b(int i) {
        return this.f169a.m261b(m227e(i));
    }

    public void m231a() {
        this.f170b.m248a();
        for (int size = this.f171c.size() - 1; size >= 0; size--) {
            this.f169a.m265d((View) this.f171c.get(size));
            this.f171c.remove(size);
        }
        this.f169a.m262b();
    }

    View m230a(int i, int i2) {
        int size = this.f171c.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) this.f171c.get(i3);
            aer b = this.f169a.m260b(view);
            if (b.m864d() == i && !b.m871k() && !b.m874n() && (i2 == -1 || b.f442e == i2)) {
                return view;
            }
        }
        return null;
    }

    public void m234a(View view, int i, LayoutParams layoutParams, boolean z) {
        int a;
        if (i < 0) {
            a = this.f169a.m255a();
        } else {
            a = m227e(i);
        }
        this.f170b.m250a(a, z);
        if (z) {
            m228g(view);
        }
        this.f169a.m259a(view, a, layoutParams);
    }

    public int m237b() {
        return this.f169a.m255a() - this.f171c.size();
    }

    public int m240c() {
        return this.f169a.m255a();
    }

    public View m241c(int i) {
        return this.f169a.m261b(i);
    }

    void m243d(int i) {
        int e = m227e(i);
        this.f170b.m253d(e);
        this.f169a.m263c(e);
    }

    int m238b(View view) {
        int a = this.f169a.m256a(view);
        if (a == -1 || this.f170b.m252c(a)) {
            return -1;
        }
        return a - this.f170b.m254e(a);
    }

    public boolean m242c(View view) {
        return this.f171c.contains(view);
    }

    public void m244d(View view) {
        int a = this.f169a.m256a(view);
        if (a < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        this.f170b.m249a(a);
        m228g(view);
    }

    void m245e(View view) {
        int a = this.f169a.m256a(view);
        if (a < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f170b.m252c(a)) {
            this.f170b.m251b(a);
            m229h(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f170b.toString() + ", hidden list:" + this.f171c.size();
    }

    boolean m246f(View view) {
        int a = this.f169a.m256a(view);
        if (a == -1) {
            m229h(view);
            return true;
        } else if (!this.f170b.m252c(a)) {
            return false;
        } else {
            this.f170b.m253d(a);
            m229h(view);
            this.f169a.m257a(a);
            return true;
        }
    }
}
