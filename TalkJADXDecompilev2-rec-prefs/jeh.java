package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class jeh implements Parcelable {
    public static final Creator<jeh> CREATOR = new jei();
    public final int f19932a;
    public final int f19933b;
    public final Intent f19934c;

    public jeh(int i, int i2, Intent intent) {
        this.f19932a = i;
        this.f19933b = i2;
        this.f19934c = intent;
    }

    jeh(Parcel parcel) {
        this.f19932a = parcel.readInt();
        this.f19933b = parcel.readInt();
        this.f19934c = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f19932a);
        parcel.writeInt(this.f19933b);
        parcel.writeParcelable(this.f19934c, i);
    }

    public int describeContents() {
        return 0;
    }
}
