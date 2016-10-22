import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;

final class dl implements Parcelable {
    public static final Creator<dl> CREATOR;
    final int[] a;
    final int b;
    final int c;
    final String d;
    final int e;
    final int f;
    final CharSequence g;
    final int h;
    final CharSequence i;
    final ArrayList<String> j;
    final ArrayList<String> k;

    public dl(dg dgVar) {
        int i = 0;
        for (dj djVar = dgVar.c; djVar != null; djVar = djVar.a) {
            if (djVar.i != null) {
                i += djVar.i.size();
            }
        }
        this.a = new int[(i + (dgVar.e * 7))];
        if (dgVar.l) {
            i = 0;
            for (dj djVar2 = dgVar.c; djVar2 != null; djVar2 = djVar2.a) {
                int i2 = i + 1;
                this.a[i] = djVar2.c;
                int i3 = i2 + 1;
                this.a[i2] = djVar2.d != null ? djVar2.d.p : -1;
                int i4 = i3 + 1;
                this.a[i3] = djVar2.e;
                i2 = i4 + 1;
                this.a[i4] = djVar2.f;
                i4 = i2 + 1;
                this.a[i2] = djVar2.g;
                i2 = i4 + 1;
                this.a[i4] = djVar2.h;
                if (djVar2.i != null) {
                    int size = djVar2.i.size();
                    i4 = i2 + 1;
                    this.a[i2] = size;
                    i2 = 0;
                    while (i2 < size) {
                        i3 = i4 + 1;
                        this.a[i4] = ((dr) djVar2.i.get(i2)).p;
                        i2++;
                        i4 = i3;
                    }
                    i = i4;
                } else {
                    i = i2 + 1;
                    this.a[i2] = 0;
                }
            }
            this.b = dgVar.j;
            this.c = dgVar.k;
            this.d = dgVar.n;
            this.e = dgVar.p;
            this.f = dgVar.q;
            this.g = dgVar.r;
            this.h = dgVar.s;
            this.i = dgVar.t;
            this.j = dgVar.u;
            this.k = dgVar.v;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public dl(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.h = parcel.readInt();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.createStringArrayList();
        this.k = parcel.createStringArrayList();
    }

    public dg a(ee eeVar) {
        dg dgVar = new dg(eeVar);
        int i = 0;
        int i2 = 0;
        while (i2 < this.a.length) {
            dj djVar = new dj();
            int i3 = i2 + 1;
            djVar.c = this.a[i2];
            if (ee.a) {
                new StringBuilder("Instantiate ").append(dgVar).append(" op #").append(i).append(" base fragment #").append(this.a[i3]);
            }
            int i4 = i3 + 1;
            i2 = this.a[i3];
            if (i2 >= 0) {
                djVar.d = (dr) eeVar.f.get(i2);
            } else {
                djVar.d = null;
            }
            i3 = i4 + 1;
            djVar.e = this.a[i4];
            i4 = i3 + 1;
            djVar.f = this.a[i3];
            i3 = i4 + 1;
            djVar.g = this.a[i4];
            int i5 = i3 + 1;
            djVar.h = this.a[i3];
            i4 = i5 + 1;
            int i6 = this.a[i5];
            if (i6 > 0) {
                djVar.i = new ArrayList(i6);
                i3 = 0;
                while (i3 < i6) {
                    if (ee.a) {
                        new StringBuilder("Instantiate ").append(dgVar).append(" set remove fragment #").append(this.a[i4]);
                    }
                    i5 = i4 + 1;
                    djVar.i.add((dr) eeVar.f.get(this.a[i4]));
                    i3++;
                    i4 = i5;
                }
            }
            dgVar.f = djVar.e;
            dgVar.g = djVar.f;
            dgVar.h = djVar.g;
            dgVar.i = djVar.h;
            dgVar.a(djVar);
            i++;
            i2 = i4;
        }
        dgVar.j = this.b;
        dgVar.k = this.c;
        dgVar.n = this.d;
        dgVar.p = this.e;
        dgVar.l = true;
        dgVar.q = this.f;
        dgVar.r = this.g;
        dgVar.s = this.h;
        dgVar.t = this.i;
        dgVar.u = this.j;
        dgVar.v = this.k;
        dgVar.b(1);
        return dgVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        TextUtils.writeToParcel(this.g, parcel, 0);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeStringList(this.j);
        parcel.writeStringList(this.k);
    }

    static {
        CREATOR = new dm();
    }
}
