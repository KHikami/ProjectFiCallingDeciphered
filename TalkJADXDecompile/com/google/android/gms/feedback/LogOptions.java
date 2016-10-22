package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import gza;

public class LogOptions extends AbstractSafeParcelable {
    public static final Creator<LogOptions> CREATOR;
    public final int a;
    public String b;
    public boolean c;

    static {
        CREATOR = new gza();
    }

    public LogOptions(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, this.b, false);
        gwb.a(parcel, 3, this.c);
        gwb.v(parcel, c);
    }
}
