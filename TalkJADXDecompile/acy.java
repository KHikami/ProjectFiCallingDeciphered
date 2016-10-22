import android.view.View;

final class acy {
    int a;
    int b;
    boolean c;
    boolean d;
    final /* synthetic */ acx e;

    acy(acx acx) {
        this.e = acx;
        a();
    }

    void a() {
        this.a = -1;
        this.b = nzf.UNSET_ENUM_VALUE;
        this.c = false;
        this.d = false;
    }

    void b() {
        int d;
        if (this.c) {
            d = this.e.j.d();
        } else {
            d = this.e.j.c();
        }
        this.b = d;
    }

    public String toString() {
        return "AnchorInfo{mPosition=" + this.a + ", mCoordinate=" + this.b + ", mLayoutFromEnd=" + this.c + ", mValid=" + this.d + '}';
    }

    public void a(View view) {
        int b = this.e.j.b();
        if (b >= 0) {
            b(view);
            return;
        }
        this.a = this.e.d(view);
        int e;
        if (this.c) {
            b = (this.e.j.d() - b) - this.e.j.b(view);
            this.b = this.e.j.d() - b;
            if (b > 0) {
                e = this.b - this.e.j.e(view);
                int c = this.e.j.c();
                e -= c + Math.min(this.e.j.a(view) - c, 0);
                if (e < 0) {
                    this.b = Math.min(b, -e) + this.b;
                    return;
                }
                return;
            }
            return;
        }
        e = this.e.j.a(view);
        c = e - this.e.j.c();
        this.b = e;
        if (c > 0) {
            b = (this.e.j.d() - Math.min(0, (this.e.j.d() - b) - this.e.j.b(view))) - (e + this.e.j.e(view));
            if (b < 0) {
                this.b -= Math.min(c, -b);
            }
        }
    }

    public void b(View view) {
        if (this.c) {
            this.b = this.e.j.b(view) + this.e.j.b();
        } else {
            this.b = this.e.j.a(view);
        }
        this.a = this.e.d(view);
    }
}
