package p000;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public final class ikp {
    static ikp f17924a;
    static final int f17925b;
    final Handler f17926c;
    final int[] f17927d = new int[f17925b];
    final Runnable f17928e = new ikq(this);
    double f17929f = -1.0d;
    ikr f17930g = new ikr(this, 0, 0);
    volatile int f17931h;
    volatile int f17932i;
    volatile int f17933j;
    private final HandlerThread f17934k = new HandlerThread("CpuMonitor");

    static {
        if (VERSION.SDK_INT >= 19) {
            f17925b = Runtime.getRuntime().availableProcessors();
        } else {
            f17925b = ikp.m22190a("present");
        }
    }

    ikp() {
        this.f17934k.start();
        this.f17926c = new Handler(this.f17934k.getLooper());
        this.f17926c.post(this.f17928e);
    }

    public void m22193a() {
        this.f17926c.removeCallbacks(this.f17928e);
        if (this.f17934k.getLooper() != null) {
            this.f17934k.getLooper().quit();
        }
    }

    public int m22194b() {
        return this.f17933j;
    }

    public int m22195c() {
        return this.f17927d[0];
    }

    public int m22196d() {
        return this.f17931h;
    }

    public int m22197e() {
        return this.f17932i;
    }

    static int m22190a(String str) {
        String valueOf = String.valueOf("/sys/devices/system/cpu/");
        String valueOf2 = String.valueOf(str);
        if (valueOf2.length() != 0) {
            valueOf2 = valueOf.concat(valueOf2);
        } else {
            valueOf2 = new String(valueOf);
        }
        valueOf2 = ikp.m22192c(valueOf2);
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

    private static String m22192c(String str) {
        String str2;
        String str3;
        String valueOf;
        Throwable th;
        String str4 = null;
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(str));
            try {
                str4 = bufferedReader.readLine();
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    itx.m23277a(5, "vclib", "Could not close file reader.");
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
                    itx.m23277a(3, str2, valueOf);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                            itx.m23277a(5, "vclib", "Could not close file reader.");
                        }
                    }
                    return str4;
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e4) {
                            itx.m23277a(5, "vclib", "Could not close file reader.");
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
            itx.m23277a(3, str2, valueOf);
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

    static int m22191b(String str) {
        int i = 0;
        String c = ikp.m22192c(str);
        try {
            i = Integer.parseInt(c);
        } catch (NumberFormatException e) {
            new Object[1][i] = c;
        }
        return i;
    }

    ikr m22198f() {
        int nextInt;
        Throwable th;
        int i = -1;
        String c = ikp.m22192c("/proc/stat");
        if (c == null) {
            return new ikr(this, i, i);
        }
        Scanner scanner;
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
                        itx.m23277a(5, "vclib", "Could not parse /proc/stat");
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
                itx.m23277a(5, "vclib", "Could not parse /proc/stat");
                if (scanner != null) {
                    scanner.close();
                }
                return new ikr(this, nextInt, i);
            }
        } catch (Exception e3) {
            scanner = null;
            nextInt = i;
            itx.m23277a(5, "vclib", "Could not parse /proc/stat");
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
