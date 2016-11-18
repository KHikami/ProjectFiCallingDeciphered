package defpackage;

import android.view.View;

final class ceg implements Runnable {
    final /* synthetic */ cdr a;

    ceg(cdr cdr) {
        this.a = cdr;
    }

    public void run() {
        iil.a("Expected condition to be true", this.a.bi);
        if (this.a.isAdded() && !this.a.isPaused()) {
            View view = this.a.getView();
            if (view != null) {
                this.a.showEmptyViewProgress(view);
            }
        }
    }
}
