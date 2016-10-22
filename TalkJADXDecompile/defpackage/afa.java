package defpackage;

import android.view.View;

/* renamed from: afa */
final class afa implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ aez b;

    afa(aez aez, View view) {
        this.b = aez;
        this.a = view;
    }

    public void run() {
        this.b.smoothScrollTo(this.a.getLeft() - ((this.b.getWidth() - this.a.getWidth()) / 2), 0);
        this.b.a = null;
    }
}
