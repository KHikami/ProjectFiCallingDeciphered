package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import buf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import cqf;
import java.util.Collections;
import java.util.List;

public final class LocationSettingsRequest implements SafeParcelable {
    public static final Creator CREATOR;
    final int a;
    final List b;
    final boolean c;
    final boolean d;

    static {
        CREATOR = new cqf();
    }

    public LocationSettingsRequest(int i, List list, boolean z, boolean z2) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = z2;
    }

    public LocationSettingsRequest(List list, boolean z, boolean z2) {
        this(3, list, z, z2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.c(parcel, 1, Collections.unmodifiableList(this.b), false);
        buf.d(parcel, 1000, this.a);
        buf.a(parcel, 2, this.c);
        buf.a(parcel, 3, this.d);
        buf.v(parcel, c);
    }
}
