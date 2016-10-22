package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import iaj;

public class OpenChannelResponse extends AbstractSafeParcelable {
    public static final Creator<OpenChannelResponse> CREATOR;
    public final int a;
    public final int b;
    public final ChannelImpl c;

    static {
        CREATOR = new iaj();
    }

    public OpenChannelResponse(int i, int i2, ChannelImpl channelImpl) {
        this.a = i;
        this.b = i2;
        this.c = channelImpl;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.d(parcel, 2, this.b);
        gwb.a(parcel, 3, this.c, i, false);
        gwb.v(parcel, c);
    }
}
