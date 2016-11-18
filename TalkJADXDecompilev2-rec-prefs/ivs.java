package p000;

import com.google.android.libraries.material.progress.MaterialProgressBar;

public final class ivs implements Runnable {
    final /* synthetic */ ivp f19192a;
    final /* synthetic */ MaterialProgressBar f19193b;

    public ivs(MaterialProgressBar materialProgressBar, ivp ivp) {
        this.f19193b = materialProgressBar;
        this.f19192a = ivp;
    }

    public void run() {
        boolean z = true;
        this.f19193b.f8612a = false;
        if (this.f19192a.isVisible()) {
            ivm ivm = (ivm) this.f19193b.getProgressDrawable();
            float growScale = this.f19192a.getGrowScale();
            boolean c = this.f19192a.m23377c();
            super.setIndeterminate(false);
            int i = this.f19193b.f8613b;
            this.f19193b.m10440a(0);
            this.f19193b.setProgress(i);
            if (c) {
                ivm.m23368a(true);
            }
            ivm.setGrowScale(growScale);
            if (c) {
                z = false;
            }
            ivm.setVisible(z, false);
            this.f19192a.m23374a(false);
        }
    }
}
