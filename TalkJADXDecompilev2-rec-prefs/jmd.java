package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

public final class jmd implements jmb {
    public static final Creator<jmd> CREATOR = new jme();
    final List<String> f20464a = new ArrayList();
    final List<String> f20465b = new ArrayList();

    public boolean mo459a(int i, jch jch) {
        int i2;
        for (i2 = 0; i2 < this.f20464a.size(); i2++) {
            if (!jch.mo3448c((String) this.f20464a.get(i2))) {
                return false;
            }
        }
        for (i2 = 0; i2 < this.f20465b.size(); i2++) {
            if (jch.mo3448c((String) this.f20465b.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public jmd m24685a(String str) {
        this.f20464a.add(str);
        return this;
    }

    public jmd m24687b(String str) {
        this.f20465b.add(str);
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f20464a);
        parcel.writeStringList(this.f20465b);
    }

    public jmd(Parcel parcel) {
        parcel.readStringList(this.f20464a);
        parcel.readStringList(this.f20465b);
    }
}
