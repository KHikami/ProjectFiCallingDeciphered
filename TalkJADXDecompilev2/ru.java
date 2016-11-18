package defpackage;

import android.support.v4.widget.ContentLoadingProgressBar;

public final class ru implements Runnable {
    final /* synthetic */ ContentLoadingProgressBar a;

    public ru(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.a = contentLoadingProgressBar;
    }

    public void run() {
        this.a.b = false;
        this.a.a = -1;
        this.a.setVisibility(8);
    }
}
