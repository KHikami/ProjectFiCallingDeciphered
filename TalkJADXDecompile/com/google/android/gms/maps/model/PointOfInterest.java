package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import gwb;
import hre;

public final class PointOfInterest implements SafeParcelable {
    public static final hre CREATOR;
    public final LatLng a;
    public final String b;
    public final String c;
    private final int d;

    static {
        CREATOR = new hre();
    }

    public PointOfInterest(int i, LatLng latLng, String str, String str2) {
        this.d = i;
        this.a = latLng;
        this.b = str;
        this.c = str2;
    }

    int a() {
        return this.d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, a());
        gwb.a(parcel, 2, this.a, i, false);
        gwb.a(parcel, 3, this.b, false);
        gwb.a(parcel, 4, this.c, false);
        gwb.v(parcel, c);
    }
}
