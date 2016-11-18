package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class bxw extends bxn implements Parcelable {
    public static final Creator<bxw> CREATOR = new bxx();
    public hkh f4756f;

    bxw(Parcel parcel) {
        super(parcel);
        Object obj = (duv) parcel.readParcelable(duv.class.getClassLoader());
        bm.m6123a(obj, (Object) "Null place not allowed!");
        this.f4756f = obj == null ? null : obj.m12746a();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        bm.m6123a(this.f4756f, (Object) "Location can not be null!");
        super.m6897a(parcel);
        parcel.writeParcelable(duv.m12745a(this.f4756f), 0);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.f4756f = ((duv) objectInputStream.readObject()).m12746a();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(duv.m12745a(this.f4756f));
    }
}
