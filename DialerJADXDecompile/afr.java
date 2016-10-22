import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: PG */
final class afr implements Creator {
    afr() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new afq[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new afq(parcel);
    }
}
