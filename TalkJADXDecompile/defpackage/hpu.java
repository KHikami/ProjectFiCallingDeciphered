package defpackage;

import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

/* renamed from: hpu */
public final class hpu {
    public float a;
    public float b;

    public StreetViewPanoramaOrientation a() {
        return new StreetViewPanoramaOrientation(this.b, this.a);
    }

    public hpu a(float f) {
        this.b = f;
        return this;
    }

    public hpu b(float f) {
        this.a = f;
        return this;
    }
}
