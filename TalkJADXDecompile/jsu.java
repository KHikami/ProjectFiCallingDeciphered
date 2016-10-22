import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public final class jsu implements Parcelable {
    public static final Creator<jsu> CREATOR;
    private final List<String> a;

    public jsu(List<String> list) {
        this.a = list;
    }

    jsu(Parcel parcel) {
        this.a = parcel.createStringArrayList();
    }

    List<String> a() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
    }

    public int describeContents() {
        return 0;
    }

    static {
        CREATOR = new jsv();
    }

    public String toString() {
        return this.a.toString();
    }
}
