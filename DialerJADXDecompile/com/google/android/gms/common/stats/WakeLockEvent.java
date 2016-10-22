package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import buf;
import bvx;
import bvy;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public final class WakeLockEvent extends bvx implements SafeParcelable {
    public static final Creator CREATOR;
    final int a;
    final long b;
    int c;
    final String d;
    final int e;
    final List f;
    final String g;
    final long h;
    int i;
    final String j;
    final String k;
    final float l;
    final long m;
    private long n;

    static {
        CREATOR = new bvy();
    }

    public WakeLockEvent(int i, long j, int i2, String str, int i3, List list, String str2, long j2, int i4, String str3, String str4, float f, long j3) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = str;
        this.j = str3;
        this.e = i3;
        this.n = -1;
        this.f = list;
        this.g = str2;
        this.h = j2;
        this.i = i4;
        this.k = str4;
        this.l = f;
        this.m = j3;
    }

    public WakeLockEvent(long j, int i, String str, int i2, List list, String str2, long j2, int i3, String str3, String str4, float f, long j3) {
        this(1, j, i, str, i2, list, str2, j2, i3, str3, str4, f, j3);
    }

    public final long a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final long c() {
        return this.n;
    }

    public final String d() {
        String str;
        StringBuilder append = new StringBuilder("\t").append(this.d).append("\t").append(this.e).append("\t").append(this.f == null ? "" : TextUtils.join(",", this.f)).append("\t").append(this.i).append("\t");
        if (this.j == null) {
            str = "";
        } else {
            str = this.j;
        }
        append = append.append(str).append("\t");
        if (this.k == null) {
            str = "";
        } else {
            str = this.k;
        }
        return append.append(str).append("\t").append(this.l).toString();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.a(parcel, 2, this.b);
        buf.a(parcel, 4, this.d, false);
        buf.d(parcel, 5, this.e);
        buf.b(parcel, 6, this.f, false);
        buf.a(parcel, 8, this.h);
        buf.a(parcel, 10, this.j, false);
        buf.d(parcel, 11, this.c);
        buf.a(parcel, 12, this.g, false);
        buf.a(parcel, 13, this.k, false);
        buf.d(parcel, 14, this.i);
        buf.a(parcel, 15, this.l);
        buf.a(parcel, 16, this.m);
        buf.v(parcel, c);
    }
}
