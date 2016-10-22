import android.os.Parcel;
import android.os.Parcelable.Creator;

final class duw implements Creator<duv> {
    duw() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new duv[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new duv(parcel);
    }
}
