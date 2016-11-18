package p000;

import android.support.v4.widget.ContentLoadingProgressBar;

public final class rv implements Runnable {
    final /* synthetic */ ContentLoadingProgressBar f35082a;

    public rv(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.f35082a = contentLoadingProgressBar;
    }

    public void run() {
        this.f35082a.c = false;
        if (!this.f35082a.d) {
            this.f35082a.a = System.currentTimeMillis();
            this.f35082a.setVisibility(0);
        }
    }
}
