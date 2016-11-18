package p000;

import android.view.View;

final class bq {
    private final View f4167a;
    private int f4168b;
    private int f4169c;
    private int f4170d;
    private int f4171e;

    public bq(View view) {
        this.f4167a = view;
    }

    public void m6379a() {
        this.f4168b = this.f4167a.getTop();
        this.f4169c = this.f4167a.getLeft();
        m6378c();
    }

    private void m6378c() {
        oa.e(this.f4167a, this.f4170d - (this.f4167a.getTop() - this.f4168b));
        oa.f(this.f4167a, this.f4171e - (this.f4167a.getLeft() - this.f4169c));
    }

    public boolean m6380a(int i) {
        if (this.f4170d == i) {
            return false;
        }
        this.f4170d = i;
        m6378c();
        return true;
    }

    public boolean m6382b(int i) {
        if (this.f4171e == i) {
            return false;
        }
        this.f4171e = i;
        m6378c();
        return true;
    }

    public int m6381b() {
        return this.f4170d;
    }
}
