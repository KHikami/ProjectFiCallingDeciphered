package defpackage;

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
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public fbt(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public static fbt a(String str) {
        return new fbt(str, null, null, null, false);
    }

    public static fbt a(String str, String str2, boolean z) {
        return new fbt(null, null, str, str2, false);
    }

    public static fbt b(String str) {
        return new fbt(null, null, null, str, false);
    }

    public boolean a() {
        return (this.a == null && this.c == null && this.d == null) ? false : true;
    }

    public boolean b() {
        return (this.a == null && this.b == null && this.d == null) ? false : true;
    }

    public String c() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
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
        if (TextUtils.equals(this.a, fbt.a) && TextUtils.equals(this.b, fbt.b) && TextUtils.equals(this.c, fbt.c) && TextUtils.equals(this.d, fbt.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((fbt.a(this.a) + 527) * 31) + fbt.a(this.b)) * 31) + fbt.a(this.c)) * 31) + fbt.a(this.d);
    }

    private static int a(Object obj) {
        return obj != null ? obj.hashCode() : 0;
    }

    public String toString() {
        String str = this.c;
        String str2 = this.d;
        String str3 = this.a;
        String str4 = this.b;
        return new StringBuilder((((String.valueOf(str).length() + 86) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()).append("EntityLookupSpec { email: ").append(str).append("  phoneNumber: ").append(str2).append("  gaiaId: ").append(str3).append("  chatId: ").append(str4).append(" createOffNetwork:").append(this.e).append(" }").toString();
    }

    public static lsi[] a(Collection<fbt> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        List list = null;
        for (fbt e : collection) {
            List arrayList;
            lsi e2 = e.e();
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

    private lsi e() {
        lsi lsi;
        if (!TextUtils.isEmpty(this.d)) {
            lsi = new lsi();
            lsi.a = new lsl();
            lsi.a.a = new muu();
            lsi.a.a.a = this.d;
            return lsi;
        } else if (TextUtils.isEmpty(this.c)) {
            return null;
        } else {
            lsi = new lsi();
            lsi.b = new lsj();
            lsi.b.a = this.c;
            return lsi;
        }
    }

    public lqd d() {
        lqd lqd = new lqd();
        if (this.a != null) {
            lqd.a = this.a;
        } else if (this.c != null) {
            lqd.c = this.c;
        } else if (this.d != null) {
            lqd.d = this.d;
        }
        if (this.e) {
            lqd.f = Boolean.valueOf(true);
        }
        return lqd;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
