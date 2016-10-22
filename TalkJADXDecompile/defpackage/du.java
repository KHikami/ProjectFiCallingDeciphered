package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: du */
public final class du implements Parcelable {
    public static final Creator<du> CREATOR;
    final Bundle a;

    du(Parcel parcel, ClassLoader classLoader) {
        this.a = parcel.readBundle();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    static {
        CREATOR = new dv();
    }
}
