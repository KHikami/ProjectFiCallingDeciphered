package p000;

public class fgm implements fok {
    private final String f5723a;
    private final String f5724b;
    private int f5725c = 0;
    private final String f5726d = glk.m17967a(new Throwable());
    private String f5727e;

    public fgm(String str, String str2) {
        this.f5723a = str;
        this.f5724b = str2;
    }

    public int L_() {
        return this.f5725c;
    }

    public void mo1023b(int i) {
        this.f5725c = i;
    }

    public ead mo1021a() {
        return new fgl(this);
    }

    public void d_(String str) {
        this.f5727e = str;
    }

    public String toString() {
        String str = this.f5723a;
        String str2 = this.f5724b;
        String str3 = this.f5726d;
        String str4 = this.f5727e;
        return new StringBuilder((((String.valueOf(str).length() + 67) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()).append("GetPhotoRequest ownerId: ").append(str).append("\nphotoId:\n").append(str2).append("\nCreation stack:\n").append(str3).append("\nOrigin stack:\n").append(str4).toString();
    }

    public String m8024c() {
        return this.f5723a;
    }

    public String m8025d() {
        return this.f5724b;
    }

    public boolean mo1022a(int i) {
        return false;
    }
}
