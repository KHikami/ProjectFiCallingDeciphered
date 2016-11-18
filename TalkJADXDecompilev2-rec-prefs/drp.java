package p000;

public final class drp extends drl {
    private final int f10401c;
    private final String f10402d;
    private final String f10403e;

    public drp(String str, String str2, int i) {
        this.f10402d = str;
        this.f10403e = str2;
        this.f10401c = i;
    }

    public ead mo1021a() {
        return new drn(this);
    }

    public String toString() {
        int i = this.f10401c;
        String str = this.f10403e;
        String str2 = this.f10402d;
        String str3 = this.a;
        String str4 = this.b;
        return new StringBuilder((((String.valueOf(str).length() + 138) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()).append("set group link sharing status request: groupLinkSharingStatus=").append(i).append("conversationId=").append(str).append("clientGeneratedId=").append(str2).append("\nCreation stack:\n").append(str3).append("\nOrigin stack:\n").append(str4).toString();
    }

    public int m12562c() {
        return this.f10401c;
    }

    public String m12563d() {
        return this.f10402d;
    }

    public String m12564e() {
        return this.f10403e;
    }
}
