package p000;

import com.google.android.apps.hangouts.elane.VolumeCircle;

public final class cwt implements Runnable {
    final /* synthetic */ VolumeCircle f9244a;

    public cwt(VolumeCircle volumeCircle) {
        this.f9244a = volumeCircle;
    }

    public void run() {
        if (this.f9244a.f6207b > 0) {
            this.f9244a.m8427a();
            this.f9244a.f6208c.postDelayed(this.f9244a.f6209d, (long) this.f9244a.getResources().getInteger(gwb.pj));
            return;
        }
        this.f9244a.f6206a = false;
    }
}
