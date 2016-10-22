package defpackage;

import android.text.TextUtils;
import android.widget.SectionIndexer;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: aea */
public final class aea implements SectionIndexer {
    String[] a;
    int[] b;
    int c;

    public aea(String[] strArr, int[] iArr) {
        int i = 0;
        if (strArr == null || iArr == null) {
            throw new NullPointerException();
        } else if (strArr.length != iArr.length) {
            throw new IllegalArgumentException("The sections and counts arrays must have the same length");
        } else {
            this.a = strArr;
            this.b = new int[iArr.length];
            int i2 = 0;
            while (i < iArr.length) {
                if (TextUtils.isEmpty(this.a[i])) {
                    this.a[i] = " ";
                } else if (!this.a[i].equals(" ")) {
                    this.a[i] = this.a[i].trim();
                }
                this.b[i] = i2;
                i2 += iArr[i];
                i++;
            }
            this.c = i2;
        }
    }

    public final Object[] getSections() {
        return this.a;
    }

    public final int getPositionForSection(int i) {
        if (i < 0 || i >= this.a.length) {
            return -1;
        }
        return this.b[i];
    }

    public final int getSectionForPosition(int i) {
        if (i < 0 || i >= this.c) {
            return -1;
        }
        int binarySearch = Arrays.binarySearch(this.b, i);
        return binarySearch < 0 ? (-binarySearch) - 2 : binarySearch;
    }
}
