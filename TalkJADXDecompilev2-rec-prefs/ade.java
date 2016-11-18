package p000;

import android.view.View;

final class ade implements Runnable {
    final /* synthetic */ add f334a;

    ade(add add) {
        this.f334a = add;
    }

    public void run() {
        View i = this.f334a.m165i();
        if (i != null && i.getWindowToken() != null) {
            this.f334a.mo14a();
        }
    }
}
