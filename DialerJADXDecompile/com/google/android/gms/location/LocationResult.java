package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import buf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import cqe;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class LocationResult implements SafeParcelable {
    public static final Creator CREATOR;
    public static final List a;
    final int b;
    final List c;

    static {
        a = Collections.emptyList();
        CREATOR = new cqe();
    }

    public LocationResult(int i, List list) {
        this.b = i;
        this.c = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.c.size() != this.c.size()) {
            return false;
        }
        Iterator it = this.c.iterator();
        for (Location time : locationResult.c) {
            if (((Location) it.next()).getTime() != time.getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 17;
        for (Location time : this.c) {
            long time2 = time.getTime();
            i = ((int) (time2 ^ (time2 >>> 32))) + (i * 31);
        }
        return i;
    }

    public final String toString() {
        return "LocationResult[locations: " + this.c + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.c(parcel, 1, this.c, false);
        buf.d(parcel, 1000, this.b);
        buf.v(parcel, c);
    }
}
