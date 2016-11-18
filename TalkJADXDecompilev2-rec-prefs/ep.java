package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class ep implements Parcelable {
    public static final Creator<ep> CREATOR = new eq();
    final String f11959a;
    final int f11960b;
    final boolean f11961c;
    final int f11962d;
    final int f11963e;
    final String f11964f;
    final boolean f11965g;
    final boolean f11966h;
    final Bundle f11967i;
    final boolean f11968j;
    Bundle f11969k;
    dr f11970l;

    public ep(dr drVar) {
        this.f11959a = drVar.getClass().getName();
        this.f11960b = drVar.f753p;
        this.f11961c = drVar.f761x;
        this.f11962d = drVar.f728G;
        this.f11963e = drVar.f729H;
        this.f11964f = drVar.f730I;
        this.f11965g = drVar.f733L;
        this.f11966h = drVar.f732K;
        this.f11967i = drVar.f755r;
        this.f11968j = drVar.f731J;
    }

    public ep(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        this.f11959a = parcel.readString();
        this.f11960b = parcel.readInt();
        this.f11961c = parcel.readInt() != 0;
        this.f11962d = parcel.readInt();
        this.f11963e = parcel.readInt();
        this.f11964f = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f11965g = z;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f11966h = z;
        this.f11967i = parcel.readBundle();
        if (parcel.readInt() == 0) {
            z2 = false;
        }
        this.f11968j = z2;
        this.f11969k = parcel.readBundle();
    }

    public dr m14208a(ec ecVar, dr drVar, el elVar) {
        if (this.f11970l == null) {
            Context i = ecVar.m13033i();
            if (this.f11967i != null) {
                this.f11967i.setClassLoader(i.getClassLoader());
            }
            this.f11970l = dr.instantiate(i, this.f11959a, this.f11967i);
            if (this.f11969k != null) {
                this.f11969k.setClassLoader(i.getClassLoader());
                this.f11970l.f751n = this.f11969k;
            }
            this.f11970l.m1228a(this.f11960b, drVar);
            this.f11970l.f761x = this.f11961c;
            this.f11970l.f763z = true;
            this.f11970l.f728G = this.f11962d;
            this.f11970l.f729H = this.f11963e;
            this.f11970l.f730I = this.f11964f;
            this.f11970l.f733L = this.f11965g;
            this.f11970l.f732K = this.f11966h;
            this.f11970l.f731J = this.f11968j;
            this.f11970l.f723B = ecVar.f10793d;
            if (ee.f11264a) {
                new StringBuilder("Instantiated fragment ").append(this.f11970l);
            }
        }
        this.f11970l.f726E = elVar;
        return this.f11970l;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        int i3 = 1;
        parcel.writeString(this.f11959a);
        parcel.writeInt(this.f11960b);
        parcel.writeInt(this.f11961c ? 1 : 0);
        parcel.writeInt(this.f11962d);
        parcel.writeInt(this.f11963e);
        parcel.writeString(this.f11964f);
        if (this.f11965g) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (this.f11966h) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeBundle(this.f11967i);
        if (!this.f11968j) {
            i3 = 0;
        }
        parcel.writeInt(i3);
        parcel.writeBundle(this.f11969k);
    }
}
