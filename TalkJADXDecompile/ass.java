enum ass extends asq {
    ass(String str, int i) {
        super(2, (byte) 0);
    }

    protected void a(Throwable th) {
        super.a(th);
        if (th != null) {
            throw new RuntimeException("Request threw uncaught throwable", th);
        }
    }
}
