package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: hfm */
public class hfm {
    static final ExecutorService a;

    static {
        a = Executors.newFixedThreadPool(2, new hhd("GAC_Executor"));
    }
}
