package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class fbt implements Parcelable, Serializable {
    public static final Creator<fbt> CREATOR = new fbu();
    private static final long serialVersionUID = 1;
    public final String f12658a;
    public final String f12659b;
    public final String f12660c;
    public final String f12661d;
    public final boolean f12662e;

    public fbt(String str, String str2, String str3, String str4, boolean z) {
        this.f12658a = str;
        this.f12659b = str2;
        this.f12660c = str3;
        this.f12661d = str4;
        this.f12662e = z;
    }

    public static fbt m14917a(String str) {
        return new fbt(str, null, null, null, false);
    }

    public static fbt m14918a(String str, String str2, boolean z) {
        return new fbt(null, null, str, str2, false);
    }

    public static fbt m14920b(String str) {
        return new fbt(null, null, null, str, false);
    }

    public boolean m14922a() {
        return (this.f12658a == null && this.f12660c == null && this.f12661d == null) ? false : true;
    }

    public boolean m14923b() {
        return (this.f12658a == null && this.f12659b == null && this.f12661d == null) ? false : true;
    }

    public String m14924c() {
        String str = this.f12658a;
        String str2 = this.f12659b;
        String str3 = this.f12660c;
        String str4 = this.f12661d;
        return new StringBuilder((((String.valueOf(str).length() + 3) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()).append(str).append("|").append(str2).append("|").append(str3).append("|").append(str4).toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fbt)) {
            return false;
        }
        fbt fbt = (fbt) obj;
        if (TextUtils.equals(this.f12658a, fbt.f12658a) && TextUtils.equals(this.f12659b, fbt.f12659b) && TextUtils.equals(this.f12660c, fbt.f12660c) && TextUtils.equals(this.f12661d, fbt.f12661d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((fbt.m14916a(this.f12658a) + 527) * 31) + fbt.m14916a(this.f12659b)) * 31) + fbt.m14916a(this.f12660c)) * 31) + fbt.m14916a(this.f12661d);
    }

    private static int m14916a(Object obj) {
        return obj != null ? obj.hashCode() : 0;
    }

    public String toString() {
        String str = this.f12660c;
        String str2 = this.f12661d;
        String str3 = this.f12658a;
        String str4 = this.f12659b;
        return new StringBuilder((((String.valueOf(str).length() + 86) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()).append("EntityLookupSpec { email: ").append(str).append("  phoneNumber: ").append(str2).append("  gaiaId: ").append(str3).append("  chatId: ").append(str4).append(" createOffNetwork:").append(this.f12662e).append(" }").toString();
    }

    public static lsi[] m14919a(Collection<fbt> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        List list = null;
        for (fbt e : collection) {
            List arrayList;
            lsi e2 = e.m14921e();
            if (e2 != null) {
                if (list == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = list;
                }
                arrayList.add(e2);
            } else {
                arrayList = list;
            }
            list = arrayList;
        }
        if (list == null) {
            return null;
        }
        lsi[] lsiArr = new lsi[list.size()];
        list.toArray(lsiArr);
        return lsiArr;
    }

    private lsi m14921e() {
        lsi lsi;
        if (!TextUtils.isEmpty(this.f12661d)) {
            lsi = new lsi();
            lsi.f26323a = new lsl();
            lsi.f26323a.f26328a = new muu();
            lsi.f26323a.f26328a.f28411a = this.f12661d;
            return lsi;
        } else if (TextUtils.isEmpty(this.f12660c)) {
            return null;
        } else {
            lsi = new lsi();
            lsi.f26324b = new lsj();
            lsi.f26324b.f26326a = this.f12660c;
            return lsi;
        }
    }

    public lqd m14925d() {
        lqd lqd = new lqd();
        if (this.f12658a != null) {
            lqd.f26079a = this.f12658a;
        } else if (this.f12660c != null) {
            lqd.f26081c = this.f12660c;
        } else if (this.f12661d != null) {
            lqd.f26082d = this.f12661d;
        }
        if (this.f12662e) {
            lqd.f26084f = Boolean.valueOf(true);
        }
        return lqd;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12658a);
        parcel.writeString(this.f12659b);
        parcel.writeString(this.f12660c);
        parcel.writeString(this.f12661d);
        parcel.writeInt(this.f12662e ? 1 : 0);
    }
}
