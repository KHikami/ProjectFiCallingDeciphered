package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import brl;
import buf;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import crz;

public class AuthAccountResult implements brl, SafeParcelable {
    public static final Creator CREATOR;
    final int a;
    int b;
    Intent c;

    static {
        CREATOR = new crz();
    }

    public AuthAccountResult() {
        this(0, null);
    }

    public AuthAccountResult(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    private AuthAccountResult(int i, Intent intent) {
        this(2, 0, null);
    }

    public final Status a() {
        return this.b == 0 ? Status.a : Status.e;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.d(parcel, 2, this.b);
        buf.a(parcel, 3, this.c, i, false);
        buf.v(parcel, c);
    }
}
