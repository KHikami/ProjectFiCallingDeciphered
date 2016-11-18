package p000;

public final class drt extends drl {
    private final String f10410c;

    public drt(String str) {
        this.f10410c = str;
    }

    public String m12574c() {
        return this.f10410c;
    }

    public ead mo1021a() {
        return new drr(this);
    }

    public String toString() {
        String str = this.f10410c;
        String str2 = this.a;
        String str3 = this.b;
        return new StringBuilder(((String.valueOf(str).length() + 84) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append("open conversation from URL request: conversationUrl=").append(str).append("\nCreation stack:\n").append(str2).append("\nOrigin stack:\n").append(str3).toString();
    }
}
