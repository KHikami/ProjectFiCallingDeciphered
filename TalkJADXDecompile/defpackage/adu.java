package defpackage;

import android.view.View;

/* renamed from: adu */
final class adu extends ads {
    adu(aef aef) {
        super((byte) 0);
    }

    public int d() {
        return this.a.A() - this.a.E();
    }

    public int e() {
        return this.a.A();
    }

    public void a(int i) {
        this.a.i(i);
    }

    public int c() {
        return this.a.C();
    }

    public int e(View view) {
        aeg aeg = (aeg) view.getLayoutParams();
        return aeg.bottomMargin + (this.a.g(view) + aeg.topMargin);
    }

    public int f(View view) {
        aeg aeg = (aeg) view.getLayoutParams();
        return aeg.rightMargin + (this.a.f(view) + aeg.leftMargin);
    }

    public int b(View view) {
        aeg aeg = (aeg) view.getLayoutParams();
        return aeg.bottomMargin + this.a.k(view);
    }

    public int a(View view) {
        return this.a.i(view) - ((aeg) view.getLayoutParams()).topMargin;
    }

    public int c(View view) {
        this.a.a(view, true, this.b);
        return this.b.bottom;
    }

    public int d(View view) {
        this.a.a(view, true, this.b);
        return this.b.top;
    }

    public int f() {
        return (this.a.A() - this.a.C()) - this.a.E();
    }

    public int g() {
        return this.a.E();
    }

    public int h() {
        return this.a.y();
    }

    public int i() {
        return this.a.x();
    }
}
