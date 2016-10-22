package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hzz;
import iaa;
import iam;

public class RemoveListenerRequest extends AbstractSafeParcelable {
    public static final Creator<RemoveListenerRequest> CREATOR;
    final int a;
    public final hzz b;

    static {
        CREATOR = new iam();
    }

    public RemoveListenerRequest(int i, IBinder iBinder) {
        this.a = i;
        if (iBinder != null) {
            this.b = iaa.a(iBinder);
        } else {
            this.b = null;
        }
    }

    IBinder a() {
        return this.b == null ? null : this.b.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, a(), false);
        gwb.v(parcel, c);
    }
}
