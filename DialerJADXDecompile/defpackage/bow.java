package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: bow */
final class bow {
    int a;
    ByteArrayOutputStream b;
    private /* synthetic */ bov c;

    public bow(bov bov) {
        this.c = bov;
        this.b = new ByteArrayOutputStream();
    }

    public final boolean a(bos bos) {
        buf.A((Object) bos);
        if (this.a + 1 > bom.g()) {
            return false;
        }
        String a = this.c.a(bos, false);
        if (a == null) {
            this.c.f.a().a(bos, "Error formatting hit");
            return true;
        }
        byte[] bytes = a.getBytes();
        int length = bytes.length;
        if (length > bom.c()) {
            this.c.f.a().a(bos, "Hit size exceeds the maximum size limit");
            return true;
        }
        if (this.b.size() > 0) {
            length++;
        }
        if (this.b.size() + length > ((Integer) boq.t.a()).intValue()) {
            return false;
        }
        try {
            if (this.b.size() > 0) {
                this.b.write(bov.b);
            }
            this.b.write(bytes);
            this.a++;
            return true;
        } catch (IOException e) {
            this.c.e("Failed to write payload when batching hits", e);
            return true;
        }
    }
}
