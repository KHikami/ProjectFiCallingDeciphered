package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import buf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import csb;
import java.util.List;

public class CheckServerAuthResult implements SafeParcelable {
    public static final Creator CREATOR;
    final int a;
    final boolean b;
    final List c;

    static {
        CREATOR = new csb();
    }

    public CheckServerAuthResult(int i, boolean z, List list) {
        this.a = i;
        this.b = z;
        this.c = list;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.a(parcel, 2, this.b);
        buf.c(parcel, 3, this.c, false);
        buf.v(parcel, c);
    }
}
