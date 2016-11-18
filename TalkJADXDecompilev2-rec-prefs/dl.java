package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;

final class dl implements Parcelable {
    public static final Creator<dl> CREATOR = new dm();
    final int[] f10057a;
    final int f10058b;
    final int f10059c;
    final String f10060d;
    final int f10061e;
    final int f10062f;
    final CharSequence f10063g;
    final int f10064h;
    final CharSequence f10065i;
    final ArrayList<String> f10066j;
    final ArrayList<String> f10067k;

    public dl(dg dgVar) {
        int i = 0;
        for (dj djVar = dgVar.f9643c; djVar != null; djVar = djVar.f9906a) {
            if (djVar.f9914i != null) {
                i += djVar.f9914i.size();
            }
        }
        this.f10057a = new int[(i + (dgVar.f9645e * 7))];
        if (dgVar.f9652l) {
            i = 0;
            for (dj djVar2 = dgVar.f9643c; djVar2 != null; djVar2 = djVar2.f9906a) {
                int i2 = i + 1;
                this.f10057a[i] = djVar2.f9908c;
                int i3 = i2 + 1;
                this.f10057a[i2] = djVar2.f9909d != null ? djVar2.f9909d.f753p : -1;
                int i4 = i3 + 1;
                this.f10057a[i3] = djVar2.f9910e;
                i2 = i4 + 1;
                this.f10057a[i4] = djVar2.f9911f;
                i4 = i2 + 1;
                this.f10057a[i2] = djVar2.f9912g;
                i2 = i4 + 1;
                this.f10057a[i4] = djVar2.f9913h;
                if (djVar2.f9914i != null) {
                    int size = djVar2.f9914i.size();
                    i4 = i2 + 1;
                    this.f10057a[i2] = size;
                    i2 = 0;
                    while (i2 < size) {
                        i3 = i4 + 1;
                        this.f10057a[i4] = ((dr) djVar2.f9914i.get(i2)).f753p;
                        i2++;
                        i4 = i3;
                    }
                    i = i4;
                } else {
                    i = i2 + 1;
                    this.f10057a[i2] = 0;
                }
            }
            this.f10058b = dgVar.f9650j;
            this.f10059c = dgVar.f9651k;
            this.f10060d = dgVar.f9654n;
            this.f10061e = dgVar.f9656p;
            this.f10062f = dgVar.f9657q;
            this.f10063g = dgVar.f9658r;
            this.f10064h = dgVar.f9659s;
            this.f10065i = dgVar.f9660t;
            this.f10066j = dgVar.f9661u;
            this.f10067k = dgVar.f9662v;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public dl(Parcel parcel) {
        this.f10057a = parcel.createIntArray();
        this.f10058b = parcel.readInt();
        this.f10059c = parcel.readInt();
        this.f10060d = parcel.readString();
        this.f10061e = parcel.readInt();
        this.f10062f = parcel.readInt();
        this.f10063g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f10064h = parcel.readInt();
        this.f10065i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f10066j = parcel.createStringArrayList();
        this.f10067k = parcel.createStringArrayList();
    }

    public dg m12181a(ee eeVar) {
        dg dgVar = new dg(eeVar);
        int i = 0;
        int i2 = 0;
        while (i2 < this.f10057a.length) {
            dj djVar = new dj();
            int i3 = i2 + 1;
            djVar.f9908c = this.f10057a[i2];
            if (ee.f11264a) {
                new StringBuilder("Instantiate ").append(dgVar).append(" op #").append(i).append(" base fragment #").append(this.f10057a[i3]);
            }
            int i4 = i3 + 1;
            i2 = this.f10057a[i3];
            if (i2 >= 0) {
                djVar.f9909d = (dr) eeVar.f11270f.get(i2);
            } else {
                djVar.f9909d = null;
            }
            i3 = i4 + 1;
            djVar.f9910e = this.f10057a[i4];
            i4 = i3 + 1;
            djVar.f9911f = this.f10057a[i3];
            i3 = i4 + 1;
            djVar.f9912g = this.f10057a[i4];
            int i5 = i3 + 1;
            djVar.f9913h = this.f10057a[i3];
            i4 = i5 + 1;
            int i6 = this.f10057a[i5];
            if (i6 > 0) {
                djVar.f9914i = new ArrayList(i6);
                i3 = 0;
                while (i3 < i6) {
                    if (ee.f11264a) {
                        new StringBuilder("Instantiate ").append(dgVar).append(" set remove fragment #").append(this.f10057a[i4]);
                    }
                    i5 = i4 + 1;
                    djVar.f9914i.add((dr) eeVar.f11270f.get(this.f10057a[i4]));
                    i3++;
                    i4 = i5;
                }
            }
            dgVar.f9646f = djVar.f9910e;
            dgVar.f9647g = djVar.f9911f;
            dgVar.f9648h = djVar.f9912g;
            dgVar.f9649i = djVar.f9913h;
            dgVar.m11668a(djVar);
            i++;
            i2 = i4;
        }
        dgVar.f9650j = this.f10058b;
        dgVar.f9651k = this.f10059c;
        dgVar.f9654n = this.f10060d;
        dgVar.f9656p = this.f10061e;
        dgVar.f9652l = true;
        dgVar.f9657q = this.f10062f;
        dgVar.f9658r = this.f10063g;
        dgVar.f9659s = this.f10064h;
        dgVar.f9660t = this.f10065i;
        dgVar.f9661u = this.f10066j;
        dgVar.f9662v = this.f10067k;
        dgVar.m11677b(1);
        return dgVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f10057a);
        parcel.writeInt(this.f10058b);
        parcel.writeInt(this.f10059c);
        parcel.writeString(this.f10060d);
        parcel.writeInt(this.f10061e);
        parcel.writeInt(this.f10062f);
        TextUtils.writeToParcel(this.f10063g, parcel, 0);
        parcel.writeInt(this.f10064h);
        TextUtils.writeToParcel(this.f10065i, parcel, 0);
        parcel.writeStringList(this.f10066j);
        parcel.writeStringList(this.f10067k);
    }
}
