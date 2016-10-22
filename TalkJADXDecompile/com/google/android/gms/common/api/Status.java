package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gup;
import guw;
import gwb;

public final class Status extends AbstractSafeParcelable implements gup {
    public static final Creator<Status> CREATOR;
    public static final Status a;
    public static final Status b;
    public static final Status c;
    public static final Status d;
    public static final Status e;
    public static final Status f;
    private final int g;
    private final int h;
    private final String i;
    private final PendingIntent j;

    static {
        a = new Status(0);
        b = new Status(14);
        c = new Status(8);
        d = new Status(15);
        e = new Status(16);
        f = new Status(17);
        CREATOR = new guw();
    }

    public Status(int i) {
        this(i, null);
    }

    public Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.g = i;
        this.h = i2;
        this.i = str;
        this.j = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    PendingIntent a() {
        return this.j;
    }

    public String b() {
        return this.i;
    }

    int c() {
        return this.g;
    }

    public boolean d() {
        return this.h <= 0;
    }

    public int e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.g == status.g && this.h == status.h && gwb.e(this.i, status.i) && gwb.e(this.j, status.j);
    }

    public int hashCode() {
        return gwb.a(Integer.valueOf(this.g), Integer.valueOf(this.h), this.i, this.j);
    }

    public Status k() {
        return this;
    }

    public String toString() {
        return gwb.K((Object) this).a("statusCode", this.i != null ? this.i : gwb.x(this.h)).a("resolution", this.j).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, e());
        gwb.a(parcel, 2, b(), false);
        gwb.a(parcel, 3, a(), i, false);
        gwb.d(parcel, 1000, c());
        gwb.v(parcel, c);
    }
}
