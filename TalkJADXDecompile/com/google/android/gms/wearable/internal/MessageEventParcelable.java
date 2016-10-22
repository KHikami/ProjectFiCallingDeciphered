package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hye;
import iah;

public class MessageEventParcelable extends AbstractSafeParcelable implements hye {
    public static final Creator<MessageEventParcelable> CREATOR;
    final int a;
    private final int b;
    private final String c;
    private final byte[] d;
    private final String e;

    static {
        CREATOR = new iah();
    }

    public MessageEventParcelable(int i, int i2, String str, byte[] bArr, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = bArr;
        this.e = str2;
    }

    public String a() {
        return this.c;
    }

    public byte[] b() {
        return this.d;
    }

    public String c() {
        return this.e;
    }

    public int d() {
        return this.b;
    }

    public String toString() {
        int i = this.b;
        String str = this.c;
        String valueOf = String.valueOf(this.d == null ? "null" : Integer.valueOf(this.d.length));
        return new StringBuilder((String.valueOf(str).length() + 43) + String.valueOf(valueOf).length()).append("MessageEventParcelable[").append(i).append(",").append(str).append(", size=").append(valueOf).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.d(parcel, 2, d());
        gwb.a(parcel, 3, a(), false);
        gwb.a(parcel, 4, b(), false);
        gwb.a(parcel, 5, c(), false);
        gwb.v(parcel, c);
    }
}
