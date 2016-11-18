package defpackage;

import java.util.concurrent.Executor;

final class iot implements Executor {
    iot() {
    }

    public void execute(Runnable runnable) {
        gwb.a(runnable);
    }
}
