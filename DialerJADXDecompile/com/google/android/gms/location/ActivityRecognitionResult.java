package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import buf;
import cog;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class ActivityRecognitionResult implements SafeParcelable {
    public static final cog CREATOR;
    final int a;
    List b;
    long c;
    long d;
    int e;
    Bundle f;

    static {
        CREATOR = new cog();
    }

    public ActivityRecognitionResult(int i, List list, long j, long j2, int i2, Bundle bundle) {
        this.a = i;
        this.b = list;
        this.c = j;
        this.d = j2;
        this.e = i2;
        this.f = bundle;
    }

    private static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if ((bundle == null && bundle2 != null) || (bundle != null && bundle2 == null)) {
            return false;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            if (bundle.get(str) == null) {
                if (bundle2.get(str) != null) {
                    return false;
                }
            } else if (bundle.get(str) instanceof Bundle) {
                if (!a(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else if (!bundle.get(str).equals(bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
        return this.c == activityRecognitionResult.c && this.d == activityRecognitionResult.d && this.e == activityRecognitionResult.e && buf.c(this.b, activityRecognitionResult.b) && a(this.f, activityRecognitionResult.f);
    }

    public int hashCode() {
        return buf.a(Long.valueOf(this.c), Long.valueOf(this.d), Integer.valueOf(this.e), this.b, this.f);
    }

    public String toString() {
        return "ActivityRecognitionResult [probableActivities=" + this.b + ", timeMillis=" + this.c + ", elapsedRealtimeMillis=" + this.d + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.c(parcel, 1, this.b, false);
        buf.d(parcel, 1000, this.a);
        buf.a(parcel, 2, this.c);
        buf.a(parcel, 3, this.d);
        buf.d(parcel, 4, this.e);
        buf.a(parcel, 5, this.f, false);
        buf.v(parcel, c);
    }
}
