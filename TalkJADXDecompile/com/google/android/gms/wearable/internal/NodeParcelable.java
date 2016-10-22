package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import ayo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import iai;

public class NodeParcelable extends AbstractSafeParcelable implements ayo {
    public static final Creator<NodeParcelable> CREATOR;
    final int a;
    private final String b;
    private final String c;
    private final int d;
    private final boolean e;

    static {
        CREATOR = new iai();
    }

    public NodeParcelable(int i, String str, String str2, int i2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = z;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        return !(obj instanceof NodeParcelable) ? false : ((NodeParcelable) obj).b.equals(this.b);
    }

    public boolean g() {
        return this.e;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        String str = this.c;
        String str2 = this.b;
        int i = this.d;
        return new StringBuilder((String.valueOf(str).length() + 45) + String.valueOf(str2).length()).append("Node{").append(str).append(", id=").append(str2).append(", hops=").append(i).append(", isNearby=").append(this.e).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, a(), false);
        gwb.a(parcel, 3, b(), false);
        gwb.d(parcel, 4, c());
        gwb.a(parcel, 5, g());
        gwb.v(parcel, c);
    }
}
