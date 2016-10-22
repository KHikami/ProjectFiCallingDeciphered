package com.google.android.gms.clearcut;

import android.os.Parcel;
import bqj;
import bqm;
import buf;
import bvm;
import clg;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.Arrays;

public class LogEventParcelable implements SafeParcelable {
    public static final bqm CREATOR;
    public final int a;
    public PlayLoggerContext b;
    public byte[] c;
    public int[] d;
    public final clg e;
    public final bqj f;
    public final bqj g;

    static {
        CREATOR = new bqm();
    }

    public LogEventParcelable(int i, PlayLoggerContext playLoggerContext, byte[] bArr, int[] iArr) {
        this.a = i;
        this.b = playLoggerContext;
        this.c = bArr;
        this.d = iArr;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public LogEventParcelable(PlayLoggerContext playLoggerContext, clg clg, bqj bqj, bqj bqj2, int[] iArr) {
        this.a = 1;
        this.b = playLoggerContext;
        this.e = clg;
        this.f = bqj;
        this.g = bqj2;
        this.d = iArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogEventParcelable)) {
            return false;
        }
        LogEventParcelable logEventParcelable = (LogEventParcelable) obj;
        return this.a == logEventParcelable.a && buf.c(this.b, logEventParcelable.b) && Arrays.equals(this.c, logEventParcelable.c) && Arrays.equals(this.d, logEventParcelable.d) && buf.c(this.e, logEventParcelable.e) && buf.c(this.f, logEventParcelable.f) && buf.c(this.g, logEventParcelable.g);
    }

    public int hashCode() {
        return buf.a(Integer.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public String toString() {
        String str = null;
        StringBuilder stringBuilder = new StringBuilder("LogEventParcelable[");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append(", ");
        stringBuilder.append(this.c == null ? null : new String(this.c));
        stringBuilder.append(", ");
        if (this.d != null) {
            str = new bvm(", ").a(new StringBuilder(), Arrays.asList(new int[][]{this.d})).toString();
        }
        stringBuilder.append(str);
        stringBuilder.append(", ");
        stringBuilder.append(this.e);
        stringBuilder.append(", ");
        stringBuilder.append(this.f);
        stringBuilder.append(", ");
        stringBuilder.append(this.g);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.a(parcel, 2, this.b, i, false);
        buf.a(parcel, 3, this.c, false);
        buf.a(parcel, 4, this.d, false);
        buf.v(parcel, c);
    }
}
