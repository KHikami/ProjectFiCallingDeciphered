package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hwz;
import java.util.List;

public class CheckServerAuthResult extends AbstractSafeParcelable {
    public static final Creator<CheckServerAuthResult> CREATOR;
    final int a;
    final boolean b;
    final List<Scope> c;

    static {
        CREATOR = new hwz();
    }

    public CheckServerAuthResult(int i, boolean z, List<Scope> list) {
        this.a = i;
        this.b = z;
        this.c = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, this.b);
        gwb.c(parcel, 3, this.c, false);
        gwb.v(parcel, c);
    }
}
