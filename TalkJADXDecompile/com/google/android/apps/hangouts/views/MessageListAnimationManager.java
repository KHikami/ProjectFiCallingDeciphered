package com.google.android.apps.hangouts.views;

import android.animation.ObjectAnimator;
import android.os.Handler;
import android.widget.AbsListView;
import bbw;
import glk;
import gpj;
import gpk;
import gpl;
import gwb;
import java.util.PriorityQueue;
import java.util.Queue;
import kae;

public final class MessageListAnimationManager {
    public static final boolean a;
    static int f;
    final Queue<AnimateInNewMessageRunnable> b;
    boolean c;
    final gpk d;
    gpl e;
    private AbsListView g;
    private Handler h;
    private MessageListItemWrapperView i;

    public class AnimateInNewMessageRunnable implements Comparable<AnimateInNewMessageRunnable>, Runnable {
        public MessageListItemWrapperView a;
        final /* synthetic */ MessageListAnimationManager b;
        private int c;
        private MessageListView d;
        private ObjectAnimator e;
        private boolean f;

        public /* synthetic */ int compareTo(Object obj) {
            return a((AnimateInNewMessageRunnable) obj);
        }

        public AnimateInNewMessageRunnable(MessageListAnimationManager messageListAnimationManager, MessageListItemWrapperView messageListItemWrapperView, AbsListView absListView) {
            this.b = messageListAnimationManager;
            this.a = messageListItemWrapperView;
            this.d = (MessageListView) absListView;
            this.f = false;
        }

        public void run() {
            this.e = ObjectAnimator.ofFloat(this, "percentage", new float[]{0.0f, 1.0f});
            this.e.setDuration((long) MessageListAnimationManager.f);
            this.e.setInterpolator(new bbw());
            this.e.addListener(new gpj(this));
            if (this.b.d != null) {
                this.b.d.a();
            }
            if (this.a.getParent() == this.d) {
                this.c = this.d.getPositionForView(this.a);
                this.e.start();
                return;
            }
            a();
        }

        public void a() {
            if (this.b.d != null) {
                this.b.d.b();
            }
            this.b.c = false;
            this.a.d();
            if (this.b.e != null) {
                this.b.e.a(this.a);
            }
            MessageListAnimationManager messageListAnimationManager = this.b;
            messageListAnimationManager.a((Runnable) messageListAnimationManager.b.poll());
        }

        public void setPercentage(float f) {
            if (!this.f) {
                if (this.a.getParent() == null) {
                    this.f = true;
                    this.e.cancel();
                }
                this.d.a(this.c, this.a.getTop() - this.a.a(f));
                this.a.requestLayout();
                if (this.f) {
                    this.a.a(1.0f);
                }
            }
        }

        public int a(AnimateInNewMessageRunnable animateInNewMessageRunnable) {
            return this.a.g() > animateInNewMessageRunnable.a.g() ? 1 : -1;
        }
    }

    static {
        kae kae = glk.u;
        a = false;
    }

    public void a(gpl gpl) {
        this.e = gpl;
    }

    public gpk a() {
        return this.d;
    }

    public void a(boolean z) {
        if (this.d != null) {
            this.d.a();
        }
        MessageListItemWrapperView.c(z);
        if (this.i != null && this.i.getParent() == this.g) {
            this.i.h();
        }
        if (this.d != null) {
            this.d.b();
        }
    }

    public MessageListAnimationManager(AbsListView absListView, gpk gpk, Handler handler) {
        this.b = new PriorityQueue();
        this.c = false;
        this.g = absListView;
        this.d = gpk;
        this.h = handler;
        f = absListView.getResources().getInteger(gwb.fC);
    }

    public void a(MessageListItemWrapperView messageListItemWrapperView) {
        this.i = messageListItemWrapperView;
    }

    public MessageListItemWrapperView b() {
        return this.i;
    }

    public void b(MessageListItemWrapperView messageListItemWrapperView) {
        if (a) {
            String valueOf = String.valueOf(messageListItemWrapperView);
            new StringBuilder(String.valueOf(valueOf).length() + 20).append("enqueueForAnimation ").append(valueOf);
        }
        Runnable animateInNewMessageRunnable = new AnimateInNewMessageRunnable(this, messageListItemWrapperView, this.g);
        if (this.c) {
            this.b.offer(animateInNewMessageRunnable);
        } else {
            a(animateInNewMessageRunnable);
        }
    }

    void a(Runnable runnable) {
        if (runnable != null) {
            this.c = true;
            this.h.post(runnable);
        }
    }
}
