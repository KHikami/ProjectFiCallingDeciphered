package p000;

import android.support.v4.widget.ContentLoadingProgressBar;

public final class ru implements Runnable {
    final /* synthetic */ ContentLoadingProgressBar f35081a;

    public ru(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.f35081a = contentLoadingProgressBar;
    }

    public void run() {
        this.f35081a.b = false;
        this.f35081a.a = -1;
        this.f35081a.setVisibility(8);
    }
}
