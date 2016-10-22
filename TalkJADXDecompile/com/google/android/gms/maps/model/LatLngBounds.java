package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import gwb;
import hrb;

public final class LatLngBounds implements SafeParcelable {
    public static final hrb CREATOR;
    public final LatLng a;
    public final LatLng b;
    private final int c;

    static {
        CREATOR = new hrb();
    }

    public LatLngBounds(int i, LatLng latLng, LatLng latLng2) {
        gwb.f((Object) latLng, (Object) "null southwest");
        gwb.f((Object) latLng2, (Object) "null northeast");
        gwb.a(latLng2.a >= latLng.a, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(latLng.a), Double.valueOf(latLng2.a));
        this.c = i;
        this.a = latLng;
        this.b = latLng2;
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
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.a.equals(latLngBounds.a) && this.b.equals(latLngBounds.b);
    }

    public int hashCode() {
        return gwb.a(this.a, this.b);
    }

    public String toString() {
        return gwb.K((Object) this).a("southwest", this.a).a("northeast", this.b).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, a());
        gwb.a(parcel, 2, this.a, i, false);
        gwb.a(parcel, 3, this.b, i, false);
        gwb.v(parcel, c);
    }
}
