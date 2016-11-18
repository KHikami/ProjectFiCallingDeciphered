package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class jeh implements Parcelable {
    public static final Creator<jeh> CREATOR = new jei();
    public final int a;
    public final int b;
    public final Intent c;

    public jeh(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    jeh(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
    }

    public int describeContents() {
        return 0;
    }
}
