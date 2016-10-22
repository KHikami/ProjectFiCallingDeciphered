package defpackage;

import com.google.android.apps.hangouts.views.MessageListItemWrapperView;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/* renamed from: gpl */
public class gpl {
    public Queue<Long> a;
    public Set<Long> b;
    public Long c;
    public boolean d;
    public final boolean e;
    public long f;
    public boolean g;

    public void a(MessageListItemWrapperView messageListItemWrapperView) {
        Long d = d();
        if (d == null || messageListItemWrapperView.e() != gwb.a(d)) {
            glk.d("Babel", "[MessageCursorAdapter] onRevealFinished called when the new message queue was empty.", new Object[0]);
        } else {
            this.c = c();
        }
    }

    public gpl(boolean z) {
        this.e = z;
        a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.database.Cursor r11) {
        /*
        r10 = this;
        r0 = defpackage.bns.j;
        if (r0 == 0) goto L_0x0024;
    L_0x0004:
        if (r11 != 0) goto L_0x00c3;
    L_0x0006:
        r0 = "null";
    L_0x0008:
        r0 = java.lang.String.valueOf(r0);
        r1 = new java.lang.StringBuilder;
        r2 = java.lang.String.valueOf(r0);
        r2 = r2.length();
        r2 = r2 + 32;
        r1.<init>(r2);
        r2 = "[MessageListState] setNewCursor ";
        r1 = r1.append(r2);
        r1.append(r0);
    L_0x0024:
        monitor-enter(r10);
        r0 = new java.util.LinkedList;	 Catch:{ all -> 0x00cd }
        r0.<init>();	 Catch:{ all -> 0x00cd }
        if (r11 == 0) goto L_0x0092;
    L_0x002c:
        r1 = r11.moveToLast();	 Catch:{ all -> 0x00cd }
        if (r1 == 0) goto L_0x0092;
    L_0x0032:
        r1 = "_id";
        r1 = r11.getColumnIndexOrThrow(r1);	 Catch:{ all -> 0x00cd }
        r2 = "timestamp";
        r2 = r11.getColumnIndexOrThrow(r2);	 Catch:{ all -> 0x00cd }
        r3 = r10.d;	 Catch:{ all -> 0x00cd }
        if (r3 != 0) goto L_0x0072;
    L_0x0042:
        r3 = r10.e;	 Catch:{ all -> 0x00cd }
        if (r3 != 0) goto L_0x0072;
    L_0x0046:
        r3 = r10.g;	 Catch:{ all -> 0x00cd }
        if (r3 != 0) goto L_0x0072;
    L_0x004a:
        r4 = r11.getLong(r2);	 Catch:{ all -> 0x00cd }
        r6 = r11.getLong(r1);	 Catch:{ all -> 0x00cd }
        r3 = r10.b;	 Catch:{ all -> 0x00cd }
        r8 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x00cd }
        r3 = r3.contains(r8);	 Catch:{ all -> 0x00cd }
        if (r3 != 0) goto L_0x0072;
    L_0x005e:
        r8 = r10.f;	 Catch:{ all -> 0x00cd }
        r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r3 <= 0) goto L_0x0072;
    L_0x0064:
        r3 = 0;
        r4 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x00cd }
        r0.add(r3, r4);	 Catch:{ all -> 0x00cd }
        r3 = r11.moveToPrevious();	 Catch:{ all -> 0x00cd }
        if (r3 != 0) goto L_0x004a;
    L_0x0072:
        r11.moveToLast();	 Catch:{ all -> 0x00cd }
        r2 = r11.getLong(r2);	 Catch:{ all -> 0x00cd }
        r10.a(r2);	 Catch:{ all -> 0x00cd }
        r2 = r10.d;	 Catch:{ all -> 0x00cd }
        if (r2 != 0) goto L_0x0088;
    L_0x0080:
        r2 = r10.e;	 Catch:{ all -> 0x00cd }
        if (r2 != 0) goto L_0x0088;
    L_0x0084:
        r2 = r10.g;	 Catch:{ all -> 0x00cd }
        if (r2 == 0) goto L_0x0092;
    L_0x0088:
        r2 = r11.getLong(r1);	 Catch:{ all -> 0x00cd }
        r1 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x00cd }
        r10.c = r1;	 Catch:{ all -> 0x00cd }
    L_0x0092:
        r1 = r10.a;	 Catch:{ all -> 0x00cd }
        r1.addAll(r0);	 Catch:{ all -> 0x00cd }
        r1 = r10.b;	 Catch:{ all -> 0x00cd }
        r1.addAll(r0);	 Catch:{ all -> 0x00cd }
        r0 = defpackage.bns.j;	 Catch:{ all -> 0x00cd }
        if (r0 == 0) goto L_0x00be;
    L_0x00a0:
        r0 = r10.a;	 Catch:{ all -> 0x00cd }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x00cd }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00cd }
        r2 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x00cd }
        r2 = r2.length();	 Catch:{ all -> 0x00cd }
        r2 = r2 + 26;
        r1.<init>(r2);	 Catch:{ all -> 0x00cd }
        r2 = "[MessageListState] newIds ";
        r1 = r1.append(r2);	 Catch:{ all -> 0x00cd }
        r1.append(r0);	 Catch:{ all -> 0x00cd }
    L_0x00be:
        r0 = 0;
        r10.d = r0;	 Catch:{ all -> 0x00cd }
        monitor-exit(r10);	 Catch:{ all -> 0x00cd }
        return;
    L_0x00c3:
        r0 = r11.getCount();
        r0 = java.lang.Integer.valueOf(r0);
        goto L_0x0008;
    L_0x00cd:
        r0 = move-exception;
        monitor-exit(r10);	 Catch:{ all -> 0x00cd }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: gpl.a(android.database.Cursor):void");
    }

    public void a() {
        this.a = new LinkedList();
        this.b = new HashSet();
        this.c = null;
        this.d = true;
        this.f = 0;
        this.g = false;
    }

    public void a(long j) {
        this.f = Math.max(this.f, j);
    }

    public void b() {
        this.a = new LinkedList();
        this.b = new HashSet();
        this.d = true;
        this.g = false;
    }

    public Long c() {
        return (Long) this.a.poll();
    }

    public Long d() {
        return (Long) this.a.peek();
    }

    public boolean b(long j) {
        return this.a.contains(Long.valueOf(j));
    }

    public boolean c(long j) {
        return this.c != null && gwb.a(this.c) == j;
    }

    public void a(boolean z) {
        this.g = z;
    }
}
