package p000;

final class aki implements ajx {
    final /* synthetic */ ajr f1122a;
    private StringBuilder f1123b;
    private boolean f1124c;

    aki(ajr ajr) {
        this.f1122a = ajr;
    }

    public void mo232a() {
        this.f1123b = new StringBuilder();
        this.f1123b.append("[[hash: " + this.f1122a.hashCode() + "\n");
    }

    public void mo233a(ajy ajy) {
        this.f1123b.append(String.valueOf(ajy.toString()).concat(": "));
        this.f1124c = true;
    }

    public boolean mo234a(ajw ajw) {
        if (!this.f1124c) {
            this.f1123b.append(", ");
            this.f1124c = false;
        }
        this.f1123b.append("[").append(ajw.toString()).append("]");
        return true;
    }

    public void mo236c() {
        this.f1123b.append("\n");
    }

    public void mo235b() {
        this.f1123b.append("]]\n");
    }

    public String toString() {
        return this.f1123b.toString();
    }
}
