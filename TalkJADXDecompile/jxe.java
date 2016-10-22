import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class jxe extends jwj {
    public static final Creator<jxe> CREATOR;
    public boolean a;
    public Bundle b;

    public jxe(Parcel parcel) {
        boolean z = true;
        super(parcel);
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.a = z;
        this.b = parcel.readBundle();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeBundle(this.b);
    }

    public jxe(Parcelable parcelable) {
        super(parcelable);
    }

    static {
        CREATOR = new jxf();
    }
}
