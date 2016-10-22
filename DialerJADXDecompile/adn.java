import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.drawable.Drawable;
import android.net.Uri.Builder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

/* compiled from: PG */
public final class adn implements Parcelable, Comparable {
    public static final Creator CREATOR;
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public final /* synthetic */ int compareTo(Object obj) {
        adn adn = (adn) obj;
        int compareTo = this.c.compareTo(adn.c);
        if (compareTo != 0) {
            return compareTo;
        }
        compareTo = this.b.compareTo(adn.b);
        if (compareTo == 0) {
            return this.a - adn.a;
        }
        return compareTo;
    }

    static {
        CREATOR = new ado();
    }

    public adn(int i, String str, String str2, String str3, Drawable drawable) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public static adn a(int i) {
        return new adn(i, null, null, null, null);
    }

    public static void a(SharedPreferences sharedPreferences, adn adn) {
        String str = null;
        if (adn == null || adn.a != -6) {
            String str2;
            Editor putInt = sharedPreferences.edit().putInt("filter.type", adn == null ? -1 : adn.a);
            String str3 = "filter.accountName";
            if (adn == null) {
                str2 = null;
            } else {
                str2 = adn.c;
            }
            putInt = putInt.putString(str3, str2);
            str3 = "filter.accountType";
            if (adn == null) {
                str2 = null;
            } else {
                str2 = adn.b;
            }
            Editor putString = putInt.putString(str3, str2);
            String str4 = "filter.dataSet";
            if (adn != null) {
                str = adn.d;
            }
            putString.putString(str4, str).apply();
        }
    }

    public static adn a(SharedPreferences sharedPreferences) {
        adn adn;
        int i = sharedPreferences.getInt("filter.type", -1);
        if (i == -1) {
            adn = null;
        } else {
            adn = new adn(i, sharedPreferences.getString("filter.accountType", null), sharedPreferences.getString("filter.accountName", null), sharedPreferences.getString("filter.dataSet", null), null);
        }
        if (adn == null) {
            adn = a(-2);
        }
        if (adn.a == 1 || adn.a == -6) {
            return a(-2);
        }
        return adn;
    }

    public final String toString() {
        switch (this.a) {
            case -6:
                return "single";
            case -5:
                return "with_phones";
            case -4:
                return "starred";
            case -3:
                return "custom";
            case -2:
                return "all_accounts";
            case oe.HOST_ID /*-1*/:
                return "default";
            case rl.c /*0*/:
                String str;
                String valueOf;
                String str2 = this.b;
                if (this.d != null) {
                    str = "/";
                    valueOf = String.valueOf(this.d);
                    valueOf = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
                } else {
                    valueOf = "";
                }
                str = this.c;
                return new StringBuilder(((String.valueOf(str2).length() + 10) + String.valueOf(valueOf).length()) + String.valueOf(str).length()).append("account: ").append(str2).append(valueOf).append(" ").append(str).toString();
            default:
                return super.toString();
        }
    }

    public final int hashCode() {
        int i = this.a;
        if (this.b != null) {
            i = (((i * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }
        if (this.d != null) {
            return (i * 31) + this.d.hashCode();
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adn)) {
            return false;
        }
        adn adn = (adn) obj;
        if (this.a == adn.a && TextUtils.equals(this.c, adn.c) && TextUtils.equals(this.b, adn.b) && TextUtils.equals(this.d, adn.d)) {
            return true;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.c);
        parcel.writeString(this.b);
        parcel.writeString(this.d);
    }

    public final int describeContents() {
        return 0;
    }

    public final Builder a(Builder builder) {
        if (this.a != 0) {
            throw new IllegalStateException("filterType must be FILTER_TYPE_ACCOUNT");
        }
        builder.appendQueryParameter("account_name", this.c);
        builder.appendQueryParameter("account_type", this.b);
        if (!TextUtils.isEmpty(this.d)) {
            builder.appendQueryParameter("data_set", this.d);
        }
        return builder;
    }
}
