package defpackage;

import android.os.Parcel;

/* renamed from: ls */
final class ls implements kd<lr> {
    ls() {
    }

    public /* synthetic */ Object a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(null) == null) {
            return lr.d;
        }
        throw new IllegalStateException("superState must be null");
    }

    public /* synthetic */ Object[] a(int i) {
        return new lr[i];
    }
}
