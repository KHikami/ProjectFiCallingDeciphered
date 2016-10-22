package defpackage;

import android.view.View;

/* renamed from: adt */
final class adt extends ads {
    adt(aef aef) {
        super((byte) 0);
    }

    public int d() {
        return this.a.z() - this.a.D();
    }

    public int e() {
        return this.a.z();
    }

    public void a(int i) {
        this.a.h(i);
    }

    public int c() {
        return this.a.B();
    }

    public int e(View view) {
        aeg aeg = (aeg) view.getLayoutParams();
        return aeg.rightMargin + (this.a.f(view) + aeg.leftMargin);
    }

    public int f(View view) {
        aeg aeg = (aeg) view.getLayoutParams();
        return aeg.bottomMargin + (this.a.g(view) + aeg.topMargin);
    }

    public int b(View view) {
        aeg aeg = (aeg) view.getLayoutParams();
        return aeg.rightMargin + this.a.j(view);
    }

    public int a(View view) {
        return this.a.h(view) - ((aeg) view.getLayoutParams()).leftMargin;
    }

    public int c(View view) {
        this.a.a(view, true, this.b);
        return this.b.right;
    }

    public int d(View view) {
        this.a.a(view, true, this.b);
        return this.b.left;
    }

    public int f() {
        return (this.a.z() - this.a.B()) - this.a.D();
    }

    public int g() {
        return this.a.D();
    }

    public int h() {
        return this.a.x();
    }

    public int i() {
        return this.a.y();
    }
}
