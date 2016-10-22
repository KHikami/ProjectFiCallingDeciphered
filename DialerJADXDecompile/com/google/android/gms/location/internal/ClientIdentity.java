package com.google.android.gms.location.internal;

import android.os.Parcel;
import buf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import cot;

public class ClientIdentity implements SafeParcelable {
    public static final cot CREATOR;
    final int a;
    public final int b;
    public final String c;

    static {
        CREATOR = new cot();
    }

    public ClientIdentity(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.b == this.b && buf.c(clientIdentity.c, this.c);
    }

    public int hashCode() {
        return this.b;
    }

    public String toString() {
        return String.format("%d:%s", new Object[]{Integer.valueOf(this.b), this.c});
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.b);
        buf.d(parcel, 1000, this.a);
        buf.a(parcel, 2, this.c, false);
        buf.v(parcel, c);
    }
}
