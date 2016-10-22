final class dop implements Comparable<dop> {
    private static long c;
    public final long a;
    public final dof b;

    public /* synthetic */ int compareTo(Object obj) {
        return a((dop) obj);
    }

    static {
        c = 0;
    }

    public dop(dof dof) {
        iil.a();
        long j = c;
        c = 1 + j;
        this.a = j;
        this.b = dof;
    }

    public int a(dop dop) {
        int compareTo = Integer.valueOf(this.b.a).compareTo(Integer.valueOf(dop.b.a));
        return compareTo != 0 ? compareTo : Long.valueOf(this.a).compareTo(Long.valueOf(dop.a));
    }
}
