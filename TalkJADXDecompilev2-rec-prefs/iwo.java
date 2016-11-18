package p000;

import java.lang.Thread.UncaughtExceptionHandler;

final class iwo implements UncaughtExceptionHandler {
    final UncaughtExceptionHandler f19275a;
    final /* synthetic */ iwm f19276b;

    iwo(iwm iwm, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f19276b = iwm;
        this.f19275a = uncaughtExceptionHandler;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void uncaughtException(Thread thread, Throwable th) {
        try {
            if (this.f19276b.f19249a.m23425a()) {
                onl onl = new onl();
                onl.a = Boolean.valueOf(true);
                ook ook = new ook();
                ook.g = onl;
                ook.g.b = new oog();
                ook.g.b.a = gwb.ad(this.f19276b.f19250b);
                this.f19276b.m23378a(null, ook, null);
            }
            gwb.ac(this.f19276b.f19250b);
            if (this.f19275a != null) {
                this.f19275a.uncaughtException(thread, th);
            }
        } catch (Exception e) {
            if (this.f19275a != null) {
                this.f19275a.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            if (this.f19275a != null) {
                this.f19275a.uncaughtException(thread, th);
            }
        }
    }
}
