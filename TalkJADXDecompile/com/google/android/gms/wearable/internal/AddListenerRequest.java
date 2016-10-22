package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hzz;
import iaa;
import iay;
import ibi;

public class AddListenerRequest extends AbstractSafeParcelable {
    public static final Creator<AddListenerRequest> CREATOR;
    final int a;
    public final hzz b;
    public final IntentFilter[] c;
    public final String d;
    public final String e;

    static {
        CREATOR = new ibi();
    }

    public AddListenerRequest(int i, IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        this.a = i;
        if (iBinder != null) {
            this.b = iaa.a(iBinder);
        } else {
            this.b = null;
        }
        this.c = intentFilterArr;
        this.d = str;
        this.e = str2;
    }

    public AddListenerRequest(iay iay) {
        this.a = 1;
        this.b = iay;
        this.c = iay.a();
        this.d = iay.b();
        this.e = null;
    }

    IBinder a() {
        return this.b == null ? null : this.b.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, a(), false);
        gwb.a(parcel, 3, this.c, i, false);
        gwb.a(parcel, 4, this.d, false);
        gwb.a(parcel, 5, this.e, false);
        gwb.v(parcel, c);
    }
}
