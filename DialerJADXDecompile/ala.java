import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.telecom.PhoneAccountHandle;
import android.text.TextUtils;

/* compiled from: PG */
public final class ala {
    public boolean A;
    public CharSequence B;
    public CharSequence C;
    public String D;
    public String E;
    public aws F;
    public int G;
    public int H;
    public CharSequence a;
    public String b;
    public String c;
    public int d;
    public String e;
    public String f;
    public int[] g;
    public long h;
    public long i;
    public CharSequence j;
    public CharSequence k;
    public int l;
    public int m;
    public CharSequence n;
    public Uri o;
    public Uri p;
    public int q;
    public String r;
    public PhoneAccountHandle s;
    public int t;
    public Long u;
    public String v;
    public String w;
    public long x;
    public boolean y;
    public boolean z;

    public ala(CharSequence charSequence, int i, CharSequence charSequence2) {
        this.y = true;
        this.z = false;
        this.A = false;
        this.a = charSequence;
        this.d = i;
        this.b = charSequence2.toString();
    }

    public static CharSequence a(Resources resources, String str, CharSequence charSequence) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(charSequence)) {
            String string = resources.getString(cob.bS, new Object[]{charSequence, str});
            str = aim.a(string, str);
            if (str == null) {
                return string;
            }
            return str;
        } else if (!TextUtils.isEmpty(str)) {
            CharSequence a = aim.a(resources, cob.bR, str);
            if (a != null) {
                return a;
            }
            return str;
        } else if (TextUtils.isEmpty(charSequence)) {
            return "";
        } else {
            return TextUtils.expandTemplate(resources.getString(cob.bN), new CharSequence[]{charSequence});
        }
    }

    public final CharSequence a() {
        if (this.l == 1 || TextUtils.isEmpty(this.k)) {
            return this.j;
        }
        return this.k;
    }

    public final void a(Context context, CharSequence charSequence, boolean z) {
        this.w = buf.a(context, this.a, this.d, charSequence, this.b, z).toString();
    }
}
