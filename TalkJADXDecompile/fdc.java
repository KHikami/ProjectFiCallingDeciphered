import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class fdc implements Parcelable {
    public static final Creator<fdc> CREATOR;
    public final int a;
    public final bko b;
    public final fdn c;

    public fdc(bko bko) {
        this.a = bko.g();
        this.c = fde.e(bko);
        this.b = bko;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.a());
    }

    protected fdc(Parcel parcel) {
        this.b = fde.a(parcel.readString());
        this.a = this.b.g();
        this.c = fde.e(this.b);
    }

    static {
        CREATOR = new fdd();
    }
}
