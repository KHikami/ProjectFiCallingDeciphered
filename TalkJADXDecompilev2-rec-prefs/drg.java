package p000;

public final class drg extends drl {
    private final String f10391c;
    private final String f10392d;

    public drg(String str, String str2) {
        this.f10391c = str;
        this.f10392d = str2;
    }

    public ead mo1021a() {
        return new dre(this);
    }

    public String m12547c() {
        return this.f10392d;
    }

    public String toString() {
        String str = this.f10392d;
        String str2 = this.f10391c;
        String str3 = this.a;
        String str4 = this.b;
        return new StringBuilder((((String.valueOf(str).length() + 95) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()).append("get conversation URL request: conversationId=").append(str).append("clientGeneratedId=").append(str2).append("\nCreation stack:\n").append(str3).append("\nOrigin stack:\n").append(str4).toString();
    }
}
