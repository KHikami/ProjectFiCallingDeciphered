package com.google.android.libraries.componentview.core;

import com.google.android.libraries.componentview.api.external.Readyable.ReadyInfo;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import mti;
import mtt;

public class Utils {
    private static float a;

    final class 1 implements Runnable {
        final /* synthetic */ List a;
        final /* synthetic */ mtt b;
        private final AtomicInteger c;

        public void run() {
            if (this.c.decrementAndGet() == 0) {
                long j = 0;
                int i = 0;
                while (i < this.a.size()) {
                    try {
                        j = Math.max(j, ((ReadyInfo) ((mti) this.a.get(i)).get()).a);
                        i++;
                    } catch (Exception e) {
                        this.b.b(new ReadyInfo());
                        return;
                    }
                }
                this.b.b(new ReadyInfo(j));
            }
        }
    }

    final class 2 implements Runnable {
        final /* synthetic */ mtt a;
        final /* synthetic */ mti b;

        public void run() {
            try {
                this.a.b((ReadyInfo) this.b.get());
            } catch (Exception e) {
                this.a.b(new ReadyInfo());
            }
        }
    }

    static {
        a = -1.0f;
    }
}
