package com.google.android.gms.identity.accounts.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hbl;

public final class AccountData extends AbstractSafeParcelable {
    public static final Creator<AccountData> CREATOR;
    private final int a;
    private final String b;
    private final String c;

    static {
        CREATOR = new hbl();
    }

    public AccountData(int i, String str, String str2) {
        gwb.a(str, (Object) "Account name must not be empty.");
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.a(parcel, 1, b(), false);
        gwb.a(parcel, 2, c(), false);
        gwb.d(parcel, 1000, a());
        gwb.v(parcel, c);
    }
}
