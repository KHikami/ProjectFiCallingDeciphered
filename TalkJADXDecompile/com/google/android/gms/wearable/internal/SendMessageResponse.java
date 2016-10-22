package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import iao;

public class SendMessageResponse extends AbstractSafeParcelable {
    public static final Creator<SendMessageResponse> CREATOR;
    public final int a;
    public final int b;
    public final int c;

    static {
        CREATOR = new iao();
    }

    public SendMessageResponse(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.d(parcel, 2, this.b);
        gwb.d(parcel, 3, this.c);
        gwb.v(parcel, c);
    }
}
