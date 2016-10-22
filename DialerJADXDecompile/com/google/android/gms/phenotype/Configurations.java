package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import buf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import cru;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

public class Configurations implements SafeParcelable {
    public static final Creator CREATOR;
    final int a;
    public final String b;
    public final String c;
    public final Configuration[] d;
    public final boolean e;
    private Map f;

    static {
        Charset.forName("UTF-8");
        CREATOR = new cru();
    }

    public Configurations(int i, String str, String str2, Configuration[] configurationArr, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = configurationArr;
        this.e = z;
        this.f = new TreeMap();
        for (Configuration configuration : configurationArr) {
            this.f.put(Integer.valueOf(configuration.b), configuration);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Configurations)) {
            return false;
        }
        Configurations configurations = (Configurations) obj;
        return this.a == configurations.a && buf.c(this.b, configurations.b) && buf.c(this.c, configurations.c) && buf.c(this.f, configurations.f) && this.e == configurations.e;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Configurations(");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append('\'');
        stringBuilder.append(this.b);
        stringBuilder.append('\'');
        stringBuilder.append(", ");
        stringBuilder.append('\'');
        stringBuilder.append(this.c);
        stringBuilder.append('\'');
        stringBuilder.append(", ");
        stringBuilder.append('(');
        for (Configuration append : this.f.values()) {
            stringBuilder.append(append);
            stringBuilder.append(", ");
        }
        stringBuilder.append(')');
        stringBuilder.append(", ");
        stringBuilder.append(this.e);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.a(parcel, 2, this.b, false);
        buf.a(parcel, 3, this.c, false);
        buf.a(parcel, 4, this.d, i, false);
        buf.a(parcel, 5, this.e);
        buf.v(parcel, c);
    }
}
