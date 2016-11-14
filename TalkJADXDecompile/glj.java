import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.text.format.DateUtils;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

// handles/calculates system time?
public final class glj {
    private static long a;
    private static long b;
    private static long c;
    private static long d;

    static {
        a = -1;
        b = -1;
        c = -1;
        d = -1;
    }

    public static CharSequence a(Context context, long j, long j2, int i) {
        if (j <= 0 || j2 <= 0) {
            return null;
        }
        long j3 = j2 - j;
        if (j3 <= -900000) {
            glk.e("Babel", "The given start time comes after the current time", new Object[0]);
            return null;
        }
        Resources resources = context.getResources();
        long b = b(j, j2);
        Object obj = (262144 & i) != 0 ? 1 : null;
        if (j3 < 900000) {
            if (obj != null) {
                return resources.getText(gwb.wG);
            }
            return resources.getText(gwb.wH);
        } else if (30000 + j3 < 3600000) {
            r2 = (int) ((j3 + 30000) / 60000);
            if (obj != null) {
                return resources.getQuantityString(gwb.wu, r2, new Object[]{Integer.valueOf(r2)});
            }
            return resources.getQuantityString(gwb.wv, r2, new Object[]{Integer.valueOf(r2)});
        } else if (j3 < 36000000) {
            r2 = (int) ((j3 + 1800000) / 3600000);
            if (obj != null) {
                return resources.getQuantityString(gwb.ws, r2, new Object[]{Integer.valueOf(r2)});
            }
            return resources.getQuantityString(gwb.wt, r2, new Object[]{Integer.valueOf(r2)});
        } else {
            Calendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(j);
            if (b == 0) {
                if (obj != null) {
                    return resources.getText(gwb.wI);
                }
                return resources.getText(gwb.wJ);
            } else if (b == 1) {
                if (obj != null) {
                    return resources.getText(gwb.wM);
                }
                return resources.getText(gwb.wN);
            } else if (b < 7) {
                r2 = (int) b;
                if (obj != null) {
                    return resources.getQuantityString(gwb.wq, r2, new Object[]{Integer.valueOf(r2)});
                }
                return resources.getQuantityString(gwb.wr, r2, new Object[]{Integer.valueOf(r2)});
            } else {
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
                gregorianCalendar2.setTimeInMillis(j2);
                gregorianCalendar2.add(2, -1);
                if (gregorianCalendar2.compareTo(gregorianCalendar) < 0) {
                    r2 = (int) ((3 + b) / 7);
                    if (obj != null) {
                        return resources.getQuantityString(gwb.wy, r2, new Object[]{Integer.valueOf(r2)});
                    }
                    return resources.getQuantityString(gwb.wz, r2, new Object[]{Integer.valueOf(r2)});
                }
                gregorianCalendar2.setTimeInMillis(j2);
                gregorianCalendar2.add(1, -1);
                if (gregorianCalendar2.compareTo(gregorianCalendar) < 0) {
                    gregorianCalendar2.setTimeInMillis(j2);
                    r2 = (gregorianCalendar2.get(2) + (gregorianCalendar2.get(1) * 12)) - (gregorianCalendar.get(2) + (gregorianCalendar.get(1) * 12));
                    if (obj != null) {
                        return resources.getQuantityString(gwb.ww, r2, new Object[]{Integer.valueOf(r2)});
                    }
                    return resources.getQuantityString(gwb.wx, r2, new Object[]{Integer.valueOf(r2)});
                } else if (obj != null) {
                    return resources.getText(gwb.wK);
                } else {
                    return resources.getText(gwb.wL);
                }
            }
        }
    }

    public static boolean a(long j, long j2) {
        if (j <= 0 || j2 <= 0 || j2 - j <= -900000) {
            return false;
        }
        return true;
    }

    public static CharSequence a(long j, long j2, boolean z) {
        return a(j, j2, true, 0, z);
    }

    public static CharSequence b(long j, long j2, boolean z) {
        return a(j, j2, false, 0, z);
    }

    public static CharSequence a(long j) {
        return DateUtils.formatDateTime(gwb.H(), j, 21);
    }

    private static CharSequence a(long j, long j2, boolean z, int i, boolean z2) {
        long j3 = j2 - j;
        if (j3 < 60000) {
            return gwb.H().getResources().getText(gwb.wO);
        }
        if (j3 < 3600000) {
            String quantityString;
            long j4 = j3 / 60000;
            if (z2) {
                quantityString = gwb.H().getResources().getQuantityString(gwb.wo, (int) j4);
            } else {
                quantityString = gwb.H().getResources().getQuantityString(gwb.wD, (int) j4);
            }
            return String.format(quantityString, new Object[]{Long.valueOf(j4)});
        } else if (b(j, j2) == 0) {
            return DateUtils.formatDateTime(gwb.H(), j, 1);
        } else {
            Context H;
            if (j3 < 604800000) {
                H = gwb.H();
                if (z) {
                    return DateUtils.formatDateTime(H, j, ((z2 ? 0 : 32768) | 2) | 0);
                }
                return DateUtils.formatDateTime(H, j, ((z2 ? 0 : 32768) | 3) | 0);
            } else if (j3 < 31449600000L) {
                H = gwb.H();
                if (z) {
                    return DateUtils.formatDateTime(H, j, (((z2 ? 0 : 65536) | 16) | 8) | 0);
                }
                return DateUtils.formatDateTime(H, j, (((z2 ? 0 : 65536) | 17) | 8) | 0);
            } else {
                Context H2 = gwb.H();
                if (z) {
                    return DateUtils.formatDateTime(H2, j, 131092);
                }
                return DateUtils.formatDateTime(H2, j, 131093);
            }
        }
    }

    public static CharSequence b(long j) {
        int i;
        long a = a();
        long abs = Math.abs(a - j);
        Context H = gwb.H();
        if (abs < 3600000) {
            a = abs / 60000;
            i = gwb.wD;
        } else if (abs < 86400000) {
            a = abs / 3600000;
            i = gwb.wB;
        } else if (abs >= 604800000) {
            return DateUtils.formatDateRange(H, j, j, 327680);
        } else {
            a = b(j, a);
            i = gwb.wA;
        }
        return String.format(H.getResources().getQuantityString(i, (int) a), new Object[]{Long.valueOf(a)});
    }

    private static long b(long j, long j2) {
        TimeZone timeZone = TimeZone.getDefault();
        return ((((long) timeZone.getOffset(j2)) + j2) / 86400000) - ((((long) timeZone.getOffset(j)) + j) / 86400000);
    }

    public static String a(long j, boolean z, boolean z2) {
        String quantityString;
        int i = (int) (j / 60000);
        int i2 = (int) ((j / 1000) % 60);
        StringBuilder stringBuilder = new StringBuilder();
        Resources resources = gwb.H().getResources();
        if (i > 0) {
            if (z) {
                quantityString = resources.getQuantityString(gwb.wn, i, new Object[]{Integer.valueOf(i)});
            } else {
                quantityString = resources.getQuantityString(gwb.wC, i, new Object[]{Integer.valueOf(i)});
            }
            stringBuilder.append(quantityString);
        }
        if (i2 > 0 || z2) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(" ");
            }
            if (z) {
                quantityString = resources.getQuantityString(gwb.wp, i2, new Object[]{Integer.valueOf(i2)});
            } else {
                quantityString = resources.getQuantityString(gwb.wE, i2, new Object[]{Integer.valueOf(i2)});
            }
            stringBuilder.append(quantityString);
        }
        return stringBuilder.toString();
    }

    public static long a() {
        if (a < 0) {
            return System.currentTimeMillis();
        }
        return (System.currentTimeMillis() - a) + c;
    }

    public static long b() {
        if (b < 0) {
            return SystemClock.elapsedRealtime();
        }
        return (SystemClock.elapsedRealtime() - b) + d;
    }
}
