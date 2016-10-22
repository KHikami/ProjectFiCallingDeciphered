import android.os.Parcel;

/* compiled from: PG */
final class im implements ht {
    im() {
    }

    public final /* synthetic */ Object[] a(int i) {
        return new il[i];
    }

    public final /* synthetic */ Object a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return il.d;
        }
        throw new IllegalStateException("superState must be null");
    }
}
