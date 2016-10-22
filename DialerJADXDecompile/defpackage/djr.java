package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: djr */
public class djr implements Closeable {
    final dlw a;
    final dka b;
    final djx c;

    public boolean a(djs djs) {
        try {
            this.a.a(9);
            int a = djz.a(this.a);
            if (a < 0 || a > 16384) {
                throw djz.b("FRAME_SIZE_ERROR: %s", Integer.valueOf(a));
            }
            byte c = (byte) this.a.c();
            byte c2 = (byte) this.a.c();
            int e = this.a.e() & Integer.MAX_VALUE;
            if (djz.a.isLoggable(Level.FINE)) {
                djz.a.fine(dkb.a(true, e, a, c, c2));
            }
            switch (c) {
                case rl.c /*0*/:
                    b(djs, a, c2, e);
                    return true;
                case rq.b /*1*/:
                    a(djs, a, c2, e);
                    return true;
                case rq.c /*2*/:
                    a(djs, a, e);
                    return true;
                case rl.e /*3*/:
                    b(djs, a, e);
                    return true;
                case rl.f /*4*/:
                    c(djs, a, c2, e);
                    return true;
                case rl.g /*5*/:
                    d(djs, a, c2, e);
                    return true;
                case rl.i /*6*/:
                    e(djs, a, c2, e);
                    return true;
                case rl.h /*7*/:
                    c(djs, a, e);
                    return true;
                case rl.j /*8*/:
                    d(djs, a, e);
                    return true;
                default:
                    this.a.d((long) a);
                    return true;
            }
        } catch (IOException e2) {
            return false;
        }
    }

    djr(dlw dlw, int i, boolean z) {
        this.a = dlw;
        this.b = new dka(this.a);
        this.c = new djx(4096, this.b);
    }

    void a(djs djs, int i, byte b, int i2) {
        short s = (short) 0;
        if (i2 == 0) {
            throw djz.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }
        boolean z = (b & 1) != 0;
        if ((b & 8) != 0) {
            s = (short) (this.a.c() & 255);
        }
        if ((b & 32) != 0) {
            a(djs, i2);
            i -= 5;
        }
        List a = a(djz.a(i, b, s), s, b, i2);
        int i3 = djv.a;
        djs.a(z, i2, a);
    }

    List a(int i, short s, byte b, int i2) {
        dka dka = this.b;
        this.b.d = i;
        dka.a = i;
        this.b.e = s;
        this.b.b = b;
        this.b.c = i2;
        djx djx = this.c;
        while (!djx.b.b()) {
            int c = djx.b.c() & 255;
            if (c == 128) {
                throw new IOException("index == 0");
            } else if ((c & 128) == 128) {
                c = djx.a(c, 127) - 1;
                if (djx.c(c)) {
                    djx.a.add(djw.a[c]);
                } else {
                    int a = djx.a(c - djw.a.length);
                    if (a < 0 || a > djx.e.length - 1) {
                        throw new IOException("Header index too large " + (c + 1));
                    }
                    djx.a.add(djx.e[a]);
                }
            } else if (c == 64) {
                djx.a(-1, new dju(djw.a(djx.b()), djx.b()));
            } else if ((c & 64) == 64) {
                djx.a(-1, new dju(djx.b(djx.a(c, 63) - 1), djx.b()));
            } else if ((c & 32) == 32) {
                djx.d = djx.a(c, 31);
                if (djx.d < 0 || djx.d > djx.c) {
                    throw new IOException("Invalid dynamic table size update " + djx.d);
                }
                djx.a();
            } else if (c == 16 || c == 0) {
                djx.a.add(new dju(djw.a(djx.b()), djx.b()));
            } else {
                djx.a.add(new dju(djx.b(djx.a(c, 15) - 1), djx.b()));
            }
        }
        djx = this.c;
        List arrayList = new ArrayList(djx.a);
        djx.a.clear();
        return arrayList;
    }

    void b(djs djs, int i, byte b, int i2) {
        boolean z;
        short s = (short) 1;
        short s2 = (short) 0;
        if ((b & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((b & 32) == 0) {
            s = (short) 0;
        }
        if (s != (short) 0) {
            throw djz.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        if ((b & 8) != 0) {
            s2 = (short) (this.a.c() & 255);
        }
        djs.a(z, i2, this.a, djz.a(i, b, s2));
        this.a.d((long) s2);
    }

    void a(djs djs, int i, int i2) {
        if (i != 5) {
            throw djz.b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
        } else if (i2 == 0) {
            throw djz.b("TYPE_PRIORITY streamId == 0", new Object[0]);
        } else {
            a(djs, i2);
        }
    }

    void a(djs djs, int i) {
        this.a.e();
        this.a.c();
    }

    void b(djs djs, int i, int i2) {
        if (i != 4) {
            throw djz.b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
        } else if (i2 == 0) {
            throw djz.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
        } else {
            djq a = djq.a(this.a.e());
            if (a == null) {
                throw djz.b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(r0));
            } else {
                djs.a(i2, a);
            }
        }
    }

    void c(djs djs, int i, byte b, int i2) {
        if (i2 != 0) {
            throw djz.b("TYPE_SETTINGS streamId != 0", new Object[0]);
        } else if ((b & 1) != 0) {
            if (i != 0) {
                throw djz.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
        } else if (i % 6 != 0) {
            throw djz.b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
        } else {
            int i3;
            dkf dkf = new dkf();
            for (i3 = 0; i3 < i; i3 += 6) {
                int d = this.a.d();
                int e = this.a.e();
                switch (d) {
                    case rq.b /*1*/:
                    case rl.i /*6*/:
                        break;
                    case rq.c /*2*/:
                        if (!(e == 0 || e == 1)) {
                            throw djz.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        }
                    case rl.e /*3*/:
                        d = 4;
                        break;
                    case rl.f /*4*/:
                        d = 7;
                        if (e < 0) {
                            throw djz.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                        break;
                    case rl.g /*5*/:
                        if (e < 16384 || e > 16777215) {
                            throw djz.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(e));
                        }
                    default:
                        throw djz.b("PROTOCOL_ERROR invalid settings id: %s", Short.valueOf(d));
                }
                if (d < dkf.d.length) {
                    int i4 = 1 << d;
                    dkf.a |= i4;
                    dkf.b &= i4 ^ -1;
                    dkf.c = (i4 ^ -1) & dkf.c;
                    dkf.d[d] = e;
                }
            }
            djs.a(dkf);
            if (dkf.a() >= 0) {
                djx djx = this.c;
                i3 = dkf.a();
                djx.c = i3;
                djx.d = i3;
                djx.a();
            }
        }
    }

    void d(djs djs, int i, byte b, int i2) {
        short s = (short) 0;
        if (i2 == 0) {
            throw djz.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        if ((b & 8) != 0) {
            s = (short) (this.a.c() & 255);
        }
        this.a.e();
        a(djz.a(i - 4, b, s), s, b, i2);
        djs.a(i2);
    }

    void e(djs djs, int i, byte b, int i2) {
        boolean z = true;
        if (i != 8) {
            throw djz.b("TYPE_PING length != 8: %s", Integer.valueOf(i));
        } else if (i2 != 0) {
            throw djz.b("TYPE_PING streamId != 0", new Object[0]);
        } else {
            int e = this.a.e();
            int e2 = this.a.e();
            if ((b & 1) == 0) {
                z = false;
            }
            djs.a(z, e, e2);
        }
    }

    void c(djs djs, int i, int i2) {
        if (i < 8) {
            throw djz.b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
        } else if (i2 != 0) {
            throw djz.b("TYPE_GOAWAY streamId != 0", new Object[0]);
        } else {
            int e = this.a.e();
            int i3 = i - 8;
            djq a = djq.a(this.a.e());
            if (a == null) {
                throw djz.b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(r0));
            }
            dlx dlx = dlx.a;
            if (i3 > 0) {
                dlx = this.a.b((long) i3);
            }
            djs.a(e, a, dlx);
        }
    }

    void d(djs djs, int i, int i2) {
        if (i != 4) {
            throw djz.b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        }
        long e = ((long) this.a.e()) & 2147483647L;
        if (e == 0) {
            throw djz.b("windowSizeIncrement was 0", Long.valueOf(e));
        } else {
            djs.a(i2, e);
        }
    }

    public void close() {
        this.a.close();
    }
}
