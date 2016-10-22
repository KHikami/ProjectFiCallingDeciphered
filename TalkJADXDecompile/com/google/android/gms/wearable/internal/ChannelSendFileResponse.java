package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import ibq;

public class ChannelSendFileResponse extends AbstractSafeParcelable {
    public static final Creator<ChannelSendFileResponse> CREATOR;
    public final int a;
    public final int b;

    static {
        CREATOR = new ibq();
    }

    public ChannelSendFileResponse(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.d(parcel, 2, this.b);
        gwb.v(parcel, c);
    }
}
