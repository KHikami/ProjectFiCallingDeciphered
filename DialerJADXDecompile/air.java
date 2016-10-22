import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
public final class air implements Parcelable {
    public static final Creator CREATOR;
    public final int a;
    public final int b;

    static {
        CREATOR = new ais();
    }

    public air(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    air(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        air air = (air) obj;
        if (this.a != air.a) {
            return false;
        }
        if (this.b != air.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.a + 31) * 31) + this.b;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}
