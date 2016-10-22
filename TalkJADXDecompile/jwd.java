import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class jwd extends jwj {
    public static final Creator<jwd> CREATOR;
    String a;

    public jwd(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
    }

    public jwd(Parcelable parcelable) {
        super(parcelable);
    }

    static {
        CREATOR = new jwe();
    }
}
