package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import gwb;
import hkd;
import java.util.Collections;
import java.util.List;

public class LocationRequestInternal extends AbstractSafeParcelable {
    public static final hkd CREATOR;
    public static final List<ClientIdentity> a;
    LocationRequest b;
    boolean c;
    List<ClientIdentity> d;
    String e;
    boolean f;
    private final int g;

    static {
        a = Collections.emptyList();
        CREATOR = new hkd();
    }

    public LocationRequestInternal(int i, LocationRequest locationRequest, boolean z, List<ClientIdentity> list, String str, boolean z2) {
        this.g = i;
        this.b = locationRequest;
        this.c = z;
        this.d = list;
        this.e = str;
        this.f = z2;
    }

    int a() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationRequestInternal)) {
            return false;
        }
        LocationRequestInternal locationRequestInternal = (LocationRequestInternal) obj;
        return gwb.e(this.b, locationRequestInternal.b) && this.c == locationRequestInternal.c && this.f == locationRequestInternal.f && gwb.e(this.d, locationRequestInternal.d);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b.toString());
        if (this.e != null) {
            stringBuilder.append(" tag=").append(this.e);
        }
        stringBuilder.append(" trigger=").append(this.c);
        stringBuilder.append(" hideAppOps=").append(this.f);
        stringBuilder.append(" clients=").append(this.d);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.a(parcel, 1, this.b, i, false);
        gwb.a(parcel, 4, this.c);
        gwb.c(parcel, 5, this.d, false);
        gwb.a(parcel, 6, this.e, false);
        gwb.a(parcel, 7, this.f);
        gwb.d(parcel, 1000, a());
        gwb.v(parcel, c);
    }
}
