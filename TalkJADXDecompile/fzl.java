final class fzl {
    long a;
    long b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    long i;

    public fzl() {
        a();
    }

    public void a() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = Long.MAX_VALUE;
    }

    public void a(long j) {
        if (j < this.i) {
            this.i = j;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sync batch stats: ");
        stringBuilder.append("duration = ").append(this.a).append(", ");
        stringBuilder.append("txnlen = ").append(this.b).append(", ");
        stringBuilder.append("count = ").append(this.d).append("/").append(this.c).append(", ");
        stringBuilder.append("added = ").append(this.f).append("/").append(this.e).append(", ");
        stringBuilder.append("deleted = ").append(this.h).append("/").append(this.g).append(", ");
        stringBuilder.append("timestamp = ").append(this.i / 1000).append(".");
        return stringBuilder.toString();
    }
}
