package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import buf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import con;

public final class LocationRequest implements SafeParcelable {
    public static final con CREATOR;
    final int a;
    int b;
    public long c;
    public long d;
    public boolean e;
    long f;
    int g;
    float h;
    long i;

    static {
        CREATOR = new con();
    }

    public LocationRequest() {
        this.a = 1;
        this.b = 102;
        this.c = 3600000;
        this.d = 600000;
        this.e = false;
        this.f = Long.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = 0.0f;
        this.i = 0;
    }

    public LocationRequest(int i, int i2, long j, long j2, boolean z, long j3, int i3, float f, long j4) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = j3;
        this.g = i3;
        this.h = f;
        this.i = j4;
    }

    public static void a(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("invalid interval: " + j);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.b == locationRequest.b && this.c == locationRequest.c && this.d == locationRequest.d && this.e == locationRequest.e && this.f == locationRequest.f && this.g == locationRequest.g && this.h == locationRequest.h;
    }

    public final int hashCode() {
        return buf.a(Integer.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d), Boolean.valueOf(this.e), Long.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h));
    }

    public final String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder append = stringBuilder.append("Request[");
        switch (this.b) {
            case 100:
                str = "PRIORITY_HIGH_ACCURACY";
                break;
            case 102:
                str = "PRIORITY_BALANCED_POWER_ACCURACY";
                break;
            case 104:
                str = "PRIORITY_LOW_POWER";
                break;
            case 105:
                str = "PRIORITY_NO_POWER";
                break;
            default:
                str = "???";
                break;
        }
        append.append(str);
        if (this.b != 105) {
            stringBuilder.append(" requested=");
            stringBuilder.append(this.c).append("ms");
        }
        stringBuilder.append(" fastest=");
        stringBuilder.append(this.d).append("ms");
        if (this.i > this.c) {
            stringBuilder.append(" maxWait=");
            stringBuilder.append(this.i).append("ms");
        }
        if (this.f != Long.MAX_VALUE) {
            long elapsedRealtime = this.f - SystemClock.elapsedRealtime();
            stringBuilder.append(" expireIn=");
            stringBuilder.append(elapsedRealtime).append("ms");
        }
        if (this.g != Integer.MAX_VALUE) {
            stringBuilder.append(" num=").append(this.g);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final LocationRequest a(int i) {
        switch (i) {
            case 100:
            case 102:
            case 104:
            case 105:
                this.b = i;
                return this;
            default:
                throw new IllegalArgumentException("invalid quality: " + i);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.b);
        buf.d(parcel, 1000, this.a);
        buf.a(parcel, 2, this.c);
        buf.a(parcel, 3, this.d);
        buf.a(parcel, 4, this.e);
        buf.a(parcel, 5, this.f);
        buf.d(parcel, 6, this.g);
        buf.a(parcel, 7, this.h);
        buf.a(parcel, 8, this.i);
        buf.v(parcel, c);
    }
}
