package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import buf;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import csl;

public class SignInResponse implements SafeParcelable {
    public static final Creator CREATOR;
    final int a;
    public final ConnectionResult b;
    public final ResolveAccountResponse c;

    static {
        CREATOR = new csl();
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

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.a(parcel, 2, this.b, i, false);
        buf.a(parcel, 3, this.c, i, false);
        buf.v(parcel, c);
    }
}
