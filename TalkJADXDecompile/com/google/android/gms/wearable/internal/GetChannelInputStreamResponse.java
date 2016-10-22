package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hzi;

public class GetChannelInputStreamResponse extends AbstractSafeParcelable {
    public static final Creator<GetChannelInputStreamResponse> CREATOR;
    public final int a;
    public final int b;
    public final ParcelFileDescriptor c;

    static {
        CREATOR = new hzi();
    }

    public GetChannelInputStreamResponse(int i, int i2, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i;
        this.b = i2;
        this.c = parcelFileDescriptor;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.d(parcel, 2, this.b);
        gwb.a(parcel, 3, this.c, i, false);
        gwb.v(parcel, c);
    }
}
