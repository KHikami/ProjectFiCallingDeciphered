package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class aff extends lr {
    public static final Creator<aff> CREATOR = gwb.m1577a(new afg());
    public boolean f521a;

    public aff(Parcelable parcelable) {
        super(parcelable);
    }

    public aff(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f521a = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.f521a));
    }

    public String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f521a + "}";
    }
}
