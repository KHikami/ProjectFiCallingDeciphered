package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jmd */
public final class jmd implements jmb {
    public static final Creator<jmd> CREATOR;
    final List<String> a;
    final List<String> b;

    public jmd() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public boolean a(int i, jch jch) {
        int i2;
        for (i2 = 0; i2 < this.a.size(); i2++) {
            if (!jch.c((String) this.a.get(i2))) {
                return false;
            }
        }
        for (i2 = 0; i2 < this.b.size(); i2++) {
            if (jch.c((String) this.b.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public jmd a(String str) {
        this.a.add(str);
        return this;
    }

    public jmd b(String str) {
        this.b.add(str);
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeStringList(this.b);
    }

    public jmd(Parcel parcel) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        parcel.readStringList(this.a);
        parcel.readStringList(this.b);
    }

    static {
        CREATOR = new jme();
    }
}
