package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bto;
import buf;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@Deprecated
public class ValidateAccountRequest implements SafeParcelable {
    public static final Creator CREATOR;
    final int a;
    final int b;
    final IBinder c;
    final Scope[] d;
    final Bundle e;
    final String f;

    static {
        CREATOR = new bto();
    }

    public ValidateAccountRequest(int i, int i2, IBinder iBinder, Scope[] scopeArr, Bundle bundle, String str) {
        this.a = i;
        this.b = i2;
        this.c = iBinder;
        this.d = scopeArr;
        this.e = bundle;
        this.f = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.d(parcel, 2, this.b);
        buf.a(parcel, 3, this.c, false);
        buf.a(parcel, 4, this.d, i, false);
        buf.a(parcel, 5, this.e, false);
        buf.a(parcel, 6, this.f, false);
        buf.v(parcel, c);
    }
}
