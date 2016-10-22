import android.os.Parcel;
import android.os.Parcelable.Creator;

final class jme implements Creator<jmd> {
    jme() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new jmd[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new jmd(parcel);
    }
}
