import android.os.Parcel;
import android.os.Parcelable.Creator;

final class jfc implements Creator<jfb<?>> {
    jfc() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new jfb[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new jfb(parcel);
    }
}
