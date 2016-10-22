package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hzk;

public class GetCloudSyncOptInOutDoneResponse extends AbstractSafeParcelable {
    public static final Creator<GetCloudSyncOptInOutDoneResponse> CREATOR;
    public final int a;
    public final int b;
    public final boolean c;

    static {
        CREATOR = new hzk();
    }

    public GetCloudSyncOptInOutDoneResponse(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.d(parcel, 2, this.b);
        gwb.a(parcel, 3, this.c);
        gwb.v(parcel, c);
    }
}
