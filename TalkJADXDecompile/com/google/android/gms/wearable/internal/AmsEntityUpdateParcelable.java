package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import ayo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import ibk;

public class AmsEntityUpdateParcelable extends AbstractSafeParcelable implements ayo {
    public static final Creator<AmsEntityUpdateParcelable> CREATOR;
    final int a;
    private byte b;
    private final byte c;
    private final String d;

    static {
        CREATOR = new ibk();
    }

    public AmsEntityUpdateParcelable(int i, byte b, byte b2, String str) {
        this.b = b;
        this.a = i;
        this.c = b2;
        this.d = str;
    }

    public byte a() {
        return this.b;
    }

    public byte b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AmsEntityUpdateParcelable amsEntityUpdateParcelable = (AmsEntityUpdateParcelable) obj;
        return this.b != amsEntityUpdateParcelable.b ? false : this.a != amsEntityUpdateParcelable.a ? false : this.c != amsEntityUpdateParcelable.c ? false : this.d.equals(amsEntityUpdateParcelable.d);
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public String toString() {
        int i = this.a;
        byte b = this.b;
        byte b2 = this.c;
        String str = this.d;
        return new StringBuilder(String.valueOf(str).length() + 97).append("AmsEntityUpdateParcelable{mVersionCode=").append(i).append(", mEntityId=").append(b).append(", mAttributeId=").append(b2).append(", mValue='").append(str).append("'}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, a());
        gwb.a(parcel, 3, b());
        gwb.a(parcel, 4, c(), false);
        gwb.v(parcel, c);
    }
}
