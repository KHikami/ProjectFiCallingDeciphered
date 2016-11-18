package p000;

import android.view.View;

final class afa implements Runnable {
    final /* synthetic */ View f507a;
    final /* synthetic */ aez f508b;

    afa(aez aez, View view) {
        this.f508b = aez;
        this.f507a = view;
    }

    public void run() {
        this.f508b.smoothScrollTo(this.f507a.getLeft() - ((this.f508b.getWidth() - this.f507a.getWidth()) / 2), 0);
        this.f508b.f497a = null;
    }
}
