import android.os.Parcel;
import android.os.Parcelable.Creator;

public class kc<T> implements Creator<T> {
    final kd<T> a;

    public kc(kd<T> kdVar) {
        this.a = kdVar;
    }

    public T createFromParcel(Parcel parcel) {
        return this.a.a(parcel, null);
    }

    public T[] newArray(int i) {
        return this.a.a(i);
    }

    public kc(kd<T> kdVar, byte b) {
        this(kdVar);
    }
}
