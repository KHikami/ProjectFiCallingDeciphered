package p000;

import android.text.TextUtils;

public final class huw implements hwr {
    private final String f17346b;
    private final String f17347c;
    private String f17348d;

    public huw(String str, String str2) {
        this.f17346b = str;
        this.f17347c = str2;
    }

    private String m20905c() {
        if (this.f17348d == null) {
            String str;
            String str2 = this.f17347c;
            if (TextUtils.isEmpty(str2)) {
                str = "";
            } else {
                StringBuilder a = hvx.m21118a();
                for (int i = 0; i < str2.length(); i++) {
                    char charAt = str2.charAt(i);
                    if (Character.digit(charAt, 10) != -1 || charAt == '+' || charAt == ',' || charAt == ';' || (('a' <= charAt && charAt <= 'z') || ('A' <= charAt && charAt <= 'Z'))) {
                        a.append(charAt);
                    }
                }
                str = a.toString();
            }
            this.f17348d = str;
        }
        return this.f17348d;
    }

    public String mo2954a() {
        return this.f17346b;
    }

    public String mo2955b() {
        return this.f17347c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof huw)) {
            return false;
        }
        return gwb.m2186e(m20905c(), ((huw) obj).m20905c());
    }

    public String toString() {
        String str = this.f17347c != null ? this.f17347c : "null";
        String str2 = this.f17346b != null ? this.f17346b : "null";
        return new StringBuilder((String.valueOf(str).length() + 26) + String.valueOf(str2).length()).append("PhoneNumber:[Value=").append(str).append(" Type=").append(str2).append("]").toString();
    }
}
