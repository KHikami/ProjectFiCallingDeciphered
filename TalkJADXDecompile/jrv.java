import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.api.client.http.HttpStatusCodes;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

final class jrv {
    static final long a;
    private static final Bundle c;
    private static final Set<String> d;
    private static final Pattern e;
    private static final jpz t;
    final jre b;
    private jro f;
    private String g;
    private boolean h;
    private final Context i;
    private final jvk j;
    private final String k;
    private final String l;
    private final String m;
    private final boolean n;
    private final jrk o;
    private final jpu p;
    private final jqx q;
    private final jrj r;
    private final jpz s;

    jrv(jrc jrc) {
        ba.a(jrc.b(), (Object) "must specify an accountName");
        ba.a(jrc.c(), (Object) "must specify an accountGaiaId");
        this.i = jrc.a();
        this.k = jrc.b();
        this.l = jrc.c();
        this.m = jrc.d();
        this.b = jrc.e();
        this.n = jrc.f();
        this.o = jrc.g();
        this.p = jrc.h();
        this.q = (jqx) jyn.b(this.i, jqx.class);
        this.r = (jrj) jyn.b(this.i, jrj.class);
        this.j = new jvk(this.i, this.k, "oauth2:https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.stream.read https://www.googleapis.com/auth/plus.stream.write https://www.googleapis.com/auth/plus.circles.write https://www.googleapis.com/auth/plus.circles.read https://www.googleapis.com/auth/plus.photos.readwrite https://www.googleapis.com/auth/plus.native");
        this.s = new jpw(this.i);
    }

    jqs a(jrl jrl) {
        jrr jrr = null;
        boolean z = true;
        try {
            jpz q = jrl.q();
            if (q == null) {
                q = jrl.k() ? t : this.s;
            }
            jrr = new jrs(this.i).a(jrl.a()).a(jrl.b()).b(jrl.d()).a(jrl.n()).a(jrl.o()).a(jrl.p()).a(q).a(jrl.r()).a();
            if (gwb.a(this.i, jrl.a(), q)) {
                jrr.a();
            }
            if (!TextUtils.isEmpty(jrl.c())) {
                jrr.a(jrl.c());
            }
            if (jrl.j() > 0) {
                jrr.b(jrl.j());
            }
            String e = jrr.e();
            if (d.contains(e)) {
                throw new jqi(e, false);
            }
            boolean z2;
            if (e == null || !(e.startsWith("image/") || e.startsWith("video/") || e.startsWith("audio/"))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                jrk jrk;
                String str = this.n ? "uploadmediapreferredbackground" : this.g != null ? this.g : jrl.m() ? "uploadmediabackground" : "uploadmedia";
                String a = gwb.a(this.i, "plusi", str, true, c);
                Context context = this.i;
                juy juy = this.j;
                String str2 = this.m;
                String str3 = this.l;
                if (this.q == null) {
                    jrk = this.o;
                } else {
                    jrk = this.q.a();
                }
                if (this.q == null || !this.q.b()) {
                    z = false;
                }
                jqy jqc = new jqc(context, juy, a, jrl, jrr, str2, str3, jrk, z);
                a(jqc);
                int e2 = jqc.e();
                if (a(e2)) {
                    String c = jqc.c();
                    if (c == null) {
                        throw new jqp("upload failed (initial response didn't get valid location url)");
                    }
                    jqs a2 = a(c, jrr, null, jrl.m(), 0);
                    try {
                        if (jrr.b()) {
                            new File(jrr.c().getPath()).delete();
                        }
                    } catch (Exception e3) {
                    }
                    this.h = false;
                    return a2;
                } else if (e2 == 400) {
                    throw new jqp("upload failed (bad payload, file too large) " + e2);
                } else if (e2 == HttpStatusCodes.STATUS_CODE_UNAUTHORIZED) {
                    throw new jqo(Integer.toString(HttpStatusCodes.STATUS_CODE_UNAUTHORIZED));
                } else if (e2 == HttpStatusCodes.STATUS_CODE_SERVICE_UNAVAILABLE) {
                    throw new jqn("Server throttle code 503", true);
                } else if (e2 == 0 || (e2 >= HttpStatusCodes.STATUS_CODE_SERVER_ERROR && e2 < 600)) {
                    throw new jqn("upload transient error:" + e2);
                } else {
                    throw new jqp(Integer.toString(e2));
                }
            }
            throw new jqi(e, true);
        } catch (Throwable e4) {
            throw new jqk(e4);
        } catch (Exception e5) {
            throw new jqn(e5, null);
        } catch (Throwable th) {
            if (jrr != null) {
                try {
                    if (jrr.b()) {
                        new File(jrr.c().getPath()).delete();
                    }
                } catch (Exception e6) {
                }
            }
            this.h = false;
        }
    }

    synchronized void a() {
        this.h = true;
        if (this.f != null) {
            this.f.c();
            this.f = null;
        }
    }

    void b() {
        this.p.a();
    }

    private jqy a(jqy jqy) {
        jqy.a();
        b();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        jqy.d();
        jrf.a(SystemClock.elapsedRealtime() - elapsedRealtime);
        int e = jqy.e();
        if (e == HttpStatusCodes.STATUS_CODE_UNAUTHORIZED || e == HttpStatusCodes.STATUS_CODE_FORBIDDEN) {
            try {
                jqy.j().a();
                jqy.a();
                b();
                elapsedRealtime = SystemClock.elapsedRealtime();
                jqy.d();
                jrf.a(SystemClock.elapsedRealtime() - elapsedRealtime);
            } catch (Throwable e2) {
                throw new jqo(e2);
            }
        }
        return jqy;
    }

    private jqs a(String str, jrr jrr, String str2, boolean z, long j) {
        this.b.a(0, jrr.k());
        if (Log.isLoggable("Uploader", 4)) {
            new StringBuilder(28).append("--- UPLOAD task: ").append(jrr.hashCode());
        }
        if (Log.isLoggable("Uploader", 2)) {
            new StringBuilder(String.valueOf(null).length() + 87).append("Uploading stream, resumeFingerprint: ").append(null).append(", background: ").append(z).append(", offset: 0").append(")");
        }
        jrp jrp = new jrp(this, jrr, 0);
        try {
            jrw jrw = new jrw(this, jrr.g(), jrr.k(), 0);
            jqy jro = new jro(this.i, this.j, str, jrr.e(), 0, jrr.k(), jrp, jrw);
            synchronized (this) {
                if (this.h) {
                    throw new jqg(null);
                }
                this.f = jro;
            }
            a(jro);
            int e = jro.e();
            if (a(e)) {
                jrw.a(jrr.k(), jrr.k());
                if (jro == null) {
                    throw new jqp("null HttpEntity in response");
                }
                if (Log.isLoggable("Uploader", 3)) {
                    new StringBuilder(32).append("parseResult: length: ").append((int) jro.f());
                }
                byte[] g = jro.g();
                nyt a = nyt.a(g, 0, g.length);
                kno kno = new kno();
                kno.b(a);
                koh koh = kno.a;
                if (koh == null) {
                    throw new jqp("Unable to parse UploadMediaResponse");
                }
                jri jri;
                jqs a2;
                if (koh == null || koh.d == null) {
                    jri = null;
                } else {
                    kui kui = koh.d;
                    long j2 = -1;
                    long j3 = -1;
                    boolean z2 = false;
                    boolean z3 = false;
                    if (kui != null) {
                        if (kui.b != null) {
                            j2 = kui.b.longValue() / 1048576;
                        }
                        if (kui.a != null) {
                            j3 = kui.a.longValue() / 1048576;
                        }
                        z2 = gwb.b(kui.d);
                        z3 = gwb.b(kui.c);
                    }
                    jri = new jri(j2, j3, z2, z3);
                }
                if (koh.a != null) {
                    kud kud = koh.a;
                    a2 = new jqt().a(jri).a(kud.c != null ? kud.c.a : null).a((long) (gwb.a(kud.u) * 1000.0d)).b(kud.h).b(jrr.k()).c(kud.q != null ? kud.q.i : null).d(kud.i).e(kud.l != null ? kud.l.b : null).a(!jrr.b()).a();
                } else if (koh.e != null) {
                    String str3 = null;
                    String str4 = null;
                    nsb nsb = koh.e;
                    String str5 = null;
                    if (nsb.b != null) {
                        str3 = nsb.b.a;
                        if (nsb.b.b != null) {
                            str4 = nsb.b.b.c;
                            str5 = nsb.b.b.a;
                        }
                    }
                    a2 = new jqt().a(jri).b(str4).b(jrr.k()).d(str3).e(str5).a();
                } else {
                    throw new jqp("Unsupported UploadMediaResponse type");
                }
                ArrayList arrayList = (ArrayList) jrf.b.get();
                int size = arrayList.size();
                if (size > 0) {
                    jrh jrh = (jrh) arrayList.get(size - 1);
                    jrh.b = (int) (((long) jrh.b) + 1);
                }
                synchronized (this) {
                    this.f = null;
                }
                return a2;
            } else if (e == 308) {
                throw new jqp("uploaded full stream but server returned incomplete");
            } else if (e == 400) {
                throw new jqp("upload failed (bad payload, file too large) " + e);
            } else if (e >= HttpStatusCodes.STATUS_CODE_SERVER_ERROR && e < 600) {
                throw new jqn("upload transient error" + e, gwb.a(jrr, str));
            } else if (jrw.a()) {
                throw jrw.b();
            } else if (jro.i()) {
                throw new jqg(jro.h(), gwb.a(jrr, str));
            } else if (jro.h() != null) {
                throw new jqn(jro.h(), gwb.a(jrr, str));
            } else {
                throw new jqp(Integer.toString(e));
            }
        } catch (IOException e2) {
            try {
                throw new jqn(e2.toString(), gwb.a(jrr, str));
            } catch (Throwable th) {
                synchronized (this) {
                }
                this.f = null;
            }
        }
    }

    private static boolean a(int i) {
        return i == HttpStatusCodes.STATUS_CODE_OK || i == 201;
    }

    static {
        Bundle bundle = new Bundle();
        bundle.putString("uploadType", "resumable");
        c = bundle;
        a = kdk.KILOBYTES.a(10);
        Set hashSet = new HashSet(2);
        hashSet.addAll(Arrays.asList(new String[]{"application/placeholder-image", "application/stitching-preview"}));
        d = Collections.unmodifiableSet(hashSet);
        e = Pattern.compile("bytes=(\\d+)-(\\d+)");
        t = new jpx();
    }
}
