package defpackage;

import android.view.OrientationEventListener;

final class isc extends OrientationEventListener {
    final /* synthetic */ iry a;

    public isc(iry iry) {
        this.a = iry;
        super(iry.r, 3);
    }

    public void onOrientationChanged(int i) {
        if (i != -1) {
            synchronized (this.a.y) {
                int o;
                if (this.a.E) {
                    o = this.a.o();
                } else {
                    o = this.a.D;
                    if (i >= 338 || i <= 22) {
                        o = 0;
                    } else if (i >= 68 && i <= 112) {
                        o = 270;
                    } else if (i >= 158 && i <= 202) {
                        o = 180;
                    } else if (i >= 248 && i <= 292) {
                        o = 90;
                    }
                }
                if (o != this.a.D) {
                    this.a.D = o;
                    this.a.k();
                }
            }
        }
    }
}
