package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import buf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import cqh;

public final class LocationSettingsStates implements SafeParcelable {
    public static final Creator CREATOR;
    final int a;
    final boolean b;
    final boolean c;
    final boolean d;
    final boolean e;
    final boolean f;
    final boolean g;

    static {
        CREATOR = new cqh();
    }

    public LocationSettingsStates(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.a(parcel, 1, this.b);
        buf.d(parcel, 1000, this.a);
        buf.a(parcel, 2, this.c);
        buf.a(parcel, 3, this.d);
        buf.a(parcel, 4, this.e);
        buf.a(parcel, 5, this.f);
        buf.a(parcel, 6, this.g);
        buf.v(parcel, c);
    }
}
