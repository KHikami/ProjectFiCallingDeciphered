package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gvn;
import gwb;

public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Creator<AuthAccountRequest> CREATOR;
    final int a;
    final IBinder b;
    final Scope[] c;
    Integer d;
    Integer e;

    static {
        CREATOR = new gvn();
    }

    public AuthAccountRequest(int i, IBinder iBinder, Scope[] scopeArr, Integer num, Integer num2) {
        this.a = i;
        this.b = iBinder;
        this.c = scopeArr;
        this.d = num;
        this.e = num2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, this.b, false);
        gwb.a(parcel, 3, this.c, i, false);
        gwb.a(parcel, 4, this.d, false);
        gwb.a(parcel, 5, this.e, false);
        gwb.v(parcel, c);
    }
}
