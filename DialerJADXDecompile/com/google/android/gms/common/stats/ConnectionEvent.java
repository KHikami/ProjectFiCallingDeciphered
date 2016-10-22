package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import buf;
import bvq;
import bvx;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ConnectionEvent extends bvx implements SafeParcelable {
    public static final Creator CREATOR;
    final int a;
    final long b;
    int c;
    final String d;
    final String e;
    final String f;
    final String g;
    final String h;
    final String i;
    final long j;
    final long k;
    private long l;

    static {
        CREATOR = new bvq();
    }

    public ConnectionEvent(int i, long j, int i2, String str, String str2, String str3, String str4, String str5, String str6, long j2, long j3) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.l = -1;
        this.h = str5;
        this.i = str6;
        this.j = j2;
        this.k = j3;
    }

    public ConnectionEvent(long j, int i, String str, String str2, String str3, String str4, String str5, String str6, long j2, long j3) {
        this(1, j, i, str, str2, str3, str4, str5, str6, j2, j3);
    }

    public final long a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final long c() {
        return this.l;
    }

    public final String d() {
        return "\t" + this.d + "/" + this.e + "\t" + this.f + "/" + this.g + "\t" + (this.h == null ? "" : this.h) + "\t" + this.k;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.a(parcel, 2, this.b);
        buf.a(parcel, 4, this.d, false);
        buf.a(parcel, 5, this.e, false);
        buf.a(parcel, 6, this.f, false);
        buf.a(parcel, 7, this.g, false);
        buf.a(parcel, 8, this.h, false);
        buf.a(parcel, 10, this.j);
        buf.a(parcel, 11, this.k);
        buf.d(parcel, 12, this.c);
        buf.a(parcel, 13, this.i, false);
        buf.v(parcel, c);
    }
}
