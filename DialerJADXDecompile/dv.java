import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: PG */
final class dv implements Creator {
    dv() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new du[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new du(parcel);
    }
}
