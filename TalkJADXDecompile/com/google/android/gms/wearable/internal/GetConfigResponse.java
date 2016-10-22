package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import gwb;
import hzn;

@Deprecated
public class GetConfigResponse extends AbstractSafeParcelable {
    public static final Creator<GetConfigResponse> CREATOR;
    public final int a;
    public final int b;
    public final ConnectionConfiguration c;

    static {
        CREATOR = new hzn();
    }

    public GetConfigResponse(int i, int i2, ConnectionConfiguration connectionConfiguration) {
        this.a = i;
        this.b = i2;
        this.c = connectionConfiguration;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.d(parcel, 2, this.b);
        gwb.a(parcel, 3, this.c, i, false);
        gwb.v(parcel, c);
    }
}
