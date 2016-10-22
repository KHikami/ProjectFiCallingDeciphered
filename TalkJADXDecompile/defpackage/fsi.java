package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.api.client.http.HttpStatusCodes;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: fsi */
public class fsi extends frf {
    static final boolean a;
    static final gma b;
    private static iin<fss> d;
    private static final Object e;
    final Object c;
    private final ExecutorService g;
    private final HashSet<fsr> h;
    private final LinkedList<fsr> i;

    public fsi() {
        this.g = Executors.newSingleThreadExecutor();
        this.h = new HashSet();
        this.i = new LinkedList();
        this.c = new Object();
    }

    static {
        kae kae = glk.q;
        a = false;
        b = gma.a("MediaLoader");
        e = new Object();
    }

    protected String a() {
        return "MediaLoader";
    }

    protected void a(ArrayList<String> arrayList) {
        if (arrayList.size() > 0) {
            arrayList = arrayList;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                String str = (String) arrayList.get(i);
                frj d = d(str);
                String valueOf;
                if (d != null) {
                    if (d instanceof fsr) {
                        fsr fsr = (fsr) d;
                        if (fsr.h != null) {
                            fsr.h.c = System.nanoTime();
                        }
                        synchronized (this.c) {
                            String str2;
                            if (fsr.a()) {
                                if (this.h.size() < 8) {
                                    if (a) {
                                        str2 = "execute add to active: reference request =";
                                        valueOf = String.valueOf(fsr.toString());
                                        a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                                    }
                                    this.h.add(fsr);
                                } else {
                                    if (a) {
                                        str2 = "execute add to waiting: reference request =";
                                        valueOf = String.valueOf(fsr.toString());
                                        if (valueOf.length() != 0) {
                                            valueOf = str2.concat(valueOf);
                                        } else {
                                            valueOf = new String(str2);
                                        }
                                        a(valueOf);
                                    }
                                    this.i.add(fsr);
                                    fsr = null;
                                }
                            } else if (a) {
                                str2 = "execute skip: reference request =";
                                valueOf = String.valueOf(fsr.toString());
                                if (valueOf.length() != 0) {
                                    valueOf = str2.concat(valueOf);
                                } else {
                                    valueOf = new String(str2);
                                }
                                a(valueOf);
                            }
                        }
                        if (fsr != null) {
                            c(fsr);
                        }
                    }
                    i = i2;
                } else if (a) {
                    valueOf = "No MediaRequests for key: ";
                    str = String.valueOf(str);
                    a(str.length() != 0 ? valueOf.concat(str) : new String(valueOf));
                    i = i2;
                } else {
                    i = i2;
                }
            }
        }
    }

    private void c(fsr fsr) {
        if (a) {
            String str = "startGetBytes on ";
            String valueOf = String.valueOf(fsr.toString());
            if (valueOf.length() != 0) {
                valueOf = str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
            a(valueOf);
        }
        if (fsr.h != null) {
            fsr.h.d = System.nanoTime();
        }
        fsh m_ = fsr.m_();
        if (m_ != null && m_.a() != null) {
            a(fsr, m_);
        }
    }

    public void a(fsr fsr, fsh fsh) {
        byte[] a = fsh.a();
        if (a) {
            String str;
            if (fsh == null) {
                str = " null ";
            } else {
                str = " size=" + a.length + " ";
            }
            String valueOf = String.valueOf(fsr.toString());
            a(new StringBuilder((String.valueOf(str).length() + 16) + String.valueOf(valueOf).length()).append("mediaDownloaded ").append(str).append(valueOf).toString());
        }
        if (fsr.h != null) {
            fsr.h.e = System.nanoTime();
        }
        if (fsh.c()) {
            fsi.a(fsr, " Volley Cache Hit");
        }
        if (a == null || a.length <= 0) {
            b(fsr);
        } else if (fsr.n().p() != null && TextUtils.isEmpty(fsr.n().o())) {
            this.g.execute(new fsj(this, fsr, a, fsh));
        } else if (fsr.n().n()) {
            this.g.execute(new fsk(this, fsr, a, fsh));
        } else {
            this.g.execute(new fsl(this, fsr, a));
        }
    }

    private static boolean f(String str) {
        return (TextUtils.isEmpty(str) || ba.f(str)) ? false : true;
    }

    private void a(byte[] bArr, String str, fsr fsr, boolean z) {
        OutputStream outputStream;
        Throwable e;
        iil.b();
        File j = fsr.j();
        if (!fsi.f(str)) {
            str = fsr.g;
            if (!fsi.f(str)) {
                a(fsr);
                return;
            }
        }
        Object a = gkd.a(j, str, fsr.f.p());
        if (TextUtils.isEmpty(a)) {
            a(fsr);
            glk.e("Babel_medialoader", "could not create save name", new Object[0]);
        } else if (j.exists() || j.mkdir()) {
            File file = new File(j, a);
            try {
                if (file.exists()) {
                    outputStream = null;
                } else {
                    outputStream = new FileOutputStream(file);
                    try {
                        outputStream.write(bArr);
                        outputStream.flush();
                    } catch (IOException e2) {
                        e = e2;
                    }
                }
                Uri fromFile = Uri.fromFile(file);
                fsr.f.a(fromFile.getPath());
                fsr.a(fromFile.getPath());
                if (TextUtils.isEmpty(fsr.f.p())) {
                    gwb.H().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", fromFile));
                }
                if (a) {
                    String str2 = "Successful save ";
                    String valueOf = String.valueOf(fsr.toString());
                    if (valueOf.length() != 0) {
                        valueOf = str2.concat(valueOf);
                    } else {
                        valueOf = new String(str2);
                    }
                    a(valueOf);
                }
                if (z) {
                    d(fsr);
                    List<frj> c = c(fsr.c());
                    if (c != null) {
                        for (frj frj : c) {
                            iil.a("Expected condition to be true", frj instanceof fsr);
                            fsr fsr2 = (fsr) frj;
                            if (fsr2.e) {
                                a(new fsm(this, fsr2));
                            } else {
                                fsr2.h();
                            }
                        }
                    } else if (outputStream != null) {
                        try {
                            outputStream.close();
                            return;
                        } catch (Throwable e3) {
                            Log.e("Babel_medialoader", "exception closing file while trying to save", e3);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable e32) {
                        Log.e("Babel_medialoader", "exception closing file while trying to save", e32);
                    }
                }
            } catch (IOException e4) {
                e32 = e4;
                outputStream = null;
                try {
                    a(fsr);
                    glk.d("Babel_medialoader", "exception writing bytes to file while trying to save", e32);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Throwable e322) {
                            Log.e("Babel_medialoader", "exception closing file while trying to save", e322);
                        }
                    }
                } catch (Throwable th) {
                    e322 = th;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Throwable e5) {
                            Log.e("Babel_medialoader", "exception closing file while trying to save", e5);
                        }
                    }
                    throw e322;
                }
            } catch (Throwable th2) {
                e322 = th2;
                outputStream = null;
                if (outputStream != null) {
                    outputStream.close();
                }
                throw e322;
            }
        } else {
            Log.e("Babel_medialoader", "could not create save directory.");
        }
    }

    public void a(fsr fsr, fsq fsq) {
        iil.b();
        if (a) {
            String str = "mediaDecoded ";
            String valueOf = String.valueOf(fsr.toString());
            if (valueOf.length() != 0) {
                valueOf = str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
            a(valueOf);
        }
        d(fsr);
        List<frj> c = c(fsr.c());
        if (c == null) {
            if (fsq != null) {
                fsq.b();
            }
        } else if (fsq != null) {
            for (frj frj : c) {
                iil.a("Expected condition to be true", frj instanceof fsr);
                fsq.a();
                fsr fsr2 = (fsr) frj;
                if (!(fsr2.h == null || fsr.h == null)) {
                    if (fsr2 != fsr) {
                        fsr2.h.c = fsr.h.c;
                        fsr2.h.d = fsr.h.d;
                        fsr2.h.e = fsr.h.e;
                        fsi.a(fsr2, " Secondary request");
                    }
                    fsr2.h.f = System.nanoTime();
                }
                if (fsr2.e) {
                    a(new fsn(this, fsr2, fsq));
                } else {
                    fsr2.a(fsq, false);
                    fsq.b();
                }
            }
            fsq.b();
        }
    }

    public boolean a(frj frj) {
        return a(frj, false);
    }

    public boolean a(frj frj, boolean z) {
        if (frj == null || !(frj instanceof fsr)) {
            String valueOf = String.valueOf(frj);
            glk.e("Babel_medialoader", new StringBuilder(String.valueOf(valueOf).length() + 35).append("MediaLoader.load: invalid request: ").append(valueOf).toString(), new Object[0]);
            return false;
        }
        fsr fsr = (fsr) frj;
        if (a) {
            valueOf = String.valueOf(fsr.toString());
            a(new StringBuilder(String.valueOf(valueOf).length() + 30).append("load req=").append(valueOf).append(" loadOnlyCached=").append(z).toString());
        }
        if (glk.A) {
            Object fss = new fss();
            fss.a = glj.a();
            fss.b = System.nanoTime();
            fss.g = fsr.c();
            synchronized (e) {
                if (d == null) {
                    d = new iin(HttpStatusCodes.STATUS_CODE_OK);
                }
                d.a(fss);
                fsr.h = fss;
            }
        } else if (d != null) {
            synchronized (e) {
                if (d != null) {
                    d = null;
                }
            }
        }
        boolean z2 = fsr.f() && fsr.e();
        String str;
        String valueOf2;
        if (z2 || z) {
            if (fsr.h != null) {
                long nanoTime = System.nanoTime();
                fsr.h.c = nanoTime;
                fsr.h.d = nanoTime;
                fsr.h.e = nanoTime;
                fsr.h.f = nanoTime;
                if (z2) {
                    str = " Bitmap Cache Hit";
                } else {
                    str = " Bitmap Cache Miss";
                }
                if (fsr.h.h == null) {
                    fsr.h.h = str;
                } else {
                    fss fss2 = fsr.h;
                    String valueOf3 = String.valueOf(fss2.h);
                    str = String.valueOf(str);
                    fss2.h = str.length() != 0 ? valueOf3.concat(str) : new String(valueOf3);
                }
                if (a) {
                    str = "request history=";
                    valueOf2 = String.valueOf(fsr.h.toString());
                    if (valueOf2.length() != 0) {
                        valueOf2 = str.concat(valueOf2);
                    } else {
                        valueOf2 = new String(str);
                    }
                    a(valueOf2);
                }
            }
            return z2;
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            super.c(frj);
            return false;
        } else {
            if (a) {
                str = "no cache found, load req=";
                valueOf2 = String.valueOf(fsr.toString());
                if (valueOf2.length() != 0) {
                    valueOf2 = str.concat(valueOf2);
                } else {
                    valueOf2 = new String(str);
                }
                a(valueOf2);
            }
            return super.a(frj);
        }
    }

    public void a(fsr fsr) {
        iil.b();
        String valueOf = String.valueOf(fsr.n());
        glk.d("Babel", new StringBuilder(String.valueOf(valueOf).length() + 21).append("Media failed to load:").append(valueOf).toString(), new Object[0]);
        fsi.a(fsr, " Failed");
        d(fsr);
        c(fsr.c());
        if (fsr.e) {
            a(new fso(this, fsr));
        } else {
            fsr.g();
        }
    }

    public void b(fsr fsr) {
        this.g.execute(new fsp(this, fsr));
    }

    public String toString() {
        int size = this.h.size();
        return "MediaLoader: active/waiting=" + size + "/" + this.i.size();
    }

    void a(String str) {
        String valueOf = String.valueOf(toString());
        new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(str).length()).append(valueOf).append(": ").append(str);
    }

    private static int a(long j, long j2) {
        return (j <= 0 || j2 <= 0) ? -1 : (int) ((j - j2) / 1000000);
    }

    public static void a(PrintWriter printWriter) {
        synchronized (e) {
            if (d == null) {
                return;
            }
            printWriter.println("loadTime              w-e   a-e   dec-a del-dec del-e key extras");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
            for (int i = 0; i < d.a(); i++) {
                fss fss = (fss) d.a(i);
                String str = "%s %5d %5d %5d %5d %5d %s %s";
                Object[] objArr = new Object[8];
                objArr[0] = simpleDateFormat.format(Long.valueOf(fss.a));
                objArr[1] = Integer.valueOf(fsi.a(fss.c, fss.b));
                objArr[2] = Integer.valueOf(fsi.a(fss.d, fss.b));
                objArr[3] = Integer.valueOf(fsi.a(fss.e, fss.d));
                objArr[4] = Integer.valueOf(fsi.a(fss.f, fss.e));
                objArr[5] = Integer.valueOf(fsi.a(fss.f, fss.b));
                objArr[6] = fss.g;
                objArr[7] = fss.h != null ? fss.h : "";
                printWriter.println(String.format(str, objArr));
            }
        }
    }

    private void d(fsr fsr) {
        boolean z = false;
        if (fsr.h != null) {
            fsr.h.f = System.nanoTime();
        }
        synchronized (this.c) {
            String str;
            String valueOf;
            fsr fsr2;
            if (fsr.a()) {
                z = this.h.remove(fsr);
                if (!z) {
                    glk.e("Babel_medialoader", String.valueOf(toString()).concat(" removeFromActive for a request that isn't in the active."), new Object[0]);
                }
                if (a) {
                    str = "removeFromActive: reference request =";
                    valueOf = String.valueOf(fsr.toString());
                    if (valueOf.length() != 0) {
                        valueOf = str.concat(valueOf);
                    } else {
                        valueOf = new String(str);
                    }
                    a(valueOf);
                }
            }
            if (z && this.h.size() >= 8) {
                glk.e("Babel_medialoader", "Number of active requests (" + this.h.size() + ") greater than max active (8" + ")", new Object[0]);
            }
            if (!z || this.i.size() <= 0) {
                fsr2 = null;
            } else {
                fsr2 = null;
                while (fsr2 == null && this.i.size() > 0) {
                    fsr2 = (fsr) this.i.poll();
                    if (a) {
                        str = "transferrequest selected  on ";
                        valueOf = String.valueOf(fsr2.toString());
                        a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    }
                    if (b(fsr2.c())) {
                        if (a) {
                            str = "mediaDecoded waiting to active request =";
                            valueOf = String.valueOf(fsr2.toString());
                            a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                        }
                        this.h.add(fsr2);
                    } else {
                        if (a) {
                            valueOf = "mediaDecoded waiting to active skipped: request =";
                            String valueOf2 = String.valueOf(fsr2.toString());
                            a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                        }
                        fsr2 = null;
                    }
                }
            }
        }
        if (fsr2 != null) {
            c(fsr2);
        }
    }

    private static void a(fsr fsr, String str) {
        if (fsr.h != null) {
            fss fss;
            if (fsr.h.h == null) {
                fss = fsr.h;
            } else {
                fss = fsr.h;
                String valueOf = String.valueOf(fss.h);
                String valueOf2 = String.valueOf(str);
                str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            }
            fss.h = str;
        }
    }
}
