/* compiled from: PG */
final class bgl implements bfy {
    private StringBuilder a;
    private boolean b;
    private /* synthetic */ bfs c;

    bgl(bfs bfs) {
        this.c = bfs;
    }

    public final void a() {
        this.a = new StringBuilder();
        this.a.append("[[hash: " + this.c.hashCode() + "\n");
    }

    public final void a(bfz bfz) {
        this.a.append(String.valueOf(bfz.toString()).concat(": "));
        this.b = true;
    }

    public final boolean a(bfx bfx) {
        if (!this.b) {
            this.a.append(", ");
            this.b = false;
        }
        this.a.append("[").append(bfx.toString()).append("]");
        return true;
    }

    public final void c() {
        this.a.append("\n");
    }

    public final void b() {
        this.a.append("]]\n");
    }

    public final String toString() {
        return this.a.toString();
    }
}
