public final class ewd implements far {
    public evz a(byte[] bArr) {
        nzf nzf = (lnp) nzf.a(new lnp(), bArr);
        if (ewc.a(nzf)) {
            nzf.responseHeader.a = Integer.valueOf(1);
            nzf.b = new lqg();
            long a = glj.a() * 1000;
            nzf.b.c = Long.valueOf(a);
            nzf.b.o = Long.valueOf(a + 86400000000L);
            return new ewc(nzf);
        } else if (evz.a(nzf.responseHeader)) {
            return new ewv(nzf, nzf.responseHeader);
        } else {
            return new ewc(nzf);
        }
    }
}
