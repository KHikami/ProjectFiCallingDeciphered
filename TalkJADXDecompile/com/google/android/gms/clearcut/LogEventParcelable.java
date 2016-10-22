package com.google.android.gms.clearcut;

import a;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import gtn;
import gwb;
import gxk;
import hcw;
import java.util.Arrays;

public class LogEventParcelable extends AbstractSafeParcelable {
    public static final gtn CREATOR;
    public final int a;
    public PlayLoggerContext b;
    public byte[] c;
    public int[] d;
    public final hcw e;
    public final a f;
    public final a g;

    static {
        CREATOR = new gtn();
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

    public LogEventParcelable(PlayLoggerContext playLoggerContext, hcw hcw, a aVar, a aVar2, int[] iArr) {
        this.a = 1;
        this.b = playLoggerContext;
        this.e = hcw;
        this.f = aVar;
        this.g = aVar2;
        this.d = iArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogEventParcelable)) {
            return false;
        }
        LogEventParcelable logEventParcelable = (LogEventParcelable) obj;
        return this.a == logEventParcelable.a && gwb.e(this.b, logEventParcelable.b) && Arrays.equals(this.c, logEventParcelable.c) && Arrays.equals(this.d, logEventParcelable.d) && gwb.e(this.e, logEventParcelable.e) && gwb.e(this.f, logEventParcelable.f) && gwb.e(this.g, logEventParcelable.g);
    }

    public int hashCode() {
        return gwb.a(Integer.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public String toString() {
        String str = null;
        StringBuilder append = new StringBuilder("LogEventParcelable[").append(this.a).append(", ").append(this.b).append(", LogEventBytes: ").append(this.c == null ? null : new String(this.c)).append(", TestCodes: ");
        if (this.d != null) {
            str = new gxk(", ").a(new StringBuilder(), Arrays.asList(new int[][]{this.d})).toString();
        }
        return append.append(str).append(", LogEvent: ").append(this.e).append(", ExtensionProducer: ").append(this.f).append(", VeProducer: ").append(this.g).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, this.b, i, false);
        gwb.a(parcel, 3, this.c, false);
        gwb.a(parcel, 4, this.d, false);
        gwb.v(parcel, c);
    }
}
