package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: cu */
final class cu implements Parcelable {
    public static final Creator CREATOR;
    private int[] a;
    private int b;
    private int c;
    private String d;
    private int e;
    private int f;
    private CharSequence g;
    private int h;
    private CharSequence i;
    private ArrayList j;
    private ArrayList k;

    public cu(cp cpVar) {
        int i = 0;
        for (cs csVar = cpVar.a; csVar != null; csVar = csVar.a) {
            if (csVar.i != null) {
                i += csVar.i.size();
            }
        }
        this.a = new int[(i + (cpVar.b * 7))];
        if (cpVar.i) {
            i = 0;
            for (cs csVar2 = cpVar.a; csVar2 != null; csVar2 = csVar2.a) {
                int i2 = i + 1;
                this.a[i] = csVar2.c;
                int i3 = i2 + 1;
                this.a[i2] = csVar2.d != null ? csVar2.d.h : -1;
                int i4 = i3 + 1;
                this.a[i3] = csVar2.e;
                i2 = i4 + 1;
                this.a[i4] = csVar2.f;
                i4 = i2 + 1;
                this.a[i2] = csVar2.g;
                i2 = i4 + 1;
                this.a[i4] = csVar2.h;
                if (csVar2.i != null) {
                    int size = csVar2.i.size();
                    i4 = i2 + 1;
                    this.a[i2] = size;
                    i2 = 0;
                    while (i2 < size) {
                        i3 = i4 + 1;
                        this.a[i4] = ((db) csVar2.i.get(i2)).h;
                        i2++;
                        i4 = i3;
                    }
                    i = i4;
                } else {
                    i = i2 + 1;
                    this.a[i2] = 0;
                }
            }
            this.b = cpVar.g;
            this.c = cpVar.h;
            this.d = cpVar.j;
            this.e = cpVar.k;
            this.f = cpVar.l;
            this.g = cpVar.m;
            this.h = cpVar.n;
            this.i = cpVar.o;
            this.j = cpVar.p;
            this.k = cpVar.q;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public cu(Parcel parcel) {
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

    public final cp a(dm dmVar) {
        cp cpVar = new cp(dmVar);
        int i = 0;
        while (i < this.a.length) {
            cs csVar = new cs();
            int i2 = i + 1;
            csVar.c = this.a[i];
            boolean z = dm.a;
            int i3 = i2 + 1;
            i = this.a[i2];
            if (i >= 0) {
                csVar.d = (db) dmVar.b.get(i);
            } else {
                csVar.d = null;
            }
            i2 = i3 + 1;
            csVar.e = this.a[i3];
            i3 = i2 + 1;
            csVar.f = this.a[i2];
            i2 = i3 + 1;
            csVar.g = this.a[i3];
            i3 = i2 + 1;
            csVar.h = this.a[i2];
            i = i3 + 1;
            int i4 = this.a[i3];
            if (i4 > 0) {
                csVar.i = new ArrayList(i4);
                i3 = 0;
                while (i3 < i4) {
                    boolean z2 = dm.a;
                    i2 = i + 1;
                    csVar.i.add((db) dmVar.b.get(this.a[i]));
                    i3++;
                    i = i2;
                }
            }
            cpVar.c = csVar.e;
            cpVar.d = csVar.f;
            cpVar.e = csVar.g;
            cpVar.f = csVar.h;
            cpVar.a(csVar);
        }
        cpVar.g = this.b;
        cpVar.h = this.c;
        cpVar.j = this.d;
        cpVar.k = this.e;
        cpVar.i = true;
        cpVar.l = this.f;
        cpVar.m = this.g;
        cpVar.n = this.h;
        cpVar.o = this.i;
        cpVar.p = this.j;
        cpVar.q = this.k;
        cpVar.a(1);
        return cpVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
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
        CREATOR = new cv();
    }
}
