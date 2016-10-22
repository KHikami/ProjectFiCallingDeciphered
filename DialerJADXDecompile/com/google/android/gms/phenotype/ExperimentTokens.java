package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import buf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import crw;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExperimentTokens implements SafeParcelable {
    public static final Creator CREATOR;
    private static final byte[][] j;
    private static final Charset k;
    final int a;
    public final String b;
    public final byte[] c;
    public final byte[][] d;
    public final byte[][] e;
    public final byte[][] f;
    public final byte[][] g;
    public final int[] h;
    public final byte[][] i;

    static {
        CREATOR = new crw();
        ExperimentTokens experimentTokens = new ExperimentTokens();
        j = new byte[0][];
        k = Charset.forName("UTF-8");
    }

    private ExperimentTokens() {
        this(Collections.EMPTY_LIST);
    }

    public ExperimentTokens(int i, String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.a = i;
        this.b = str;
        this.c = bArr;
        this.d = bArr2;
        this.e = bArr3;
        this.f = bArr4;
        this.g = bArr5;
        this.h = iArr;
        this.i = bArr6;
    }

    private ExperimentTokens(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this(1, str, null, bArr2, bArr3, bArr4, bArr5, iArr, bArr6);
    }

    private ExperimentTokens(List list) {
        this("", null, j, j, j, j, a(list), b(list));
    }

    private static List a(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        List arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List a(byte[][] bArr) {
        if (bArr == null) {
            return null;
        }
        List arrayList = new ArrayList(bArr.length);
        for (byte[] str : bArr) {
            arrayList.add(new String(str, k));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void a(StringBuilder stringBuilder, String str, int[] iArr) {
        stringBuilder.append(str);
        stringBuilder.append("=");
        if (iArr == null) {
            stringBuilder.append("null");
            return;
        }
        stringBuilder.append("(");
        int length = iArr.length;
        Object obj = 1;
        int i = 0;
        while (i < length) {
            int i2 = iArr[i];
            if (obj == null) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(i2);
            i++;
            obj = null;
        }
        stringBuilder.append(")");
    }

    private static void a(StringBuilder stringBuilder, String str, byte[][] bArr) {
        stringBuilder.append(str);
        stringBuilder.append("=");
        if (bArr == null) {
            stringBuilder.append("null");
            return;
        }
        stringBuilder.append("(");
        int length = bArr.length;
        Object obj = 1;
        int i = 0;
        while (i < length) {
            byte[] bArr2 = bArr[i];
            if (obj == null) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("'");
            stringBuilder.append(new String(bArr2, k));
            stringBuilder.append("'");
            i++;
            obj = null;
        }
        stringBuilder.append(")");
    }

    private static int[] a(List list) {
        int i = 0;
        for (ExperimentTokens experimentTokens : list) {
            int length = (experimentTokens == null || experimentTokens.h == null) ? i : i + experimentTokens.h.length;
            i = length;
        }
        int[] iArr = new int[i];
        i = 0;
        for (ExperimentTokens experimentTokens2 : list) {
            if (!(experimentTokens2 == null || experimentTokens2.h == null)) {
                int[] iArr2 = experimentTokens2.h;
                int length2 = iArr2.length;
                length = 0;
                while (length < length2) {
                    int i2 = i + 1;
                    iArr[i] = iArr2[length];
                    length++;
                    i = i2;
                }
            }
            i = i;
        }
        return iArr;
    }

    private static byte[][] b(List list) {
        int i = 0;
        int i2 = 0;
        for (ExperimentTokens experimentTokens : list) {
            int i3 = (experimentTokens == null || experimentTokens.c == null) ? i2 : i2 + 1;
            i2 = i3;
        }
        byte[][] bArr = new byte[i2][];
        for (ExperimentTokens experimentTokens2 : list) {
            if (!(experimentTokens2 == null || experimentTokens2.c == null)) {
                i2 = i + 1;
                bArr[i] = experimentTokens2.c;
                i = i2;
            }
        }
        return bArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ExperimentTokens)) {
            return false;
        }
        ExperimentTokens experimentTokens = (ExperimentTokens) obj;
        return this.a == experimentTokens.a && buf.c(this.b, experimentTokens.b) && Arrays.equals(this.c, experimentTokens.c) && buf.c(a(this.d), a(experimentTokens.d)) && buf.c(a(this.e), a(experimentTokens.e)) && buf.c(a(this.f), a(experimentTokens.f)) && buf.c(a(this.g), a(experimentTokens.g)) && buf.c(a(this.h), a(experimentTokens.h)) && buf.c(a(this.i), a(experimentTokens.i));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ExperimentTokens");
        stringBuilder.append("(");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.b == null ? "null" : "'" + this.b + "'");
        stringBuilder.append(", ");
        byte[] bArr = this.c;
        stringBuilder.append("direct");
        stringBuilder.append("=");
        if (bArr == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append("'");
            stringBuilder.append(new String(bArr, k));
            stringBuilder.append("'");
        }
        stringBuilder.append(", ");
        a(stringBuilder, "GAIA", this.d);
        stringBuilder.append(", ");
        a(stringBuilder, "PSEUDO", this.e);
        stringBuilder.append(", ");
        a(stringBuilder, "ALWAYS", this.f);
        stringBuilder.append(", ");
        a(stringBuilder, "OTHER", this.g);
        stringBuilder.append(", ");
        a(stringBuilder, "weak", this.h);
        stringBuilder.append(", ");
        a(stringBuilder, "directs", this.i);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.a(parcel, 2, this.b, false);
        buf.a(parcel, 3, this.c, false);
        buf.a(parcel, 4, this.d, false);
        buf.a(parcel, 5, this.e, false);
        buf.a(parcel, 6, this.f, false);
        buf.a(parcel, 7, this.g, false);
        buf.a(parcel, 8, this.h, false);
        buf.a(parcel, 9, this.i, false);
        buf.v(parcel, c);
    }
}
