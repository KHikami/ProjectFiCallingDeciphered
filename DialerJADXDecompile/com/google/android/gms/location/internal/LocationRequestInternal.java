package com.google.android.gms.location.internal;

import android.os.Parcel;
import buf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import cpr;
import java.util.Collections;
import java.util.List;

public class LocationRequestInternal implements SafeParcelable {
    public static final cpr CREATOR;
    public static final List a;
    final int b;
    LocationRequest c;
    boolean d;
    boolean e;
    boolean f;
    List g;
    String h;
    boolean i;

    static {
        a = Collections.emptyList();
        CREATOR = new cpr();
    }

    public LocationRequestInternal(int i, LocationRequest locationRequest, boolean z, boolean z2, boolean z3, List list, String str, boolean z4) {
        this.b = i;
        this.c = locationRequest;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = list;
        this.h = str;
        this.i = z4;
    }

    @Deprecated
    public static LocationRequestInternal a(LocationRequest locationRequest) {
        return new LocationRequestInternal(1, locationRequest, false, true, true, a, null, false);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationRequestInternal)) {
            return false;
        }
        LocationRequestInternal locationRequestInternal = (LocationRequestInternal) obj;
        return buf.c(this.c, locationRequestInternal.c) && this.d == locationRequestInternal.d && this.e == locationRequestInternal.e && this.f == locationRequestInternal.f && this.i == locationRequestInternal.i && buf.c(this.g, locationRequestInternal.g);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.c.toString());
        if (this.h != null) {
            stringBuilder.append(" tag=").append(this.h);
        }
        stringBuilder.append(" nlpDebug=").append(this.d);
        stringBuilder.append(" trigger=").append(this.f);
        stringBuilder.append(" restorePIListeners=").append(this.e);
        stringBuilder.append(" hideAppOps=").append(this.i);
        stringBuilder.append(" clients=").append(this.g);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.a(parcel, 1, this.c, i, false);
        buf.d(parcel, 1000, this.b);
        buf.a(parcel, 2, this.d);
        buf.a(parcel, 3, this.e);
        buf.a(parcel, 4, this.f);
        buf.c(parcel, 5, this.g, false);
        buf.a(parcel, 6, this.h, false);
        buf.a(parcel, 7, this.i);
        buf.v(parcel, c);
    }
}
