package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hzr;

public class GetFdForAssetResponse extends AbstractSafeParcelable {
    public static final Creator<GetFdForAssetResponse> CREATOR;
    public final int a;
    public final int b;
    public final ParcelFileDescriptor c;

    static {
        CREATOR = new hzr();
    }

    public GetFdForAssetResponse(int i, int i2, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i;
        this.b = i2;
        this.c = parcelFileDescriptor;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i | 1;
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.d(parcel, 2, this.b);
        gwb.a(parcel, 3, this.c, i2, false);
        gwb.v(parcel, c);
    }
}
