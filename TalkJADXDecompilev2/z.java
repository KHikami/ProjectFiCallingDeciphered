package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class z extends lr {
    public static final Creator<z> CREATOR = gwb.a(new guu());
    final int a;

    public z(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
    }

    public z(Parcelable parcelable, int i) {
        super(parcelable);
        this.a = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }
}
