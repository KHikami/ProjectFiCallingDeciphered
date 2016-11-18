package p000;

public final class otb {
    private final String f34227a;
    private final otc f34228b;
    private final otj f34229c;

    public otb(String str, otj otj) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        } else if (otj == null) {
            throw new IllegalArgumentException("Body may not be null");
        } else {
            this.f34227a = str;
            this.f34229c = otj;
            this.f34228b = new otc();
            m39662a(otj);
            m39663b(otj);
            m39665c(otj);
        }
    }

    private String m39664c() {
        return this.f34227a;
    }

    public otj m39666a() {
        return this.f34229c;
    }

    public otc m39667b() {
        return this.f34228b;
    }

    private void m39661a(String str, String str2) {
        this.f34228b.m39669a(new oth(str, str2));
    }

    private void m39662a(otj otj) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("form-data; name=\"");
        stringBuilder.append(m39664c());
        stringBuilder.append("\"");
        if (otj.mo4224e() != null) {
            stringBuilder.append("; filename=\"");
            stringBuilder.append(otj.mo4224e());
            stringBuilder.append("\"");
        }
        m39661a("Content-Disposition", stringBuilder.toString());
    }

    private void m39663b(otj otj) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(otj.m39687a());
        if (otj.mo4221b() != null) {
            stringBuilder.append("; charset=");
            stringBuilder.append(otj.mo4221b());
        }
        m39661a("Content-Type", stringBuilder.toString());
    }

    private void m39665c(otj otj) {
        m39661a("Content-Transfer-Encoding", otj.mo4222c());
    }
}
