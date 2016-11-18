package p000;

final class dop implements Comparable<dop> {
    private static long f10251c = 0;
    public final long f10252a;
    public final dof f10253b;

    public /* synthetic */ int compareTo(Object obj) {
        return m12376a((dop) obj);
    }

    public dop(dof dof) {
        iil.m21867a();
        long j = f10251c;
        f10251c = 1 + j;
        this.f10252a = j;
        this.f10253b = dof;
    }

    public int m12376a(dop dop) {
        int compareTo = Integer.valueOf(this.f10253b.f10219a).compareTo(Integer.valueOf(dop.f10253b.f10219a));
        return compareTo != 0 ? compareTo : Long.valueOf(this.f10252a).compareTo(Long.valueOf(dop.f10252a));
    }
}
