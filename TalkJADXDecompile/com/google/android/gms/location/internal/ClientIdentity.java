package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hjl;

public class ClientIdentity extends AbstractSafeParcelable {
    public static final hjl CREATOR;
    public final int a;
    public final String b;
    private final int c;

    static {
        CREATOR = new hjl();
    }

    public ClientIdentity(int i, int i2, String str) {
        this.c = i;
        this.a = i2;
        this.b = str;
    }

    int a() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.a == this.a && gwb.e(clientIdentity.b, this.b);
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        return String.format("%d:%s", new Object[]{Integer.valueOf(this.a), this.b});
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, this.b, false);
        gwb.d(parcel, 1000, a());
        gwb.v(parcel, c);
    }
}
