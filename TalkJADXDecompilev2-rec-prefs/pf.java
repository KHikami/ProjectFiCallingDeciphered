package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class pf extends lr {
    public static final Creator<pf> CREATOR = gwb.a(new pg());
    public int f34986a;
    public Parcelable f34987b;
    public ClassLoader f34988c;

    public pf(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f34986a);
        parcel.writeParcelable(this.f34987b, i);
    }

    public String toString() {
        return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f34986a + "}";
    }

    pf(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        this.f34986a = parcel.readInt();
        this.f34987b = parcel.readParcelable(classLoader);
        this.f34988c = classLoader;
    }
}
