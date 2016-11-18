package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class fdc implements Parcelable {
    public static final Creator<fdc> CREATOR = new fdd();
    public final int f12721a;
    public final bko f12722b;
    public final fdn f12723c;

    public fdc(bko bko) {
        this.f12721a = bko.m5638g();
        this.f12723c = fde.m15019e(bko);
        this.f12722b = bko;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12722b.m5629a());
    }

    protected fdc(Parcel parcel) {
        this.f12722b = fde.m14994a(parcel.readString());
        this.f12721a = this.f12722b.m5638g();
        this.f12723c = fde.m15019e(this.f12722b);
    }
}
