package p000;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

public final class dzp implements alf {
    private static final boolean f10930a = false;
    private dzi f10931b;
    private final File f10932c;
    private final int f10933d;

    static {
        kae kae = glk.f15562i;
    }

    public dzp(File file, int i) {
        String valueOf = String.valueOf(file.getAbsolutePath());
        String valueOf2 = String.valueOf("/volleyCache");
        this.f10932c = new File(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        this.f10933d = i;
    }

    public synchronized void mo1787a() {
        try {
            this.f10931b = dzi.m13150a(this.f10932c, 538181937, 1, (long) this.f10933d);
        } catch (IOException e) {
            glk.m17982e("Babel", "VolleyDiskCache: IO exception on initialize", new Object[0]);
            throw new RuntimeException("Couldn't initialize volley disk cache");
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo1788a(String str, alg alg) {
        OutputStream outputStream = null;
        try {
            String valueOf = String.valueOf(str.hashCode());
            if (f10930a) {
                String str2 = "VolleyDiskCache: Cache put ";
                String valueOf2 = String.valueOf(str);
                if (valueOf2.length() != 0) {
                    str2.concat(valueOf2);
                } else {
                    valueOf2 = new String(str2);
                }
            }
            dzk b = this.f10931b.m13164b(valueOf);
            outputStream = b.m13169a(0);
            alg.f1188g.put("VolleyDiskCache", "VolleyDiskCache");
            new dzq(str, alg).m13193a(outputStream);
            outputStream.write(alg.f1182a);
            b.m13170a();
            try {
                outputStream.close();
            } catch (IOException e) {
                glk.m17982e("Babel", "VolleyDiskCache: IO exception on put", new Object[0]);
            }
        } catch (IOException e2) {
            glk.m17982e("Babel", "VolleyDiskCache: IO exception on put", new Object[0]);
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e3) {
                    glk.m17982e("Babel", "VolleyDiskCache: IO exception on put", new Object[0]);
                }
            }
        } catch (Throwable th) {
            Throwable th2 = th;
            OutputStream outputStream2 = outputStream;
            Throwable th3 = th2;
            if (outputStream2 != null) {
                try {
                    outputStream2.close();
                } catch (IOException e4) {
                    glk.m17982e("Babel", "VolleyDiskCache: IO exception on put", new Object[0]);
                }
            }
            throw th3;
        }
    }

    public synchronized alg mo1786a(String str) {
        Throwable th;
        alg alg = null;
        synchronized (this) {
            InputStream a;
            try {
                dzn a2 = this.f10931b.m13161a(String.valueOf(str.hashCode()));
                String str2;
                if (a2 != null) {
                    a = a2.m13177a(0);
                    try {
                        dzq dzq = new dzq();
                        if (dzp.m13178a(a) != 538181937) {
                            throw new IOException();
                        }
                        dzq.f10934a = dzp.m13178a(a);
                        dzq.f10935b = dzp.m13185c(a);
                        dzq.f10936c = dzp.m13185c(a);
                        if (dzq.f10936c.equals("")) {
                            dzq.f10936c = null;
                        }
                        dzq.f10937d = dzp.m13184b(a);
                        dzq.f10938e = dzp.m13184b(a);
                        dzq.f10939f = dzp.m13184b(a);
                        dzq.f10940g = dzp.m13186d(a);
                        if (dzq.f10935b.equals(str)) {
                            byte[] a3 = dzp.m13183a(a, dzq.f10934a);
                            if (f10930a) {
                                String str3 = "VolleyDiskCache: Cache hit ";
                                String valueOf = String.valueOf(str);
                                if (valueOf.length() != 0) {
                                    str3.concat(valueOf);
                                } else {
                                    valueOf = new String(str3);
                                }
                            }
                            alg = dzq.m13192a(a3);
                            if (a != null) {
                                try {
                                    a.close();
                                } catch (IOException e) {
                                    glk.m17982e("Babel", "VolleyDiskCache: IO exception on get", new Object[0]);
                                }
                            }
                        } else {
                            if (f10930a) {
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
                                    glk.m17982e("Babel", "VolleyDiskCache: IO exception on get", new Object[0]);
                                }
                            }
                        }
                    } catch (IOException e3) {
                        try {
                            glk.m17982e("Babel", "VolleyDiskCache: IO exception on get", new Object[0]);
                            if (a != null) {
                                try {
                                    a.close();
                                } catch (IOException e4) {
                                    glk.m17982e("Babel", "VolleyDiskCache: IO exception on get", new Object[0]);
                                }
                            }
                            return alg;
                        } catch (Throwable th2) {
                            th = th2;
                            if (a != null) {
                                try {
                                    a.close();
                                } catch (IOException e5) {
                                    glk.m17982e("Babel", "VolleyDiskCache: IO exception on get", new Object[0]);
                                }
                            }
                            throw th;
                        }
                    }
                } else if (f10930a) {
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
                glk.m17982e("Babel", "VolleyDiskCache: IO exception on get", new Object[0]);
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

    public synchronized void mo1789b(String str) {
        try {
            String valueOf = String.valueOf(str.hashCode());
            if (f10930a) {
                String str2 = "VolleyDiskCache: Cache remove ";
                String valueOf2 = String.valueOf(str);
                if (valueOf2.length() != 0) {
                    str2.concat(valueOf2);
                } else {
                    valueOf2 = new String(str2);
                }
            }
            this.f10931b.m13167c(valueOf);
        } catch (IOException e) {
        }
    }

    private static int m13187e(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    static void m13179a(OutputStream outputStream, int i) {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write(i >>> 24);
    }

    static int m13178a(InputStream inputStream) {
        return (((dzp.m13187e(inputStream) | 0) | (dzp.m13187e(inputStream) << 8)) | (dzp.m13187e(inputStream) << 16)) | (dzp.m13187e(inputStream) << 24);
    }

    static void m13180a(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    static long m13184b(InputStream inputStream) {
        return (((((((0 | (((long) dzp.m13187e(inputStream)) & 255)) | ((((long) dzp.m13187e(inputStream)) & 255) << 8)) | ((((long) dzp.m13187e(inputStream)) & 255) << 16)) | ((((long) dzp.m13187e(inputStream)) & 255) << 24)) | ((((long) dzp.m13187e(inputStream)) & 255) << 32)) | ((((long) dzp.m13187e(inputStream)) & 255) << 40)) | ((((long) dzp.m13187e(inputStream)) & 255) << 48)) | ((((long) dzp.m13187e(inputStream)) & 255) << 56);
    }

    static void m13181a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        dzp.m13180a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    static String m13185c(InputStream inputStream) {
        return new String(dzp.m13183a(inputStream, (int) dzp.m13184b(inputStream)), "UTF-8");
    }

    static void m13182a(Map<String, String> map, OutputStream outputStream) {
        if (map != null) {
            dzp.m13179a(outputStream, map.size());
            for (Entry entry : map.entrySet()) {
                dzp.m13181a(outputStream, (String) entry.getKey());
                dzp.m13181a(outputStream, (String) entry.getValue());
            }
            return;
        }
        dzp.m13179a(outputStream, 0);
    }

    static Map<String, String> m13186d(InputStream inputStream) {
        Map<String, String> emptyMap;
        int a = dzp.m13178a(inputStream);
        if (a == 0) {
            emptyMap = Collections.emptyMap();
        } else {
            emptyMap = new ky(a);
        }
        for (int i = 0; i < a; i++) {
            emptyMap.put(dzp.m13185c(inputStream).intern(), dzp.m13185c(inputStream).intern());
        }
        return emptyMap;
    }

    private static byte[] m13183a(InputStream inputStream, int i) {
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
