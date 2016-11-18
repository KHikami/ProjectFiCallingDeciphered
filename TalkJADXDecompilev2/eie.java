package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class eie implements Parcelable {
    public static final Creator<eie> CREATOR = new eif();
    public final int a;
    public final Bundle b;
    public final int c;

    public eie(int i, int i2) {
        this(i, i2, null);
    }

    public eie(int i, int i2, Bundle bundle) {
        this.c = i;
        this.a = i2;
        this.b = bundle;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.a);
        parcel.writeBundle(this.b);
    }
}
