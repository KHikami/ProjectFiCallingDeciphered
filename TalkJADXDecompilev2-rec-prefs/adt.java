package p000;

import android.view.View;

final class adt extends ads {
    adt(aef aef) {
        super(aef);
    }

    public int mo93d() {
        return this.a.m506z() - this.a.m401D();
    }

    public int mo95e() {
        return this.a.m506z();
    }

    public void mo89a(int i) {
        this.a.m487h(i);
    }

    public int mo91c() {
        return this.a.m399B();
    }

    public int mo96e(View view) {
        aeg aeg = (aeg) view.getLayoutParams();
        return aeg.rightMargin + (this.a.m478f(view) + aeg.leftMargin);
    }

    public int mo98f(View view) {
        aeg aeg = (aeg) view.getLayoutParams();
        return aeg.bottomMargin + (this.a.m482g(view) + aeg.topMargin);
    }

    public int mo90b(View view) {
        aeg aeg = (aeg) view.getLayoutParams();
        return aeg.rightMargin + this.a.m492j(view);
    }

    public int mo88a(View view) {
        return this.a.m486h(view) - ((aeg) view.getLayoutParams()).leftMargin;
    }

    public int mo92c(View view) {
        this.a.m434a(view, true, this.b);
        return this.b.right;
    }

    public int mo94d(View view) {
        this.a.m434a(view, true, this.b);
        return this.b.left;
    }

    public int mo97f() {
        return (this.a.m506z() - this.a.m399B()) - this.a.m401D();
    }

    public int mo99g() {
        return this.a.m401D();
    }

    public int mo100h() {
        return this.a.m504x();
    }

    public int mo101i() {
        return this.a.m505y();
    }
}
