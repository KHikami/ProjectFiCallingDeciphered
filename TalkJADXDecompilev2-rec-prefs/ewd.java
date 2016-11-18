package p000;

public final class ewd implements far {
    public evz mo1959a(byte[] bArr) {
        nzf nzf = (lnp) nzf.m1027a(new lnp(), bArr);
        if (ewc.m14705a(nzf)) {
            nzf.responseHeader.f26515a = Integer.valueOf(1);
            nzf.f25798b = new lqg();
            long a = glj.m17956a() * 1000;
            nzf.f25798b.f26108c = Long.valueOf(a);
            nzf.f25798b.f26120o = Long.valueOf(a + 86400000000L);
            return new ewc(nzf);
        } else if (evz.m8120a(nzf.responseHeader)) {
            return new ewv(nzf, nzf.responseHeader);
        } else {
            return new ewc(nzf);
        }
    }
}
