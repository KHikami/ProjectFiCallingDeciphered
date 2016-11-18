package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class eie implements Parcelable {
    public static final Creator<eie> CREATOR = new eif();
    public final int f11593a;
    public final Bundle f11594b;
    public final int f11595c;

    public eie(int i, int i2) {
        this(i, i2, null);
    }

    public eie(int i, int i2, Bundle bundle) {
        this.f11595c = i;
        this.f11593a = i2;
        this.f11594b = bundle;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11595c);
        parcel.writeInt(this.f11593a);
        parcel.writeBundle(this.f11594b);
    }
}
