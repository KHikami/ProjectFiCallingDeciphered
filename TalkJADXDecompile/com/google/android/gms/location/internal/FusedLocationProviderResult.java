package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gup;
import gwb;
import hjm;

public final class FusedLocationProviderResult extends AbstractSafeParcelable implements gup {
    public static final Creator<FusedLocationProviderResult> CREATOR;
    public static final FusedLocationProviderResult a;
    private final int b;
    private final Status c;

    static {
        a = new FusedLocationProviderResult(Status.a);
        CREATOR = new hjm();
    }

    public FusedLocationProviderResult(int i, Status status) {
        this.b = i;
        this.c = status;
    }

    private FusedLocationProviderResult(Status status) {
        this(1, status);
    }

    public int a() {
        return this.b;
    }

    public Status k() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.a(parcel, 1, k(), i, false);
        gwb.d(parcel, 1000, a());
        gwb.v(parcel, c);
    }
}
