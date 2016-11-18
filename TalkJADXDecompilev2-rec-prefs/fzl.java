package p000;

final class fzl {
    long f14469a;
    long f14470b;
    int f14471c;
    int f14472d;
    int f14473e;
    int f14474f;
    int f14475g;
    int f14476h;
    long f14477i;

    public fzl() {
        m16699a();
    }

    public void m16699a() {
        this.f14469a = 0;
        this.f14470b = 0;
        this.f14471c = 0;
        this.f14472d = 0;
        this.f14473e = 0;
        this.f14474f = 0;
        this.f14475g = 0;
        this.f14476h = 0;
        this.f14477i = Long.MAX_VALUE;
    }

    public void m16700a(long j) {
        if (j < this.f14477i) {
            this.f14477i = j;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sync batch stats: ");
        stringBuilder.append("duration = ").append(this.f14469a).append(", ");
        stringBuilder.append("txnlen = ").append(this.f14470b).append(", ");
        stringBuilder.append("count = ").append(this.f14472d).append("/").append(this.f14471c).append(", ");
        stringBuilder.append("added = ").append(this.f14474f).append("/").append(this.f14473e).append(", ");
        stringBuilder.append("deleted = ").append(this.f14476h).append("/").append(this.f14475g).append(", ");
        stringBuilder.append("timestamp = ").append(this.f14477i / 1000).append(".");
        return stringBuilder.toString();
    }
}
