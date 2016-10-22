package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: bd */
final class bd {
    final View a;
    int b;
    int c;
    int d;
    private int e;

    public bd(View view) {
        this.a = view;
    }

    final void a() {
        kn.d(this.a, this.d - (this.a.getTop() - this.b));
        kn.e(this.a, this.e - (this.a.getLeft() - this.c));
    }

    public final boolean a(int i) {
        if (this.d == i) {
            return false;
        }
        this.d = i;
        a();
        return true;
    }
}
