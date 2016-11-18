package p000;

import android.view.OrientationEventListener;

final class isc extends OrientationEventListener {
    final /* synthetic */ iry f18847a;

    public isc(iry iry) {
        this.f18847a = iry;
        super(iry.f18799r, 3);
    }

    public void onOrientationChanged(int i) {
        if (i != -1) {
            synchronized (this.f18847a.f18806y) {
                int o;
                if (this.f18847a.f18789E) {
                    o = this.f18847a.m23077o();
                } else {
                    o = this.f18847a.f18788D;
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
                if (o != this.f18847a.f18788D) {
                    this.f18847a.f18788D = o;
                    this.f18847a.m23073k();
                }
            }
        }
    }
}
