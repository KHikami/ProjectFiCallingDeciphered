package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gtq;
import gvh;
import gwb;
import gwf;
import gwp;
import gwq;
import java.util.Collection;

public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Creator<GetServiceRequest> CREATOR;
    final int a;
    final int b;
    int c;
    String d;
    IBinder e;
    Scope[] f;
    Bundle g;
    Account h;
    long i;

    static {
        CREATOR = new gwf();
    }

    public GetServiceRequest(int i) {
        this.a = 3;
        this.c = gtq.c;
        this.b = i;
    }

    public GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, long j) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                account2 = gvh.a(gwq.a(iBinder));
            }
            this.h = account2;
        } else {
            this.e = iBinder;
            this.h = account;
        }
        this.f = scopeArr;
        this.g = bundle;
        this.i = j;
    }

    public GetServiceRequest a(Account account) {
        this.h = account;
        return this;
    }

    public GetServiceRequest a(Bundle bundle) {
        this.g = bundle;
        return this;
    }

    public GetServiceRequest a(gwp gwp) {
        if (gwp != null) {
            this.e = gwp.asBinder();
        }
        return this;
    }

    public GetServiceRequest a(String str) {
        this.d = str;
        return this;
    }

    public GetServiceRequest a(Collection<Scope> collection) {
        this.f = (Scope[]) collection.toArray(new Scope[collection.size()]);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.d(parcel, 2, this.b);
        gwb.d(parcel, 3, this.c);
        gwb.a(parcel, 4, this.d, false);
        gwb.a(parcel, 5, this.e, false);
        gwb.a(parcel, 6, this.f, i, false);
        gwb.a(parcel, 7, this.g, false);
        gwb.a(parcel, 8, this.h, i, false);
        gwb.a(parcel, 9, this.i);
        gwb.v(parcel, c);
    }
}
