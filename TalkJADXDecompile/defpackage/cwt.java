package defpackage;

import com.google.android.apps.hangouts.elane.VolumeCircle;

/* renamed from: cwt */
public final class cwt implements Runnable {
    final /* synthetic */ VolumeCircle a;

    public cwt(VolumeCircle volumeCircle) {
        this.a = volumeCircle;
    }

    public void run() {
        if (this.a.b > 0) {
            this.a.a();
            this.a.c.postDelayed(this.a.d, (long) this.a.getResources().getInteger(gwb.pj));
            return;
        }
        this.a.a = false;
    }
}
