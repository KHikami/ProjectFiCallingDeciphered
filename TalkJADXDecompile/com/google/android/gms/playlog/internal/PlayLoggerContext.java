package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hwt;

public class PlayLoggerContext extends AbstractSafeParcelable {
    public static final hwt CREATOR;
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final int j;

    static {
        CREATOR = new hwt();
    }

    public PlayLoggerContext(int i, String str, int i2, int i3, String str2, String str3, boolean z, String str4, boolean z2, int i4) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = str4;
        this.i = z2;
        this.j = i4;
    }

    public PlayLoggerContext(String str, int i, int i2, String str2, String str3, String str4, boolean z, int i3) {
        this.a = 1;
        this.b = (String) gwb.L((Object) str);
        this.c = i;
        this.d = i2;
        this.h = str2;
        this.e = str3;
        this.f = str4;
        this.g = !z;
        this.i = z;
        this.j = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayLoggerContext)) {
            return false;
        }
        PlayLoggerContext playLoggerContext = (PlayLoggerContext) obj;
        return this.a == playLoggerContext.a && this.b.equals(playLoggerContext.b) && this.c == playLoggerContext.c && this.d == playLoggerContext.d && gwb.e(this.h, playLoggerContext.h) && gwb.e(this.e, playLoggerContext.e) && gwb.e(this.f, playLoggerContext.f) && this.g == playLoggerContext.g && this.i == playLoggerContext.i && this.j == playLoggerContext.j;
    }

    public int hashCode() {
        return gwb.a(Integer.valueOf(this.a), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), this.h, this.e, this.f, Boolean.valueOf(this.g), Boolean.valueOf(this.i), Integer.valueOf(this.j));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlayLoggerContext[");
        stringBuilder.append("versionCode=").append(this.a).append(',');
        stringBuilder.append("package=").append(this.b).append(',');
        stringBuilder.append("packageVersionCode=").append(this.c).append(',');
        stringBuilder.append("logSource=").append(this.d).append(',');
        stringBuilder.append("logSourceName=").append(this.h).append(',');
        stringBuilder.append("uploadAccount=").append(this.e).append(',');
        stringBuilder.append("loggingId=").append(this.f).append(',');
        stringBuilder.append("logAndroidId=").append(this.g).append(',');
        stringBuilder.append("isAnonymous=").append(this.i).append(',');
        stringBuilder.append("qosTier=").append(this.j);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, this.b, false);
        gwb.d(parcel, 3, this.c);
        gwb.d(parcel, 4, this.d);
        gwb.a(parcel, 5, this.e, false);
        gwb.a(parcel, 6, this.f, false);
        gwb.a(parcel, 7, this.g);
        gwb.a(parcel, 8, this.h, false);
        gwb.a(parcel, 9, this.i);
        gwb.d(parcel, 10, this.j);
        gwb.v(parcel, c);
    }
}
