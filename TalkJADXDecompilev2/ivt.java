package defpackage;

import com.google.android.libraries.material.progress.MaterialProgressBar;

public final class ivt implements Runnable {
    final /* synthetic */ MaterialProgressBar a;

    public ivt(MaterialProgressBar materialProgressBar) {
        this.a = materialProgressBar;
    }

    public void run() {
        if (this.a.getVisibility() == 0) {
            this.a.setVisibility(4);
        }
    }
}
