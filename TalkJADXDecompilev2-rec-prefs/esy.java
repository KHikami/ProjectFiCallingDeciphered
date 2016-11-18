package p000;

public class esy extends esx {
    private static final long serialVersionUID = 1;
    private final String f12217c;
    private final String f12218d;
    private final String f12219e;

    public esy(String str, String str2, String str3) {
        this.f12217c = str;
        this.f12218d = str2;
        this.f12219e = str3;
    }

    public nzf mo1944a(String str, int i, int i2) {
        nzf oid = new oid();
        oid.d = new oif();
        oid.d.a = this.f12217c;
        oid.d.b = this.f12218d;
        String str2 = this.f12217c;
        String str3 = this.f12218d;
        oid.a = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(str3).length()).append(str2).append(":").append(str3).toString();
        oid.b = new ohu();
        oid.b.a = this.f12219e;
        return oid;
    }

    public boolean mo1950k() {
        return true;
    }

    public String mo1947g() {
        return "handoffnumbers/add";
    }
}
