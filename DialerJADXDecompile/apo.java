import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: PG */
final class apo implements Creator {
    apo() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new apn[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new apn(parcel);
    }
}
