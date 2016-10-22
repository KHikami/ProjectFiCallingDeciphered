package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import buf;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import csi;

public class RecordConsentRequest implements SafeParcelable {
    public static final Creator CREATOR;
    final int a;
    final Account b;
    final Scope[] c;
    final String d;

    static {
        CREATOR = new csi();
    }

    public RecordConsentRequest(int i, Account account, Scope[] scopeArr, String str) {
        this.a = i;
        this.b = account;
        this.c = scopeArr;
        this.d = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.a(parcel, 2, this.b, i, false);
        buf.a(parcel, 3, this.c, i, false);
        buf.a(parcel, 4, this.d, false);
        buf.v(parcel, c);
    }
}
