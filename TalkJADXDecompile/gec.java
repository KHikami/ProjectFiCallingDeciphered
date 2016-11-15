import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;
import java.util.Objects;

// current_network_carrier object

public final class gec implements Parcelable { //refered to as network status in gwb
    public static final Creator<gec> CREATOR;
    private final int a;    // Roaming status (1 = roaming, 2 = not roaming, otherwise unknown)
    private final String b; //sim operator identifier
    private final String c; //network country ISO (international standard org)

    public gec(Context context, int i) {
        String str;
        this.a = i;
        this.b = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        ggc a = ggc.a(context); //new ggc object created
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String networkCountryIso = telephonyManager.getNetworkCountryIso();
        if (networkCountryIso != null) {
            networkCountryIso = networkCountryIso.toUpperCase(Locale.US);//formats ISO to US format
            if (!TextUtils.isEmpty(networkCountryIso)) {
                if (!networkCountryIso.equals(a.k())) {
                    //if network Country is not previous country ISO,
                    //set "previous" ISO to be current ISO
                    a.b(networkCountryIso);

                }
                str = networkCountryIso;
                this.c = str;
            }
        }

        // Note: if the lines in networkCountryIso!= null executed
        // a.k() now returns current country ISO

        CharSequence k = a.k(); //get previous country iso.

        if (!TextUtils.isEmpty(k)) { //if had previous country, store into a charsequence
            CharSequence charSequence = k;
        } else if (telephonyManager.getPhoneType() == 2) { //phone type is CDMA & no previous ISO
            str = glq.i(context);
        } else {
            glk.c("Babel_telephony", "TeleNetworkStatus.getCurrentNetworkCountryIso, network country is unknown.", new Object[0]);
            str = null;
            //if no previous country ISO & no current country iso
        }
        this.c = str;//stores country iso state
    }

    gec(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public String toString() {
        String str;
        String str2;
        int c = c();
        if (c == 2) {
            str = "T-Mobile";
        } else if (c == 1) {
            str = "Sprint";
        } else {
            str2 = "Uknown carrier: ";  // spelled unknown wrong
            str = String.valueOf(this.b);
            str = str.length() != 0 ? str2.concat(str) : new String(str2);
        }
        if (this.a == 1) {
            str2 = "roaming";
        } else if (this.a == 2) {
            str2 = "not roaming";
        } else {
            str2 = "roaming status unknown";
        }
        String str3 = this.c;
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
        if (this.a == gec.a && Objects.equals(this.b, gec.b) && Objects.equals(this.c, gec.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.a + 31;
        if (this.b != null) {
            i = (i * 31) + this.b.hashCode();
        }
        if (this.c != null) {
            return (i * 31) + this.c.hashCode();
        }
        return i;
    }

    // Returns roaming status (2 = roaming, 1 = not roaming, 3 = unknown or default)
    //   either by inferring from what network we are on, or by just looking at this.a
    public int a() {
        int c = c();
        // If we are not on T-Mobile and not on Sprint, OR we are roaming...
        if ((c != 2 && c != 1) || this.a == 1) {
            //simOperator is not 2 and not 1 or int given at construction is 1
            return 2;
        }
        // Not roaming
        if (this.a == 2) {
            return 1;
        }
        // Unknown status
        return 3;
    }

    public String b() {
        return this.b;
    } //returns SIM Operator

    // Returns mapped int for current MCC/MNC number
    // https://en.wikipedia.org/wiki/Mobile_country_code
    public int c() {
        String str = this.b; //returns a "code" based on the Sim Operator
        if (str != null) {
            if (str.startsWith("310260")) { // T-Mobile
                return 2;
            }
            if (str.startsWith("310120")) { // Sprint
                return 1;
            }
            if (str.startsWith("311580")) { // US Cellular
                return 3;
            }
            if (str.startsWith("23420")) {  // Hutchison 3G (UK)
                return 4;
            }
            if (str.startsWith("45403")) {  // Hutchison Telecom (HK)
                return 5;
            }
        }
        return 0;   // Error
    }

    public String d() {
        return this.c;
    } //returns ISO

    int e() {
        if (this.c == null) {//no ISO => 3
            return 3;
        }
        if (this.c.equals(Locale.US.getCountry())) {
            return 1; //if ISO is US => 1
        }
        return 2; //default is 2 (must be international ISO)
    }

    public static gec a(gfz gfz) {
        String str = null;
        String str2 = TextUtils.isEmpty(gfz.b) ? null : gfz.b;
        if (!TextUtils.isEmpty(gfz.c)) {
            str = gfz.c;
        }
        return new gec(gfz.a, str2, str);
    }

    gfz f() {
        gfz gfz = new gfz();
        gfz.a = this.a;
        if (this.b != null) {
            gfz.b = this.b;
        }
        if (this.c != null) {
            gfz.c = this.c;
        }
        return gfz;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    // Returns true if we have a US ISO, AND babel_hutch_experience_for_us is true (when looked up in context hashmap)
    public boolean a(Context context) {
        if (gwb.a(context, "babel_hutch_experience_for_us", false) || e() != 1) {
            //if I have an ISO or passes gwb.a(context, string, false) => false
            return false;
        }
        return true;
    }

    // Returns true if we have an international ISO, OR babel_hutch_experience_for_us is false(when looked up in context hashmap)
    public boolean b(Context context) {
        //in international area or gwb.a(Context,string,boolean)
        //=> in international area or gservices do not allow bable hutch experience
        if (gwb.a(context, "babel_hutch_experience_for_us", false) || e() == 2) {
            return true;
        }
        return false;
    }

    static {
        CREATOR = new ged();
    }
}
