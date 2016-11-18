package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class kc<T> implements Creator<T> {
    final kd<T> f21387a;

    public kc(kd<T> kdVar) {
        this.f21387a = kdVar;
    }

    public T createFromParcel(Parcel parcel) {
        return this.f21387a.mo107a(parcel, null);
    }

    public T[] newArray(int i) {
        return this.f21387a.mo108a(i);
    }

    public kc(kd<T> kdVar, byte b) {
        this(kdVar);
    }
}
