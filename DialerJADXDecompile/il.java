import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
public class il implements Parcelable {
    public static final Creator CREATOR;
    public static final il d;
    public final Parcelable e;

    static {
        d = new il('\u0000');
        CREATOR = buf.a(new im());
    }

    private il() {
        this.e = null;
    }

    public il(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        if (parcelable == d) {
            parcelable = null;
        }
        this.e = parcelable;
    }

    public il(Parcel parcel, ClassLoader classLoader) {
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

    il(char c) {
        this();
    }
}
