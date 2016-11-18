package p000;

import android.widget.ProgressBar;

public final class ahx {
    private final ProgressBar f852a;
    private final ProgressBar f853b;
    private boolean f854c;

    public ahx(ProgressBar progressBar, ProgressBar progressBar2, boolean z) {
        this.f852a = progressBar;
        this.f853b = progressBar2;
        m1359a(true);
    }

    private void m1359a(boolean z) {
        this.f854c = z;
        m1360b(this.f854c);
    }

    public void m1361a(int i) {
        if (i == 4 || i == 8) {
            this.f853b.setVisibility(i);
            this.f852a.setVisibility(i);
            return;
        }
        m1360b(this.f854c);
    }

    private void m1360b(boolean z) {
        int i;
        int i2 = 8;
        ProgressBar progressBar = this.f853b;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        progressBar.setVisibility(i);
        ProgressBar progressBar2 = this.f852a;
        if (!z) {
            i2 = 0;
        }
        progressBar2.setVisibility(i2);
    }
}
