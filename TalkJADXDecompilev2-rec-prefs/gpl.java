package p000;

import android.database.Cursor;
import com.google.android.apps.hangouts.views.MessageListItemWrapperView;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class gpl {
    public Queue<Long> f15864a;
    public Set<Long> f15865b;
    public Long f15866c;
    public boolean f15867d;
    public final boolean f15868e;
    public long f15869f;
    public boolean f15870g;

    public void m18271a(MessageListItemWrapperView messageListItemWrapperView) {
        Long d = m18277d();
        if (d == null || messageListItemWrapperView.m9529e() != gwb.m1523a(d)) {
            glk.m17981d("Babel", "[MessageCursorAdapter] onRevealFinished called when the new message queue was empty.", new Object[0]);
        } else {
            this.f15866c = m18275c();
        }
    }

    public gpl(boolean z) {
        this.f15868e = z;
        m18268a();
    }

    public void m18270a(Cursor cursor) {
        if (bns.f4058j) {
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
                if (!this.f15867d && !this.f15868e && !this.f15870g) {
                    do {
                        long j = cursor.getLong(columnIndexOrThrow2);
                        long j2 = cursor.getLong(columnIndexOrThrow);
                        if (this.f15865b.contains(Long.valueOf(j2)) || j <= this.f15869f) {
                            break;
                        }
                        linkedList.add(0, Long.valueOf(j2));
                    } while (cursor.moveToPrevious());
                }
                cursor.moveToLast();
                m18269a(cursor.getLong(columnIndexOrThrow2));
                if (this.f15867d || this.f15868e || this.f15870g) {
                    this.f15866c = Long.valueOf(cursor.getLong(columnIndexOrThrow));
                }
            }
            this.f15864a.addAll(linkedList);
            this.f15865b.addAll(linkedList);
            if (bns.f4058j) {
                valueOf = String.valueOf(this.f15864a);
                new StringBuilder(String.valueOf(valueOf).length() + 26).append("[MessageListState] newIds ").append(valueOf);
            }
            this.f15867d = false;
        }
    }

    public void m18268a() {
        this.f15864a = new LinkedList();
        this.f15865b = new HashSet();
        this.f15866c = null;
        this.f15867d = true;
        this.f15869f = 0;
        this.f15870g = false;
    }

    public void m18269a(long j) {
        this.f15869f = Math.max(this.f15869f, j);
    }

    public void m18273b() {
        this.f15864a = new LinkedList();
        this.f15865b = new HashSet();
        this.f15867d = true;
        this.f15870g = false;
    }

    public Long m18275c() {
        return (Long) this.f15864a.poll();
    }

    public Long m18277d() {
        return (Long) this.f15864a.peek();
    }

    public boolean m18274b(long j) {
        return this.f15864a.contains(Long.valueOf(j));
    }

    public boolean m18276c(long j) {
        return this.f15866c != null && gwb.m1523a(this.f15866c) == j;
    }

    public void m18272a(boolean z) {
        this.f15870g = z;
    }
}
