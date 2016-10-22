package defpackage;

/* renamed from: dzt */
final class dzt implements msx<dzz> {
    final /* synthetic */ dzs a;

    dzt(dzs dzs) {
        this.a = dzs;
    }

    private void a(dzz dzz) {
        this.a.a(dzz);
    }

    public void a(Throwable th) {
        dzs dzs = this.a;
        String valueOf = String.valueOf(th);
        glk.e("Babel_FutureNQ", new StringBuilder(String.valueOf(valueOf).length() + 30).append("onFailure in preProcessFuture ").append(valueOf).toString(), new Object[0]);
        dzs.d = null;
        dzs.e.d();
        dzs.d();
    }
}
