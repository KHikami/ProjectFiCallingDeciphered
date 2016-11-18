package p000;

import android.view.View;

final class ceg implements Runnable {
    final /* synthetic */ cdr f5124a;

    ceg(cdr cdr) {
        this.f5124a = cdr;
    }

    public void run() {
        iil.m21874a("Expected condition to be true", this.f5124a.bi);
        if (this.f5124a.isAdded() && !this.f5124a.isPaused()) {
            View view = this.f5124a.getView();
            if (view != null) {
                this.f5124a.showEmptyViewProgress(view);
            }
        }
    }
}
