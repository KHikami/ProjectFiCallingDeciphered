package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import gwb;
import hrn;

public final class VisibleRegion implements SafeParcelable {
    public static final hrn CREATOR;
    public final LatLng a;
    public final LatLng b;
    public final LatLng c;
    public final LatLng d;
    public final LatLngBounds e;
    private final int f;

    static {
        CREATOR = new hrn();
    }

    public VisibleRegion(int i, LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f = i;
        this.a = latLng;
        this.b = latLng2;
        this.c = latLng3;
        this.d = latLng4;
        this.e = latLngBounds;
    }

    int a() {
        return this.f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return this.a.equals(visibleRegion.a) && this.b.equals(visibleRegion.b) && this.c.equals(visibleRegion.c) && this.d.equals(visibleRegion.d) && this.e.equals(visibleRegion.e);
    }

    public int hashCode() {
        return gwb.a(this.a, this.b, this.c, this.d, this.e);
    }

    public String toString() {
        return gwb.K((Object) this).a("nearLeft", this.a).a("nearRight", this.b).a("farLeft", this.c).a("farRight", this.d).a("latLngBounds", this.e).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, a());
        gwb.a(parcel, 2, this.a, i, false);
        gwb.a(parcel, 3, this.b, i, false);
        gwb.a(parcel, 4, this.c, i, false);
        gwb.a(parcel, 5, this.d, i, false);
        gwb.a(parcel, 6, this.e, i, false);
        gwb.v(parcel, c);
    }
}
