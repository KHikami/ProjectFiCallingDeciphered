package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

/* renamed from: fee */
final class fee extends eaf implements Parcelable, Serializable {
    public static final Creator<fee> CREATOR;

    public fee(String str, int i) {
        super(str, i);
    }

    public void a(Context context, int i, evz evz) {
        ((bhl) jyn.a(context, bhl.class)).a(new feh(evz, i));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    protected fee(Parcel parcel) {
        super(parcel);
    }

    static {
        CREATOR = new fef();
    }
}
