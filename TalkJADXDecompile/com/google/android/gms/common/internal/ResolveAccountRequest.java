package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gvj;
import gwb;

public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Creator<ResolveAccountRequest> CREATOR;
    final int a;
    private final Account b;
    private final int c;
    private final GoogleSignInAccount d;

    static {
        CREATOR = new gvj();
    }

    public ResolveAccountRequest(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    public ResolveAccountRequest(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public Account a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public GoogleSignInAccount c() {
        return this.d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, a(), i, false);
        gwb.d(parcel, 3, b());
        gwb.a(parcel, 4, c(), i, false);
        gwb.v(parcel, c);
    }
}
