package p000;

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

public class fsi extends frf {
    static final boolean f13894a = false;
    static final gma f13895b = gma.m18073a("MediaLoader");
    private static iin<fss> f13896d;
    private static final Object f13897e = new Object();
    final Object f13898c = new Object();
    private final ExecutorService f13899g = Executors.newSingleThreadExecutor();
    private final HashSet<fsr> f13900h = new HashSet();
    private final LinkedList<fsr> f13901i = new LinkedList();

    static {
        kae kae = glk.f15570q;
    }

    protected String mo1676a() {
        return "MediaLoader";
    }

    protected void mo1677a(ArrayList<String> arrayList) {
        if (arrayList.size() > 0) {
            arrayList = arrayList;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                String str = (String) arrayList.get(i);
                frj d = m12719d(str);
                String valueOf;
                if (d != null) {
                    if (d instanceof fsr) {
                        fsr fsr = (fsr) d;
                        if (fsr.f3558h != null) {
                            fsr.f3558h.f13924c = System.nanoTime();
                        }
                        synchronized (this.f13898c) {
                            String str2;
                            if (fsr.mo606a()) {
                                if (this.f13900h.size() < 8) {
                                    if (f13894a) {
                                        str2 = "execute add to active: reference request =";
                                        valueOf = String.valueOf(fsr.toString());
                                        m16139a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                                    }
                                    this.f13900h.add(fsr);
                                } else {
                                    if (f13894a) {
                                        str2 = "execute add to waiting: reference request =";
                                        valueOf = String.valueOf(fsr.toString());
                                        if (valueOf.length() != 0) {
                                            valueOf = str2.concat(valueOf);
                                        } else {
                                            valueOf = new String(str2);
                                        }
                                        m16139a(valueOf);
                                    }
                                    this.f13901i.add(fsr);
                                    fsr = null;
                                }
                            } else if (f13894a) {
                                str2 = "execute skip: reference request =";
                                valueOf = String.valueOf(fsr.toString());
                                if (valueOf.length() != 0) {
                                    valueOf = str2.concat(valueOf);
                                } else {
                                    valueOf = new String(str2);
                                }
                                m16139a(valueOf);
                            }
                        }
                        if (fsr != null) {
                            m16132c(fsr);
                        }
                    }
                    i = i2;
                } else if (f13894a) {
                    valueOf = "No MediaRequests for key: ";
                    str = String.valueOf(str);
                    m16139a(str.length() != 0 ? valueOf.concat(str) : new String(valueOf));
                    i = i2;
                } else {
                    i = i2;
                }
            }
        }
    }

    private void m16132c(fsr fsr) {
        if (f13894a) {
            String str = "startGetBytes on ";
            String valueOf = String.valueOf(fsr.toString());
            if (valueOf.length() != 0) {
                valueOf = str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
            m16139a(valueOf);
        }
        if (fsr.f3558h != null) {
            fsr.f3558h.f13925d = System.nanoTime();
        }
        fsh m_ = fsr.m_();
        if (m_ != null && m_.m16124a() != null) {
            m16137a(fsr, m_);
        }
    }

    public void m16137a(fsr fsr, fsh fsh) {
        byte[] a = fsh.m16124a();
        if (f13894a) {
            String str;
            if (fsh == null) {
                str = " null ";
            } else {
                str = " size=" + a.length + " ";
            }
            String valueOf = String.valueOf(fsr.toString());
            m16139a(new StringBuilder((String.valueOf(str).length() + 16) + String.valueOf(valueOf).length()).append("mediaDownloaded ").append(str).append(valueOf).toString());
        }
        if (fsr.f3558h != null) {
            fsr.f3558h.f13926e = System.nanoTime();
        }
        if (fsh.m16126c()) {
            fsi.m16129a(fsr, " Volley Cache Hit");
        }
        if (a == null || a.length <= 0) {
            m16143b(fsr);
        } else if (fsr.m5508n().m5543p() != null && TextUtils.isEmpty(fsr.m5508n().m5542o())) {
            this.f13899g.execute(new fsj(this, fsr, a, fsh));
        } else if (fsr.m5508n().m5541n()) {
            this.f13899g.execute(new fsk(this, fsr, a, fsh));
        } else {
            this.f13899g.execute(new fsl(this, fsr, a));
        }
    }

    private static boolean m16134f(String str) {
        return (TextUtils.isEmpty(str) || ba.m4639f(str)) ? false : true;
    }

    private void m16131a(byte[] bArr, String str, fsr fsr, boolean z) {
        OutputStream outputStream;
        Throwable e;
        iil.m21876b();
        File j = fsr.mo635j();
        if (!fsi.m16134f(str)) {
            str = fsr.f3557g;
            if (!fsi.m16134f(str)) {
                m16136a(fsr);
                return;
            }
        }
        Object a = gkd.m17875a(j, str, fsr.f3556f.m5543p());
        if (TextUtils.isEmpty(a)) {
            m16136a(fsr);
            glk.m17982e("Babel_medialoader", "could not create save name", new Object[0]);
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
                fsr.f3556f.m5537a(fromFile.getPath());
                fsr.mo634a(fromFile.getPath());
                if (TextUtils.isEmpty(fsr.f3556f.m5543p())) {
                    gwb.m1400H().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", fromFile));
                }
                if (f13894a) {
                    String str2 = "Successful save ";
                    String valueOf = String.valueOf(fsr.toString());
                    if (valueOf.length() != 0) {
                        valueOf = str2.concat(valueOf);
                    } else {
                        valueOf = new String(str2);
                    }
                    m16139a(valueOf);
                }
                if (z) {
                    m16133d(fsr);
                    List<frj> c = m12716c(fsr.mo594c());
                    if (c != null) {
                        for (frj frj : c) {
                            iil.m21874a("Expected condition to be true", frj instanceof fsr);
                            fsr fsr2 = (fsr) frj;
                            if (fsr2.f3555e) {
                                m12710a(new fsm(this, fsr2));
                            } else {
                                fsr2.mo601h();
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
                    m16136a(fsr);
                    glk.m17980d("Babel_medialoader", "exception writing bytes to file while trying to save", e32);
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

    public void m16138a(fsr fsr, fsq fsq) {
        iil.m21876b();
        if (f13894a) {
            String str = "mediaDecoded ";
            String valueOf = String.valueOf(fsr.toString());
            if (valueOf.length() != 0) {
                valueOf = str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
            m16139a(valueOf);
        }
        m16133d(fsr);
        List<frj> c = m12716c(fsr.mo594c());
        if (c == null) {
            if (fsq != null) {
                fsq.mo2292b();
            }
        } else if (fsq != null) {
            for (frj frj : c) {
                iil.m21874a("Expected condition to be true", frj instanceof fsr);
                fsq.mo2291a();
                fsr fsr2 = (fsr) frj;
                if (!(fsr2.f3558h == null || fsr.f3558h == null)) {
                    if (fsr2 != fsr) {
                        fsr2.f3558h.f13924c = fsr.f3558h.f13924c;
                        fsr2.f3558h.f13925d = fsr.f3558h.f13925d;
                        fsr2.f3558h.f13926e = fsr.f3558h.f13926e;
                        fsi.m16129a(fsr2, " Secondary request");
                    }
                    fsr2.f3558h.f13927f = System.nanoTime();
                }
                if (fsr2.f3555e) {
                    m12710a(new fsn(this, fsr2, fsq));
                } else {
                    fsr2.mo597a(fsq, false);
                    fsq.mo2292b();
                }
            }
            fsq.mo2292b();
        }
    }

    public boolean mo2072a(frj frj) {
        return m16142a(frj, false);
    }

    public boolean m16142a(frj frj, boolean z) {
        if (frj == null || !(frj instanceof fsr)) {
            String valueOf = String.valueOf(frj);
            glk.m17982e("Babel_medialoader", new StringBuilder(String.valueOf(valueOf).length() + 35).append("MediaLoader.load: invalid request: ").append(valueOf).toString(), new Object[0]);
            return false;
        }
        fsr fsr = (fsr) frj;
        if (f13894a) {
            valueOf = String.valueOf(fsr.toString());
            m16139a(new StringBuilder(String.valueOf(valueOf).length() + 30).append("load req=").append(valueOf).append(" loadOnlyCached=").append(z).toString());
        }
        if (glk.f15551A) {
            Object fss = new fss();
            fss.f13922a = glj.m17956a();
            fss.f13923b = System.nanoTime();
            fss.f13928g = fsr.mo594c();
            synchronized (f13897e) {
                if (f13896d == null) {
                    f13896d = new iin(HttpStatusCodes.STATUS_CODE_OK);
                }
                f13896d.m21890a(fss);
                fsr.f3558h = fss;
            }
        } else if (f13896d != null) {
            synchronized (f13897e) {
                if (f13896d != null) {
                    f13896d = null;
                }
            }
        }
        boolean z2 = fsr.mo599f() && fsr.mo598e();
        String str;
        String valueOf2;
        if (z2 || z) {
            if (fsr.f3558h != null) {
                long nanoTime = System.nanoTime();
                fsr.f3558h.f13924c = nanoTime;
                fsr.f3558h.f13925d = nanoTime;
                fsr.f3558h.f13926e = nanoTime;
                fsr.f3558h.f13927f = nanoTime;
                if (z2) {
                    str = " Bitmap Cache Hit";
                } else {
                    str = " Bitmap Cache Miss";
                }
                if (fsr.f3558h.f13929h == null) {
                    fsr.f3558h.f13929h = str;
                } else {
                    fss fss2 = fsr.f3558h;
                    String valueOf3 = String.valueOf(fss2.f13929h);
                    str = String.valueOf(str);
                    fss2.f13929h = str.length() != 0 ? valueOf3.concat(str) : new String(valueOf3);
                }
                if (f13894a) {
                    str = "request history=";
                    valueOf2 = String.valueOf(fsr.f3558h.toString());
                    if (valueOf2.length() != 0) {
                        valueOf2 = str.concat(valueOf2);
                    } else {
                        valueOf2 = new String(str);
                    }
                    m16139a(valueOf2);
                }
            }
            return z2;
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            super.m12718c(frj);
            return false;
        } else {
            if (f13894a) {
                str = "no cache found, load req=";
                valueOf2 = String.valueOf(fsr.toString());
                if (valueOf2.length() != 0) {
                    valueOf2 = str.concat(valueOf2);
                } else {
                    valueOf2 = new String(str);
                }
                m16139a(valueOf2);
            }
            return super.mo2072a(frj);
        }
    }

    public void m16136a(fsr fsr) {
        iil.m21876b();
        String valueOf = String.valueOf(fsr.m5508n());
        glk.m17981d("Babel", new StringBuilder(String.valueOf(valueOf).length() + 21).append("Media failed to load:").append(valueOf).toString(), new Object[0]);
        fsi.m16129a(fsr, " Failed");
        m16133d(fsr);
        m12716c(fsr.mo594c());
        if (fsr.f3555e) {
            m12710a(new fso(this, fsr));
        } else {
            fsr.mo600g();
        }
    }

    public void m16143b(fsr fsr) {
        this.f13899g.execute(new fsp(this, fsr));
    }

    public String toString() {
        int size = this.f13900h.size();
        return "MediaLoader: active/waiting=" + size + "/" + this.f13901i.size();
    }

    void m16139a(String str) {
        String valueOf = String.valueOf(toString());
        new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(str).length()).append(valueOf).append(": ").append(str);
    }

    private static int m16127a(long j, long j2) {
        return (j <= 0 || j2 <= 0) ? -1 : (int) ((j - j2) / 1000000);
    }

    public static void m16130a(PrintWriter printWriter) {
        synchronized (f13897e) {
            if (f13896d == null) {
                return;
            }
            printWriter.println("loadTime              w-e   a-e   dec-a del-dec del-e key extras");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
            for (int i = 0; i < f13896d.m21888a(); i++) {
                fss fss = (fss) f13896d.m21889a(i);
                String str = "%s %5d %5d %5d %5d %5d %s %s";
                Object[] objArr = new Object[8];
                objArr[0] = simpleDateFormat.format(Long.valueOf(fss.f13922a));
                objArr[1] = Integer.valueOf(fsi.m16127a(fss.f13924c, fss.f13923b));
                objArr[2] = Integer.valueOf(fsi.m16127a(fss.f13925d, fss.f13923b));
                objArr[3] = Integer.valueOf(fsi.m16127a(fss.f13926e, fss.f13925d));
                objArr[4] = Integer.valueOf(fsi.m16127a(fss.f13927f, fss.f13926e));
                objArr[5] = Integer.valueOf(fsi.m16127a(fss.f13927f, fss.f13923b));
                objArr[6] = fss.f13928g;
                objArr[7] = fss.f13929h != null ? fss.f13929h : "";
                printWriter.println(String.format(str, objArr));
            }
        }
    }

    private void m16133d(fsr fsr) {
        boolean z = false;
        if (fsr.f3558h != null) {
            fsr.f3558h.f13927f = System.nanoTime();
        }
        synchronized (this.f13898c) {
            String str;
            String valueOf;
            fsr fsr2;
            if (fsr.mo606a()) {
                z = this.f13900h.remove(fsr);
                if (!z) {
                    glk.m17982e("Babel_medialoader", String.valueOf(toString()).concat(" removeFromActive for a request that isn't in the active."), new Object[0]);
                }
                if (f13894a) {
                    str = "removeFromActive: reference request =";
                    valueOf = String.valueOf(fsr.toString());
                    if (valueOf.length() != 0) {
                        valueOf = str.concat(valueOf);
                    } else {
                        valueOf = new String(str);
                    }
                    m16139a(valueOf);
                }
            }
            if (z && this.f13900h.size() >= 8) {
                glk.m17982e("Babel_medialoader", "Number of active requests (" + this.f13900h.size() + ") greater than max active (8" + ")", new Object[0]);
            }
            if (!z || this.f13901i.size() <= 0) {
                fsr2 = null;
            } else {
                fsr2 = null;
                while (fsr2 == null && this.f13901i.size() > 0) {
                    fsr2 = (fsr) this.f13901i.poll();
                    if (f13894a) {
                        str = "transferrequest selected  on ";
                        valueOf = String.valueOf(fsr2.toString());
                        m16139a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    }
                    if (m12715b(fsr2.mo594c())) {
                        if (f13894a) {
                            str = "mediaDecoded waiting to active request =";
                            valueOf = String.valueOf(fsr2.toString());
                            m16139a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                        }
                        this.f13900h.add(fsr2);
                    } else {
                        if (f13894a) {
                            valueOf = "mediaDecoded waiting to active skipped: request =";
                            String valueOf2 = String.valueOf(fsr2.toString());
                            m16139a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                        }
                        fsr2 = null;
                    }
                }
            }
        }
        if (fsr2 != null) {
            m16132c(fsr2);
        }
    }

    private static void m16129a(fsr fsr, String str) {
        if (fsr.f3558h != null) {
            fss fss;
            if (fsr.f3558h.f13929h == null) {
                fss = fsr.f3558h;
            } else {
                fss = fsr.f3558h;
                String valueOf = String.valueOf(fss.f13929h);
                String valueOf2 = String.valueOf(str);
                str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            }
            fss.f13929h = str;
        }
    }
}
