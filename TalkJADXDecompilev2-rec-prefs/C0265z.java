package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class C0265z extends lr {
    public static final Creator<C0265z> CREATOR = gwb.a(new guu());
    final int f35878a;

    public C0265z(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f35878a = parcel.readInt();
    }

    public C0265z(Parcelable parcelable, int i) {
        super(parcelable);
        this.f35878a = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f35878a);
    }
}
