package defpackage;

import android.support.v4.widget.ContentLoadingProgressBar;

public final class rv implements Runnable {
    final /* synthetic */ ContentLoadingProgressBar a;

    public rv(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.a = contentLoadingProgressBar;
    }

    public void run() {
        this.a.c = false;
        if (!this.a.d) {
            this.a.a = System.currentTimeMillis();
            this.a.setVisibility(0);
        }
    }
}
