package defpackage;

/* renamed from: drp */
public final class drp extends drl {
    private final int c;
    private final String d;
    private final String e;

    public drp(String str, String str2, int i) {
        this.d = str;
        this.e = str2;
        this.c = i;
    }

    public ead a() {
        return new drn(this);
    }

    public String toString() {
        int i = this.c;
        String str = this.e;
        String str2 = this.d;
        String str3 = this.a;
        String str4 = this.b;
        return new StringBuilder((((String.valueOf(str).length() + 138) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()).append("set group link sharing status request: groupLinkSharingStatus=").append(i).append("conversationId=").append(str).append("clientGeneratedId=").append(str2).append("\nCreation stack:\n").append(str3).append("\nOrigin stack:\n").append(str4).toString();
    }

    public int c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }
}
