package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gup;
import gwb;
import hwx;

public class AuthAccountResult extends AbstractSafeParcelable implements gup {
    public static final Creator<AuthAccountResult> CREATOR;
    final int a;
    private int b;
    private Intent c;

    static {
        CREATOR = new hwx();
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

    public int a() {
        return this.b;
    }

    public Intent b() {
        return this.c;
    }

    public Status k() {
        return this.b == 0 ? Status.a : Status.e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.d(parcel, 2, a());
        gwb.a(parcel, 3, b(), i, false);
        gwb.v(parcel, c);
    }
}
