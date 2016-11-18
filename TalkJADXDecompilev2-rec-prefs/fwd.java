package p000;

final class fwd implements jwm {
    final /* synthetic */ fvy f14138a;

    fwd(fvy fvy) {
        this.f14138a = fvy;
    }

    public boolean mo1377a(jwi jwi, Object obj) {
        boolean b = gwb.m2061b((Boolean) obj);
        this.f14138a.f14126a.mo2144a("use_local_apn_pref_key", b);
        fyi.m16608a(this.f14138a.context, !b);
        this.f14138a.getActivity().finish();
        return true;
    }
}
