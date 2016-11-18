package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class aem extends lr {
    public static final Creator<aem> CREATOR = gwb.m1577a(new aen());
    public Parcelable f402a;

    aem(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            classLoader = aef.class.getClassLoader();
        }
        this.f402a = parcel.readParcelable(classLoader);
    }

    public aem(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f402a, 0);
    }
}
