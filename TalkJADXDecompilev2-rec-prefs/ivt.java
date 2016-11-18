package p000;

import com.google.android.libraries.material.progress.MaterialProgressBar;

public final class ivt implements Runnable {
    final /* synthetic */ MaterialProgressBar f19194a;

    public ivt(MaterialProgressBar materialProgressBar) {
        this.f19194a = materialProgressBar;
    }

    public void run() {
        if (this.f19194a.getVisibility() == 0) {
            this.f19194a.setVisibility(4);
        }
    }
}
