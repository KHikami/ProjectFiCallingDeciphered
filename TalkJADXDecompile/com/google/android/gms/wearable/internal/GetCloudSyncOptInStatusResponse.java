package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hzl;

public class GetCloudSyncOptInStatusResponse extends AbstractSafeParcelable {
    public static final Creator<GetCloudSyncOptInStatusResponse> CREATOR;
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;

    static {
        CREATOR = new hzl();
    }

    public GetCloudSyncOptInStatusResponse(int i, int i2, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.d(parcel, 2, this.b);
        gwb.a(parcel, 3, this.c);
        gwb.a(parcel, 4, this.d);
        gwb.v(parcel, c);
    }
}
