package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class ep implements Parcelable {
    public static final Creator<ep> CREATOR = new eq();
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
    dr l;

    public ep(dr drVar) {
        this.a = drVar.getClass().getName();
        this.b = drVar.p;
        this.c = drVar.x;
        this.d = drVar.G;
        this.e = drVar.H;
        this.f = drVar.I;
        this.g = drVar.L;
        this.h = drVar.K;
        this.i = drVar.r;
        this.j = drVar.J;
    }

    public ep(Parcel parcel) {
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

    public dr a(ec ecVar, dr drVar, el elVar) {
        if (this.l == null) {
            Context i = ecVar.i();
            if (this.i != null) {
                this.i.setClassLoader(i.getClassLoader());
            }
            this.l = dr.instantiate(i, this.a, this.i);
            if (this.k != null) {
                this.k.setClassLoader(i.getClassLoader());
                this.l.n = this.k;
            }
            this.l.a(this.b, drVar);
            this.l.x = this.c;
            this.l.z = true;
            this.l.G = this.d;
            this.l.H = this.e;
            this.l.I = this.f;
            this.l.L = this.g;
            this.l.K = this.h;
            this.l.J = this.j;
            this.l.B = ecVar.d;
            if (ee.a) {
                new StringBuilder("Instantiated fragment ").append(this.l);
            }
        }
        this.l.E = elVar;
        return this.l;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
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
}
