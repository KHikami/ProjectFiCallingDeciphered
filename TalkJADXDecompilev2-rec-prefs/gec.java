package p000;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;
import java.util.Objects;

public final class gec implements Parcelable {
    public static final Creator<gec> CREATOR = new ged();
    private final int f14830a;
    private final String f14831b;
    private final String f14832c;

    public gec(Context context, int i) {
        String str;
        this.f14830a = i;
        this.f14831b = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        ggc a = ggc.m17608a(context);
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String networkCountryIso = telephonyManager.getNetworkCountryIso();
        if (networkCountryIso != null) {
            networkCountryIso = networkCountryIso.toUpperCase(Locale.US);
            if (!TextUtils.isEmpty(networkCountryIso)) {
                if (!networkCountryIso.equals(a.m17635k())) {
                    a.m17622b(networkCountryIso);
                }
                str = networkCountryIso;
                this.f14832c = str;
            }
        }
        CharSequence k = a.m17635k();
        if (!TextUtils.isEmpty(k)) {
            CharSequence charSequence = k;
        } else if (telephonyManager.getPhoneType() == 2) {
            str = glq.m18037i(context);
        } else {
            glk.m17979c("Babel_telephony", "TeleNetworkStatus.getCurrentNetworkCountryIso, network country is unknown.", new Object[0]);
            str = null;
        }
        this.f14832c = str;
    }

    gec(int i, String str, String str2) {
        this.f14830a = i;
        this.f14831b = str;
        this.f14832c = str2;
    }

    public String toString() {
        String str;
        String str2;
        int c = m17121c();
        if (c == 2) {
            str = "T-Mobile";
        } else if (c == 1) {
            str = "Sprint";
        } else {
            str2 = "Uknown carrier: ";
            str = String.valueOf(this.f14831b);
            str = str.length() != 0 ? str2.concat(str) : new String(str2);
        }
        if (this.f14830a == 1) {
            str2 = "roaming";
        } else if (this.f14830a == 2) {
            str2 = "not roaming";
        } else {
            str2 = "roaming status unknown";
        }
        String str3 = this.f14832c;
        return new StringBuilder(((String.valueOf(str).length() + 4) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append(str).append(", ").append(str2).append(", ").append(str3).toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gec gec = (gec) obj;
        if (this.f14830a == gec.f14830a && Objects.equals(this.f14831b, gec.f14831b) && Objects.equals(this.f14832c, gec.f14832c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.f14830a + 31;
        if (this.f14831b != null) {
            i = (i * 31) + this.f14831b.hashCode();
        }
        if (this.f14832c != null) {
            return (i * 31) + this.f14832c.hashCode();
        }
        return i;
    }

    public int m17117a() {
        int c = m17121c();
        if ((c != 2 && c != 1) || this.f14830a == 1) {
            return 2;
        }
        if (this.f14830a == 2) {
            return 1;
        }
        return 3;
    }

    public String m17119b() {
        return this.f14831b;
    }

    public int m17121c() {
        String str = this.f14831b;
        if (str != null) {
            if (str.startsWith("310260")) {
                return 2;
            }
            if (str.startsWith("310120")) {
                return 1;
            }
            if (str.startsWith("311580")) {
                return 3;
            }
            if (str.startsWith("23420")) {
                return 4;
            }
            if (str.startsWith("45403")) {
                return 5;
            }
        }
        return 0;
    }

    public String m17122d() {
        return this.f14832c;
    }

    int m17123e() {
        if (this.f14832c == null) {
            return 3;
        }
        if (this.f14832c.equals(Locale.US.getCountry())) {
            return 1;
        }
        return 2;
    }

    public static gec m17116a(gfz gfz) {
        String str = null;
        String str2 = TextUtils.isEmpty(gfz.f15206b) ? null : gfz.f15206b;
        if (!TextUtils.isEmpty(gfz.f15207c)) {
            str = gfz.f15207c;
        }
        return new gec(gfz.f15205a, str2, str);
    }

    gfz m17124f() {
        gfz gfz = new gfz();
        gfz.f15205a = this.f14830a;
        if (this.f14831b != null) {
            gfz.f15206b = this.f14831b;
        }
        if (this.f14832c != null) {
            gfz.f15207c = this.f14832c;
        }
        return gfz;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14830a);
        parcel.writeString(this.f14831b);
        parcel.writeString(this.f14832c);
    }

    public boolean m17118a(Context context) {
        if (gwb.m1906a(context, "babel_hutch_experience_for_us", false) || m17123e() != 1) {
            return false;
        }
        return true;
    }

    public boolean m17120b(Context context) {
        if (gwb.m1906a(context, "babel_hutch_experience_for_us", false) || m17123e() == 2) {
            return true;
        }
        return false;
    }
}
