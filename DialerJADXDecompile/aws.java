import android.net.Uri;
import android.text.TextUtils;

/* compiled from: PG */
public final class aws {
    public static aws a;
    public Uri b;
    public String c;
    public String d;
    public String e;
    public int f;
    public String g;
    public String h;
    public String i;
    public String j;
    public long k;
    public Uri l;
    public boolean m;
    public String n;
    public long o;
    public int p;

    public aws() {
        this.p = 0;
    }

    static {
        a = new aws();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.b == null ? 0 : this.b.hashCode()) + 31) * 31;
        if (this.d != null) {
            i = this.d.hashCode();
        }
        return hashCode + i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        aws aws = (aws) obj;
        if (!buf.a(this.b, aws.b)) {
            return false;
        }
        if (!TextUtils.equals(this.d, aws.d)) {
            return false;
        }
        if (!TextUtils.equals(this.e, aws.e)) {
            return false;
        }
        if (this.f != aws.f) {
            return false;
        }
        if (!TextUtils.equals(this.g, aws.g)) {
            return false;
        }
        if (!TextUtils.equals(this.h, aws.h)) {
            return false;
        }
        if (!TextUtils.equals(this.i, aws.i)) {
            return false;
        }
        if (!TextUtils.equals(this.j, aws.j)) {
            return false;
        }
        if (this.k != aws.k) {
            return false;
        }
        if (!buf.a(this.l, aws.l)) {
            return false;
        }
        if (!TextUtils.equals(this.n, aws.n)) {
            return false;
        }
        if (this.o != aws.o) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String str = this.d;
        String str2 = this.e;
        int i = this.f;
        String str3 = this.g;
        String str4 = this.h;
        String str5 = this.i;
        String str6 = this.j;
        long j = this.k;
        String valueOf2 = String.valueOf(this.l);
        String str7 = this.n;
        return new StringBuilder(((((((((String.valueOf(valueOf).length() + 217) + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(str5).length()) + String.valueOf(str6).length()) + String.valueOf(valueOf2).length()) + String.valueOf(str7).length()).append("ContactInfo{lookupUri=").append(valueOf).append(", name='").append(str).append("', nameAlternative='").append(str2).append("', type=").append(i).append(", label='").append(str3).append("', number='").append(str4).append("', formattedNumber='").append(str5).append("', normalizedNumber='").append(str6).append("', photoId=").append(j).append(", photoUri=").append(valueOf2).append(", objectId='").append(str7).append("', userType=").append(this.o).append("}").toString();
    }
}
