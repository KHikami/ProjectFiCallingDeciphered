import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class byg extends bxn implements Parcelable {
    public static final Creator<byg> CREATOR;
    public String f;
    public String g;

    static {
        CREATOR = new byh();
    }

    byg(Parcel parcel) {
        super(parcel);
        this.f = parcel.readString();
        this.g = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.a(parcel);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
}
