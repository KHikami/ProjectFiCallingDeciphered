package defpackage;

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
    public static final Charset a = Charset.forName("UTF-8");
    private final String b;
    private final String c;
    private String d;
    private String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final Uri j;
    private final String k;
    private final int l;
    private final int m;
    private final String n;
    private final transient PendingIntent o;

    public /* synthetic */ Object clone() {
        return r();
    }

    dhz(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, PendingIntent pendingIntent, Uri uri) {
        if (str2 == null || str3 != null) {
            this.b = str;
            this.l = i2;
            this.m = i;
            this.d = str3;
            if ("conversation".equals(str2)) {
                boolean z;
                if (str4 == null || str4.equals(str3)) {
                    z = true;
                } else {
                    z = false;
                }
                iil.a("Expected condition to be true", z);
                this.c = "conversation";
                this.e = str3;
            } else {
                this.c = str2;
                this.e = str4;
            }
            this.f = str5;
            this.g = str6;
            this.h = str7;
            this.i = str8;
            this.n = str9;
            this.o = pendingIntent;
            this.k = str10;
            this.j = uri;
            return;
        }
        throw new IllegalArgumentException("externalKeyType specified but not externalKey");
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public boolean c() {
        return this.d != null;
    }

    public void a(String str) {
        this.d = str;
    }

    public String d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }

    public String f() {
        return this.f;
    }

    public String g() {
        return this.g;
    }

    public String h() {
        return this.h;
    }

    public String i() {
        return this.i;
    }

    public String j() {
        return this.k;
    }

    public Uri k() {
        return this.j;
    }

    public int l() {
        return this.l;
    }

    public int m() {
        return this.m;
    }

    public String n() {
        return this.n;
    }

    public PendingIntent o() {
        return this.o;
    }

    public boolean p() {
        return this.g == null && this.c == null;
    }

    public boolean q() {
        return (TextUtils.isEmpty(this.g) || TextUtils.isEmpty(this.f)) ? false : true;
    }

    public dhz b(String str) {
        return new dhz(this.b, this.m, this.l, null, null, null, this.f, this.g, this.h, this.i, gwb.U(str), null, null, this.j);
    }

    public dhz c(String str) {
        boolean z;
        if (this.d == null && this.c == null && this.o == null && this.k == null) {
            z = true;
        } else {
            z = false;
        }
        iil.a("Expected condition to be true", z);
        if (this.b != null && this.b.equals(str)) {
            return this;
        }
        return new dhz(str, this.m, this.l, null, null, null, this.f, this.g, this.h, this.i, null, null, null, this.j);
    }

    public dhz d(String str) {
        return new dhz(this.b, this.m, this.l, this.c, this.d, null, null, str, this.h, this.i, this.n, null, this.o, this.j);
    }

    public dhz e(String str) {
        if (!"conversation".equals(this.c)) {
            return new dhz(this.b, this.m, this.l, this.c, this.d, str, this.f, this.g, this.h, this.i, this.n, null, this.o, this.j);
        } else if (str == null && this.g == null && (this.c == null || "conversation".equals(this.c))) {
            throw new IllegalStateException("Erasing the only data of conv id");
        } else {
            return new dhz(this.b, this.m, this.l, str == null ? null : "conversation", str, str, this.f, this.g, this.h, this.i, this.n, null, this.o, this.j);
        }
    }

    public dhz r() {
        return new dhz(this.b, this.m, this.l, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.n, this.k, this.o, this.j);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HangoutRequest{ account=").append(itx.a(this.b)).append(", ");
        stringBuilder.append("callMediaType=").append(this.l).append(", ");
        if (this.c != null) {
            if (!"conversation".equals(this.c)) {
                stringBuilder.append("extKey=").append(this.c).append(':').append(this.d).append(", ");
            }
            stringBuilder.append("convId=").append(this.e).append(", ");
        }
        if (this.g != null) {
            stringBuilder.append("hangoutId=").append(this.f).append(':').append(itx.a(this.g)).append(", ");
        }
        if (!(this.h == null || this.i == null)) {
            stringBuilder.append("calendarId=").append(this.h).append(':').append(this.i).append(", ");
        }
        if (this.k != null) {
            stringBuilder.append("pendingIdKey=").append(itx.a(this.k)).append(' ');
        }
        if (this.n != null) {
            stringBuilder.append("inviteeNick=").append(itx.a(this.n)).append(' ');
        }
        if (this.j != null) {
            stringBuilder.append("originalUri=").append(this.j.toString()).append(' ');
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public int hashCode() {
        return ((this.b.hashCode() + 31) * 31) + this.m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dhz dhz = (dhz) obj;
        if (!this.b.equals(dhz.b)) {
            return false;
        }
        int i;
        int i2;
        if (this.m == 4) {
            i = 1;
        } else {
            i = this.m;
        }
        if (dhz.m == 4) {
            i2 = 1;
        } else {
            i2 = dhz.m;
        }
        boolean z = (i == -1 || i2 == -1) ? true : (i == 1 || i == 7) ? i2 == 1 || i2 == 7 : i == i2;
        if (!z) {
            return false;
        }
        z = this.c != null && this.c.equals(dhz.c) && this.d.equals(dhz.d);
        boolean z2;
        if (this.e == null || !this.e.equals(dhz.e)) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z3;
        if (this.g == null || !this.g.equals(dhz.g) || (!(this.f == null && dhz.f == null) && (this.f == null || !this.f.equals(dhz.f)))) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean z4;
        if (this.k == null || !this.k.equals(dhz.k)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z || r3 || r4 || r5) {
            return true;
        }
        return false;
    }

    void a(Editor editor) {
        editor.putString("ACCOUNT_NAME", this.b);
        editor.putInt("CALL_MEDIA_TYPE", this.l);
        editor.putString("EXTERNAL_KEY", this.d);
        editor.putString("EXTERNAL_KEY_TYPE", this.c);
        editor.putString("CONVERSATION_ID", this.e);
        editor.putString("INFO_HANGOUT_DOMAIN", this.f);
        editor.putString("INFO_HANGOUT_ID", this.g);
        editor.putString("INFO_CALENDAR_ID", this.h);
        editor.putString("INFO_EVENT_ID", this.i);
        editor.putString("PENDING_HANGOUT_ID_KEY", this.k);
        editor.putInt("HANGOUT_TYPE", this.m);
        editor.putString("INFO_INVITEE_NICK", this.n);
        editor.putString("ORIGINAL_URI", this.j != null ? this.j.toString() : null);
    }

    public static dhz a(SharedPreferences sharedPreferences) {
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

    public static dhz a(Uri uri, String str, PendingIntent pendingIntent) {
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
            itx.a(5, "vclib", "URI has too few or too many segments.");
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
                str7 = new String(mqq.b.a(split[0]), a);
                str8 = Uri.decode(split[1]);
            }
        }
        if (str3 == null || str4 != null) {
            return new dhz(str, 1, 1, str2, str6, null, str4, str3, str7, str8, null, null, pendingIntent, uri);
        }
        itx.a(5, "vclib", "Shouldn't have a non-null hangoutId without a domain");
        return null;
    }

    public void s() {
        if (this.o != null) {
            try {
                this.o.send();
            } catch (Throwable e) {
                itx.a(5, "vclib", "HangoutRequest call complete intent could not be sent", e);
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.k);
        parcel.writeInt(this.m);
        parcel.writeInt(this.l);
        parcel.writeString(this.n);
        parcel.writeParcelable(this.o, i);
        parcel.writeParcelable(this.j, i);
    }

    dhz(Parcel parcel) {
        this.b = parcel.readString();
        String readString = parcel.readString();
        if ("conversation".equals(readString)) {
            readString = "conversation";
        }
        this.c = readString;
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.k = parcel.readString();
        this.m = parcel.readInt();
        this.l = parcel.readInt();
        this.n = parcel.readString();
        this.o = (PendingIntent) parcel.readParcelable(null);
        this.j = (Uri) parcel.readParcelable(null);
    }
}
