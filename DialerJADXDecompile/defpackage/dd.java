package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* renamed from: dd */
public class dd extends RuntimeException {
    public dd(String str, Exception exception) {
        super(str, exception);
    }

    public dd(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
