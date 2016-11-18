package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class pf extends lr {
    public static final Creator<pf> CREATOR = gwb.a(new pg());
    public int a;
    public Parcelable b;
    public ClassLoader c;

    public pf(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
    }

    public String toString() {
        return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.a + "}";
    }

    pf(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        this.a = parcel.readInt();
        this.b = parcel.readParcelable(classLoader);
        this.c = classLoader;
    }
}
