import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
final class dw implements Parcelable {
    public static final Creator CREATOR;
    final String a;
    final int b;
    final boolean c;
    final int d;
    final int e;
    final String f;
    final boolean g;
    final boolean h;
    final Bundle i;
    final boolean j;
    Bundle k;
    db l;

    public dw(db dbVar) {
        this.a = dbVar.getClass().getName();
        this.b = dbVar.h;
        this.c = dbVar.p;
        this.d = dbVar.y;
        this.e = dbVar.z;
        this.f = dbVar.A;
        this.g = dbVar.D;
        this.h = dbVar.C;
        this.i = dbVar.j;
        this.j = dbVar.B;
    }

    public dw(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.g = z;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.h = z;
        this.i = parcel.readBundle();
        if (parcel.readInt() == 0) {
            z2 = false;
        }
        this.j = z2;
        this.k = parcel.readBundle();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        int i3 = 1;
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        if (this.g) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (this.h) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeBundle(this.i);
        if (!this.j) {
            i3 = 0;
        }
        parcel.writeInt(i3);
        parcel.writeBundle(this.k);
    }

    static {
        CREATOR = new dx();
    }
}
