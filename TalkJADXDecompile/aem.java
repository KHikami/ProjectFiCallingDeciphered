import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class aem extends lr {
    public static final Creator<aem> CREATOR;
    public Parcelable a;

    aem(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            classLoader = aef.class.getClassLoader();
        }
        this.a = parcel.readParcelable(classLoader);
    }

    public aem(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, 0);
    }

    static {
        CREATOR = gwb.a(new aen());
    }
}
