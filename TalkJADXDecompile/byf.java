import android.os.Parcel;
import android.os.Parcelable.Creator;

final class byf implements Creator<bye> {
    byf() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new bye[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new bye(parcel);
    }
}
