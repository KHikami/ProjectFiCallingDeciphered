import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class lr implements Parcelable {
    public static final Creator<lr> CREATOR;
    public static final lr d;
    public final Parcelable e;

    static {
        d = new lr('\u0000');
        CREATOR = gwb.a(new ls());
    }

    private lr() {
        this.e = null;
    }

    public lr(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        if (parcelable == d) {
            parcelable = null;
        }
        this.e = parcelable;
    }

    public lr(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable == null) {
            readParcelable = d;
        }
        this.e = readParcelable;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.e, i);
    }

    lr(char c) {
        this();
    }
}
