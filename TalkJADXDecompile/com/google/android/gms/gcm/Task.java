package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import gzr;
import gzs;

public class Task implements Parcelable {
    private final String a;
    private final String b;
    private final boolean c;
    private final boolean d;
    private final int e;
    private final boolean f;
    private final gzr g;
    private final Bundle h;

    @Deprecated
    Task(Parcel parcel) {
        boolean z = true;
        Log.e("Task", "Constructing a Task object using a parcel.");
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt() == 1;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.d = z;
        this.e = 2;
        this.f = false;
        this.g = gzr.a;
        this.h = null;
    }

    Task(gzs gzs) {
        this.a = gzs.d;
        this.b = gzs.e;
        this.c = gzs.f;
        this.d = gzs.g;
        this.e = gzs.c;
        this.f = gzs.h;
        this.h = gzs.j;
        this.g = gzs.i != null ? gzs.i : gzr.a;
    }

    public static void b(Bundle bundle) {
        if (bundle != null) {
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            int dataSize = obtain.dataSize();
            if (dataSize > 10240) {
                obtain.recycle();
                String valueOf = String.valueOf("Extras exceeding maximum size(10240 bytes): ");
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(dataSize).toString());
            }
            obtain.recycle();
            for (String str : bundle.keySet()) {
                int i;
                Object obj = bundle.get(str);
                if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof String) || (obj instanceof Boolean)) {
                    i = 1;
                    continue;
                } else {
                    i = 0;
                    continue;
                }
                if (i == 0) {
                    throw new IllegalArgumentException("Only the following extra parameter types are supported: Integer, Long, Double, String, and Boolean. ");
                }
            }
        }
    }

    public void a(Bundle bundle) {
        bundle.putString("tag", this.b);
        bundle.putBoolean("update_current", this.c);
        bundle.putBoolean("persisted", this.d);
        bundle.putString("service", this.a);
        bundle.putInt("requiredNetwork", this.e);
        bundle.putBoolean("requiresCharging", this.f);
        bundle.putBundle("retryStrategy", this.g.a(new Bundle()));
        bundle.putBundle("extras", this.h);
    }

    public String c() {
        return this.a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 1;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        if (!this.d) {
            i2 = 0;
        }
        parcel.writeInt(i2);
    }
}
