package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import brl;
import buf;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import cqg;

public final class LocationSettingsResult implements brl, SafeParcelable {
    public static final Creator CREATOR;
    final int a;
    public final Status b;
    final LocationSettingsStates c;

    static {
        CREATOR = new cqg();
    }

    public LocationSettingsResult(int i, Status status, LocationSettingsStates locationSettingsStates) {
        this.a = i;
        this.b = status;
        this.c = locationSettingsStates;
    }

    public LocationSettingsResult(Status status) {
        this(1, status, null);
    }

    public final Status a() {
        return this.b;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.a(parcel, 1, this.b, i, false);
        buf.d(parcel, 1000, this.a);
        buf.a(parcel, 2, this.c, i, false);
        buf.v(parcel, c);
    }
}
