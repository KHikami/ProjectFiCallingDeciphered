package io.grpc.internal;

import cyx;
import day;
import i;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
public class ay {
    private static final Logger f;
    public final long a;
    public Map b;
    public boolean c;
    public Throwable d;
    public long e;
    private final cyx g;

    static {
        f = Logger.getLogger(ay.class.getName());
    }

    public ay(long j, cyx cyx) {
        this.b = day.a();
        this.a = j;
        this.g = cyx;
    }

    public final boolean a() {
        synchronized (this) {
            if (this.c) {
                return false;
            }
            this.c = true;
            long a = this.g.a(TimeUnit.NANOSECONDS);
            this.e = a;
            Map map = this.b;
            this.b = null;
            for (Entry entry : map.entrySet()) {
                a((Executor) entry.getValue(), a((i) entry.getKey(), a));
            }
            return true;
        }
    }

    public static void a(i iVar, Executor executor, Throwable th) {
        a(executor, a(iVar, th));
    }

    public static void a(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            f.log(Level.SEVERE, "Failed to execute PingCallback", th);
        }
    }

    public static Runnable a(i iVar, long j) {
        return new az(iVar, j);
    }

    public static Runnable a(i iVar, Throwable th) {
        return new ba(iVar, th);
    }
}
