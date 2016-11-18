package p000;

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
    static final long f20937a = kdk.f21417d.m25595a(10);
    private static final Bundle f20938c;
    private static final Set<String> f20939d;
    private static final Pattern f20940e = Pattern.compile("bytes=(\\d+)-(\\d+)");
    private static final jpz f20941t = new jpx();
    final jre f20942b;
    private jro f20943f;
    private String f20944g;
    private boolean f20945h;
    private final Context f20946i;
    private final jvk f20947j = new jvk(this.f20946i, this.f20948k, "oauth2:https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.stream.read https://www.googleapis.com/auth/plus.stream.write https://www.googleapis.com/auth/plus.circles.write https://www.googleapis.com/auth/plus.circles.read https://www.googleapis.com/auth/plus.photos.readwrite https://www.googleapis.com/auth/plus.native");
    private final String f20948k;
    private final String f20949l;
    private final String f20950m;
    private final boolean f20951n;
    private final jrk f20952o;
    private final jpu f20953p;
    private final jqx f20954q = ((jqx) jyn.m25433b(this.f20946i, jqx.class));
    private final jrj f20955r = ((jrj) jyn.m25433b(this.f20946i, jrj.class));
    private final jpz f20956s = new jpw(this.f20946i);

    jrv(jrc jrc) {
        ba.m4535a(jrc.m25052b(), (Object) "must specify an accountName");
        ba.m4535a(jrc.m25054c(), (Object) "must specify an accountGaiaId");
        this.f20946i = jrc.m25048a();
        this.f20948k = jrc.m25052b();
        this.f20949l = jrc.m25054c();
        this.f20950m = jrc.m25055d();
        this.f20942b = jrc.m25056e();
        this.f20951n = jrc.m25057f();
        this.f20952o = jrc.m25058g();
        this.f20953p = jrc.m25059h();
    }

    jqs m25134a(jrl jrl) {
        jrr jrr = null;
        boolean z = true;
        try {
            jpz q = jrl.m25079q();
            if (q == null) {
                q = jrl.m25073k() ? f20941t : this.f20956s;
            }
            jrr = new jrs(this.f20946i).m25121a(jrl.m25063a()).m25122a(jrl.m25064b()).m25128b(jrl.m25066d()).m25125a(jrl.m25076n()).m25126a(jrl.m25077o()).m25124a(jrl.m25078p()).m25123a(q).m25127a(jrl.m25080r()).m25120a();
            if (gwb.m1898a(this.f20946i, jrl.m25063a(), q)) {
                jrr.m25103a();
            }
            if (!TextUtils.isEmpty(jrl.m25065c())) {
                jrr.m25104a(jrl.m25065c());
            }
            if (jrl.m25072j() > 0) {
                jrr.m25105b(jrl.m25072j());
            }
            String e = jrr.m25109e();
            if (f20939d.contains(e)) {
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
                String str = this.f20951n ? "uploadmediapreferredbackground" : this.f20944g != null ? this.f20944g : jrl.m25075m() ? "uploadmediabackground" : "uploadmedia";
                String a = gwb.m1649a(this.f20946i, "plusi", str, true, f20938c);
                Context context = this.f20946i;
                juy juy = this.f20947j;
                String str2 = this.f20950m;
                String str3 = this.f20949l;
                if (this.f20954q == null) {
                    jrk = this.f20952o;
                } else {
                    jrk = this.f20954q.m25036a();
                }
                if (this.f20954q == null || !this.f20954q.m25037b()) {
                    z = false;
                }
                jqy jqc = new jqc(context, juy, a, jrl, jrr, str2, str3, jrk, z);
                m25132a(jqc);
                int e2 = jqc.m24995e();
                if (jrv.m25133a(e2)) {
                    String c = jqc.m25004c();
                    if (c == null) {
                        throw new jqp("upload failed (initial response didn't get valid location url)");
                    }
                    jqs a2 = m25131a(c, jrr, null, jrl.m25075m(), 0);
                    try {
                        if (jrr.m25106b()) {
                            new File(jrr.m25107c().getPath()).delete();
                        }
                    } catch (Exception e3) {
                    }
                    this.f20945h = false;
                    return a2;
                } else if (e2 == 400) {
                    throw new jqp("upload failed (bad payload, file too large) " + e2);
                } else if (e2 == HttpStatusCodes.STATUS_CODE_UNAUTHORIZED) {
                    throw new jqo(Integer.toString(HttpStatusCodes.STATUS_CODE_UNAUTHORIZED));
                } else if (e2 == HttpStatusCodes.STATUS_CODE_SERVICE_UNAVAILABLE) {
                    throw new jqn("Server throttle code 503", true);
                } else if (e2 == 0 || (e2 >= 500 && e2 < 600)) {
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
                    if (jrr.m25106b()) {
                        new File(jrr.m25107c().getPath()).delete();
                    }
                } catch (Exception e6) {
                }
            }
            this.f20945h = false;
        }
    }

    synchronized void m25135a() {
        this.f20945h = true;
        if (this.f20943f != null) {
            this.f20943f.m25093c();
            this.f20943f = null;
        }
    }

    void m25136b() {
        this.f20953p.m24965a();
    }

    private jqy m25132a(jqy jqy) {
        jqy.mo3592a();
        m25136b();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        jqy.m24994d();
        jrf.m25061a(SystemClock.elapsedRealtime() - elapsedRealtime);
        int e = jqy.m24995e();
        if (e == HttpStatusCodes.STATUS_CODE_UNAUTHORIZED || e == HttpStatusCodes.STATUS_CODE_FORBIDDEN) {
            try {
                jqy.m25000j().mo3616a();
                jqy.mo3592a();
                m25136b();
                elapsedRealtime = SystemClock.elapsedRealtime();
                jqy.m24994d();
                jrf.m25061a(SystemClock.elapsedRealtime() - elapsedRealtime);
            } catch (Throwable e2) {
                throw new jqo(e2);
            }
        }
        return jqy;
    }

    private jqs m25131a(String str, jrr jrr, String str2, boolean z, long j) {
        this.f20942b.mo3595a(0, jrr.m25115k());
        if (Log.isLoggable("Uploader", 4)) {
            new StringBuilder(28).append("--- UPLOAD task: ").append(jrr.hashCode());
        }
        if (Log.isLoggable("Uploader", 2)) {
            new StringBuilder(String.valueOf(null).length() + 87).append("Uploading stream, resumeFingerprint: ").append(null).append(", background: ").append(z).append(", offset: 0").append(")");
        }
        jrp jrp = new jrp(this, jrr, 0);
        try {
            jrw jrw = new jrw(this, jrr.m25111g(), jrr.m25115k(), 0);
            jqy jro = new jro(this.f20946i, this.f20947j, str, jrr.m25109e(), 0, jrr.m25115k(), jrp, jrw);
            synchronized (this) {
                if (this.f20945h) {
                    throw new jqg(null);
                }
                this.f20943f = jro;
            }
            m25132a(jro);
            int e = jro.m24995e();
            if (jrv.m25133a(e)) {
                jrw.mo3514a(jrr.m25115k(), jrr.m25115k());
                if (jro == null) {
                    throw new jqp("null HttpEntity in response");
                }
                if (Log.isLoggable("Uploader", 3)) {
                    new StringBuilder(32).append("parseResult: length: ").append((int) jro.m24996f());
                }
                byte[] g = jro.m24997g();
                nyt a = nyt.a(g, 0, g.length);
                kno kno = new kno();
                kno.m26695b(a);
                koh koh = kno.f22428a;
                if (koh == null) {
                    throw new jqp("Unable to parse UploadMediaResponse");
                }
                jri jri;
                jqs a2;
                if (koh == null || koh.f22525d == null) {
                    jri = null;
                } else {
                    kui kui = koh.f22525d;
                    long j2 = -1;
                    long j3 = -1;
                    boolean z2 = false;
                    boolean z3 = false;
                    if (kui != null) {
                        if (kui.f23440b != null) {
                            j2 = kui.f23440b.longValue() / 1048576;
                        }
                        if (kui.f23439a != null) {
                            j3 = kui.f23439a.longValue() / 1048576;
                        }
                        z2 = gwb.m2061b(kui.f23442d);
                        z3 = gwb.m2061b(kui.f23441c);
                    }
                    jri = new jri(j2, j3, z2, z3);
                }
                if (koh.f22522a != null) {
                    kud kud = koh.f22522a;
                    a2 = new jqt().m25020a(jri).m25019a(kud.f23389c != null ? kud.f23389c.f23356a : null).m25018a((long) (gwb.m1473a(kud.f23407u) * 1000.0d)).m25023b(kud.f23394h).m25022b(jrr.m25115k()).m25024c(kud.f23403q != null ? kud.f23403q.f23285i : null).m25025d(kud.f23395i).m25026e(kud.f23398l != null ? kud.f23398l.f23453b : null).m25021a(!jrr.m25106b()).m25017a();
                } else if (koh.f22526e != null) {
                    String str3 = null;
                    String str4 = null;
                    nsb nsb = koh.f22526e;
                    String str5 = null;
                    if (nsb.b != null) {
                        str3 = nsb.b.a;
                        if (nsb.b.b != null) {
                            str4 = nsb.b.b.c;
                            str5 = nsb.b.b.a;
                        }
                    }
                    a2 = new jqt().m25020a(jri).m25023b(str4).m25022b(jrr.m25115k()).m25025d(str3).m25026e(str5).m25017a();
                } else {
                    throw new jqp("Unsupported UploadMediaResponse type");
                }
                ArrayList arrayList = (ArrayList) jrf.f20834b.get();
                int size = arrayList.size();
                if (size > 0) {
                    jrh jrh = (jrh) arrayList.get(size - 1);
                    jrh.f20837b = (int) (((long) jrh.f20837b) + 1);
                }
                synchronized (this) {
                    this.f20943f = null;
                }
                return a2;
            } else if (e == 308) {
                throw new jqp("uploaded full stream but server returned incomplete");
            } else if (e == 400) {
                throw new jqp("upload failed (bad payload, file too large) " + e);
            } else if (e >= 500 && e < 600) {
                throw new jqn("upload transient error" + e, gwb.m1671a(jrr, str));
            } else if (jrw.m25138a()) {
                throw jrw.m25139b();
            } else if (jro.m24999i()) {
                throw new jqg(jro.m24998h(), gwb.m1671a(jrr, str));
            } else if (jro.m24998h() != null) {
                throw new jqn(jro.m24998h(), gwb.m1671a(jrr, str));
            } else {
                throw new jqp(Integer.toString(e));
            }
        } catch (IOException e2) {
            try {
                throw new jqn(e2.toString(), gwb.m1671a(jrr, str));
            } catch (Throwable th) {
                synchronized (this) {
                    this.f20943f = null;
                }
            }
        }
    }

    private static boolean m25133a(int i) {
        return i == HttpStatusCodes.STATUS_CODE_OK || i == 201;
    }

    static {
        Bundle bundle = new Bundle();
        bundle.putString("uploadType", "resumable");
        f20938c = bundle;
        Set hashSet = new HashSet(2);
        hashSet.addAll(Arrays.asList(new String[]{"application/placeholder-image", "application/stitching-preview"}));
        f20939d = Collections.unmodifiableSet(hashSet);
    }
}
