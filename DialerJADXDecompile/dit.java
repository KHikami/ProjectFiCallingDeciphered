import io.grpc.internal.a;
import io.grpc.internal.au;
import io.grpc.internal.aw;
import io.grpc.internal.ay;
import io.grpc.internal.bt;
import io.grpc.internal.f;
import java.util.List;
import java.util.logging.Level;

/* compiled from: PG */
final class dit implements djs, Runnable {
    private djr a;
    private boolean b;
    private /* synthetic */ diq c;

    dit(diq diq, djr djr) {
        this.c = diq;
        this.b = true;
        this.a = djr;
    }

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName("OkHttpClientTransport");
        while (true) {
            try {
                if (!this.a.a(this)) {
                    break;
                }
            } catch (Throwable e) {
                this.c.a(0, djq.PROTOCOL_ERROR, dhn.j.b(e));
            } finally {
                try {
                    this.a.close();
                } catch (Throwable e2) {
                    diq.a.log(Level.INFO, "Exception closing frame reader", e2);
                }
                this.c.d.a();
                Thread.currentThread().setName(name);
            }
        }
        this.c.a(0, djq.INTERNAL_ERROR, dhn.j.a("End of stream or IOException"));
    }

    public final void a(boolean z, int i, dlw dlw, int i2) {
        dio b = this.c.b(i);
        if (b != null) {
            dlw.a((long) i2);
            dlu dlu = new dlu();
            dlu.a_(dlw.a(), (long) i2);
            synchronized (this.c.g) {
                b.a(dlu, z);
            }
        } else if (this.c.a(i)) {
            this.c.e.a(i, djq.INVALID_STREAM);
            dlw.d((long) i2);
        } else {
            this.c.a(djq.PROTOCOL_ERROR, "Received data for unknown stream: " + i);
            return;
        }
        this.c.j += i2;
        if (this.c.j >= 32767) {
            this.c.e.a(0, (long) this.c.j);
            this.c.j = 0;
        }
    }

    public final void a(boolean z, int i, List list) {
        boolean z2;
        boolean z3 = true;
        synchronized (this.c.g) {
            dio dio = (dio) this.c.h.get(Integer.valueOf(i));
            if (dio == null) {
                if (this.c.a(i)) {
                    this.c.e.a(i, djq.INVALID_STREAM);
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else if (z) {
                Object c = buf.c(list);
                cob.i(c);
                if (dio.m != null) {
                    dio.m = dio.m.b(c.toString());
                } else {
                    dio.m = dio.b(c);
                    dio.n = c;
                }
                if (dio.m != null) {
                    dio.a(dio.m, dio.n);
                    dio.b(dhn.c);
                    z2 = false;
                } else {
                    dhn a;
                    r1 = (dhn) c.a(dhn.k);
                    if (r1 == null) {
                        r1 = aw.a(c);
                        if (r1 == null || r1.a()) {
                            a = dhn.d.a("missing GRPC status in response");
                        } else {
                            a = r1.a("missing GRPC status, inferred error from HTTP status code");
                        }
                    } else {
                        a = r1;
                    }
                    String str = (String) c.a(dhn.l);
                    if (str != null) {
                        r1 = a.b(str);
                    } else {
                        r1 = a;
                    }
                    aw.d(c);
                    cob.b(c, (Object) "trailers");
                    if (dio.g == f.STATUS) {
                        a.a.log(Level.INFO, "Received trailers on closed stream {0}\n {1}\n {2}", new Object[]{dio.g(), r1, c});
                    }
                    dio.c = r1;
                    dio.d = c;
                    dio.a(bt.a, true);
                    z2 = false;
                }
            } else {
                dgr b = buf.b(list);
                cob.i((Object) b);
                if (dio.m != null) {
                    dio.m = dio.m.b(b.toString());
                    z2 = false;
                } else {
                    dhn a2 = aw.a(b);
                    if (a2 == null) {
                        dio.m = dhn.i.a("received non-terminal headers with no :status");
                    } else if (a2.a()) {
                        dio.m = dio.b(b);
                    } else {
                        dio.m = a2;
                    }
                    if (dio.m != null) {
                        r1 = dio.m;
                        String valueOf = String.valueOf(b);
                        dio.m = r1.b(new StringBuilder(String.valueOf(valueOf).length() + 1).append("\n").append(valueOf).toString());
                        dio.n = b;
                        dio.o = aw.c(b);
                        z2 = false;
                    } else {
                        aw.d(b);
                        if (dio.b == null) {
                            z3 = false;
                        }
                        cob.b(z3, (Object) "stream not started");
                        if (dio.g == f.STATUS) {
                            a.a.log(Level.INFO, "Received headers on closed stream {0} {1}", new Object[]{dio.g(), b});
                        }
                        dio.a(f.MESSAGE);
                        dio.b.a(b);
                        z2 = false;
                    }
                }
            }
        }
        if (z2) {
            this.c.a(djq.PROTOCOL_ERROR, "Received header for unknown stream: " + i);
        }
    }

    public final void a(int i, djq djq) {
        this.c.a(i, diq.a(djq).b("Rst Stream"), null);
    }

    public final void a(dkf dkf) {
        synchronized (this.c.g) {
            if (buf.a(dkf, 4)) {
                this.c.p = buf.b(dkf, 4);
            }
            if (buf.a(dkf, 7)) {
                int b = buf.b(dkf, 7);
                diz diz = this.c.f;
                if (b < 0) {
                    throw new IllegalArgumentException("Invalid initial window size: " + b);
                }
                int i = b - diz.c;
                diz.c = b;
                for (dio dio : diz.a.d()) {
                    dja dja = (dja) dio.r;
                    if (dja == null) {
                        dio.r = new dja(diz, dio);
                    } else {
                        dja.a(i);
                    }
                }
                if (i > 0) {
                    diz.b();
                }
            }
            if (this.b) {
                this.c.d.b();
                this.b = false;
            }
            this.c.c();
        }
        this.c.e.a(dkf);
    }

    public final void a(boolean z, int i, int i2) {
        ay ayVar = null;
        if (z) {
            long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
            synchronized (this.c.g) {
                if (this.c.m == null) {
                    diq.a.warning("Received unexpected ping ack. No ping outstanding");
                } else if (this.c.m.a == j) {
                    ayVar = this.c.m;
                    this.c.m = null;
                } else {
                    diq.a.log(Level.WARNING, String.format("Received unexpected ping ack. Expecting %d, got %d", new Object[]{Long.valueOf(this.c.m.a), Long.valueOf(j)}));
                }
            }
            if (ayVar != null) {
                ayVar.a();
                return;
            }
            return;
        }
        this.c.e.a(true, i, i2);
    }

    public final void a(int i, djq djq, dlx dlx) {
        dhn b = au.a((long) djq.n).b("Received Goaway");
        if (dlx != null && dlx.b.length > 0) {
            b = b.b(dlx.a());
        }
        this.c.a(i, null, b);
    }

    public final void a(int i) {
        this.c.e.a(i, djq.PROTOCOL_ERROR);
    }

    public final void a(int i, long j) {
        if (j == 0) {
            String str = "Received 0 flow control window increment.";
            if (i == 0) {
                this.c.a(djq.PROTOCOL_ERROR, str);
                return;
            } else {
                this.c.a(i, dhn.i.a(str), djq.PROTOCOL_ERROR);
                return;
            }
        }
        synchronized (this.c.g) {
            if (i == 0) {
                this.c.f.a(null, (int) j);
                return;
            }
            Object obj;
            dio dio = (dio) this.c.h.get(Integer.valueOf(i));
            if (dio != null) {
                this.c.f.a(dio, (int) j);
                obj = null;
            } else {
                obj = !this.c.a(i) ? 1 : null;
            }
            if (obj != null) {
                this.c.a(djq.PROTOCOL_ERROR, "Received window_update for unknown stream: " + i);
                return;
            }
            return;
        }
    }
}
