import android.os.Parcel;
import android.os.Parcelable.Creator;

final class jtd implements Creator<jtc> {
    jtd() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new jtc[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new jtc(parcel);
    }
}
