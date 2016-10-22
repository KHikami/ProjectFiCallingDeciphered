public final class drt extends drl {
    private final String c;

    public drt(String str) {
        this.c = str;
    }

    public String c() {
        return this.c;
    }

    public ead a() {
        return new drr(this);
    }

    public String toString() {
        String str = this.c;
        String str2 = this.a;
        String str3 = this.b;
        return new StringBuilder(((String.valueOf(str).length() + 84) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append("open conversation from URL request: conversationUrl=").append(str).append("\nCreation stack:\n").append(str2).append("\nOrigin stack:\n").append(str3).toString();
    }
}
