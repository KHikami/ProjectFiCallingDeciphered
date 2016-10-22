import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class dzi implements Closeable {
    private static final Charset e;
    final File a;
    final int b;
    Writer c;
    int d;
    private final File f;
    private final File g;
    private final int h;
    private final long i;
    private long j;
    private final LinkedHashMap<String, dzm> k;
    private long l;
    private final ExecutorService m;
    private final Callable<Void> n;

    static {
        e = Charset.forName("UTF-8");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.io.InputStream r4) {
        /*
        r0 = new java.lang.StringBuilder;
        r1 = 80;
        r0.<init>(r1);
    L_0x0007:
        r1 = r4.read();
        r2 = -1;
        if (r1 != r2) goto L_0x0014;
    L_0x000e:
        r0 = new java.io.EOFException;
        r0.<init>();
        throw r0;
    L_0x0014:
        r2 = 10;
        if (r1 == r2) goto L_0x001d;
    L_0x0018:
        r1 = (char) r1;
        r0.append(r1);
        goto L_0x0007;
    L_0x001d:
        r1 = r0.length();
        if (r1 <= 0) goto L_0x0032;
    L_0x0023:
        r2 = r1 + -1;
        r2 = r0.charAt(r2);
        r3 = 13;
        if (r2 != r3) goto L_0x0032;
    L_0x002d:
        r1 = r1 + -1;
        r0.setLength(r1);
    L_0x0032:
        r0 = r0.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: dzi.a(java.io.InputStream):java.lang.String");
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    private static void a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            String valueOf = String.valueOf(file);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 17).append("not a directory: ").append(valueOf).toString());
        }
        int length = listFiles.length;
        int i = 0;
        while (i < length) {
            File file2 = listFiles[i];
            if (file2.isDirectory()) {
                a(file2);
            }
            if (file2.delete()) {
                i++;
            } else {
                valueOf = String.valueOf(file2);
                throw new IOException(new StringBuilder(String.valueOf(valueOf).length() + 23).append("failed to delete file: ").append(valueOf).toString());
            }
        }
    }

    private dzi(File file, int i, int i2, long j) {
        this.j = 0;
        this.k = new LinkedHashMap(0, 0.75f, true);
        this.l = 0;
        this.m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.n = new dzj(this);
        this.a = file;
        this.h = i;
        this.f = new File(file, "journal");
        this.g = new File(file, "journal.tmp");
        this.b = i2;
        this.i = j;
    }

    public static dzi a(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        dzi dzi = new dzi(file, 538181937, 1, j);
        if (dzi.f.exists()) {
            try {
                dzi.d();
                dzi.e();
                dzi.c = new BufferedWriter(new FileWriter(dzi.f, true), 8192);
                return dzi;
            } catch (IOException e) {
                dzi.g();
            }
        }
        file.mkdirs();
        dzi = new dzi(file, 538181937, 1, j);
        dzi.a();
        return dzi;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d() {
        /*
        r9 = this;
        r7 = 2;
        r2 = new java.io.BufferedInputStream;
        r0 = new java.io.FileInputStream;
        r1 = r9.f;
        r0.<init>(r1);
        r1 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r2.<init>(r0, r1);
        r0 = a(r2);	 Catch:{ all -> 0x00b5 }
        r1 = a(r2);	 Catch:{ all -> 0x00b5 }
        r3 = a(r2);	 Catch:{ all -> 0x00b5 }
        r4 = a(r2);	 Catch:{ all -> 0x00b5 }
        r5 = a(r2);	 Catch:{ all -> 0x00b5 }
        r6 = "com.google.android.apps.hangouts.network";
        r6 = r6.equals(r0);	 Catch:{ all -> 0x00b5 }
        if (r6 == 0) goto L_0x0053;
    L_0x002b:
        r6 = "1";
        r6 = r6.equals(r1);	 Catch:{ all -> 0x00b5 }
        if (r6 == 0) goto L_0x0053;
    L_0x0033:
        r6 = r9.h;	 Catch:{ all -> 0x00b5 }
        r6 = java.lang.Integer.toString(r6);	 Catch:{ all -> 0x00b5 }
        r3 = r6.equals(r3);	 Catch:{ all -> 0x00b5 }
        if (r3 == 0) goto L_0x0053;
    L_0x003f:
        r3 = r9.b;	 Catch:{ all -> 0x00b5 }
        r3 = java.lang.Integer.toString(r3);	 Catch:{ all -> 0x00b5 }
        r3 = r3.equals(r4);	 Catch:{ all -> 0x00b5 }
        if (r3 == 0) goto L_0x0053;
    L_0x004b:
        r3 = "";
        r3 = r3.equals(r5);	 Catch:{ all -> 0x00b5 }
        if (r3 != 0) goto L_0x00d0;
    L_0x0053:
        r3 = new java.io.IOException;	 Catch:{ all -> 0x00b5 }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00b5 }
        r7 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x00b5 }
        r7 = r7.length();	 Catch:{ all -> 0x00b5 }
        r7 = r7 + 35;
        r8 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00b5 }
        r8 = r8.length();	 Catch:{ all -> 0x00b5 }
        r7 = r7 + r8;
        r8 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x00b5 }
        r8 = r8.length();	 Catch:{ all -> 0x00b5 }
        r7 = r7 + r8;
        r8 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x00b5 }
        r8 = r8.length();	 Catch:{ all -> 0x00b5 }
        r7 = r7 + r8;
        r6.<init>(r7);	 Catch:{ all -> 0x00b5 }
        r7 = "unexpected journal header: [";
        r6 = r6.append(r7);	 Catch:{ all -> 0x00b5 }
        r0 = r6.append(r0);	 Catch:{ all -> 0x00b5 }
        r6 = ", ";
        r0 = r0.append(r6);	 Catch:{ all -> 0x00b5 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x00b5 }
        r1 = ", ";
        r0 = r0.append(r1);	 Catch:{ all -> 0x00b5 }
        r0 = r0.append(r4);	 Catch:{ all -> 0x00b5 }
        r1 = ", ";
        r0 = r0.append(r1);	 Catch:{ all -> 0x00b5 }
        r0 = r0.append(r5);	 Catch:{ all -> 0x00b5 }
        r1 = "]";
        r0 = r0.append(r1);	 Catch:{ all -> 0x00b5 }
        r0 = r0.toString();	 Catch:{ all -> 0x00b5 }
        r3.<init>(r0);	 Catch:{ all -> 0x00b5 }
        throw r3;	 Catch:{ all -> 0x00b5 }
    L_0x00b5:
        r0 = move-exception;
        a(r2);
        throw r0;
    L_0x00ba:
        r0 = 1;
        r1 = r4[r0];	 Catch:{ EOFException -> 0x00f3 }
        r0 = 0;
        r0 = r4[r0];	 Catch:{ EOFException -> 0x00f3 }
        r5 = "REMOVE";
        r0 = r0.equals(r5);	 Catch:{ EOFException -> 0x00f3 }
        if (r0 == 0) goto L_0x00fe;
    L_0x00c8:
        r0 = r4.length;	 Catch:{ EOFException -> 0x00f3 }
        if (r0 != r7) goto L_0x00fe;
    L_0x00cb:
        r0 = r9.k;	 Catch:{ EOFException -> 0x00f3 }
        r0.remove(r1);	 Catch:{ EOFException -> 0x00f3 }
    L_0x00d0:
        r3 = a(r2);	 Catch:{ EOFException -> 0x00f3 }
        r0 = " ";
        r4 = r3.split(r0);	 Catch:{ EOFException -> 0x00f3 }
        r0 = r4.length;	 Catch:{ EOFException -> 0x00f3 }
        if (r0 >= r7) goto L_0x00ba;
    L_0x00dd:
        r1 = new java.io.IOException;	 Catch:{ EOFException -> 0x00f3 }
        r4 = "unexpected journal line: ";
        r0 = java.lang.String.valueOf(r3);	 Catch:{ EOFException -> 0x00f3 }
        r3 = r0.length();	 Catch:{ EOFException -> 0x00f3 }
        if (r3 == 0) goto L_0x00f8;
    L_0x00eb:
        r0 = r4.concat(r0);	 Catch:{ EOFException -> 0x00f3 }
    L_0x00ef:
        r1.<init>(r0);	 Catch:{ EOFException -> 0x00f3 }
        throw r1;	 Catch:{ EOFException -> 0x00f3 }
    L_0x00f3:
        r0 = move-exception;
        a(r2);
        return;
    L_0x00f8:
        r0 = new java.lang.String;	 Catch:{ EOFException -> 0x00f3 }
        r0.<init>(r4);	 Catch:{ EOFException -> 0x00f3 }
        goto L_0x00ef;
    L_0x00fe:
        r0 = r9.k;	 Catch:{ EOFException -> 0x00f3 }
        r0 = r0.get(r1);	 Catch:{ EOFException -> 0x00f3 }
        r0 = (dzm) r0;	 Catch:{ EOFException -> 0x00f3 }
        if (r0 != 0) goto L_0x01a0;
    L_0x0108:
        r0 = new dzm;	 Catch:{ EOFException -> 0x00f3 }
        r0.<init>(r9, r1);	 Catch:{ EOFException -> 0x00f3 }
        r5 = r9.k;	 Catch:{ EOFException -> 0x00f3 }
        r5.put(r1, r0);	 Catch:{ EOFException -> 0x00f3 }
        r1 = r0;
    L_0x0113:
        r0 = 0;
        r0 = r4[r0];	 Catch:{ EOFException -> 0x00f3 }
        r5 = "CLEAN";
        r0 = r0.equals(r5);	 Catch:{ EOFException -> 0x00f3 }
        if (r0 == 0) goto L_0x015f;
    L_0x011e:
        r0 = r4.length;	 Catch:{ EOFException -> 0x00f3 }
        r5 = r9.b;	 Catch:{ EOFException -> 0x00f3 }
        r5 = r5 + 2;
        if (r0 != r5) goto L_0x015f;
    L_0x0125:
        r0 = 1;
        r1.c = r0;	 Catch:{ EOFException -> 0x00f3 }
        r0 = 0;
        r1.d = r0;	 Catch:{ EOFException -> 0x00f3 }
        r0 = r4.length;	 Catch:{ EOFException -> 0x00f3 }
        r3 = r4.length;	 Catch:{ EOFException -> 0x00f3 }
        if (r7 <= r0) goto L_0x0135;
    L_0x012f:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ EOFException -> 0x00f3 }
        r0.<init>();	 Catch:{ EOFException -> 0x00f3 }
        throw r0;	 Catch:{ EOFException -> 0x00f3 }
    L_0x0135:
        if (r7 <= r3) goto L_0x013d;
    L_0x0137:
        r0 = new java.lang.ArrayIndexOutOfBoundsException;	 Catch:{ EOFException -> 0x00f3 }
        r0.<init>();	 Catch:{ EOFException -> 0x00f3 }
        throw r0;	 Catch:{ EOFException -> 0x00f3 }
    L_0x013d:
        r0 = r0 + -2;
        r3 = r3 + -2;
        r3 = java.lang.Math.min(r0, r3);	 Catch:{ EOFException -> 0x00f3 }
        r5 = r4.getClass();	 Catch:{ EOFException -> 0x00f3 }
        r5 = r5.getComponentType();	 Catch:{ EOFException -> 0x00f3 }
        r0 = java.lang.reflect.Array.newInstance(r5, r0);	 Catch:{ EOFException -> 0x00f3 }
        r0 = (java.lang.Object[]) r0;	 Catch:{ EOFException -> 0x00f3 }
        r5 = 2;
        r6 = 0;
        java.lang.System.arraycopy(r4, r5, r0, r6, r3);	 Catch:{ EOFException -> 0x00f3 }
        r0 = (java.lang.String[]) r0;	 Catch:{ EOFException -> 0x00f3 }
        r1.a(r0);	 Catch:{ EOFException -> 0x00f3 }
        goto L_0x00d0;
    L_0x015f:
        r0 = 0;
        r0 = r4[r0];	 Catch:{ EOFException -> 0x00f3 }
        r5 = "DIRTY";
        r0 = r0.equals(r5);	 Catch:{ EOFException -> 0x00f3 }
        if (r0 == 0) goto L_0x0176;
    L_0x016a:
        r0 = r4.length;	 Catch:{ EOFException -> 0x00f3 }
        if (r0 != r7) goto L_0x0176;
    L_0x016d:
        r0 = new dzk;	 Catch:{ EOFException -> 0x00f3 }
        r0.<init>(r9, r1);	 Catch:{ EOFException -> 0x00f3 }
        r1.d = r0;	 Catch:{ EOFException -> 0x00f3 }
        goto L_0x00d0;
    L_0x0176:
        r0 = 0;
        r0 = r4[r0];	 Catch:{ EOFException -> 0x00f3 }
        r1 = "READ";
        r0 = r0.equals(r1);	 Catch:{ EOFException -> 0x00f3 }
        if (r0 == 0) goto L_0x0184;
    L_0x0181:
        r0 = r4.length;	 Catch:{ EOFException -> 0x00f3 }
        if (r0 == r7) goto L_0x00d0;
    L_0x0184:
        r1 = new java.io.IOException;	 Catch:{ EOFException -> 0x00f3 }
        r4 = "unexpected journal line: ";
        r0 = java.lang.String.valueOf(r3);	 Catch:{ EOFException -> 0x00f3 }
        r3 = r0.length();	 Catch:{ EOFException -> 0x00f3 }
        if (r3 == 0) goto L_0x019a;
    L_0x0192:
        r0 = r4.concat(r0);	 Catch:{ EOFException -> 0x00f3 }
    L_0x0196:
        r1.<init>(r0);	 Catch:{ EOFException -> 0x00f3 }
        throw r1;	 Catch:{ EOFException -> 0x00f3 }
    L_0x019a:
        r0 = new java.lang.String;	 Catch:{ EOFException -> 0x00f3 }
        r0.<init>(r4);	 Catch:{ EOFException -> 0x00f3 }
        goto L_0x0196;
    L_0x01a0:
        r1 = r0;
        goto L_0x0113;
        */
        throw new UnsupportedOperationException("Method not decompiled: dzi.d():void");
    }

    private void e() {
        b(this.g);
        Iterator it = this.k.values().iterator();
        while (it.hasNext()) {
            dzm dzm = (dzm) it.next();
            int i;
            if (dzm.d == null) {
                for (i = 0; i < this.b; i++) {
                    this.j += dzm.b[i];
                }
            } else {
                dzm.d = null;
                for (i = 0; i < this.b; i++) {
                    b(dzm.a(i));
                    b(dzm.b(i));
                }
                it.remove();
            }
        }
    }

    synchronized void a() {
        if (this.c != null) {
            this.c.close();
        }
        Writer bufferedWriter = new BufferedWriter(new FileWriter(this.g), 8192);
        bufferedWriter.write("com.google.android.apps.hangouts.network");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.h));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.b));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (dzm dzm : this.k.values()) {
            String valueOf;
            String str;
            if (dzm.d != null) {
                valueOf = String.valueOf("DIRTY ");
                str = dzm.a;
                bufferedWriter.write(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append(str).append("\n").toString());
            } else {
                valueOf = String.valueOf("CLEAN ");
                String str2 = dzm.a;
                str = String.valueOf(dzm.a());
                bufferedWriter.write(new StringBuilder(((String.valueOf(valueOf).length() + 1) + String.valueOf(str2).length()) + String.valueOf(str).length()).append(valueOf).append(str2).append(str).append("\n").toString());
            }
        }
        bufferedWriter.close();
        this.g.renameTo(this.f);
        this.c = new BufferedWriter(new FileWriter(this.f, true), 8192);
    }

    private static void b(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public synchronized dzn a(String str) {
        dzn dzn = null;
        synchronized (this) {
            f();
            d(str);
            dzm dzm = (dzm) this.k.get(str);
            if (dzm != null) {
                if (dzm.c) {
                    InputStream[] inputStreamArr = new InputStream[this.b];
                    int i = 0;
                    while (i < this.b) {
                        try {
                            inputStreamArr[i] = new FileInputStream(dzm.a(i));
                            i++;
                        } catch (FileNotFoundException e) {
                        }
                    }
                    this.d++;
                    Writer writer = this.c;
                    String valueOf = String.valueOf("READ ");
                    writer.append(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append(str).append("\n").toString());
                    if (b()) {
                        this.m.submit(this.n);
                    }
                    dzn = new dzn(this, str, dzm.e, inputStreamArr);
                }
            }
        }
        return dzn;
    }

    public dzk b(String str) {
        return a(str, -1);
    }

    private synchronized dzk a(String str, long j) {
        dzk dzk;
        f();
        d(str);
        dzm dzm = (dzm) this.k.get(str);
        if (-1 == -1 || (dzm != null && dzm.e == -1)) {
            dzm dzm2;
            if (dzm == null) {
                dzm = new dzm(this, str);
                this.k.put(str, dzm);
                dzm2 = dzm;
            } else if (dzm.d != null) {
                dzk = null;
            } else {
                dzm2 = dzm;
            }
            dzk = new dzk(this, dzm2);
            dzm2.d = dzk;
            Writer writer = this.c;
            String valueOf = String.valueOf("DIRTY ");
            writer.write(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append(str).append("\n").toString());
            this.c.flush();
        } else {
            dzk = null;
        }
        return dzk;
    }

    synchronized void a(dzk dzk, boolean z) {
        int i = 0;
        synchronized (this) {
            dzm dzm = dzk.a;
            if (dzm.d != dzk) {
                throw new IllegalStateException();
            }
            if (z) {
                if (!dzm.c) {
                    int i2 = 0;
                    while (i2 < this.b) {
                        if (dzm.b(i2).exists()) {
                            i2++;
                        } else {
                            dzk.b();
                            throw new IllegalStateException("edit didn't create file " + i2);
                        }
                    }
                }
            }
            while (i < this.b) {
                File b = dzm.b(i);
                if (!z) {
                    b(b);
                } else if (b.exists()) {
                    File a = dzm.a(i);
                    b.renameTo(a);
                    long j = dzm.b[i];
                    long length = a.length();
                    dzm.b[i] = length;
                    this.j = (this.j - j) + length;
                }
                i++;
            }
            this.d++;
            dzm.d = null;
            Writer writer;
            String valueOf;
            if ((dzm.c | z) != 0) {
                dzm.c = true;
                writer = this.c;
                valueOf = String.valueOf("CLEAN ");
                String str = dzm.a;
                String valueOf2 = String.valueOf(dzm.a());
                writer.write(new StringBuilder(((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str).append(valueOf2).append("\n").toString());
                if (z) {
                    long j2 = this.l;
                    this.l = 1 + j2;
                    dzm.e = j2;
                }
            } else {
                this.k.remove(dzm.a);
                writer = this.c;
                valueOf = String.valueOf("REMOVE ");
                String str2 = dzm.a;
                writer.write(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str2).length()).append(valueOf).append(str2).append("\n").toString());
            }
            if (this.j > this.i || b()) {
                this.m.submit(this.n);
            }
        }
    }

    boolean b() {
        return this.d >= 2000 && this.d >= this.k.size();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean c(java.lang.String r7) {
        /*
        r6 = this;
        r1 = 0;
        monitor-enter(r6);
        r6.f();	 Catch:{ all -> 0x005f }
        d(r7);	 Catch:{ all -> 0x005f }
        r0 = r6.k;	 Catch:{ all -> 0x005f }
        r0 = r0.get(r7);	 Catch:{ all -> 0x005f }
        r0 = (dzm) r0;	 Catch:{ all -> 0x005f }
        if (r0 == 0) goto L_0x0016;
    L_0x0012:
        r2 = r0.d;	 Catch:{ all -> 0x005f }
        if (r2 == 0) goto L_0x002a;
    L_0x0016:
        r0 = r1;
    L_0x0017:
        monitor-exit(r6);
        return r0;
    L_0x0019:
        r2 = r6.j;	 Catch:{ all -> 0x005f }
        r4 = r0.b;	 Catch:{ all -> 0x005f }
        r4 = r4[r1];	 Catch:{ all -> 0x005f }
        r2 = r2 - r4;
        r6.j = r2;	 Catch:{ all -> 0x005f }
        r2 = r0.b;	 Catch:{ all -> 0x005f }
        r4 = 0;
        r2[r1] = r4;	 Catch:{ all -> 0x005f }
        r1 = r1 + 1;
    L_0x002a:
        r2 = r6.b;	 Catch:{ all -> 0x005f }
        if (r1 >= r2) goto L_0x0062;
    L_0x002e:
        r2 = r0.a(r1);	 Catch:{ all -> 0x005f }
        r3 = r2.delete();	 Catch:{ all -> 0x005f }
        if (r3 != 0) goto L_0x0019;
    L_0x0038:
        r0 = new java.io.IOException;	 Catch:{ all -> 0x005f }
        r1 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x005f }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x005f }
        r3 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x005f }
        r3 = r3.length();	 Catch:{ all -> 0x005f }
        r3 = r3 + 17;
        r2.<init>(r3);	 Catch:{ all -> 0x005f }
        r3 = "failed to delete ";
        r2 = r2.append(r3);	 Catch:{ all -> 0x005f }
        r1 = r2.append(r1);	 Catch:{ all -> 0x005f }
        r1 = r1.toString();	 Catch:{ all -> 0x005f }
        r0.<init>(r1);	 Catch:{ all -> 0x005f }
        throw r0;	 Catch:{ all -> 0x005f }
    L_0x005f:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
    L_0x0062:
        r0 = r6.d;	 Catch:{ all -> 0x005f }
        r0 = r0 + 1;
        r6.d = r0;	 Catch:{ all -> 0x005f }
        r0 = r6.c;	 Catch:{ all -> 0x005f }
        r1 = "REMOVE ";
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x005f }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x005f }
        r3 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x005f }
        r3 = r3.length();	 Catch:{ all -> 0x005f }
        r3 = r3 + 1;
        r4 = java.lang.String.valueOf(r7);	 Catch:{ all -> 0x005f }
        r4 = r4.length();	 Catch:{ all -> 0x005f }
        r3 = r3 + r4;
        r2.<init>(r3);	 Catch:{ all -> 0x005f }
        r1 = r2.append(r1);	 Catch:{ all -> 0x005f }
        r1 = r1.append(r7);	 Catch:{ all -> 0x005f }
        r2 = "\n";
        r1 = r1.append(r2);	 Catch:{ all -> 0x005f }
        r1 = r1.toString();	 Catch:{ all -> 0x005f }
        r0.append(r1);	 Catch:{ all -> 0x005f }
        r0 = r6.k;	 Catch:{ all -> 0x005f }
        r0.remove(r7);	 Catch:{ all -> 0x005f }
        r0 = r6.b();	 Catch:{ all -> 0x005f }
        if (r0 == 0) goto L_0x00af;
    L_0x00a8:
        r0 = r6.m;	 Catch:{ all -> 0x005f }
        r1 = r6.n;	 Catch:{ all -> 0x005f }
        r0.submit(r1);	 Catch:{ all -> 0x005f }
    L_0x00af:
        r0 = 1;
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: dzi.c(java.lang.String):boolean");
    }

    private void f() {
        if (this.c == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public synchronized void close() {
        if (this.c != null) {
            ArrayList arrayList = new ArrayList(this.k.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                dzm dzm = (dzm) obj;
                if (dzm.d != null) {
                    dzm.d.b();
                }
            }
            c();
            this.c.close();
            this.c = null;
        }
    }

    void c() {
        while (this.j > this.i) {
            c((String) ((Entry) this.k.entrySet().iterator().next()).getKey());
        }
    }

    private void g() {
        close();
        a(this.a);
    }

    private static void d(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 44).append("keys must not contain spaces or newlines: \"").append(str).append("\"").toString());
        }
    }
}
