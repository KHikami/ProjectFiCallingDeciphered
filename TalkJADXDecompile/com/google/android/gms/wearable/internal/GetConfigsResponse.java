package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import gwb;
import hzo;

public class GetConfigsResponse extends AbstractSafeParcelable {
    public static final Creator<GetConfigsResponse> CREATOR;
    public final int a;
    public final int b;
    public final ConnectionConfiguration[] c;

    static {
        CREATOR = new hzo();
    }

    public GetConfigsResponse(int i, int i2, ConnectionConfiguration[] connectionConfigurationArr) {
        this.a = i;
        this.b = i2;
        this.c = connectionConfigurationArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.d(parcel, 2, this.b);
        gwb.a(parcel, 3, this.c, i, false);
        gwb.v(parcel, c);
    }
}
