package p000;

import android.view.View;
import java.util.List;

final class ada {
    boolean f319a = true;
    int f320b;
    int f321c;
    int f322d;
    int f323e;
    int f324f;
    int f325g;
    int f326h = 0;
    boolean f327i = false;
    int f328j;
    List<aer> f329k = null;
    boolean f330l;

    ada() {
    }

    boolean m647a(aep aep) {
        return this.f322d >= 0 && this.f322d < aep.m845d();
    }

    View m645a(aek aek) {
        if (this.f329k != null) {
            int size = this.f329k.size();
            int i = 0;
            while (i < size) {
                View view = ((aer) this.f329k.get(i)).f438a;
                aeg aeg = (aeg) view.getLayoutParams();
                if (aeg.m611d() || this.f322d != aeg.m613f()) {
                    i++;
                } else {
                    m643a(view);
                    return view;
                }
            }
            return null;
        }
        View b = aek.m812b(this.f322d);
        this.f322d += this.f323e;
        return b;
    }

    public void m646a() {
        m643a(null);
    }

    private void m643a(View view) {
        View b = m644b(view);
        if (b == null) {
            this.f322d = -1;
        } else {
            this.f322d = ((aeg) b.getLayoutParams()).m613f();
        }
    }

    private View m644b(View view) {
        int size = this.f329k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (i2 < size) {
            int f;
            View view3;
            View view4 = ((aer) this.f329k.get(i2)).f438a;
            aeg aeg = (aeg) view4.getLayoutParams();
            if (!(view4 == view || aeg.m611d())) {
                f = (aeg.m613f() - this.f322d) * this.f323e;
                if (f >= 0 && f < i) {
                    if (f == 0) {
                        return view4;
                    }
                    view3 = view4;
                    i2++;
                    view2 = view3;
                    i = f;
                }
            }
            f = i;
            view3 = view2;
            i2++;
            view2 = view3;
            i = f;
        }
        return view2;
    }
}
