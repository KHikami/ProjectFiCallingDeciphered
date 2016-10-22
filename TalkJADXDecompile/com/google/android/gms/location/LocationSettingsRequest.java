package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hkx;
import java.util.Collections;
import java.util.List;

public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Creator<LocationSettingsRequest> CREATOR;
    private final int a;
    private final List<LocationRequest> b;
    private final boolean c;
    private final boolean d;

    static {
        CREATOR = new hkx();
    }

    public LocationSettingsRequest(int i, List<LocationRequest> list, boolean z, boolean z2) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = z2;
    }

    public int a() {
        return this.a;
    }

    public List<LocationRequest> b() {
        return Collections.unmodifiableList(this.b);
    }

    public boolean c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.c(parcel, 1, b(), false);
        gwb.a(parcel, 2, c());
        gwb.a(parcel, 3, d());
        gwb.d(parcel, 1000, a());
        gwb.v(parcel, c);
    }
}
