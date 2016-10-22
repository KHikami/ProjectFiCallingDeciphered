package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hxx;
import hza;

public class DataItemAssetParcelable extends AbstractSafeParcelable implements hxx {
    public static final Creator<DataItemAssetParcelable> CREATOR;
    final int a;
    private final String b;
    private final String c;

    static {
        CREATOR = new hza();
    }

    public DataItemAssetParcelable(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public DataItemAssetParcelable(hxx hxx) {
        this.a = 1;
        this.b = (String) gwb.L(hxx.a());
        this.c = (String) gwb.L(hxx.b());
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public hxx c() {
        return this;
    }

    public boolean e() {
        return true;
    }

    public /* synthetic */ Object f() {
        return c();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DataItemAssetParcelable[");
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        if (this.b == null) {
            stringBuilder.append(",noid");
        } else {
            stringBuilder.append(",");
            stringBuilder.append(this.b);
        }
        stringBuilder.append(", key=");
        stringBuilder.append(this.c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, a(), false);
        gwb.a(parcel, 3, b(), false);
        gwb.v(parcel, c);
    }
}
