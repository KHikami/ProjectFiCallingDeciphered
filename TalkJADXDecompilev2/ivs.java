package defpackage;

import com.google.android.libraries.material.progress.MaterialProgressBar;

public final class ivs implements Runnable {
    final /* synthetic */ ivp a;
    final /* synthetic */ MaterialProgressBar b;

    public ivs(MaterialProgressBar materialProgressBar, ivp ivp) {
        this.b = materialProgressBar;
        this.a = ivp;
    }

    public void run() {
        boolean z = true;
        this.b.a = false;
        if (this.a.isVisible()) {
            ivm ivm = (ivm) this.b.getProgressDrawable();
            float growScale = this.a.getGrowScale();
            boolean c = this.a.c();
            super.setIndeterminate(false);
            int i = this.b.b;
            this.b.a(0);
            this.b.setProgress(i);
            if (c) {
                ivm.a(true);
            }
            ivm.setGrowScale(growScale);
            if (c) {
                z = false;
            }
            ivm.setVisible(z, false);
            this.a.a(false);
        }
    }
}
