package p000;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class amz implements Closeable {
    final File f1377a;
    final int f1378b;
    Writer f1379c;
    int f1380d;
    final ThreadPoolExecutor f1381e = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new anb());
    private final File f1382f;
    private final File f1383g;
    private final File f1384h;
    private final int f1385i;
    private long f1386j;
    private long f1387k = 0;
    private final LinkedHashMap<String, and> f1388l = new LinkedHashMap(0, 0.75f, true);
    private long f1389m = 0;
    private final Callable<Void> f1390n = new ana(this);

    private amz(File file, int i, int i2, long j) {
        this.f1377a = file;
        this.f1385i = i;
        this.f1382f = new File(file, "journal");
        this.f1383g = new File(file, "journal.tmp");
        this.f1384h = new File(file, "journal.bkp");
        this.f1378b = i2;
        this.f1386j = j;
    }

    public static amz m2991a(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                amz.m2994a(file2, file3, false);
            }
        }
        amz amz = new amz(file, 1, 1, j);
        if (amz.f1382f.exists()) {
            try {
                amz.m2996d();
                amz.m2997e();
                return amz;
            } catch (IOException e) {
                PrintStream printStream = System.out;
                String valueOf = String.valueOf(file);
                String valueOf2 = String.valueOf(e.getMessage());
                printStream.println(new StringBuilder((String.valueOf(valueOf).length() + 36) + String.valueOf(valueOf2).length()).append("DiskLruCache ").append(valueOf).append(" is corrupt: ").append(valueOf2).append(", removing").toString());
                amz.m2999g();
            }
        }
        file.mkdirs();
        amz = new amz(file, 1, 1, j);
        amz.m3001a();
        return amz;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2996d() {
        Closeable anf = new anf(new FileInputStream(this.f1382f), anh.f1870a);
        int i;
        try {
            String a = anf.m3467a();
            String a2 = anf.m3467a();
            String a3 = anf.m3467a();
            String a4 = anf.m3467a();
            String a5 = anf.m3467a();
            if ("libcore.io.DiskLruCache".equals(a) && "1".equals(a2) && Integer.toString(this.f1385i).equals(a3) && Integer.toString(this.f1378b).equals(a4) && "".equals(a5)) {
                i = 0;
                while (true) {
                    a4 = anf.m3467a();
                    int indexOf = a4.indexOf(32);
                    if (indexOf == -1) {
                        break;
                    }
                    int i2 = indexOf + 1;
                    int indexOf2 = a4.indexOf(32, i2);
                    and and;
                    if (indexOf2 != -1) {
                        a2 = a4.substring(i2, indexOf2);
                        and = (and) this.f1388l.get(a2);
                        if (and == null) {
                            and = new and(this, a2);
                            this.f1388l.put(a2, and);
                        }
                        if (indexOf2 == -1) {
                        }
                        if (indexOf2 != -1) {
                        }
                        if (indexOf2 != -1) {
                            break;
                        }
                        break;
                    }
                    a = a4.substring(i2);
                    if (indexOf == 6 && a4.startsWith("REMOVE")) {
                        this.f1388l.remove(a);
                    } else {
                        a2 = a;
                        and = (and) this.f1388l.get(a2);
                        if (and == null) {
                            and = new and(this, a2);
                            this.f1388l.put(a2, and);
                        }
                        if (indexOf2 == -1 && indexOf == 5 && a4.startsWith("CLEAN")) {
                            String[] split = a4.substring(indexOf2 + 1).split(" ");
                            and.f1401e = true;
                            and.f1402f = null;
                            and.m3014a(split);
                        } else if (indexOf2 != -1 && indexOf == 5 && a4.startsWith("DIRTY")) {
                            and.f1402f = new anc(this, and);
                        } else if (indexOf2 != -1 || indexOf != 4 || !a4.startsWith("READ")) {
                            a5 = "unexpected journal line: ";
                            a = String.valueOf(a4);
                        }
                    }
                    i++;
                }
                a5 = "unexpected journal line: ";
                a = String.valueOf(a4);
                throw new IOException(a.length() != 0 ? a5.concat(a) : new String(a5));
            }
            throw new IOException(new StringBuilder((((String.valueOf(a).length() + 35) + String.valueOf(a2).length()) + String.valueOf(a4).length()) + String.valueOf(a5).length()).append("unexpected journal header: [").append(a).append(", ").append(a2).append(", ").append(a4).append(", ").append(a5).append("]").toString());
        } catch (EOFException e) {
            this.f1380d = i - this.f1388l.size();
            if (anf.m3468b()) {
                m3001a();
            } else {
                this.f1379c = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f1382f, true), anh.f1870a));
            }
            anh.m3469a(anf);
        } catch (Throwable th) {
            anh.m3469a(anf);
        }
    }

    private void m2997e() {
        amz.m2993a(this.f1383g);
        Iterator it = this.f1388l.values().iterator();
        while (it.hasNext()) {
            and and = (and) it.next();
            int i;
            if (and.f1402f == null) {
                for (i = 0; i < this.f1378b; i++) {
                    this.f1387k += and.f1398b[i];
                }
            } else {
                and.f1402f = null;
                for (i = 0; i < this.f1378b; i++) {
                    amz.m2993a(and.m3012a(i));
                    amz.m2993a(and.m3015b(i));
                }
                it.remove();
            }
        }
    }

    synchronized void m3001a() {
        if (this.f1379c != null) {
            this.f1379c.close();
        }
        Writer bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f1383g), anh.f1870a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f1385i));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f1378b));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (and and : this.f1388l.values()) {
                String valueOf;
                String str;
                if (and.f1402f != null) {
                    valueOf = String.valueOf("DIRTY ");
                    str = and.f1397a;
                    bufferedWriter.write(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append(str).append("\n").toString());
                } else {
                    valueOf = String.valueOf("CLEAN ");
                    String str2 = and.f1397a;
                    str = String.valueOf(and.m3013a());
                    bufferedWriter.write(new StringBuilder(((String.valueOf(valueOf).length() + 1) + String.valueOf(str2).length()) + String.valueOf(str).length()).append(valueOf).append(str2).append(str).append("\n").toString());
                }
            }
            bufferedWriter.close();
            if (this.f1382f.exists()) {
                amz.m2994a(this.f1382f, this.f1384h, true);
            }
            amz.m2994a(this.f1383g, this.f1382f, false);
            this.f1384h.delete();
            this.f1379c = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f1382f, true), anh.f1870a));
        } catch (Throwable th) {
            bufferedWriter.close();
        }
    }

    private static void m2993a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void m2994a(File file, File file2, boolean z) {
        if (z) {
            amz.m2993a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public synchronized ane m3000a(String str) {
        ane ane = null;
        synchronized (this) {
            m2998f();
            and and = (and) this.f1388l.get(str);
            if (and != null) {
                if (and.f1401e) {
                    for (File exists : and.f1399c) {
                        if (!exists.exists()) {
                            break;
                        }
                    }
                    this.f1380d++;
                    this.f1379c.append("READ");
                    this.f1379c.append(' ');
                    this.f1379c.append(str);
                    this.f1379c.append('\n');
                    if (m3004b()) {
                        this.f1381e.submit(this.f1390n);
                    }
                    ane = new ane(this, str, and.f1403g, and.f1399c, and.f1398b);
                }
            }
        }
        return ane;
    }

    public anc m3003b(String str) {
        return m2992a(str, -1);
    }

    private synchronized anc m2992a(String str, long j) {
        anc anc;
        m2998f();
        and and = (and) this.f1388l.get(str);
        if (-1 == -1 || (and != null && and.f1403g == -1)) {
            and and2;
            if (and == null) {
                and = new and(this, str);
                this.f1388l.put(str, and);
                and2 = and;
            } else if (and.f1402f != null) {
                anc = null;
            } else {
                and2 = and;
            }
            anc = new anc(this, and2);
            and2.f1402f = anc;
            this.f1379c.append("DIRTY");
            this.f1379c.append(' ');
            this.f1379c.append(str);
            this.f1379c.append('\n');
            this.f1379c.flush();
        } else {
            anc = null;
        }
        return anc;
    }

    synchronized void m3002a(anc anc, boolean z) {
        int i = 0;
        synchronized (this) {
            and and = anc.f1393a;
            if (and.f1402f != anc) {
                throw new IllegalStateException();
            }
            if (z) {
                if (!and.f1401e) {
                    int i2 = 0;
                    while (i2 < this.f1378b) {
                        if (!anc.f1394b[i2]) {
                            anc.m3009b();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                        } else if (!and.m3015b(i2).exists()) {
                            anc.m3009b();
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            while (i < this.f1378b) {
                File b = and.m3015b(i);
                if (!z) {
                    amz.m2993a(b);
                } else if (b.exists()) {
                    File a = and.m3012a(i);
                    b.renameTo(a);
                    long j = and.f1398b[i];
                    long length = a.length();
                    and.f1398b[i] = length;
                    this.f1387k = (this.f1387k - j) + length;
                }
                i++;
            }
            this.f1380d++;
            and.f1402f = null;
            if ((and.f1401e | z) != 0) {
                and.f1401e = true;
                this.f1379c.append("CLEAN");
                this.f1379c.append(' ');
                this.f1379c.append(and.f1397a);
                this.f1379c.append(and.m3013a());
                this.f1379c.append('\n');
                if (z) {
                    long j2 = this.f1389m;
                    this.f1389m = 1 + j2;
                    and.f1403g = j2;
                }
            } else {
                this.f1388l.remove(and.f1397a);
                this.f1379c.append("REMOVE");
                this.f1379c.append(' ');
                this.f1379c.append(and.f1397a);
                this.f1379c.append('\n');
            }
            this.f1379c.flush();
            if (this.f1387k > this.f1386j || m3004b()) {
                this.f1381e.submit(this.f1390n);
            }
        }
    }

    boolean m3004b() {
        return this.f1380d >= 2000 && this.f1380d >= this.f1388l.size();
    }

    private synchronized boolean m2995c(String str) {
        boolean z;
        int i = 0;
        synchronized (this) {
            m2998f();
            and and = (and) this.f1388l.get(str);
            if (and == null || and.f1402f != null) {
                z = false;
            } else {
                while (i < this.f1378b) {
                    File a = and.m3012a(i);
                    if (!a.exists() || a.delete()) {
                        this.f1387k -= and.f1398b[i];
                        and.f1398b[i] = 0;
                        i++;
                    } else {
                        String valueOf = String.valueOf(a);
                        throw new IOException(new StringBuilder(String.valueOf(valueOf).length() + 17).append("failed to delete ").append(valueOf).toString());
                    }
                }
                this.f1380d++;
                this.f1379c.append("REMOVE");
                this.f1379c.append(' ');
                this.f1379c.append(str);
                this.f1379c.append('\n');
                this.f1388l.remove(str);
                if (m3004b()) {
                    this.f1381e.submit(this.f1390n);
                }
                z = true;
            }
        }
        return z;
    }

    private void m2998f() {
        if (this.f1379c == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public synchronized void close() {
        if (this.f1379c != null) {
            ArrayList arrayList = new ArrayList(this.f1388l.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                and and = (and) obj;
                if (and.f1402f != null) {
                    and.f1402f.m3009b();
                }
            }
            m3005c();
            this.f1379c.close();
            this.f1379c = null;
        }
    }

    void m3005c() {
        while (this.f1387k > this.f1386j) {
            m2995c((String) ((Entry) this.f1388l.entrySet().iterator().next()).getKey());
        }
    }

    private void m2999g() {
        close();
        anh.m3470a(this.f1377a);
    }
}
