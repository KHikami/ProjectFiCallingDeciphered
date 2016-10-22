import android.os.Parcel;
import android.os.Parcelable.Creator;

final class jfj implements Creator<jfi> {
    jfj() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new jfi[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new jfi(parcel);
    }
}
