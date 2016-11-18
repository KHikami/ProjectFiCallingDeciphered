package p000;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.lang.reflect.Array;
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
    private static final Charset f10901e = Charset.forName("UTF-8");
    final File f10902a;
    final int f10903b;
    Writer f10904c;
    int f10905d;
    private final File f10906f;
    private final File f10907g;
    private final int f10908h;
    private final long f10909i;
    private long f10910j = 0;
    private final LinkedHashMap<String, dzm> f10911k = new LinkedHashMap(0, 0.75f, true);
    private long f10912l = 0;
    private final ExecutorService f10913m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final Callable<Void> f10914n = new dzj(this);

    private static String m13152a(InputStream inputStream) {
        int read;
        StringBuilder stringBuilder = new StringBuilder(80);
        while (true) {
            read = inputStream.read();
            if (read != -1) {
                if (read == 10) {
                    break;
                }
                stringBuilder.append((char) read);
            } else {
                throw new EOFException();
            }
        }
        read = stringBuilder.length();
        if (read > 0 && stringBuilder.charAt(read - 1) == '\r') {
            stringBuilder.setLength(read - 1);
        }
        return stringBuilder.toString();
    }

    public static void m13153a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    private static void m13154a(File file) {
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
                dzi.m13154a(file2);
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
        this.f10902a = file;
        this.f10908h = i;
        this.f10906f = new File(file, "journal");
        this.f10907g = new File(file, "journal.tmp");
        this.f10903b = i2;
        this.f10909i = j;
    }

    public static dzi m13150a(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        dzi dzi = new dzi(file, 538181937, 1, j);
        if (dzi.f10906f.exists()) {
            try {
                dzi.m13156d();
                dzi.m13158e();
                dzi.f10904c = new BufferedWriter(new FileWriter(dzi.f10906f, true), 8192);
                return dzi;
            } catch (IOException e) {
                dzi.m13160g();
            }
        }
        file.mkdirs();
        dzi = new dzi(file, 538181937, 1, j);
        dzi.m13162a();
        return dzi;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13156d() {
        Closeable bufferedInputStream = new BufferedInputStream(new FileInputStream(this.f10906f), 8192);
        try {
            String a = dzi.m13152a((InputStream) bufferedInputStream);
            String a2 = dzi.m13152a((InputStream) bufferedInputStream);
            String a3 = dzi.m13152a((InputStream) bufferedInputStream);
            String a4 = dzi.m13152a((InputStream) bufferedInputStream);
            String a5 = dzi.m13152a((InputStream) bufferedInputStream);
            if ("com.google.android.apps.hangouts.network".equals(a) && "1".equals(a2) && Integer.toString(this.f10908h).equals(a3) && Integer.toString(this.f10903b).equals(a4) && "".equals(a5)) {
                while (true) {
                    a3 = dzi.m13152a((InputStream) bufferedInputStream);
                    Object split = a3.split(" ");
                    if (split.length < 2) {
                        break;
                    }
                    try {
                        a2 = split[1];
                        if (split[0].equals("REMOVE") && split.length == 2) {
                            this.f10911k.remove(a2);
                        } else {
                            dzm dzm;
                            dzm dzm2 = (dzm) this.f10911k.get(a2);
                            if (dzm2 == null) {
                                dzm2 = new dzm(this, a2);
                                this.f10911k.put(a2, dzm2);
                                dzm = dzm2;
                            } else {
                                dzm = dzm2;
                            }
                            if (split[0].equals("CLEAN") && split.length == this.f10903b + 2) {
                                dzm.f10922c = true;
                                dzm.f10923d = null;
                                int length = split.length;
                                int length2 = split.length;
                                if (2 > length) {
                                    throw new IllegalArgumentException();
                                } else if (2 > length2) {
                                    throw new ArrayIndexOutOfBoundsException();
                                } else {
                                    length -= 2;
                                    length2 = Math.min(length, length2 - 2);
                                    Object[] objArr = (Object[]) Array.newInstance(split.getClass().getComponentType(), length);
                                    System.arraycopy(split, 2, objArr, 0, length2);
                                    dzm.m13175a((String[]) objArr);
                                }
                            } else if (split[0].equals("DIRTY") && split.length == 2) {
                                dzm.f10923d = new dzk(this, dzm);
                            } else if (!split[0].equals("READ") || split.length != 2) {
                                a4 = "unexpected journal line: ";
                                a = String.valueOf(a3);
                            }
                        }
                    } catch (EOFException e) {
                        dzi.m13153a(bufferedInputStream);
                        return;
                    }
                }
                a4 = "unexpected journal line: ";
                a = String.valueOf(a3);
                throw new IOException(a.length() != 0 ? a4.concat(a) : new String(a4));
            }
            throw new IOException(new StringBuilder((((String.valueOf(a).length() + 35) + String.valueOf(a2).length()) + String.valueOf(a4).length()) + String.valueOf(a5).length()).append("unexpected journal header: [").append(a).append(", ").append(a2).append(", ").append(a4).append(", ").append(a5).append("]").toString());
        } catch (Throwable th) {
            dzi.m13153a(bufferedInputStream);
        }
    }

    private void m13158e() {
        dzi.m13155b(this.f10907g);
        Iterator it = this.f10911k.values().iterator();
        while (it.hasNext()) {
            dzm dzm = (dzm) it.next();
            int i;
            if (dzm.f10923d == null) {
                for (i = 0; i < this.f10903b; i++) {
                    this.f10910j += dzm.f10921b[i];
                }
            } else {
                dzm.f10923d = null;
                for (i = 0; i < this.f10903b; i++) {
                    dzi.m13155b(dzm.m13173a(i));
                    dzi.m13155b(dzm.m13176b(i));
                }
                it.remove();
            }
        }
    }

    synchronized void m13162a() {
        if (this.f10904c != null) {
            this.f10904c.close();
        }
        Writer bufferedWriter = new BufferedWriter(new FileWriter(this.f10907g), 8192);
        bufferedWriter.write("com.google.android.apps.hangouts.network");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f10908h));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f10903b));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (dzm dzm : this.f10911k.values()) {
            String valueOf;
            String str;
            if (dzm.f10923d != null) {
                valueOf = String.valueOf("DIRTY ");
                str = dzm.f10920a;
                bufferedWriter.write(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append(str).append("\n").toString());
            } else {
                valueOf = String.valueOf("CLEAN ");
                String str2 = dzm.f10920a;
                str = String.valueOf(dzm.m13174a());
                bufferedWriter.write(new StringBuilder(((String.valueOf(valueOf).length() + 1) + String.valueOf(str2).length()) + String.valueOf(str).length()).append(valueOf).append(str2).append(str).append("\n").toString());
            }
        }
        bufferedWriter.close();
        this.f10907g.renameTo(this.f10906f);
        this.f10904c = new BufferedWriter(new FileWriter(this.f10906f, true), 8192);
    }

    private static void m13155b(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public synchronized dzn m13161a(String str) {
        dzn dzn = null;
        synchronized (this) {
            m13159f();
            dzi.m13157d(str);
            dzm dzm = (dzm) this.f10911k.get(str);
            if (dzm != null) {
                if (dzm.f10922c) {
                    InputStream[] inputStreamArr = new InputStream[this.f10903b];
                    int i = 0;
                    while (i < this.f10903b) {
                        try {
                            inputStreamArr[i] = new FileInputStream(dzm.m13173a(i));
                            i++;
                        } catch (FileNotFoundException e) {
                        }
                    }
                    this.f10905d++;
                    Writer writer = this.f10904c;
                    String valueOf = String.valueOf("READ ");
                    writer.append(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append(str).append("\n").toString());
                    if (m13165b()) {
                        this.f10913m.submit(this.f10914n);
                    }
                    dzn = new dzn(this, str, dzm.f10924e, inputStreamArr);
                }
            }
        }
        return dzn;
    }

    public dzk m13164b(String str) {
        return m13151a(str, -1);
    }

    private synchronized dzk m13151a(String str, long j) {
        dzk dzk;
        m13159f();
        dzi.m13157d(str);
        dzm dzm = (dzm) this.f10911k.get(str);
        if (-1 == -1 || (dzm != null && dzm.f10924e == -1)) {
            dzm dzm2;
            if (dzm == null) {
                dzm = new dzm(this, str);
                this.f10911k.put(str, dzm);
                dzm2 = dzm;
            } else if (dzm.f10923d != null) {
                dzk = null;
            } else {
                dzm2 = dzm;
            }
            dzk = new dzk(this, dzm2);
            dzm2.f10923d = dzk;
            Writer writer = this.f10904c;
            String valueOf = String.valueOf("DIRTY ");
            writer.write(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append(str).append("\n").toString());
            this.f10904c.flush();
        } else {
            dzk = null;
        }
        return dzk;
    }

    synchronized void m13163a(dzk dzk, boolean z) {
        int i = 0;
        synchronized (this) {
            dzm dzm = dzk.f10916a;
            if (dzm.f10923d != dzk) {
                throw new IllegalStateException();
            }
            if (z) {
                if (!dzm.f10922c) {
                    int i2 = 0;
                    while (i2 < this.f10903b) {
                        if (dzm.m13176b(i2).exists()) {
                            i2++;
                        } else {
                            dzk.m13171b();
                            throw new IllegalStateException("edit didn't create file " + i2);
                        }
                    }
                }
            }
            while (i < this.f10903b) {
                File b = dzm.m13176b(i);
                if (!z) {
                    dzi.m13155b(b);
                } else if (b.exists()) {
                    File a = dzm.m13173a(i);
                    b.renameTo(a);
                    long j = dzm.f10921b[i];
                    long length = a.length();
                    dzm.f10921b[i] = length;
                    this.f10910j = (this.f10910j - j) + length;
                }
                i++;
            }
            this.f10905d++;
            dzm.f10923d = null;
            Writer writer;
            String valueOf;
            if ((dzm.f10922c | z) != 0) {
                dzm.f10922c = true;
                writer = this.f10904c;
                valueOf = String.valueOf("CLEAN ");
                String str = dzm.f10920a;
                String valueOf2 = String.valueOf(dzm.m13174a());
                writer.write(new StringBuilder(((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str).append(valueOf2).append("\n").toString());
                if (z) {
                    long j2 = this.f10912l;
                    this.f10912l = 1 + j2;
                    dzm.f10924e = j2;
                }
            } else {
                this.f10911k.remove(dzm.f10920a);
                writer = this.f10904c;
                valueOf = String.valueOf("REMOVE ");
                String str2 = dzm.f10920a;
                writer.write(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str2).length()).append(valueOf).append(str2).append("\n").toString());
            }
            if (this.f10910j > this.f10909i || m13165b()) {
                this.f10913m.submit(this.f10914n);
            }
        }
    }

    boolean m13165b() {
        return this.f10905d >= 2000 && this.f10905d >= this.f10911k.size();
    }

    public synchronized boolean m13167c(String str) {
        boolean z;
        int i = 0;
        synchronized (this) {
            m13159f();
            dzi.m13157d(str);
            dzm dzm = (dzm) this.f10911k.get(str);
            if (dzm == null || dzm.f10923d != null) {
                z = false;
            } else {
                String valueOf;
                while (i < this.f10903b) {
                    File a = dzm.m13173a(i);
                    if (a.delete()) {
                        this.f10910j -= dzm.f10921b[i];
                        dzm.f10921b[i] = 0;
                        i++;
                    } else {
                        valueOf = String.valueOf(a);
                        throw new IOException(new StringBuilder(String.valueOf(valueOf).length() + 17).append("failed to delete ").append(valueOf).toString());
                    }
                }
                this.f10905d++;
                Writer writer = this.f10904c;
                valueOf = String.valueOf("REMOVE ");
                writer.append(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append(str).append("\n").toString());
                this.f10911k.remove(str);
                if (m13165b()) {
                    this.f10913m.submit(this.f10914n);
                }
                z = true;
            }
        }
        return z;
    }

    private void m13159f() {
        if (this.f10904c == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public synchronized void close() {
        if (this.f10904c != null) {
            ArrayList arrayList = new ArrayList(this.f10911k.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                dzm dzm = (dzm) obj;
                if (dzm.f10923d != null) {
                    dzm.f10923d.m13171b();
                }
            }
            m13166c();
            this.f10904c.close();
            this.f10904c = null;
        }
    }

    void m13166c() {
        while (this.f10910j > this.f10909i) {
            m13167c((String) ((Entry) this.f10911k.entrySet().iterator().next()).getKey());
        }
    }

    private void m13160g() {
        close();
        dzi.m13154a(this.f10902a);
    }

    private static void m13157d(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 44).append("keys must not contain spaces or newlines: \"").append(str).append("\"").toString());
        }
    }
}
