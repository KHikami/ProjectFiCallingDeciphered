package defpackage;

import android.database.Cursor;
import com.google.android.apps.hangouts.views.MessageListItemWrapperView;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

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

    public void a(Cursor cursor) {
        if (bns.j) {
            Object obj;
            if (cursor == null) {
                obj = "null";
            } else {
                obj = Integer.valueOf(cursor.getCount());
            }
            String valueOf = String.valueOf(obj);
            new StringBuilder(String.valueOf(valueOf).length() + 32).append("[MessageListState] setNewCursor ").append(valueOf);
        }
        synchronized (this) {
            Collection linkedList = new LinkedList();
            if (cursor != null && cursor.moveToLast()) {
                int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
                int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("timestamp");
                if (!this.d && !this.e && !this.g) {
                    do {
                        long j = cursor.getLong(columnIndexOrThrow2);
                        long j2 = cursor.getLong(columnIndexOrThrow);
                        if (this.b.contains(Long.valueOf(j2)) || j <= this.f) {
                            break;
                        }
                        linkedList.add(0, Long.valueOf(j2));
                    } while (cursor.moveToPrevious());
                }
                cursor.moveToLast();
                a(cursor.getLong(columnIndexOrThrow2));
                if (this.d || this.e || this.g) {
                    this.c = Long.valueOf(cursor.getLong(columnIndexOrThrow));
                }
            }
            this.a.addAll(linkedList);
            this.b.addAll(linkedList);
            if (bns.j) {
                valueOf = String.valueOf(this.a);
                new StringBuilder(String.valueOf(valueOf).length() + 26).append("[MessageListState] newIds ").append(valueOf);
            }
            this.d = false;
        }
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
