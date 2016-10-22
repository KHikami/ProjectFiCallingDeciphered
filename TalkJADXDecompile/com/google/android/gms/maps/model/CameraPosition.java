package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hqy;

public final class CameraPosition extends AbstractSafeParcelable {
    public static final hqy CREATOR;
    public final LatLng a;
    public final float b;
    public final float c;
    public final float d;
    private final int e;

    static {
        CREATOR = new hqy();
    }

    public CameraPosition(int i, LatLng latLng, float f, float f2, float f3) {
        gwb.f((Object) latLng, (Object) "null camera target");
        boolean z = 0.0f <= f2 && f2 <= 90.0f;
        gwb.a(z, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.e = i;
        this.a = latLng;
        this.b = f;
        this.c = f2 + 0.0f;
        if (((double) f3) <= 0.0d) {
            f3 = (f3 % 360.0f) + 360.0f;
        }
        this.d = f3 % 360.0f;
    }

    int a() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.a.equals(cameraPosition.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(cameraPosition.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(cameraPosition.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(cameraPosition.d);
    }

    public int hashCode() {
        return gwb.a(this.a, Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d));
    }

    public String toString() {
        return gwb.K((Object) this).a("target", this.a).a("zoom", Float.valueOf(this.b)).a("tilt", Float.valueOf(this.c)).a("bearing", Float.valueOf(this.d)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, a());
        gwb.a(parcel, 2, this.a, i, false);
        gwb.a(parcel, 3, this.b);
        gwb.a(parcel, 4, this.c);
        gwb.a(parcel, 5, this.d);
        gwb.v(parcel, c);
    }
}
