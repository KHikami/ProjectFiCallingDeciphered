package defpackage;

/* renamed from: fwc */
final class fwc implements jwn {
    final /* synthetic */ fvy a;

    fwc(fvy fvy) {
        this.a = fvy;
    }

    public boolean a() {
        try {
            this.a.getActivity().startActivity(gwb.G());
        } catch (Throwable e) {
            glk.d("Babel", "Could not set wireless alert prefs", e);
        }
        return true;
    }
}
