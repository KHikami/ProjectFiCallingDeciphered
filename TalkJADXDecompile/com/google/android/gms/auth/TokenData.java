package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gtg;
import gwb;
import java.util.List;

public class TokenData extends AbstractSafeParcelable {
    public static final gtg CREATOR;
    final int a;
    private final String b;
    private final Long c;
    private final boolean d;
    private final boolean e;
    private final List<String> f;

    static {
        CREATOR = new gtg();
    }

    public TokenData(int i, String str, Long l, boolean z, boolean z2, List<String> list) {
        this.a = i;
        this.b = gwb.M(str);
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

    public String a() {
        return this.b;
    }

    public Long b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public List<String> e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.b, tokenData.b) && gwb.e(this.c, tokenData.c) && this.d == tokenData.d && this.e == tokenData.e && gwb.e(this.f, tokenData.f);
    }

    public int hashCode() {
        return gwb.a(this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, a(), false);
        gwb.a(parcel, 3, b(), false);
        gwb.a(parcel, 4, c());
        gwb.a(parcel, 5, d());
        gwb.b(parcel, 6, e(), false);
        gwb.v(parcel, c);
    }
}
