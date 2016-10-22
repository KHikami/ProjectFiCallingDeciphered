package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import gzm;
import gzn;
import gzs;

public class OneoffTask extends Task {
    public static final Creator<OneoffTask> CREATOR;
    private final long a;
    private final long b;

    static {
        CREATOR = new gzm();
    }

    @Deprecated
    public OneoffTask(Parcel parcel) {
        super(parcel);
        this.a = parcel.readLong();
        this.b = parcel.readLong();
    }

    public OneoffTask(gzn gzn) {
        super((gzs) gzn);
        this.a = gzn.a;
        this.b = gzn.b;
    }

    public long a() {
        return this.a;
    }

    public void a(Bundle bundle) {
        super.a(bundle);
        bundle.putLong("window_start", this.a);
        bundle.putLong("window_end", this.b);
    }

    public long b() {
        return this.b;
    }

    public String toString() {
        String valueOf = String.valueOf(super.toString());
        long a = a();
        return new StringBuilder(String.valueOf(valueOf).length() + 64).append(valueOf).append(" windowStart=").append(a).append(" windowEnd=").append(b()).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
