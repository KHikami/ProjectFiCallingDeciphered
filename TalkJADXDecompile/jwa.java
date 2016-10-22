import android.os.Parcel;
import android.os.Parcelable.Creator;

final class jwa implements Creator<jvz> {
    jwa() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new jvz[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new jvz(parcel);
    }
}
