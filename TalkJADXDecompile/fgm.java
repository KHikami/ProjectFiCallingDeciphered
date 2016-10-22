public class fgm implements fok {
    private final String a;
    private final String b;
    private int c;
    private final String d;
    private String e;

    public fgm(String str, String str2) {
        this.c = 0;
        this.d = glk.a(new Throwable());
        this.a = str;
        this.b = str2;
    }

    public int L_() {
        return this.c;
    }

    public void b(int i) {
        this.c = i;
    }

    public ead a() {
        return new fgl(this);
    }

    public void d_(String str) {
        this.e = str;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.d;
        String str4 = this.e;
        return new StringBuilder((((String.valueOf(str).length() + 67) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()).append("GetPhotoRequest ownerId: ").append(str).append("\nphotoId:\n").append(str2).append("\nCreation stack:\n").append(str3).append("\nOrigin stack:\n").append(str4).toString();
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    public boolean a(int i) {
        return false;
    }
}
