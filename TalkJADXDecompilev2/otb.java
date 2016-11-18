package defpackage;

public final class otb {
    private final String a;
    private final otc b;
    private final otj c;

    public otb(String str, otj otj) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        } else if (otj == null) {
            throw new IllegalArgumentException("Body may not be null");
        } else {
            this.a = str;
            this.c = otj;
            this.b = new otc();
            a(otj);
            b(otj);
            c(otj);
        }
    }

    private String c() {
        return this.a;
    }

    public otj a() {
        return this.c;
    }

    public otc b() {
        return this.b;
    }

    private void a(String str, String str2) {
        this.b.a(new oth(str, str2));
    }

    private void a(otj otj) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("form-data; name=\"");
        stringBuilder.append(c());
        stringBuilder.append("\"");
        if (otj.e() != null) {
            stringBuilder.append("; filename=\"");
            stringBuilder.append(otj.e());
            stringBuilder.append("\"");
        }
        a("Content-Disposition", stringBuilder.toString());
    }

    private void b(otj otj) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(otj.a());
        if (otj.b() != null) {
            stringBuilder.append("; charset=");
            stringBuilder.append(otj.b());
        }
        a("Content-Type", stringBuilder.toString());
    }

    private void c(otj otj) {
        a("Content-Transfer-Encoding", otj.c());
    }
}
