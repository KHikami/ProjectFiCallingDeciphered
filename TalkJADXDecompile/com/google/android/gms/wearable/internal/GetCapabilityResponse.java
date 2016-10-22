package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hzh;

public class GetCapabilityResponse extends AbstractSafeParcelable {
    public static final Creator<GetCapabilityResponse> CREATOR;
    public final int a;
    public final int b;
    public final CapabilityInfoParcelable c;

    static {
        CREATOR = new hzh();
    }

    public GetCapabilityResponse(int i, int i2, CapabilityInfoParcelable capabilityInfoParcelable) {
        this.a = i;
        this.b = i2;
        this.c = capabilityInfoParcelable;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.d(parcel, 2, this.b);
        gwb.a(parcel, 3, this.c, i, false);
        gwb.v(parcel, c);
    }
}
