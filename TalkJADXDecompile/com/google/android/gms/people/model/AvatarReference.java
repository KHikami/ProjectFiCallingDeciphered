package com.google.android.gms.people.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hws;

public final class AvatarReference extends AbstractSafeParcelable {
    public static final Creator<AvatarReference> CREATOR;
    final int a;
    final String b;
    private final int c;

    static {
        CREATOR = new hws();
    }

    public AvatarReference(int i, int i2, String str) {
        gwb.a(i2 != 0);
        this.c = i;
        this.a = i2;
        this.b = str;
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String toString() {
        return gwb.K((Object) this).a("source", Integer.valueOf(this.a)).a("location", this.b).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, b());
        gwb.a(parcel, 2, c(), false);
        gwb.d(parcel, 1000, a());
        gwb.v(parcel, c);
    }
}
