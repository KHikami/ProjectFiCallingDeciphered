package defpackage;

import android.view.View;
import java.util.List;

final class ada {
    boolean a = true;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h = 0;
    boolean i = false;
    int j;
    List<aer> k = null;
    boolean l;

    ada() {
    }

    boolean a(aep aep) {
        return this.d >= 0 && this.d < aep.d();
    }

    View a(aek aek) {
        if (this.k != null) {
            int size = this.k.size();
            int i = 0;
            while (i < size) {
                View view = ((aer) this.k.get(i)).a;
                aeg aeg = (aeg) view.getLayoutParams();
                if (aeg.d() || this.d != aeg.f()) {
                    i++;
                } else {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View b = aek.b(this.d);
        this.d += this.e;
        return b;
    }

    public void a() {
        a(null);
    }

    private void a(View view) {
        View b = b(view);
        if (b == null) {
            this.d = -1;
        } else {
            this.d = ((aeg) b.getLayoutParams()).f();
        }
    }

    private View b(View view) {
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (i2 < size) {
            int f;
            View view3;
            View view4 = ((aer) this.k.get(i2)).a;
            aeg aeg = (aeg) view4.getLayoutParams();
            if (!(view4 == view || aeg.d())) {
                f = (aeg.f() - this.d) * this.e;
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
