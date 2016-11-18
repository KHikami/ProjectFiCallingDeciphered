package p000;

import java.util.concurrent.ExecutionException;

final class mta implements Runnable {
    final /* synthetic */ mti f28276a;
    final /* synthetic */ msx f28277b;

    mta(mti mti, msx msx) {
        this.f28276a = mti;
        this.f28277b = msx;
    }

    public void run() {
        try {
            this.f28277b.mo1299a(msy.m32872b(this.f28276a));
        } catch (ExecutionException e) {
            this.f28277b.mo1300a(e.getCause());
        } catch (Throwable e2) {
            this.f28277b.mo1300a(e2);
        } catch (Throwable e22) {
            this.f28277b.mo1300a(e22);
        }
    }
}
