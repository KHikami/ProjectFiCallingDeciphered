package p000;

import android.view.View;

final class sl implements Runnable {
    final /* synthetic */ sk f35111a;

    sl(sk skVar) {
        this.f35111a = skVar;
    }

    public void run() {
        View view;
        int i;
        int i2 = 0;
        sk skVar = this.f35111a;
        int b = skVar.f35108b.m40771b();
        boolean z = skVar.f35107a == 3;
        if (z) {
            View d = skVar.f35109c.d(3);
            if (d != null) {
                i2 = -d.getWidth();
            }
            i2 += b;
            view = d;
            i = i2;
        } else {
            i2 = skVar.f35109c.getWidth() - b;
            view = skVar.f35109c.d(5);
            i = i2;
        }
        if (view == null) {
            return;
        }
        if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && skVar.f35109c.a(view) == 0) {
            sh shVar = (sh) view.getLayoutParams();
            skVar.f35108b.m40769a(view, i, view.getTop());
            shVar.f35100c = true;
            skVar.f35109c.invalidate();
            skVar.m40632b();
            skVar.f35109c.d();
        }
    }
}
