import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* compiled from: PG */
public final class hu implements ClassLoaderCreator {
    private final ht a;

    public hu(ht htVar) {
        this.a = htVar;
    }

    public final Object createFromParcel(Parcel parcel) {
        return this.a.a(parcel, null);
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return this.a.a(parcel, classLoader);
    }

    public final Object[] newArray(int i) {
        return this.a.a(i);
    }
}
