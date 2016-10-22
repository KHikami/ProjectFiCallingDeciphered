/* compiled from: PG */
public final class bjt implements bel {
    String a;
    String b;
    String c;
    int d;
    String e;
    String f;
    String g;
    boolean h;
    String i;
    int j;

    public bjt(String str, String str2, String str3, int i, String str4, String str5, String str6, boolean z, String str7) {
        this.j = 1;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = z;
        this.i = str7;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.f;
        String str3 = this.b;
        return new StringBuilder(((String.valueOf(str).length() + 72) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append("PhoneNumberInfoImpl{mDisplayName='").append(str).append("', mImageUrl='").append(str2).append("', mNormalizedNumber='").append(str3).append("'}").toString();
    }

    public final String a() {
        return this.a;
    }

    public final int c() {
        return this.d;
    }

    public final String d() {
        return this.e;
    }

    public final String b() {
        return this.c;
    }

    public final String e() {
        return this.f;
    }

    public final String f() {
        return this.g;
    }

    public final boolean g() {
        return this.h;
    }

    public final int h() {
        return this.j;
    }
}
