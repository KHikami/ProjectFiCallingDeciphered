package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import brl;
import buf;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import coy;

public final class FusedLocationProviderResult implements brl, SafeParcelable {
    public static final Creator CREATOR;
    final int a;
    public final Status b;

    static {
        FusedLocationProviderResult fusedLocationProviderResult = new FusedLocationProviderResult(Status.a);
        CREATOR = new coy();
    }

    public FusedLocationProviderResult(int i, Status status) {
        this.a = i;
        this.b = status;
    }

    private FusedLocationProviderResult(Status status) {
        this(1, status);
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
        buf.v(parcel, c);
    }
}
