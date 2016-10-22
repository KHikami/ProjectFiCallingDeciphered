package com.google.android.gms.location;

import android.os.Parcel;
import buf;
import col;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LocationAvailability implements SafeParcelable {
    public static final col CREATOR;
    final int a;
    int b;
    int c;
    long d;
    int e;

    static {
        CREATOR = new col();
    }

    public LocationAvailability(int i, int i2, int i3, int i4, long j) {
        this.a = i;
        this.e = i2;
        this.b = i3;
        this.c = i4;
        this.d = j;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationAvailability)) {
            return false;
        }
        LocationAvailability locationAvailability = (LocationAvailability) obj;
        return this.e == locationAvailability.e && this.b == locationAvailability.b && this.c == locationAvailability.c && this.d == locationAvailability.d;
    }

    public final int hashCode() {
        return buf.a(Integer.valueOf(this.e), Integer.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.d));
    }

    public final String toString() {
        return "LocationAvailability[isLocationAvailable: " + (this.e < 1000) + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.b);
        buf.d(parcel, 1000, this.a);
        buf.d(parcel, 2, this.c);
        buf.a(parcel, 3, this.d);
        buf.d(parcel, 4, this.e);
        buf.v(parcel, c);
    }
}
