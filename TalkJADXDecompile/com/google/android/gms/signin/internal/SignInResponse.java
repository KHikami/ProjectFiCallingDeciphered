package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hxj;

public class SignInResponse extends AbstractSafeParcelable {
    public static final Creator<SignInResponse> CREATOR;
    final int a;
    private final ConnectionResult b;
    private final ResolveAccountResponse c;

    static {
        CREATOR = new hxj();
    }

    public SignInResponse(int i) {
        this(new ConnectionResult(8, null), null);
    }

    public SignInResponse(int i, ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this.a = i;
        this.b = connectionResult;
        this.c = resolveAccountResponse;
    }

    private SignInResponse(ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this(1, connectionResult, null);
    }

    public ConnectionResult a() {
        return this.b;
    }

    public ResolveAccountResponse b() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, a(), i, false);
        gwb.a(parcel, 3, b(), i, false);
        gwb.v(parcel, c);
    }
}
