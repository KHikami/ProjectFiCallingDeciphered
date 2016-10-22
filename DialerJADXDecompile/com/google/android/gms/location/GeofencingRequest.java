package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import buf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import cpw;
import java.util.List;

public class GeofencingRequest implements SafeParcelable {
    public static final Creator CREATOR;
    final int a;
    final List b;
    final int c;

    static {
        CREATOR = new cpw();
    }

    public GeofencingRequest(int i, List list, int i2) {
        this.a = i;
        this.b = list;
        this.c = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.c(parcel, 1, this.b, false);
        buf.d(parcel, 1000, this.a);
        buf.d(parcel, 2, this.c);
        buf.v(parcel, c);
    }
}
