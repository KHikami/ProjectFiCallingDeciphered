package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hzg;
import java.util.List;

public class GetAllCapabilitiesResponse extends AbstractSafeParcelable {
    public static final Creator<GetAllCapabilitiesResponse> CREATOR;
    public final int a;
    public final int b;
    public final List<CapabilityInfoParcelable> c;

    static {
        CREATOR = new hzg();
    }

    public GetAllCapabilitiesResponse(int i, int i2, List<CapabilityInfoParcelable> list) {
        this.a = i;
        this.b = i2;
        this.c = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.d(parcel, 2, this.b);
        gwb.c(parcel, 3, this.c, false);
        gwb.v(parcel, c);
    }
}
