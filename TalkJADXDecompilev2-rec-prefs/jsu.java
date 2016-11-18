package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public final class jsu implements Parcelable {
    public static final Creator<jsu> CREATOR = new jsv();
    private final List<String> f21012a;

    public jsu(List<String> list) {
        this.f21012a = list;
    }

    jsu(Parcel parcel) {
        this.f21012a = parcel.createStringArrayList();
    }

    List<String> m25172a() {
        return this.f21012a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f21012a);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f21012a.toString();
    }
}
