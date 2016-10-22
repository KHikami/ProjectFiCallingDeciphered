final class isj extends itg {
    final /* synthetic */ ish a;

    isj(ish ish) {
        this.a = ish;
    }

    public void c(itl itl) {
        if (itl.a().equals(this.a.b)) {
            this.a.b(null);
        }
    }

    public void a(itl itl) {
        String str;
        if (itl.f()) {
            str = "localParticipant";
        } else {
            str = itl.a();
        }
        this.a.a = str;
        if (this.a.b == null) {
            this.a.c(this.a.a);
        }
    }
}
