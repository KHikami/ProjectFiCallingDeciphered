package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import brl;
import btl;
import buf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class Status implements brl, SafeParcelable {
    public static final Creator CREATOR;
    public static final Status a;
    public static final Status b;
    public static final Status c;
    public static final Status d;
    public static final Status e;
    final int f;
    public final int g;
    final String h;
    public final PendingIntent i;

    static {
        a = new Status(0);
        b = new Status(14);
        c = new Status(8);
        d = new Status(15);
        e = new Status(16);
        CREATOR = new btl();
    }

    public Status(int i) {
        this(i, null);
    }

    public Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f = i;
        this.g = i2;
        this.h = str;
        this.i = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    public final Status a() {
        return this;
    }

    public final boolean b() {
        return this.g <= 0;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f == status.f && this.g == status.g && buf.c(this.h, status.h) && buf.c(this.i, status.i);
    }

    public final int hashCode() {
        return buf.a(Integer.valueOf(this.f), Integer.valueOf(this.g), this.h, this.i);
    }

    public final String toString() {
        return buf.z((Object) this).a("statusCode", this.h != null ? this.h : buf.y(this.g)).a("resolution", this.i).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.g);
        buf.d(parcel, 1000, this.f);
        buf.a(parcel, 2, this.h, false);
        buf.a(parcel, 3, this.i, i, false);
        buf.v(parcel, c);
    }
}
