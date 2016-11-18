package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class gkn<T> implements Parcelable {
    public static final Creator<gkn> CREATOR = new gko();
    private gkp<T> f15510a;

    public gkn(T t) {
        this.f15510a = new gkp(t);
    }

    gkn(Parcel parcel) {
        this.f15510a = (gkp) parcel.readStrongBinder();
    }

    public T m17889a() {
        return this.f15510a.f15511a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f15510a.asBinder());
    }
}
