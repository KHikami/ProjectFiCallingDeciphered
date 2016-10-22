package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hjf;

public final class LocationAvailability extends AbstractSafeParcelable {
    public static final hjf CREATOR;
    int a;
    int b;
    long c;
    int d;
    private final int e;

    static {
        CREATOR = new hjf();
    }

    public LocationAvailability(int i, int i2, int i3, int i4, long j) {
        this.e = i;
        this.d = i2;
        this.a = i3;
        this.b = i4;
        this.c = j;
    }

    private boolean b() {
        return this.d < 1000;
    }

    int a() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationAvailability)) {
            return false;
        }
        LocationAvailability locationAvailability = (LocationAvailability) obj;
        return this.d == locationAvailability.d && this.a == locationAvailability.a && this.b == locationAvailability.b && this.c == locationAvailability.c;
    }

    public int hashCode() {
        return gwb.a(Integer.valueOf(this.d), Integer.valueOf(this.a), Integer.valueOf(this.b), Long.valueOf(this.c));
    }

    public String toString() {
        return "LocationAvailability[isLocationAvailable: " + b() + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.d(parcel, 2, this.b);
        gwb.a(parcel, 3, this.c);
        gwb.d(parcel, 4, this.d);
        gwb.d(parcel, 1000, a());
        gwb.v(parcel, c);
    }
}
