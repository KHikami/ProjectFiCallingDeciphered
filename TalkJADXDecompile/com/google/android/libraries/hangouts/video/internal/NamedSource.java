package com.google.android.libraries.hangouts.video.internal;

import com.google.android.apps.common.proguard.UsedByNative;

@UsedByNative
public class NamedSource {
    public final String a;
    public final String b;
    public final int c;

    @UsedByNative
    public NamedSource(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public int hashCode() {
        return this.c;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof NamedSource) && ((NamedSource) obj).c == this.c;
    }

    public String toString() {
        String str = this.b;
        String str2 = this.a;
        return new StringBuilder((String.valueOf(str).length() + 15) + String.valueOf(str2).length()).append(str).append(" (").append(str2).append("/").append(this.c).append(")").toString();
    }
}
