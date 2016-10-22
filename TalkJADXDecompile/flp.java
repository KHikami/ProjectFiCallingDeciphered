import android.content.Context;

final class flp implements flo, ghz<fln> {
    private final Context a;
    private final gid b;
    private final ky<String, fln> c;

    flp(Context context) {
        this.c = new ky();
        this.a = context;
        this.b = (gid) jyn.a(context, gid.class);
    }

    public Class<fln> a() {
        return fln.class;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(gia<fln> r8, gib r9) {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = 0;
        r1 = r0;
    L_0x0003:
        r0 = r7.c;	 Catch:{ all -> 0x0061 }
        r0 = r0.size();	 Catch:{ all -> 0x0061 }
        if (r1 >= r0) goto L_0x005f;
    L_0x000b:
        r0 = r7.c;	 Catch:{ all -> 0x0061 }
        r0 = r0.c(r1);	 Catch:{ all -> 0x0061 }
        r0 = (fln) r0;	 Catch:{ all -> 0x0061 }
        r2 = r0.c;	 Catch:{ all -> 0x0061 }
        r2 = r2.a(r9);	 Catch:{ all -> 0x0061 }
        if (r2 == 0) goto L_0x005b;
    L_0x001b:
        r2 = r8.toString();	 Catch:{ all -> 0x0061 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0061 }
        r3 = r9.toString();	 Catch:{ all -> 0x0061 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x0061 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0061 }
        r5 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0061 }
        r5 = r5.length();	 Catch:{ all -> 0x0061 }
        r5 = r5 + 25;
        r6 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x0061 }
        r6 = r6.length();	 Catch:{ all -> 0x0061 }
        r5 = r5 + r6;
        r4.<init>(r5);	 Catch:{ all -> 0x0061 }
        r5 = "Triggering callback ";
        r4 = r4.append(r5);	 Catch:{ all -> 0x0061 }
        r2 = r4.append(r2);	 Catch:{ all -> 0x0061 }
        r4 = " for ";
        r2 = r2.append(r4);	 Catch:{ all -> 0x0061 }
        r2.append(r3);	 Catch:{ all -> 0x0061 }
        r2 = r7.b;	 Catch:{ all -> 0x0061 }
        r2.a(r0, r8);	 Catch:{ all -> 0x0061 }
    L_0x005b:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0003;
    L_0x005f:
        monitor-exit(r7);
        return;
    L_0x0061:
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: flp.a(gia, gib):void");
    }

    public synchronized void a(String str, String str2) {
        fln fln = (fln) this.c.get(str);
        if (fln != null) {
            String valueOf = String.valueOf(fln.a);
            String valueOf2 = String.valueOf(fln.b);
            glk.e("Babel_ConvIdChanged", new StringBuilder((((String.valueOf(str).length() + 31) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append("Replacing existing ID: ").append(str).append("/").append(str2).append(" with ").append(valueOf).append("/").append(valueOf2).toString(), new Object[0]);
            iil.a("Replaced existing changed conversation ID");
        }
        if (gwb.a(this.a, "babel_strict_conversation_id_change_checks", false)) {
            if (str.equals(str2)) {
                String str3 = "Babel_ConvIdChanged";
                valueOf = "Replacing ID with the same ID: ";
                valueOf2 = String.valueOf(str);
                if (valueOf2.length() != 0) {
                    valueOf2 = valueOf.concat(valueOf2);
                } else {
                    valueOf2 = new String(valueOf);
                }
                glk.e(str3, valueOf2, new Object[0]);
                iil.a("Replaced ID with the same ID");
            }
            if (!(blo.a(str) || blo.a(str2))) {
                glk.e("Babel_ConvIdChanged", new StringBuilder((String.valueOf(str).length() + 64) + String.valueOf(str2).length()).append("Neither the old nor new conversation IDs are client generated: ").append(str).append("/").append(str2).toString(), new Object[0]);
                iil.a("Neither the old nor new conversation IDs are client generated");
            }
            if (blo.a(str) && blo.a(str2)) {
                glk.e("Babel_ConvIdChanged", new StringBuilder((String.valueOf(str).length() + 61) + String.valueOf(str2).length()).append("Both the old and new conversation IDs are client generated: ").append(str).append("/").append(str2).toString(), new Object[0]);
                iil.a("Both the old and new conversation IDs are client generated");
            }
        }
        glk.a("Babel_ConvIdChanged", new StringBuilder((String.valueOf(str).length() + 18) + String.valueOf(str2).length()).append("ConvIdChanged ").append(str).append(" -> ").append(str2).toString(), new Object[0]);
        ayo fln2 = new fln(str, str2);
        this.c.put(str, fln2);
        this.b.a(fln2, fln2.c);
    }

    public synchronized String a(String str) {
        String str2;
        fln fln = (fln) this.c.get(str);
        if (fln != null) {
            str2 = fln.b;
        } else {
            str2 = null;
        }
        return str2;
    }
}
