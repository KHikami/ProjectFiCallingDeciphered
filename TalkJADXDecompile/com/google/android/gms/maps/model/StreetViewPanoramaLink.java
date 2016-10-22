package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import gwb;
import hri;

public class StreetViewPanoramaLink implements SafeParcelable {
    public static final hri CREATOR;
    public final String a;
    public final float b;
    private final int c;

    static {
        CREATOR = new hri();
    }

    public StreetViewPanoramaLink(int i, String str, float f) {
        this.c = i;
        this.a = str;
        if (((double) f) <= 0.0d) {
            f = (f % 360.0f) + 360.0f;
        }
        this.b = f % 360.0f;
    }

    int a() {
        return this.c;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        return this.a.equals(streetViewPanoramaLink.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(streetViewPanoramaLink.b);
    }

    public int hashCode() {
        return gwb.a(this.a, Float.valueOf(this.b));
    }

    public String toString() {
        return gwb.K((Object) this).a("panoId", this.a).a("bearing", Float.valueOf(this.b)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, a());
        gwb.a(parcel, 2, this.a, false);
        gwb.a(parcel, 3, this.b);
        gwb.v(parcel, c);
    }
}
