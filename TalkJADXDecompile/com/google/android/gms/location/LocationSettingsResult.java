package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gup;
import gwb;
import hky;

public final class LocationSettingsResult extends AbstractSafeParcelable implements gup {
    public static final Creator<LocationSettingsResult> CREATOR;
    private final int a;
    private final Status b;
    private final LocationSettingsStates c;

    static {
        CREATOR = new hky();
    }

    public LocationSettingsResult(int i, Status status, LocationSettingsStates locationSettingsStates) {
        this.a = i;
        this.b = status;
        this.c = locationSettingsStates;
    }

    public int a() {
        return this.a;
    }

    public LocationSettingsStates b() {
        return this.c;
    }

    public Status k() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.a(parcel, 1, k(), i, false);
        gwb.a(parcel, 2, b(), i, false);
        gwb.d(parcel, 1000, a());
        gwb.v(parcel, c);
    }
}
