package p000;

final class fwc implements jwn {
    final /* synthetic */ fvy f14137a;

    fwc(fvy fvy) {
        this.f14137a = fvy;
    }

    public boolean mo516a() {
        try {
            this.f14137a.getActivity().startActivity(gwb.m1395G());
        } catch (Throwable e) {
            glk.m17980d("Babel", "Could not set wireless alert prefs", e);
        }
        return true;
    }
}
