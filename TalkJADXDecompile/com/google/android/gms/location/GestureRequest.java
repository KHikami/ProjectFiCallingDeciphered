package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hkp;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class GestureRequest extends AbstractSafeParcelable {
    public static final hkp CREATOR;
    private static final List<Integer> a;
    private static final List<Integer> b;
    private static final List<Integer> c;
    private static final List<Integer> d;
    private final int e;
    private final List<Integer> f;

    static {
        a = Collections.unmodifiableList(Arrays.asList(new Integer[]{Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9), Integer.valueOf(10), Integer.valueOf(11), Integer.valueOf(12), Integer.valueOf(13), Integer.valueOf(14), Integer.valueOf(15), Integer.valueOf(16), Integer.valueOf(17), Integer.valueOf(18), Integer.valueOf(19)}));
        b = Collections.unmodifiableList(Arrays.asList(new Integer[]{Integer.valueOf(1)}));
        c = Collections.unmodifiableList(Arrays.asList(new Integer[]{Integer.valueOf(2), Integer.valueOf(4), Integer.valueOf(6), Integer.valueOf(8), Integer.valueOf(10), Integer.valueOf(12), Integer.valueOf(14), Integer.valueOf(16), Integer.valueOf(18), Integer.valueOf(19)}));
        d = Collections.unmodifiableList(Arrays.asList(new Integer[]{Integer.valueOf(3), Integer.valueOf(5), Integer.valueOf(7), Integer.valueOf(9), Integer.valueOf(11), Integer.valueOf(13), Integer.valueOf(15), Integer.valueOf(17)}));
        CREATOR = new hkp();
    }

    public GestureRequest(int i, List<Integer> list) {
        this.e = i;
        this.f = list;
    }

    public int a() {
        return this.e;
    }

    public List<Integer> b() {
        return this.f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.a(parcel, 1, b(), false);
        gwb.d(parcel, 1000, a());
        gwb.v(parcel, c);
    }
}
