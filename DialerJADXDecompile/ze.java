import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
public final class ze extends il {
    public static final Creator CREATOR;
    public Parcelable a;

    ze(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            classLoader = yz.class.getClassLoader();
        }
        this.a = parcel.readParcelable(classLoader);
    }

    public ze(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, 0);
    }

    static {
        CREATOR = buf.a(new zf());
    }
}
