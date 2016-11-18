package p000;

import android.app.PendingIntent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.List;

public class dhz implements Parcelable, Serializable {
    public static final Creator<dhz> CREATOR = new dia();
    public static final Charset f9784a = Charset.forName("UTF-8");
    private final String f9785b;
    private final String f9786c;
    private String f9787d;
    private String f9788e;
    private final String f9789f;
    private final String f9790g;
    private final String f9791h;
    private final String f9792i;
    private final Uri f9793j;
    private final String f9794k;
    private final int f9795l;
    private final int f9796m;
    private final String f9797n;
    private final transient PendingIntent f9798o;

    public /* synthetic */ Object clone() {
        return m11908r();
    }

    dhz(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, PendingIntent pendingIntent, Uri uri) {
        if (str2 == null || str3 != null) {
            this.f9785b = str;
            this.f9795l = i2;
            this.f9796m = i;
            this.f9787d = str3;
            if ("conversation".equals(str2)) {
                boolean z;
                if (str4 == null || str4.equals(str3)) {
                    z = true;
                } else {
                    z = false;
                }
                iil.m21874a("Expected condition to be true", z);
                this.f9786c = "conversation";
                this.f9788e = str3;
            } else {
                this.f9786c = str2;
                this.f9788e = str4;
            }
            this.f9789f = str5;
            this.f9790g = str6;
            this.f9791h = str7;
            this.f9792i = str8;
            this.f9797n = str9;
            this.f9798o = pendingIntent;
            this.f9794k = str10;
            this.f9793j = uri;
            return;
        }
        throw new IllegalArgumentException("externalKeyType specified but not externalKey");
    }

    public String m11885a() {
        return this.f9785b;
    }

    public String m11889b() {
        return this.f9786c;
    }

    public boolean m11891c() {
        return this.f9787d != null;
    }

    public void m11887a(String str) {
        this.f9787d = str;
    }

    public String m11893d() {
        return this.f9787d;
    }

    public String m11895e() {
        return this.f9788e;
    }

    public String m11896f() {
        return this.f9789f;
    }

    public String m11897g() {
        return this.f9790g;
    }

    public String m11898h() {
        return this.f9791h;
    }

    public String m11899i() {
        return this.f9792i;
    }

    public String m11900j() {
        return this.f9794k;
    }

    public Uri m11901k() {
        return this.f9793j;
    }

    public int m11902l() {
        return this.f9795l;
    }

    public int m11903m() {
        return this.f9796m;
    }

    public String m11904n() {
        return this.f9797n;
    }

    public PendingIntent m11905o() {
        return this.f9798o;
    }

    public boolean m11906p() {
        return this.f9790g == null && this.f9786c == null;
    }

    public boolean m11907q() {
        return (TextUtils.isEmpty(this.f9790g) || TextUtils.isEmpty(this.f9789f)) ? false : true;
    }

    public dhz m11888b(String str) {
        return new dhz(this.f9785b, this.f9796m, this.f9795l, null, null, null, this.f9789f, this.f9790g, this.f9791h, this.f9792i, gwb.m1454U(str), null, null, this.f9793j);
    }

    public dhz m11890c(String str) {
        boolean z;
        if (this.f9787d == null && this.f9786c == null && this.f9798o == null && this.f9794k == null) {
            z = true;
        } else {
            z = false;
        }
        iil.m21874a("Expected condition to be true", z);
        if (this.f9785b != null && this.f9785b.equals(str)) {
            return this;
        }
        return new dhz(str, this.f9796m, this.f9795l, null, null, null, this.f9789f, this.f9790g, this.f9791h, this.f9792i, null, null, null, this.f9793j);
    }

    public dhz m11892d(String str) {
        return new dhz(this.f9785b, this.f9796m, this.f9795l, this.f9786c, this.f9787d, null, null, str, this.f9791h, this.f9792i, this.f9797n, null, this.f9798o, this.f9793j);
    }

    public dhz m11894e(String str) {
        if (!"conversation".equals(this.f9786c)) {
            return new dhz(this.f9785b, this.f9796m, this.f9795l, this.f9786c, this.f9787d, str, this.f9789f, this.f9790g, this.f9791h, this.f9792i, this.f9797n, null, this.f9798o, this.f9793j);
        } else if (str == null && this.f9790g == null && (this.f9786c == null || "conversation".equals(this.f9786c))) {
            throw new IllegalStateException("Erasing the only data of conv id");
        } else {
            return new dhz(this.f9785b, this.f9796m, this.f9795l, str == null ? null : "conversation", str, str, this.f9789f, this.f9790g, this.f9791h, this.f9792i, this.f9797n, null, this.f9798o, this.f9793j);
        }
    }

    public dhz m11908r() {
        return new dhz(this.f9785b, this.f9796m, this.f9795l, this.f9786c, this.f9787d, this.f9788e, this.f9789f, this.f9790g, this.f9791h, this.f9792i, this.f9797n, this.f9794k, this.f9798o, this.f9793j);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HangoutRequest{ account=").append(itx.m23276a(this.f9785b)).append(", ");
        stringBuilder.append("callMediaType=").append(this.f9795l).append(", ");
        if (this.f9786c != null) {
            if (!"conversation".equals(this.f9786c)) {
                stringBuilder.append("extKey=").append(this.f9786c).append(':').append(this.f9787d).append(", ");
            }
            stringBuilder.append("convId=").append(this.f9788e).append(", ");
        }
        if (this.f9790g != null) {
            stringBuilder.append("hangoutId=").append(this.f9789f).append(':').append(itx.m23276a(this.f9790g)).append(", ");
        }
        if (!(this.f9791h == null || this.f9792i == null)) {
            stringBuilder.append("calendarId=").append(this.f9791h).append(':').append(this.f9792i).append(", ");
        }
        if (this.f9794k != null) {
            stringBuilder.append("pendingIdKey=").append(itx.m23276a(this.f9794k)).append(' ');
        }
        if (this.f9797n != null) {
            stringBuilder.append("inviteeNick=").append(itx.m23276a(this.f9797n)).append(' ');
        }
        if (this.f9793j != null) {
            stringBuilder.append("originalUri=").append(this.f9793j.toString()).append(' ');
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public int hashCode() {
        return ((this.f9785b.hashCode() + 31) * 31) + this.f9796m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dhz dhz = (dhz) obj;
        if (!this.f9785b.equals(dhz.f9785b)) {
            return false;
        }
        int i;
        int i2;
        if (this.f9796m == 4) {
            i = 1;
        } else {
            i = this.f9796m;
        }
        if (dhz.f9796m == 4) {
            i2 = 1;
        } else {
            i2 = dhz.f9796m;
        }
        boolean z = (i == -1 || i2 == -1) ? true : (i == 1 || i == 7) ? i2 == 1 || i2 == 7 : i == i2;
        if (!z) {
            return false;
        }
        z = this.f9786c != null && this.f9786c.equals(dhz.f9786c) && this.f9787d.equals(dhz.f9787d);
        boolean z2;
        if (this.f9788e == null || !this.f9788e.equals(dhz.f9788e)) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z3;
        if (this.f9790g == null || !this.f9790g.equals(dhz.f9790g) || (!(this.f9789f == null && dhz.f9789f == null) && (this.f9789f == null || !this.f9789f.equals(dhz.f9789f)))) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean z4;
        if (this.f9794k == null || !this.f9794k.equals(dhz.f9794k)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z || r3 || r4 || r5) {
            return true;
        }
        return false;
    }

    void m11886a(Editor editor) {
        editor.putString("ACCOUNT_NAME", this.f9785b);
        editor.putInt("CALL_MEDIA_TYPE", this.f9795l);
        editor.putString("EXTERNAL_KEY", this.f9787d);
        editor.putString("EXTERNAL_KEY_TYPE", this.f9786c);
        editor.putString("CONVERSATION_ID", this.f9788e);
        editor.putString("INFO_HANGOUT_DOMAIN", this.f9789f);
        editor.putString("INFO_HANGOUT_ID", this.f9790g);
        editor.putString("INFO_CALENDAR_ID", this.f9791h);
        editor.putString("INFO_EVENT_ID", this.f9792i);
        editor.putString("PENDING_HANGOUT_ID_KEY", this.f9794k);
        editor.putInt("HANGOUT_TYPE", this.f9796m);
        editor.putString("INFO_INVITEE_NICK", this.f9797n);
        editor.putString("ORIGINAL_URI", this.f9793j != null ? this.f9793j.toString() : null);
    }

    public static dhz m11883a(SharedPreferences sharedPreferences) {
        Uri parse;
        String string = sharedPreferences.getString("ACCOUNT_NAME", null);
        int i = sharedPreferences.getInt("CALL_MEDIA_TYPE", 1);
        String string2 = sharedPreferences.getString("EXTERNAL_KEY", null);
        String string3 = sharedPreferences.getString("EXTERNAL_KEY_TYPE", null);
        String string4 = sharedPreferences.getString("CONVERSATION_ID", null);
        String string5 = sharedPreferences.getString("INFO_HANGOUT_DOMAIN", null);
        String string6 = sharedPreferences.getString("INFO_HANGOUT_ID", null);
        String string7 = sharedPreferences.getString("INFO_CALENDAR_ID", null);
        String string8 = sharedPreferences.getString("INFO_EVENT_ID", null);
        String string9 = sharedPreferences.getString("PENDING_HANGOUT_ID_KEY", null);
        String string10 = sharedPreferences.getString("ORIGINAL_URI", null);
        if (string10 != null) {
            parse = Uri.parse(string10);
        } else {
            parse = null;
        }
        return new dhz(string, sharedPreferences.getInt("HANGOUT_TYPE", 1), i, string3, string2, string4, string5, string6, string7, string8, sharedPreferences.getString("INFO_INVITEE_NICK", null), string9, null, parse);
    }

    public static dhz m11884a(Uri uri, String str, PendingIntent pendingIntent) {
        if (uri == null) {
            return null;
        }
        String str2;
        String str3;
        String str4;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        List pathSegments = uri.getPathSegments();
        int size = pathSegments.size();
        String str9;
        String str10;
        if (size == 3) {
            str9 = (String) pathSegments.get(1);
            str10 = (String) pathSegments.get(2);
            if (!"call".equals((String) pathSegments.get(0)) || str9.indexOf(46) == 1) {
                str10 = null;
                str9 = null;
            }
            str6 = null;
            str2 = null;
            str3 = str10;
            str4 = str9;
        } else if (size == 4) {
            r0 = (String) pathSegments.get(0);
            str9 = (String) pathSegments.get(1);
            str10 = (String) pathSegments.get(2);
            r3 = (String) pathSegments.get(3);
            if ("hangouts".equals(r0) && "_".equals(str9)) {
                if (!"lite".equals(str10)) {
                    if (str10.indexOf(46) != -1) {
                        str2 = null;
                        str3 = Uri.decode(r3);
                        str6 = null;
                        str4 = str10;
                    } else {
                        str3 = null;
                        str4 = null;
                        str2 = str10;
                        str6 = r3;
                    }
                }
            } else if ("hangouts".equals(r0) && "extras".equals(str9)) {
                str6 = Uri.decode(r3);
                str5 = str10;
            }
            str2 = null;
            str3 = str6;
            str6 = null;
            str4 = str5;
        } else if (size == 5) {
            r0 = (String) pathSegments.get(0);
            str9 = (String) pathSegments.get(1);
            str10 = (String) pathSegments.get(2);
            r3 = (String) pathSegments.get(3);
            str2 = (String) pathSegments.get(4);
            if ("hangouts".equals(r0) && "_".equals(str9) && ("extras".equals(str10) || "meet".equals(str10))) {
                str6 = Uri.decode(str2);
                str5 = r3;
            }
            str2 = null;
            str3 = str6;
            str6 = null;
            str4 = str5;
        } else if (size != 2) {
            itx.m23277a(5, "vclib", "URI has too few or too many segments.");
            return null;
        } else {
            str2 = null;
            str3 = null;
            str6 = null;
            str4 = null;
        }
        Object queryParameter = uri.getQueryParameter("hceid");
        if (!TextUtils.isEmpty(queryParameter)) {
            String[] split = queryParameter.split("\\.");
            if (split.length == 2) {
                str7 = new String(mqq.f28123b.m32724a(split[0]), f9784a);
                str8 = Uri.decode(split[1]);
            }
        }
        if (str3 == null || str4 != null) {
            return new dhz(str, 1, 1, str2, str6, null, str4, str3, str7, str8, null, null, pendingIntent, uri);
        }
        itx.m23277a(5, "vclib", "Shouldn't have a non-null hangoutId without a domain");
        return null;
    }

    public void m11909s() {
        if (this.f9798o != null) {
            try {
                this.f9798o.send();
            } catch (Throwable e) {
                itx.m23278a(5, "vclib", "HangoutRequest call complete intent could not be sent", e);
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9785b);
        parcel.writeString(this.f9786c);
        parcel.writeString(this.f9787d);
        parcel.writeString(this.f9788e);
        parcel.writeString(this.f9789f);
        parcel.writeString(this.f9790g);
        parcel.writeString(this.f9791h);
        parcel.writeString(this.f9792i);
        parcel.writeString(this.f9794k);
        parcel.writeInt(this.f9796m);
        parcel.writeInt(this.f9795l);
        parcel.writeString(this.f9797n);
        parcel.writeParcelable(this.f9798o, i);
        parcel.writeParcelable(this.f9793j, i);
    }

    dhz(Parcel parcel) {
        this.f9785b = parcel.readString();
        String readString = parcel.readString();
        if ("conversation".equals(readString)) {
            readString = "conversation";
        }
        this.f9786c = readString;
        this.f9787d = parcel.readString();
        this.f9788e = parcel.readString();
        this.f9789f = parcel.readString();
        this.f9790g = parcel.readString();
        this.f9791h = parcel.readString();
        this.f9792i = parcel.readString();
        this.f9794k = parcel.readString();
        this.f9796m = parcel.readInt();
        this.f9795l = parcel.readInt();
        this.f9797n = parcel.readString();
        this.f9798o = (PendingIntent) parcel.readParcelable(null);
        this.f9793j = (Uri) parcel.readParcelable(null);
    }
}
