package defpackage;

import android.view.View;

final class sl implements Runnable {
    final /* synthetic */ sk a;

    sl(sk skVar) {
        this.a = skVar;
    }

    public void run() {
        View view;
        int i;
        int i2 = 0;
        sk skVar = this.a;
        int b = skVar.b.b();
        boolean z = skVar.a == 3;
        if (z) {
            View d = skVar.c.d(3);
            if (d != null) {
                i2 = -d.getWidth();
            }
            i2 += b;
            view = d;
            i = i2;
        } else {
            i2 = skVar.c.getWidth() - b;
            view = skVar.c.d(5);
            i = i2;
        }
        if (view == null) {
            return;
        }
        if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && skVar.c.a(view) == 0) {
            sh shVar = (sh) view.getLayoutParams();
            skVar.b.a(view, i, view.getTop());
            shVar.c = true;
            skVar.c.invalidate();
            skVar.b();
            skVar.c.d();
        }
    }
}
