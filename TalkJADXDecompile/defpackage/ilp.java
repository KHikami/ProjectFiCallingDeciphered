package defpackage;

import com.google.android.libraries.hangouts.video.internal.MediaSources;
import com.google.android.libraries.hangouts.video.internal.Stats;

/* renamed from: ilp */
public interface ilp {
    void a(int i, int i2, byte[] bArr);

    void a(int i, String str);

    void a(long j, int i, int i2);

    void a(long j, String str, byte[] bArr, int i);

    void a(Stats stats);

    void a(String str, int i);

    void a(String str, int i, int i2, String str2, String str3, String str4, byte[] bArr);

    void a(String str, MediaSources mediaSources);

    void a(String str, byte[] bArr);

    void a(byte[] bArr, long j);

    void a(byte[] bArr, String str);

    void b(int i);

    void b(int i, String str);

    void b(Stats stats);

    void b(String str, int i);

    void b(byte[] bArr);

    void c(int i);

    void c(int i, String str);

    void c(byte[] bArr);

    void d(int i);

    void d(boolean z);

    void d(byte[] bArr);

    void e(String str);

    void e(boolean z);

    void e(byte[] bArr);

    void f(byte[] bArr);
}
