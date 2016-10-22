package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.internal.ParcelableGeofence;
import gwb;
import hko;
import java.util.List;

public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Creator<GeofencingRequest> CREATOR;
    private final int a;
    private final List<ParcelableGeofence> b;
    private final int c;

    static {
        CREATOR = new hko();
    }

    public GeofencingRequest(int i, List<ParcelableGeofence> list, int i2) {
        this.a = i;
        this.b = list;
        this.c = i2;
    }

    public int a() {
        return this.a;
    }

    public List<ParcelableGeofence> b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.c(parcel, 1, b(), false);
        gwb.d(parcel, 2, c());
        gwb.d(parcel, 1000, a());
        gwb.v(parcel, c);
    }
}
