package defpackage;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/* renamed from: ikp */
public final class ikp {
    static ikp a;
    static final int b;
    final Handler c;
    final int[] d;
    final Runnable e;
    double f;
    ikr g;
    volatile int h;
    volatile int i;
    volatile int j;
    private final HandlerThread k;

    static {
        if (VERSION.SDK_INT >= 19) {
            b = Runtime.getRuntime().availableProcessors();
        } else {
            b = ikp.a("present");
        }
    }

    ikp() {
        this.e = new ikq(this);
        this.f = -1.0d;
        this.g = new ikr(this, 0, 0);
        this.d = new int[b];
        this.k = new HandlerThread("CpuMonitor");
        this.k.start();
        this.c = new Handler(this.k.getLooper());
        this.c.post(this.e);
    }

    public void a() {
        this.c.removeCallbacks(this.e);
        if (this.k.getLooper() != null) {
            this.k.getLooper().quit();
        }
    }

    public int b() {
        return this.j;
    }

    public int c() {
        return this.d[0];
    }

    public int d() {
        return this.h;
    }

    public int e() {
        return this.i;
    }

    static int a(String str) {
        String valueOf = String.valueOf("/sys/devices/system/cpu/");
        String valueOf2 = String.valueOf(str);
        if (valueOf2.length() != 0) {
            valueOf2 = valueOf.concat(valueOf2);
        } else {
            valueOf2 = new String(valueOf);
        }
        valueOf2 = ikp.c(valueOf2);
        if (valueOf2 == null) {
            return 1;
        }
        String[] split = valueOf2.split("\\-");
        if (split.length != 2) {
            return 1;
        }
        try {
            int parseInt = (Integer.parseInt(split[1]) - Integer.parseInt(split[0])) + 1;
            if (parseInt <= 0) {
                parseInt = 1;
            }
            return parseInt;
        } catch (NumberFormatException e) {
            valueOf2 = "Could not parse cpu count for state: ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                valueOf2.concat(valueOf);
                return 1;
            }
            valueOf = new String(valueOf2);
            return 1;
        }
    }

    private static String c(String str) {
        BufferedReader bufferedReader;
        String str2;
        String str3;
        String valueOf;
        Throwable th;
        String str4 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(str));
            try {
                str4 = bufferedReader.readLine();
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    itx.a(5, "vclib", "Could not close file reader.");
                }
            } catch (IOException e2) {
                try {
                    str2 = "vclib";
                    str3 = "Could not find or read from file: ";
                    valueOf = String.valueOf(str);
                    if (valueOf.length() == 0) {
                        valueOf = new String(str3);
                    } else {
                        valueOf = str3.concat(valueOf);
                    }
                    itx.a(3, str2, valueOf);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                            itx.a(5, "vclib", "Could not close file reader.");
                        }
                    }
                    return str4;
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e4) {
                            itx.a(5, "vclib", "Could not close file reader.");
                        }
                    }
                    throw th;
                }
            }
        } catch (IOException e5) {
            bufferedReader = str4;
            str2 = "vclib";
            str3 = "Could not find or read from file: ";
            valueOf = String.valueOf(str);
            if (valueOf.length() == 0) {
                valueOf = str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
            itx.a(3, str2, valueOf);
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            return str4;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            Object obj = str4;
            th = th4;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            throw th;
        }
        return str4;
    }

    static int b(String str) {
        int i = 0;
        String c = ikp.c(str);
        try {
            i = Integer.parseInt(c);
        } catch (NumberFormatException e) {
            new Object[1][i] = c;
        }
        return i;
    }

    ikr f() {
        Scanner scanner;
        int nextInt;
        Throwable th;
        int i = -1;
        String c = ikp.c("/proc/stat");
        if (c == null) {
            return new ikr(this, i, i);
        }
        try {
            scanner = new Scanner(c);
            try {
                scanner.next();
                nextInt = (scanner.nextInt() + scanner.nextInt()) + scanner.nextInt();
                try {
                    i = scanner.nextInt();
                    scanner.close();
                } catch (Exception e) {
                    try {
                        itx.a(5, "vclib", "Could not parse /proc/stat");
                        if (scanner != null) {
                            scanner.close();
                        }
                        return new ikr(this, nextInt, i);
                    } catch (Throwable th2) {
                        th = th2;
                        if (scanner != null) {
                            scanner.close();
                        }
                        throw th;
                    }
                }
            } catch (Exception e2) {
                nextInt = i;
                itx.a(5, "vclib", "Could not parse /proc/stat");
                if (scanner != null) {
                    scanner.close();
                }
                return new ikr(this, nextInt, i);
            }
        } catch (Exception e3) {
            scanner = null;
            nextInt = i;
            itx.a(5, "vclib", "Could not parse /proc/stat");
            if (scanner != null) {
                scanner.close();
            }
            return new ikr(this, nextInt, i);
        } catch (Throwable th3) {
            th = th3;
            scanner = null;
            if (scanner != null) {
                scanner.close();
            }
            throw th;
        }
        return new ikr(this, nextInt, i);
    }
}
