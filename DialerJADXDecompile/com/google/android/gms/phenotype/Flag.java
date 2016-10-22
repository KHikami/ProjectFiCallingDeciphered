package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import buf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import crd;
import crx;
import java.nio.charset.Charset;
import java.util.Arrays;
import rl;
import rq;

public class Flag implements SafeParcelable, Comparable {
    public static final Creator CREATOR;
    private static final Charset j;
    final int a;
    public final String b;
    final long c;
    final boolean d;
    public final double e;
    final String f;
    public final byte[] g;
    public final int h;
    public final int i;

    static {
        CREATOR = new crx();
        j = Charset.forName("UTF-8");
        crd crd = new crd();
    }

    public Flag(int i, String str, long j, boolean z, double d, String str2, byte[] bArr, int i2, int i3) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = z;
        this.e = d;
        this.f = str2;
        this.g = bArr;
        this.h = i2;
        this.i = i3;
    }

    private static int a(int i, int i2) {
        return i < i2 ? -1 : i == i2 ? 0 : 1;
    }

    public final long a() {
        if (this.h == 1) {
            return this.c;
        }
        throw new IllegalArgumentException("Not a long type");
    }

    public final boolean b() {
        if (this.h == 2) {
            return this.d;
        }
        throw new IllegalArgumentException("Not a boolean type");
    }

    public final String c() {
        if (this.h == 4) {
            return this.f;
        }
        throw new IllegalArgumentException("Not a String type");
    }

    public /* synthetic */ int compareTo(Object obj) {
        int i = 0;
        Flag flag = (Flag) obj;
        int compareTo = this.b.compareTo(flag.b);
        if (compareTo != 0) {
            return compareTo;
        }
        compareTo = a(this.h, flag.h);
        if (compareTo != 0) {
            return compareTo;
        }
        switch (this.h) {
            case rq.b /*1*/:
                long j = this.c;
                long j2 = flag.c;
                if (j < j2) {
                    i = -1;
                    break;
                } else if (j == j2) {
                    break;
                } else {
                    return 1;
                }
            case rq.c /*2*/:
                boolean z = this.d;
                if (z != flag.d) {
                    if (z) {
                        i = 1;
                        break;
                    }
                    return -1;
                }
                break;
            case rl.e /*3*/:
                return Double.compare(this.e, flag.e);
            case rl.f /*4*/:
                String str = this.f;
                String str2 = flag.f;
                if (str != str2) {
                    if (str == null) {
                        i = -1;
                        break;
                    } else if (str2 == null) {
                        i = 1;
                        break;
                    } else {
                        return str.compareTo(str2);
                    }
                }
                break;
            case rl.g /*5*/:
                if (this.g == flag.g) {
                    return 0;
                }
                if (this.g == null) {
                    return -1;
                }
                if (flag.g == null) {
                    return 1;
                }
                while (i < Math.min(this.g.length, flag.g.length)) {
                    int i2 = this.g[i] - flag.g[i];
                    if (i2 != 0) {
                        return i2;
                    }
                    i++;
                }
                return a(this.g.length, flag.g.length);
            default:
                throw new AssertionError("Invalid enum value: " + this.h);
        }
        return i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Flag)) {
            return false;
        }
        Flag flag = (Flag) obj;
        if (this.a != flag.a || !buf.c(this.b, flag.b) || this.h != flag.h || this.i != flag.i) {
            return false;
        }
        switch (this.h) {
            case rq.b /*1*/:
                return this.c == flag.c;
            case rq.c /*2*/:
                return this.d == flag.d;
            case rl.e /*3*/:
                return this.e == flag.e;
            case rl.f /*4*/:
                return buf.c(this.f, flag.f);
            case rl.g /*5*/:
                return Arrays.equals(this.g, flag.g);
            default:
                throw new AssertionError("Invalid enum value: " + this.h);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Flag(");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append(", ");
        switch (this.h) {
            case rq.b /*1*/:
                stringBuilder.append(this.c);
                break;
            case rq.c /*2*/:
                stringBuilder.append(this.d);
                break;
            case rl.e /*3*/:
                stringBuilder.append(this.e);
                break;
            case rl.f /*4*/:
                stringBuilder.append("'");
                stringBuilder.append(this.f);
                stringBuilder.append("'");
                break;
            case rl.g /*5*/:
                if (this.g != null) {
                    stringBuilder.append("'");
                    stringBuilder.append(new String(this.g, j));
                    stringBuilder.append("'");
                    break;
                }
                stringBuilder.append("null");
                break;
            default:
                throw new AssertionError("Invalid enum value: " + this.h);
        }
        stringBuilder.append(", ");
        stringBuilder.append(this.h);
        stringBuilder.append(", ");
        stringBuilder.append(this.i);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.a(parcel, 2, this.b, false);
        buf.a(parcel, 3, this.c);
        buf.a(parcel, 4, this.d);
        buf.a(parcel, 5, this.e);
        buf.a(parcel, 6, this.f, false);
        buf.a(parcel, 7, this.g, false);
        buf.d(parcel, 8, this.h);
        buf.d(parcel, 9, this.i);
        buf.v(parcel, c);
    }
}
