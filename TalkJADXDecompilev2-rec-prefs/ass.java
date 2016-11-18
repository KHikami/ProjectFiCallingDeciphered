package p000;

enum ass extends asq {
    ass(String str, int i) {
        super(str, 2);
    }

    protected void mo376a(Throwable th) {
        super.mo376a(th);
        if (th != null) {
            throw new RuntimeException("Request threw uncaught throwable", th);
        }
    }
}
