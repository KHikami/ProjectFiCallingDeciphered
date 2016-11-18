package p000;

import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public final class hpu {
    public float f17121a;
    public float f17122b;

    public StreetViewPanoramaOrientation m20441a() {
        return new StreetViewPanoramaOrientation(this.f17122b, this.f17121a);
    }

    public hpu m20442a(float f) {
        this.f17122b = f;
        return this;
    }

    public hpu m20443b(float f) {
        this.f17121a = f;
        return this;
    }
}
