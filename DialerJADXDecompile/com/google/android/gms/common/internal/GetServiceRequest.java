package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bqp;
import btn;
import buf;
import buh;
import bva;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetServiceRequest implements SafeParcelable {
    public static final Creator CREATOR;
    final int a;
    final int b;
    int c;
    public String d;
    public IBinder e;
    public Scope[] f;
    public Bundle g;
    public Account h;

    static {
        CREATOR = new buh();
    }

    public GetServiceRequest(int i) {
        this.a = 2;
        this.c = bqp.b;
        this.b = i;
    }

    public GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                account2 = btn.a(bva.a(iBinder));
            }
            this.h = account2;
        } else {
            this.e = iBinder;
            this.h = account;
        }
        this.f = scopeArr;
        this.g = bundle;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.d(parcel, 2, this.b);
        buf.d(parcel, 3, this.c);
        buf.a(parcel, 4, this.d, false);
        buf.a(parcel, 5, this.e, false);
        buf.a(parcel, 6, this.f, i, false);
        buf.a(parcel, 7, this.g, false);
        buf.a(parcel, 8, this.h, i, false);
        buf.v(parcel, c);
    }
}
