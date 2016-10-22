package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import guv;
import gwb;

public final class Scope extends AbstractSafeParcelable {
    public static final Creator<Scope> CREATOR;
    final int a;
    private final String b;

    static {
        CREATOR = new guv();
    }

    public Scope(int i, String str) {
        gwb.a(str, (Object) "scopeUri must not be null or empty");
        this.a = i;
        this.b = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public String a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        return this == obj ? true : !(obj instanceof Scope) ? false : this.b.equals(((Scope) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, a(), false);
        gwb.v(parcel, c);
    }
}
