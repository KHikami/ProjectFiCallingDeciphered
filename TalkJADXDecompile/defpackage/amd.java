package defpackage;

import java.util.Comparator;

/* renamed from: amd */
final class amd implements Comparator<byte[]> {
    amd() {
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return ((byte[]) obj).length - ((byte[]) obj2).length;
    }
}
