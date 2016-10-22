package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import bqe;
import buf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class TokenData implements SafeParcelable {
    public static final bqe CREATOR;
    final int a;
    public final String b;
    final Long c;
    final boolean d;
    final boolean e;
    final List f;

    static {
        CREATOR = new bqe();
    }

    public TokenData(int i, String str, Long l, boolean z, boolean z2, List list) {
        this.a = i;
        this.b = buf.n(str);
        this.c = l;
        this.d = z;
        this.e = z2;
        this.f = list;
    }

    public static TokenData a(Bundle bundle, String str) {
        bundle.setClassLoader(TokenData.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(TokenData.class.getClassLoader());
        return (TokenData) bundle2.getParcelable("TokenData");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.b, tokenData.b) && buf.c(this.c, tokenData.c) && this.d == tokenData.d && this.e == tokenData.e && buf.c(this.f, tokenData.f);
    }

    public int hashCode() {
        return buf.a(this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.a(parcel, 2, this.b, false);
        buf.a(parcel, 3, this.c, false);
        buf.a(parcel, 4, this.d);
        buf.a(parcel, 5, this.e);
        buf.b(parcel, 6, this.f, false);
        buf.v(parcel, c);
    }
}
