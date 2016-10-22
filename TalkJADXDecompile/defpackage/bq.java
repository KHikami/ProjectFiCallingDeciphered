package defpackage;

import android.view.View;
import oa;

/* renamed from: bq */
final class bq {
    private final View a;
    private int b;
    private int c;
    private int d;
    private int e;

    public bq(View view) {
        this.a = view;
    }

    public void a() {
        this.b = this.a.getTop();
        this.c = this.a.getLeft();
        c();
    }

    private void c() {
        oa.e(this.a, this.d - (this.a.getTop() - this.b));
        oa.f(this.a, this.e - (this.a.getLeft() - this.c));
    }

    public boolean a(int i) {
        if (this.d == i) {
            return false;
        }
        this.d = i;
        c();
        return true;
    }

    public boolean b(int i) {
        if (this.e == i) {
            return false;
        }
        this.e = i;
        c();
        return true;
    }

    public int b() {
        return this.d;
    }
}
