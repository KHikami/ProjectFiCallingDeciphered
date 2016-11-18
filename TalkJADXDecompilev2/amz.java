package defpackage;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
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
    final File a;
    final int b;
    Writer c;
    int d;
    final ThreadPoolExecutor e = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new anb());
    private final File f;
    private final File g;
    private final File h;
    private final int i;
    private long j;
    private long k = 0;
    private final LinkedHashMap<String, and> l = new LinkedHashMap(0, 0.75f, true);
    private long m = 0;
    private final Callable<Void> n = new ana(this);

    private amz(File file, int i, int i2, long j) {
        this.a = file;
        this.i = i;
        this.f = new File(file, "journal");
        this.g = new File(file, "journal.tmp");
        this.h = new File(file, "journal.bkp");
        this.b = i2;
        this.j = j;
    }

    public static amz a(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                amz.a(file2, file3, false);
            }
        }
        amz amz = new amz(file, 1, 1, j);
        if (amz.f.exists()) {
            try {
                amz.d();
                amz.e();
                return amz;
            } catch (IOException e) {
                PrintStream printStream = System.out;
                String valueOf = String.valueOf(file);
                String valueOf2 = String.valueOf(e.getMessage());
                printStream.println(new StringBuilder((String.valueOf(valueOf).length() + 36) + String.valueOf(valueOf2).length()).append("DiskLruCache ").append(valueOf).append(" is corrupt: ").append(valueOf2).append(", removing").toString());
                amz.g();
            }
        }
        file.mkdirs();
        amz = new amz(file, 1, 1, j);
        amz.a();
        return amz;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d() {
        /*
        r10 = this;
        r9 = 5;
        r8 = -1;
        r3 = new anf;
        r0 = new java.io.FileInputStream;
        r1 = r10.f;
        r0.<init>(r1);
        r1 = defpackage.anh.a;
        r3.<init>(r0, r1);
        r0 = r3.a();	 Catch:{ all -> 0x00b6 }
        r1 = r3.a();	 Catch:{ all -> 0x00b6 }
        r2 = r3.a();	 Catch:{ all -> 0x00b6 }
        r4 = r3.a();	 Catch:{ all -> 0x00b6 }
        r5 = r3.a();	 Catch:{ all -> 0x00b6 }
        r6 = "libcore.io.DiskLruCache";
        r6 = r6.equals(r0);	 Catch:{ all -> 0x00b6 }
        if (r6 == 0) goto L_0x0054;
    L_0x002c:
        r6 = "1";
        r6 = r6.equals(r1);	 Catch:{ all -> 0x00b6 }
        if (r6 == 0) goto L_0x0054;
    L_0x0034:
        r6 = r10.i;	 Catch:{ all -> 0x00b6 }
        r6 = java.lang.Integer.toString(r6);	 Catch:{ all -> 0x00b6 }
        r2 = r6.equals(r2);	 Catch:{ all -> 0x00b6 }
        if (r2 == 0) goto L_0x0054;
    L_0x0040:
        r2 = r10.b;	 Catch:{ all -> 0x00b6 }
        r2 = java.lang.Integer.toString(r2);	 Catch:{ all -> 0x00b6 }
        r2 = r2.equals(r4);	 Catch:{ all -> 0x00b6 }
        if (r2 == 0) goto L_0x0054;
    L_0x004c:
        r2 = "";
        r2 = r2.equals(r5);	 Catch:{ all -> 0x00b6 }
        if (r2 != 0) goto L_0x00bb;
    L_0x0054:
        r2 = new java.io.IOException;	 Catch:{ all -> 0x00b6 }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00b6 }
        r7 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x00b6 }
        r7 = r7.length();	 Catch:{ all -> 0x00b6 }
        r7 = r7 + 35;
        r8 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00b6 }
        r8 = r8.length();	 Catch:{ all -> 0x00b6 }
        r7 = r7 + r8;
        r8 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x00b6 }
        r8 = r8.length();	 Catch:{ all -> 0x00b6 }
        r7 = r7 + r8;
        r8 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x00b6 }
        r8 = r8.length();	 Catch:{ all -> 0x00b6 }
        r7 = r7 + r8;
        r6.<init>(r7);	 Catch:{ all -> 0x00b6 }
        r7 = "unexpected journal header: [";
        r6 = r6.append(r7);	 Catch:{ all -> 0x00b6 }
        r0 = r6.append(r0);	 Catch:{ all -> 0x00b6 }
        r6 = ", ";
        r0 = r0.append(r6);	 Catch:{ all -> 0x00b6 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x00b6 }
        r1 = ", ";
        r0 = r0.append(r1);	 Catch:{ all -> 0x00b6 }
        r0 = r0.append(r4);	 Catch:{ all -> 0x00b6 }
        r1 = ", ";
        r0 = r0.append(r1);	 Catch:{ all -> 0x00b6 }
        r0 = r0.append(r5);	 Catch:{ all -> 0x00b6 }
        r1 = "]";
        r0 = r0.append(r1);	 Catch:{ all -> 0x00b6 }
        r0 = r0.toString();	 Catch:{ all -> 0x00b6 }
        r2.<init>(r0);	 Catch:{ all -> 0x00b6 }
        throw r2;	 Catch:{ all -> 0x00b6 }
    L_0x00b6:
        r0 = move-exception;
        defpackage.anh.a(r3);
        throw r0;
    L_0x00bb:
        r0 = 0;
        r2 = r0;
    L_0x00bd:
        r4 = r3.a();	 Catch:{ EOFException -> 0x00df }
        r0 = 32;
        r5 = r4.indexOf(r0);	 Catch:{ EOFException -> 0x00df }
        if (r5 != r8) goto L_0x00fd;
    L_0x00c9:
        r1 = new java.io.IOException;	 Catch:{ EOFException -> 0x00df }
        r5 = "unexpected journal line: ";
        r0 = java.lang.String.valueOf(r4);	 Catch:{ EOFException -> 0x00df }
        r4 = r0.length();	 Catch:{ EOFException -> 0x00df }
        if (r4 == 0) goto L_0x00f7;
    L_0x00d7:
        r0 = r5.concat(r0);	 Catch:{ EOFException -> 0x00df }
    L_0x00db:
        r1.<init>(r0);	 Catch:{ EOFException -> 0x00df }
        throw r1;	 Catch:{ EOFException -> 0x00df }
    L_0x00df:
        r0 = move-exception;
        r0 = r10.l;	 Catch:{ all -> 0x00b6 }
        r0 = r0.size();	 Catch:{ all -> 0x00b6 }
        r0 = r2 - r0;
        r10.d = r0;	 Catch:{ all -> 0x00b6 }
        r0 = r3.b();	 Catch:{ all -> 0x00b6 }
        if (r0 == 0) goto L_0x0197;
    L_0x00f0:
        r10.a();	 Catch:{ all -> 0x00b6 }
    L_0x00f3:
        defpackage.anh.a(r3);
        return;
    L_0x00f7:
        r0 = new java.lang.String;	 Catch:{ EOFException -> 0x00df }
        r0.<init>(r5);	 Catch:{ EOFException -> 0x00df }
        goto L_0x00db;
    L_0x00fd:
        r0 = r5 + 1;
        r1 = 32;
        r6 = r4.indexOf(r1, r0);	 Catch:{ EOFException -> 0x00df }
        if (r6 != r8) goto L_0x011f;
    L_0x0107:
        r0 = r4.substring(r0);	 Catch:{ EOFException -> 0x00df }
        r1 = 6;
        if (r5 != r1) goto L_0x01af;
    L_0x010e:
        r1 = "REMOVE";
        r1 = r4.startsWith(r1);	 Catch:{ EOFException -> 0x00df }
        if (r1 == 0) goto L_0x01af;
    L_0x0116:
        r1 = r10.l;	 Catch:{ EOFException -> 0x00df }
        r1.remove(r0);	 Catch:{ EOFException -> 0x00df }
    L_0x011b:
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x00bd;
    L_0x011f:
        r0 = r4.substring(r0, r6);	 Catch:{ EOFException -> 0x00df }
        r1 = r0;
    L_0x0124:
        r0 = r10.l;	 Catch:{ EOFException -> 0x00df }
        r0 = r0.get(r1);	 Catch:{ EOFException -> 0x00df }
        r0 = (defpackage.and) r0;	 Catch:{ EOFException -> 0x00df }
        if (r0 != 0) goto L_0x0138;
    L_0x012e:
        r0 = new and;	 Catch:{ EOFException -> 0x00df }
        r0.<init>(r10, r1);	 Catch:{ EOFException -> 0x00df }
        r7 = r10.l;	 Catch:{ EOFException -> 0x00df }
        r7.put(r1, r0);	 Catch:{ EOFException -> 0x00df }
    L_0x0138:
        if (r6 == r8) goto L_0x015a;
    L_0x013a:
        if (r5 != r9) goto L_0x015a;
    L_0x013c:
        r1 = "CLEAN";
        r1 = r4.startsWith(r1);	 Catch:{ EOFException -> 0x00df }
        if (r1 == 0) goto L_0x015a;
    L_0x0144:
        r1 = r6 + 1;
        r1 = r4.substring(r1);	 Catch:{ EOFException -> 0x00df }
        r4 = " ";
        r1 = r1.split(r4);	 Catch:{ EOFException -> 0x00df }
        r4 = 1;
        r0.e = r4;	 Catch:{ EOFException -> 0x00df }
        r4 = 0;
        r0.f = r4;	 Catch:{ EOFException -> 0x00df }
        r0.a(r1);	 Catch:{ EOFException -> 0x00df }
        goto L_0x011b;
    L_0x015a:
        if (r6 != r8) goto L_0x016e;
    L_0x015c:
        if (r5 != r9) goto L_0x016e;
    L_0x015e:
        r1 = "DIRTY";
        r1 = r4.startsWith(r1);	 Catch:{ EOFException -> 0x00df }
        if (r1 == 0) goto L_0x016e;
    L_0x0166:
        r1 = new anc;	 Catch:{ EOFException -> 0x00df }
        r1.<init>(r10, r0);	 Catch:{ EOFException -> 0x00df }
        r0.f = r1;	 Catch:{ EOFException -> 0x00df }
        goto L_0x011b;
    L_0x016e:
        if (r6 != r8) goto L_0x017b;
    L_0x0170:
        r0 = 4;
        if (r5 != r0) goto L_0x017b;
    L_0x0173:
        r0 = "READ";
        r0 = r4.startsWith(r0);	 Catch:{ EOFException -> 0x00df }
        if (r0 != 0) goto L_0x011b;
    L_0x017b:
        r1 = new java.io.IOException;	 Catch:{ EOFException -> 0x00df }
        r5 = "unexpected journal line: ";
        r0 = java.lang.String.valueOf(r4);	 Catch:{ EOFException -> 0x00df }
        r4 = r0.length();	 Catch:{ EOFException -> 0x00df }
        if (r4 == 0) goto L_0x0191;
    L_0x0189:
        r0 = r5.concat(r0);	 Catch:{ EOFException -> 0x00df }
    L_0x018d:
        r1.<init>(r0);	 Catch:{ EOFException -> 0x00df }
        throw r1;	 Catch:{ EOFException -> 0x00df }
    L_0x0191:
        r0 = new java.lang.String;	 Catch:{ EOFException -> 0x00df }
        r0.<init>(r5);	 Catch:{ EOFException -> 0x00df }
        goto L_0x018d;
    L_0x0197:
        r0 = new java.io.BufferedWriter;	 Catch:{ all -> 0x00b6 }
        r1 = new java.io.OutputStreamWriter;	 Catch:{ all -> 0x00b6 }
        r2 = new java.io.FileOutputStream;	 Catch:{ all -> 0x00b6 }
        r4 = r10.f;	 Catch:{ all -> 0x00b6 }
        r5 = 1;
        r2.<init>(r4, r5);	 Catch:{ all -> 0x00b6 }
        r4 = defpackage.anh.a;	 Catch:{ all -> 0x00b6 }
        r1.<init>(r2, r4);	 Catch:{ all -> 0x00b6 }
        r0.<init>(r1);	 Catch:{ all -> 0x00b6 }
        r10.c = r0;	 Catch:{ all -> 0x00b6 }
        goto L_0x00f3;
    L_0x01af:
        r1 = r0;
        goto L_0x0124;
        */
        throw new UnsupportedOperationException("Method not decompiled: amz.d():void");
    }

    private void e() {
        amz.a(this.g);
        Iterator it = this.l.values().iterator();
        while (it.hasNext()) {
            and and = (and) it.next();
            int i;
            if (and.f == null) {
                for (i = 0; i < this.b; i++) {
                    this.k += and.b[i];
                }
            } else {
                and.f = null;
                for (i = 0; i < this.b; i++) {
                    amz.a(and.a(i));
                    amz.a(and.b(i));
                }
                it.remove();
            }
        }
    }

    synchronized void a() {
        if (this.c != null) {
            this.c.close();
        }
        Writer bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.g), anh.a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.i));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.b));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (and and : this.l.values()) {
                String valueOf;
                String str;
                if (and.f != null) {
                    valueOf = String.valueOf("DIRTY ");
                    str = and.a;
                    bufferedWriter.write(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append(str).append("\n").toString());
                } else {
                    valueOf = String.valueOf("CLEAN ");
                    String str2 = and.a;
                    str = String.valueOf(and.a());
                    bufferedWriter.write(new StringBuilder(((String.valueOf(valueOf).length() + 1) + String.valueOf(str2).length()) + String.valueOf(str).length()).append(valueOf).append(str2).append(str).append("\n").toString());
                }
            }
            bufferedWriter.close();
            if (this.f.exists()) {
                amz.a(this.f, this.h, true);
            }
            amz.a(this.g, this.f, false);
            this.h.delete();
            this.c = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f, true), anh.a));
        } catch (Throwable th) {
            bufferedWriter.close();
        }
    }

    private static void a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void a(File file, File file2, boolean z) {
        if (z) {
            amz.a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public synchronized ane a(String str) {
        ane ane = null;
        synchronized (this) {
            f();
            and and = (and) this.l.get(str);
            if (and != null) {
                if (and.e) {
                    for (File exists : and.c) {
                        if (!exists.exists()) {
                            break;
                        }
                    }
                    this.d++;
                    this.c.append("READ");
                    this.c.append(' ');
                    this.c.append(str);
                    this.c.append('\n');
                    if (b()) {
                        this.e.submit(this.n);
                    }
                    ane = new ane(this, str, and.g, and.c, and.b);
                }
            }
        }
        return ane;
    }

    public anc b(String str) {
        return a(str, -1);
    }

    private synchronized anc a(String str, long j) {
        anc anc;
        f();
        and and = (and) this.l.get(str);
        if (-1 == -1 || (and != null && and.g == -1)) {
            and and2;
            if (and == null) {
                and = new and(this, str);
                this.l.put(str, and);
                and2 = and;
            } else if (and.f != null) {
                anc = null;
            } else {
                and2 = and;
            }
            anc = new anc(this, and2);
            and2.f = anc;
            this.c.append("DIRTY");
            this.c.append(' ');
            this.c.append(str);
            this.c.append('\n');
            this.c.flush();
        } else {
            anc = null;
        }
        return anc;
    }

    synchronized void a(anc anc, boolean z) {
        int i = 0;
        synchronized (this) {
            and and = anc.a;
            if (and.f != anc) {
                throw new IllegalStateException();
            }
            if (z) {
                if (!and.e) {
                    int i2 = 0;
                    while (i2 < this.b) {
                        if (!anc.b[i2]) {
                            anc.b();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                        } else if (!and.b(i2).exists()) {
                            anc.b();
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            while (i < this.b) {
                File b = and.b(i);
                if (!z) {
                    amz.a(b);
                } else if (b.exists()) {
                    File a = and.a(i);
                    b.renameTo(a);
                    long j = and.b[i];
                    long length = a.length();
                    and.b[i] = length;
                    this.k = (this.k - j) + length;
                }
                i++;
            }
            this.d++;
            and.f = null;
            if ((and.e | z) != 0) {
                and.e = true;
                this.c.append("CLEAN");
                this.c.append(' ');
                this.c.append(and.a);
                this.c.append(and.a());
                this.c.append('\n');
                if (z) {
                    long j2 = this.m;
                    this.m = 1 + j2;
                    and.g = j2;
                }
            } else {
                this.l.remove(and.a);
                this.c.append("REMOVE");
                this.c.append(' ');
                this.c.append(and.a);
                this.c.append('\n');
            }
            this.c.flush();
            if (this.k > this.j || b()) {
                this.e.submit(this.n);
            }
        }
    }

    boolean b() {
        return this.d >= 2000 && this.d >= this.l.size();
    }

    private synchronized boolean c(String str) {
        boolean z;
        int i = 0;
        synchronized (this) {
            f();
            and and = (and) this.l.get(str);
            if (and == null || and.f != null) {
                z = false;
            } else {
                while (i < this.b) {
                    File a = and.a(i);
                    if (!a.exists() || a.delete()) {
                        this.k -= and.b[i];
                        and.b[i] = 0;
                        i++;
                    } else {
                        String valueOf = String.valueOf(a);
                        throw new IOException(new StringBuilder(String.valueOf(valueOf).length() + 17).append("failed to delete ").append(valueOf).toString());
                    }
                }
                this.d++;
                this.c.append("REMOVE");
                this.c.append(' ');
                this.c.append(str);
                this.c.append('\n');
                this.l.remove(str);
                if (b()) {
                    this.e.submit(this.n);
                }
                z = true;
            }
        }
        return z;
    }

    private void f() {
        if (this.c == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public synchronized void close() {
        if (this.c != null) {
            ArrayList arrayList = new ArrayList(this.l.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                and and = (and) obj;
                if (and.f != null) {
                    and.f.b();
                }
            }
            c();
            this.c.close();
            this.c = null;
        }
    }

    void c() {
        while (this.k > this.j) {
            c((String) ((Entry) this.l.entrySet().iterator().next()).getKey());
        }
    }

    private void g() {
        close();
        anh.a(this.a);
    }
}
