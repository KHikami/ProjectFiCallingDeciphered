package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import buf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import crt;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Configuration implements SafeParcelable, Comparable {
    public static final Creator CREATOR;
    final int a;
    public final int b;
    public final Flag[] c;
    public final String[] d;
    private Map e;

    static {
        CREATOR = new crt();
    }

    public Configuration(int i, int i2, Flag[] flagArr, String[] strArr) {
        this.a = i;
        this.b = i2;
        this.c = flagArr;
        this.e = new TreeMap();
        for (Flag flag : flagArr) {
            this.e.put(flag.b, flag);
        }
        this.d = strArr;
        if (this.d != null) {
            Arrays.sort(this.d);
        }
    }

    public /* synthetic */ int compareTo(Object obj) {
        return this.b - ((Configuration) obj).b;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) obj;
        return this.a == configuration.a && this.b == configuration.b && buf.c(this.e, configuration.e) && Arrays.equals(this.d, configuration.d);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Configuration(");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append(", ");
        stringBuilder.append("(");
        for (Flag append : this.e.values()) {
            stringBuilder.append(append);
            stringBuilder.append(", ");
        }
        stringBuilder.append(")");
        stringBuilder.append(", ");
        stringBuilder.append("(");
        if (this.d != null) {
            for (String append2 : this.d) {
                stringBuilder.append(append2);
                stringBuilder.append(", ");
            }
        } else {
            stringBuilder.append("null");
        }
        stringBuilder.append(")");
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.d(parcel, 2, this.b);
        buf.a(parcel, 3, this.c, i, false);
        buf.a(parcel, 4, this.d, false);
        buf.v(parcel, c);
    }
}
