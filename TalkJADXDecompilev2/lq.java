package defpackage;

import java.io.PrintWriter;

public final class lq {
    private static final Object a = new Object();
    private static char[] b = new char[24];

    private static int a(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    private static int a(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        if (!z && i <= 0) {
            return i2;
        }
        int i4;
        int i5;
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
            i5 = i;
        } else {
            i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i5 = i - (i5 * 100);
        }
        if ((z && i3 >= 2) || i5 > 9 || i2 != i4) {
            int i6 = i5 / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i5 -= i6 * 10;
        }
        cArr[i4] = (char) (i5 + 48);
        i4++;
        cArr[i4] = c;
        return i4 + 1;
    }

    private static void a(long j, PrintWriter printWriter, int i) {
        synchronized (a) {
            int i2;
            if (b.length < 0) {
                b = new char[0];
            }
            char[] cArr = b;
            if (j == 0) {
                cArr[0] = '0';
                i2 = 1;
            } else {
                char c;
                int i3;
                int i4;
                int i5;
                int i6;
                if (j > 0) {
                    c = '+';
                } else {
                    j = -j;
                    c = '-';
                }
                int i7 = (int) (j % 1000);
                int floor = (int) Math.floor((double) (j / 1000));
                int i8 = 0;
                if (floor > 86400) {
                    i8 = floor / 86400;
                    floor -= 86400 * i8;
                }
                if (floor > 3600) {
                    i3 = floor / 3600;
                    i4 = i3;
                    i3 = floor - (i3 * 3600);
                } else {
                    i4 = 0;
                    i3 = floor;
                }
                if (i3 > 60) {
                    int i9 = i3 / 60;
                    i5 = i9;
                    i6 = i3 - (i9 * 60);
                } else {
                    i5 = 0;
                    i6 = i3;
                }
                cArr[0] = c;
                int a = lq.a(cArr, i8, 'd', 1, false, 0);
                a = lq.a(cArr, i4, 'h', a, a != 1, 0);
                int a2 = lq.a(cArr, i5, 'm', a, a != 1, 0);
                i8 = lq.a(cArr, i7, 'm', lq.a(cArr, i6, 's', a2, a2 != 1, 0), true, 0);
                cArr[i8] = 's';
                i2 = i8 + 1;
            }
            printWriter.print(new String(b, 0, i2));
        }
    }

    public static void a(long j, PrintWriter printWriter) {
        lq.a(j, printWriter, 0);
    }

    public static void a(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            lq.a(j - j2, printWriter, 0);
        }
    }
}
