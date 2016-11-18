package defpackage;

import android.text.TextUtils;

public final class huw implements hwr {
    private final String b;
    private final String c;
    private String d;

    public huw(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    private String c() {
        if (this.d == null) {
            String str;
            String str2 = this.c;
            if (TextUtils.isEmpty(str2)) {
                str = "";
            } else {
                StringBuilder a = hvx.a();
                for (int i = 0; i < str2.length(); i++) {
                    char charAt = str2.charAt(i);
                    if (Character.digit(charAt, 10) != -1 || charAt == '+' || charAt == ',' || charAt == ';' || (('a' <= charAt && charAt <= 'z') || ('A' <= charAt && charAt <= 'Z'))) {
                        a.append(charAt);
                    }
                }
                str = a.toString();
            }
            this.d = str;
        }
        return this.d;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof huw)) {
            return false;
        }
        return gwb.e(c(), ((huw) obj).c());
    }

    public String toString() {
        String str = this.c != null ? this.c : "null";
        String str2 = this.b != null ? this.b : "null";
        return new StringBuilder((String.valueOf(str).length() + 26) + String.valueOf(str2).length()).append("PhoneNumber:[Value=").append(str).append(" Type=").append(str2).append("]").toString();
    }
}
