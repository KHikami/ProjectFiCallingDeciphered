final class aki implements ajx {
    final /* synthetic */ ajr a;
    private StringBuilder b;
    private boolean c;

    aki(ajr ajr) {
        this.a = ajr;
    }

    public void a() {
        this.b = new StringBuilder();
        this.b.append("[[hash: " + this.a.hashCode() + "\n");
    }

    public void a(ajy ajy) {
        this.b.append(String.valueOf(ajy.toString()).concat(": "));
        this.c = true;
    }

    public boolean a(ajw ajw) {
        if (!this.c) {
            this.b.append(", ");
            this.c = false;
        }
        this.b.append("[").append(ajw.toString()).append("]");
        return true;
    }

    public void c() {
        this.b.append("\n");
    }

    public void b() {
        this.b.append("]]\n");
    }

    public String toString() {
        return this.b.toString();
    }
}
