package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class lr implements Parcelable {
    public static final Creator<lr> CREATOR = gwb.m1577a(new ls());
    public static final lr f400d = new lr('\u0000');
    public final Parcelable f401e;

    private lr() {
        this.f401e = null;
    }

    public lr(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        if (parcelable == f400d) {
            parcelable = null;
        }
        this.f401e = parcelable;
    }

    public lr(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable == null) {
            readParcelable = f400d;
        }
        this.f401e = readParcelable;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f401e, i);
    }

    lr(char c) {
        this();
    }
}
