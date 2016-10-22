package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import gwb;
import hrj;

public class StreetViewPanoramaLocation implements SafeParcelable {
    public static final hrj CREATOR;
    public final StreetViewPanoramaLink[] a;
    public final LatLng b;
    public final String c;
    private final int d;

    static {
        CREATOR = new hrj();
    }

    public StreetViewPanoramaLocation(int i, StreetViewPanoramaLink[] streetViewPanoramaLinkArr, LatLng latLng, String str) {
        this.d = i;
        this.a = streetViewPanoramaLinkArr;
        this.b = latLng;
        this.c = str;
    }

    int a() {
        return this.d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        return this.c.equals(streetViewPanoramaLocation.c) && this.b.equals(streetViewPanoramaLocation.b);
    }

    public int hashCode() {
        return gwb.a(this.b, this.c);
    }

    public String toString() {
        return gwb.K((Object) this).a("panoId", this.c).a("position", this.b.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, a());
        gwb.a(parcel, 2, this.a, i, false);
        gwb.a(parcel, 3, this.b, i, false);
        gwb.a(parcel, 4, this.c, false);
        gwb.v(parcel, c);
    }
}
