package defpackage;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

public final class dzp implements alf {
    private static final boolean a = false;
    private dzi b;
    private final File c;
    private final int d;

    static {
        kae kae = glk.i;
    }

    public dzp(File file, int i) {
        String valueOf = String.valueOf(file.getAbsolutePath());
        String valueOf2 = String.valueOf("/volleyCache");
        this.c = new File(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        this.d = i;
    }

    public synchronized void a() {
        try {
            this.b = dzi.a(this.c, 538181937, 1, (long) this.d);
        } catch (IOException e) {
            glk.e("Babel", "VolleyDiskCache: IO exception on initialize", new Object[0]);
            throw new RuntimeException("Couldn't initialize volley disk cache");
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(java.lang.String r7, defpackage.alg r8) {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = 0;
        r1 = r7.hashCode();	 Catch:{ IOException -> 0x004c, all -> 0x0078 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ IOException -> 0x004c, all -> 0x0078 }
        r2 = a;	 Catch:{ IOException -> 0x004c, all -> 0x0078 }
        if (r2 == 0) goto L_0x001d;
    L_0x000e:
        r2 = "VolleyDiskCache: Cache put ";
        r3 = java.lang.String.valueOf(r7);	 Catch:{ IOException -> 0x004c, all -> 0x0078 }
        r4 = r3.length();	 Catch:{ IOException -> 0x004c, all -> 0x0078 }
        if (r4 == 0) goto L_0x0046;
    L_0x001a:
        r2.concat(r3);	 Catch:{ IOException -> 0x004c, all -> 0x0078 }
    L_0x001d:
        r2 = r6.b;	 Catch:{ IOException -> 0x004c, all -> 0x0078 }
        r1 = r2.b(r1);	 Catch:{ IOException -> 0x004c, all -> 0x0078 }
        r2 = 0;
        r0 = r1.a(r2);	 Catch:{ IOException -> 0x004c, all -> 0x0078 }
        r2 = r8.g;	 Catch:{ IOException -> 0x004c }
        r3 = "VolleyDiskCache";
        r4 = "VolleyDiskCache";
        r2.put(r3, r4);	 Catch:{ IOException -> 0x004c }
        r2 = new dzq;	 Catch:{ IOException -> 0x004c }
        r2.<init>(r7, r8);	 Catch:{ IOException -> 0x004c }
        r2.a(r0);	 Catch:{ IOException -> 0x004c }
        r2 = r8.a;	 Catch:{ IOException -> 0x004c }
        r0.write(r2);	 Catch:{ IOException -> 0x004c }
        r1.a();	 Catch:{ IOException -> 0x004c }
        r0.close();	 Catch:{ IOException -> 0x006c }
    L_0x0044:
        monitor-exit(r6);
        return;
    L_0x0046:
        r3 = new java.lang.String;	 Catch:{ IOException -> 0x004c, all -> 0x0078 }
        r3.<init>(r2);	 Catch:{ IOException -> 0x004c, all -> 0x0078 }
        goto L_0x001d;
    L_0x004c:
        r1 = move-exception;
        r1 = "Babel";
        r2 = "VolleyDiskCache: IO exception on put";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x008e }
        defpackage.glk.e(r1, r2, r3);	 Catch:{ all -> 0x008e }
        if (r0 == 0) goto L_0x0044;
    L_0x0059:
        r0.close();	 Catch:{ IOException -> 0x005d }
        goto L_0x0044;
    L_0x005d:
        r0 = move-exception;
        r0 = "Babel";
        r1 = "VolleyDiskCache: IO exception on put";
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0069 }
        defpackage.glk.e(r0, r1, r2);	 Catch:{ all -> 0x0069 }
        goto L_0x0044;
    L_0x0069:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
    L_0x006c:
        r0 = move-exception;
        r0 = "Babel";
        r1 = "VolleyDiskCache: IO exception on put";
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0069 }
        defpackage.glk.e(r0, r1, r2);	 Catch:{ all -> 0x0069 }
        goto L_0x0044;
    L_0x0078:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
    L_0x007c:
        if (r1 == 0) goto L_0x0081;
    L_0x007e:
        r1.close();	 Catch:{ IOException -> 0x0082 }
    L_0x0081:
        throw r0;	 Catch:{ all -> 0x0069 }
    L_0x0082:
        r1 = move-exception;
        r1 = "Babel";
        r2 = "VolleyDiskCache: IO exception on put";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x0069 }
        defpackage.glk.e(r1, r2, r3);	 Catch:{ all -> 0x0069 }
        goto L_0x0081;
    L_0x008e:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
        goto L_0x007c;
        */
        throw new UnsupportedOperationException("Method not decompiled: dzp.a(java.lang.String, alg):void");
    }

    public synchronized alg a(String str) {
        InputStream a;
        Throwable th;
        alg alg = null;
        synchronized (this) {
            try {
                dzn a2 = this.b.a(String.valueOf(str.hashCode()));
                String str2;
                if (a2 != null) {
                    a = a2.a(0);
                    try {
                        dzq dzq = new dzq();
                        if (dzp.a(a) != 538181937) {
                            throw new IOException();
                        }
                        dzq.a = dzp.a(a);
                        dzq.b = dzp.c(a);
                        dzq.c = dzp.c(a);
                        if (dzq.c.equals("")) {
                            dzq.c = null;
                        }
                        dzq.d = dzp.b(a);
                        dzq.e = dzp.b(a);
                        dzq.f = dzp.b(a);
                        dzq.g = dzp.d(a);
                        if (dzq.b.equals(str)) {
                            byte[] a3 = dzp.a(a, dzq.a);
                            if (a) {
                                String str3 = "VolleyDiskCache: Cache hit ";
                                String valueOf = String.valueOf(str);
                                if (valueOf.length() != 0) {
                                    str3.concat(valueOf);
                                } else {
                                    valueOf = new String(str3);
                                }
                            }
                            alg = dzq.a(a3);
                            if (a != null) {
                                try {
                                    a.close();
                                } catch (IOException e) {
                                    glk.e("Babel", "VolleyDiskCache: IO exception on get", new Object[0]);
                                }
                            }
                        } else {
                            if (a) {
                                str2 = "VolleyDiskCache: Cache miss (hash collision) ";
                                String valueOf2 = String.valueOf(str);
                                if (valueOf2.length() != 0) {
                                    str2.concat(valueOf2);
                                } else {
                                    valueOf2 = new String(str2);
                                }
                            }
                            if (a != null) {
                                try {
                                    a.close();
                                } catch (IOException e2) {
                                    glk.e("Babel", "VolleyDiskCache: IO exception on get", new Object[0]);
                                }
                            }
                        }
                    } catch (IOException e3) {
                        try {
                            glk.e("Babel", "VolleyDiskCache: IO exception on get", new Object[0]);
                            if (a != null) {
                                try {
                                    a.close();
                                } catch (IOException e4) {
                                    glk.e("Babel", "VolleyDiskCache: IO exception on get", new Object[0]);
                                }
                            }
                            return alg;
                        } catch (Throwable th2) {
                            th = th2;
                            if (a != null) {
                                try {
                                    a.close();
                                } catch (IOException e5) {
                                    glk.e("Babel", "VolleyDiskCache: IO exception on get", new Object[0]);
                                }
                            }
                            throw th;
                        }
                    }
                } else if (a) {
                    String str4 = "VolleyDiskCache: Cache miss ";
                    str2 = String.valueOf(str);
                    if (str2.length() != 0) {
                        str4.concat(str2);
                    } else {
                        str2 = new String(str4);
                    }
                }
            } catch (IOException e6) {
                a = null;
                glk.e("Babel", "VolleyDiskCache: IO exception on get", new Object[0]);
                if (a != null) {
                    a.close();
                }
                return alg;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                a = null;
                th = th4;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        }
        return alg;
    }

    public synchronized void b(String str) {
        try {
            String valueOf = String.valueOf(str.hashCode());
            if (a) {
                String str2 = "VolleyDiskCache: Cache remove ";
                String valueOf2 = String.valueOf(str);
                if (valueOf2.length() != 0) {
                    str2.concat(valueOf2);
                } else {
                    valueOf2 = new String(str2);
                }
            }
            this.b.c(valueOf);
        } catch (IOException e) {
        }
    }

    private static int e(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    static void a(OutputStream outputStream, int i) {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write(i >>> 24);
    }

    static int a(InputStream inputStream) {
        return (((dzp.e(inputStream) | 0) | (dzp.e(inputStream) << 8)) | (dzp.e(inputStream) << 16)) | (dzp.e(inputStream) << 24);
    }

    static void a(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    static long b(InputStream inputStream) {
        return (((((((0 | (((long) dzp.e(inputStream)) & 255)) | ((((long) dzp.e(inputStream)) & 255) << 8)) | ((((long) dzp.e(inputStream)) & 255) << 16)) | ((((long) dzp.e(inputStream)) & 255) << 24)) | ((((long) dzp.e(inputStream)) & 255) << 32)) | ((((long) dzp.e(inputStream)) & 255) << 40)) | ((((long) dzp.e(inputStream)) & 255) << 48)) | ((((long) dzp.e(inputStream)) & 255) << 56);
    }

    static void a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        dzp.a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    static String c(InputStream inputStream) {
        return new String(dzp.a(inputStream, (int) dzp.b(inputStream)), "UTF-8");
    }

    static void a(Map<String, String> map, OutputStream outputStream) {
        if (map != null) {
            dzp.a(outputStream, map.size());
            for (Entry entry : map.entrySet()) {
                dzp.a(outputStream, (String) entry.getKey());
                dzp.a(outputStream, (String) entry.getValue());
            }
            return;
        }
        dzp.a(outputStream, 0);
    }

    static Map<String, String> d(InputStream inputStream) {
        Map<String, String> emptyMap;
        int a = dzp.a(inputStream);
        if (a == 0) {
            emptyMap = Collections.emptyMap();
        } else {
            emptyMap = new ky(a);
        }
        for (int i = 0; i < a; i++) {
            emptyMap.put(dzp.c(inputStream).intern(), dzp.c(inputStream).intern());
        }
        return emptyMap;
    }

    private static byte[] a(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == i) {
            return bArr;
        }
        throw new IOException("Expected " + i + " bytes, read " + i2 + " bytes");
    }
}
