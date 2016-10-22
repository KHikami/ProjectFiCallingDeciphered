package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: gkn */
public final class gkn<T> implements Parcelable {
    public static final Creator<gkn> CREATOR;
    private gkp<T> a;

    public gkn(T t) {
        this.a = new gkp(t);
    }

    gkn(Parcel parcel) {
        this.a = (gkp) parcel.readStrongBinder();
    }

    public T a() {
        return this.a.a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.a.asBinder());
    }

    static {
        CREATOR = new gko();
    }
}
