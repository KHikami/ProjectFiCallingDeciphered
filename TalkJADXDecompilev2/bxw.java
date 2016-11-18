package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class bxw extends bxn implements Parcelable {
    public static final Creator<bxw> CREATOR = new bxx();
    public hkh f;

    bxw(Parcel parcel) {
        super(parcel);
        Object obj = (duv) parcel.readParcelable(duv.class.getClassLoader());
        bm.a(obj, (Object) "Null place not allowed!");
        this.f = obj == null ? null : obj.a();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        bm.a(this.f, (Object) "Location can not be null!");
        super.a(parcel);
        parcel.writeParcelable(duv.a(this.f), 0);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.f = ((duv) objectInputStream.readObject()).a();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(duv.a(this.f));
    }
}
