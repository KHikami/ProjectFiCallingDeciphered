package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hzq;

public class GetDataItemResponse extends AbstractSafeParcelable {
    public static final Creator<GetDataItemResponse> CREATOR;
    public final int a;
    public final int b;
    public final DataItemParcelable c;

    static {
        CREATOR = new hzq();
    }

    public GetDataItemResponse(int i, int i2, DataItemParcelable dataItemParcelable) {
        this.a = i;
        this.b = i2;
        this.c = dataItemParcelable;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.d(parcel, 2, this.b);
        gwb.a(parcel, 3, this.c, i, false);
        gwb.v(parcel, c);
    }
}
