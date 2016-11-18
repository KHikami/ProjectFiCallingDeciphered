package p000;

final class dzt implements msx<dzz> {
    final /* synthetic */ dzs f10957a;

    dzt(dzs dzs) {
        this.f10957a = dzs;
    }

    private void m13224a(dzz dzz) {
        this.f10957a.m13215a(dzz);
    }

    public void mo1300a(Throwable th) {
        dzs dzs = this.f10957a;
        String valueOf = String.valueOf(th);
        glk.m17982e("Babel_FutureNQ", new StringBuilder(String.valueOf(valueOf).length() + 30).append("onFailure in preProcessFuture ").append(valueOf).toString(), new Object[0]);
        dzs.f10947d = null;
        dzs.f10948e.mo1192d();
        dzs.mo1798d();
    }
}
