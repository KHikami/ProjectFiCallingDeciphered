package p000;

import android.view.View;

final class adu extends ads {
    adu(aef aef) {
        super(aef);
    }

    public int mo93d() {
        return this.a.m398A() - this.a.m402E();
    }

    public int mo95e() {
        return this.a.m398A();
    }

    public void mo89a(int i) {
        this.a.m490i(i);
    }

    public int mo91c() {
        return this.a.m400C();
    }

    public int mo96e(View view) {
        aeg aeg = (aeg) view.getLayoutParams();
        return aeg.bottomMargin + (this.a.m482g(view) + aeg.topMargin);
    }

    public int mo98f(View view) {
        aeg aeg = (aeg) view.getLayoutParams();
        return aeg.rightMargin + (this.a.m478f(view) + aeg.leftMargin);
    }

    public int mo90b(View view) {
        aeg aeg = (aeg) view.getLayoutParams();
        return aeg.bottomMargin + this.a.m494k(view);
    }

    public int mo88a(View view) {
        return this.a.m489i(view) - ((aeg) view.getLayoutParams()).topMargin;
    }

    public int mo92c(View view) {
        this.a.m434a(view, true, this.b);
        return this.b.bottom;
    }

    public int mo94d(View view) {
        this.a.m434a(view, true, this.b);
        return this.b.top;
    }

    public int mo97f() {
        return (this.a.m398A() - this.a.m400C()) - this.a.m402E();
    }

    public int mo99g() {
        return this.a.m402E();
    }

    public int mo100h() {
        return this.a.m505y();
    }

    public int mo101i() {
        return this.a.m504x();
    }
}
