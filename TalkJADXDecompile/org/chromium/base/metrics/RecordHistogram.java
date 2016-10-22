package org.chromium.base.metrics;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import nzf;
import org.chromium.base.annotations.JNINamespace;

@JNINamespace
public class RecordHistogram {
    private static boolean a;
    private static Map<String, Long> b;

    private static native int nativeGetHistogramValueCountForTesting(String str, int i);

    private static native void nativeInitialize();

    private static native long nativeRecordBooleanHistogram(String str, long j, boolean z);

    private static native long nativeRecordCustomCountHistogram(String str, long j, int i, int i2, int i3, int i4);

    private static native long nativeRecordCustomTimesHistogramMilliseconds(String str, long j, int i, int i2, int i3, int i4);

    private static native long nativeRecordEnumeratedHistogram(String str, long j, int i, int i2);

    private static native long nativeRecordLinearCountHistogram(String str, long j, int i, int i2, int i3, int i4);

    private static native long nativeRecordSparseHistogram(String str, long j, int i);

    static {
        a = false;
        b = Collections.synchronizedMap(new HashMap());
    }

    private static long a(String str) {
        Long l = (Long) b.get(str);
        return l == null ? 0 : l.longValue();
    }

    public static void a(String str, boolean z) {
        if (!a) {
            long a = a(str);
            long nativeRecordBooleanHistogram = nativeRecordBooleanHistogram(str, a, z);
            if (nativeRecordBooleanHistogram != a) {
                b.put(str, Long.valueOf(nativeRecordBooleanHistogram));
            }
        }
    }

    public static void a(String str, long j, TimeUnit timeUnit) {
        long toMillis = timeUnit.toMillis(j);
        long toMillis2 = TimeUnit.SECONDS.toMillis(10);
        if (!a) {
            long a = a(str);
            toMillis = nativeRecordCustomTimesHistogramMilliseconds(str, a, a(toMillis), a(1), a(toMillis2), 50);
            if (toMillis != a) {
                b.put(str, Long.valueOf(toMillis));
            }
        }
    }

    private static int a(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return nzf.UNSET_ENUM_VALUE;
        }
        return (int) j;
    }
}
