package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class jwd extends jwj {
    public static final Creator<jwd> CREATOR = new jwe();
    String f21156a;

    public jwd(Parcel parcel) {
        super(parcel);
        this.f21156a = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f21156a);
    }

    public jwd(Parcelable parcelable) {
        super(parcelable);
    }
}
