package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import com.google.android.apps.hangouts.views.HangoutEventMessageListItemView;
import com.google.android.apps.hangouts.views.MessageListItemView;
import com.google.android.apps.hangouts.views.MessageListItemWrapperView;
import java.util.HashSet;
import java.util.Set;

final class cdq {
    private static final mjq<Class<? extends bxs>> a = mjq.a((Object) fwz.class);
    private final Context b;
    private final ListView c;
    private final int d;
    private final iih e;

    static void a(Context context) {
        mjq mjq = a;
        int size = mjq.size();
        int i = 0;
        while (i < size) {
            Object obj = mjq.get(i);
            i++;
            jyn.b(context, (Class) obj);
        }
    }

    public cdq(Context context, ListView listView, int i) {
        this.b = context;
        this.c = listView;
        this.d = i;
        this.e = (iih) jyn.a(context, iih.class);
    }

    public void a(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo, MenuInflater menuInflater, fxa fxa) {
        if (view == this.c) {
            MessageListItemWrapperView messageListItemWrapperView;
            MessageListItemView messageListItemView;
            Object obj;
            int i;
            boolean z;
            MenuItem findItem;
            MenuItem findItem2;
            boolean z2;
            MenuItem findItem3;
            MenuItem findItem4;
            CharSequence spannableString;
            Object obj2 = null;
            int i2 = 1;
            if (contextMenuInfo instanceof AdapterContextMenuInfo) {
                messageListItemWrapperView = (MessageListItemWrapperView) ((AdapterContextMenuInfo) contextMenuInfo).targetView;
                if (messageListItemWrapperView != null) {
                    if (!(messageListItemWrapperView.c() instanceof HangoutEventMessageListItemView)) {
                        if (messageListItemWrapperView.c() instanceof MessageListItemView) {
                            messageListItemView = (MessageListItemView) messageListItemWrapperView.c();
                            switch (messageListItemView.r()) {
                                case 0:
                                case 1:
                                    int i3 = 1;
                                    break;
                                default:
                                    obj = null;
                                    break;
                            }
                            if (messageListItemView.s() == 2) {
                                obj2 = 1;
                            }
                            boolean d = messageListItemView.d();
                            int q = messageListItemView.q();
                            for (fyj fyj : messageListItemView.o()) {
                                i2 = ba.b(fyj.b) & i2;
                            }
                            this.e.a(this.d).b().a(Integer.valueOf(messageListItemView.C().ordinal())).c(2936);
                            i = q;
                            z = d;
                            menuInflater.inflate(gwb.hO, contextMenu);
                            if (fxa != null) {
                                contextMenu.add(0, 1000, 0, bc.gp);
                            }
                            findItem = contextMenu.findItem(ba.bs);
                            findItem2 = contextMenu.findItem(ba.aD);
                            if (obj == null) {
                                z2 = (i == 0 && i2 == 0) ? false : true;
                                findItem.setVisible(z2);
                                findItem2.setTitle(bc.fT);
                            } else {
                                if (obj2 == null || i > 0) {
                                    findItem.setVisible(false);
                                }
                                if (z) {
                                    findItem2.setTitle(bc.fW);
                                } else {
                                    findItem2.setVisible(false);
                                }
                            }
                            if (contextMenuInfo instanceof AdapterContextMenuInfo) {
                                messageListItemWrapperView = (MessageListItemWrapperView) ((AdapterContextMenuInfo) contextMenuInfo).targetView;
                                if (messageListItemWrapperView != null && (messageListItemWrapperView.c() instanceof MessageListItemView)) {
                                    messageListItemView = (MessageListItemView) messageListItemWrapperView.c();
                                    if (TextUtils.isEmpty(messageListItemView.f())) {
                                        contextMenu.findItem(ba.as).setVisible(false);
                                    }
                                    if (messageListItemView.x()) {
                                        findItem3 = contextMenu.findItem(1000);
                                        if (findItem3 != null) {
                                            findItem3.setVisible(false);
                                        }
                                    }
                                    if (!messageListItemView.p()) {
                                        contextMenu.findItem(ba.eU).setVisible(false);
                                    }
                                    z = fdq.u.b(this.d) && messageListItemView.r() == -1;
                                    findItem4 = contextMenu.findItem(ba.az);
                                    findItem4.setVisible(z);
                                    if (z) {
                                        spannableString = new SpannableString(this.b.getResources().getString(bc.go));
                                        spannableString.setSpan(new ForegroundColorSpan(-16776961), 0, spannableString.length(), 0);
                                        findItem4.setTitle(spannableString);
                                    }
                                    a(contextMenu, messageListItemView);
                                }
                            }
                            contextMenu.setHeaderTitle(bc.fU);
                        }
                    }
                    return;
                }
            }
            i = 0;
            obj = null;
            z = false;
            menuInflater.inflate(gwb.hO, contextMenu);
            if (fxa != null) {
                contextMenu.add(0, 1000, 0, bc.gp);
            }
            findItem = contextMenu.findItem(ba.bs);
            findItem2 = contextMenu.findItem(ba.aD);
            if (obj == null) {
                findItem.setVisible(false);
                if (z) {
                    findItem2.setTitle(bc.fW);
                } else {
                    findItem2.setVisible(false);
                }
            } else {
                if (i == 0) {
                }
                findItem.setVisible(z2);
                findItem2.setTitle(bc.fT);
            }
            if (contextMenuInfo instanceof AdapterContextMenuInfo) {
                messageListItemWrapperView = (MessageListItemWrapperView) ((AdapterContextMenuInfo) contextMenuInfo).targetView;
                messageListItemView = (MessageListItemView) messageListItemWrapperView.c();
                if (TextUtils.isEmpty(messageListItemView.f())) {
                    contextMenu.findItem(ba.as).setVisible(false);
                }
                if (messageListItemView.x()) {
                    findItem3 = contextMenu.findItem(1000);
                    if (findItem3 != null) {
                        findItem3.setVisible(false);
                    }
                }
                if (messageListItemView.p()) {
                    contextMenu.findItem(ba.eU).setVisible(false);
                }
                if (!fdq.u.b(this.d)) {
                }
                findItem4 = contextMenu.findItem(ba.az);
                findItem4.setVisible(z);
                if (z) {
                    spannableString = new SpannableString(this.b.getResources().getString(bc.go));
                    spannableString.setSpan(new ForegroundColorSpan(-16776961), 0, spannableString.length(), 0);
                    findItem4.setTitle(spannableString);
                }
                a(contextMenu, messageListItemView);
            }
            contextMenu.setHeaderTitle(bc.fU);
        }
    }

    private void a(ContextMenu contextMenu, MessageListItemView messageListItemView) {
        CharSequence f = messageListItemView.f();
        if (!TextUtils.isEmpty(f)) {
            CharSequence spannableString = new SpannableString(f);
            Linkify.addLinks(spannableString, 7);
            for (String str : cdq.a((URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class))) {
                String str2;
                String substring;
                boolean z;
                Object obj;
                int indexOf = str2.indexOf(58);
                if (indexOf >= 0) {
                    String substring2 = str2.substring(0, indexOf);
                    substring = str2.substring(indexOf + 1);
                    str2 = substring2;
                } else {
                    substring = str2;
                    str2 = null;
                }
                if ("mailto".equalsIgnoreCase(str2)) {
                    z = true;
                    obj = substring;
                } else if ("tel".equalsIgnoreCase(str2)) {
                    r4 = glq.i(this.b, substring);
                    z = true;
                } else {
                    z = false;
                    r4 = substring;
                }
                if (z) {
                    contextMenu.add(0, 27, 0, this.b.getString(bc.fO, new Object[]{obj})).setIntent(gwb.A(substring)).setVisible(true);
                }
            }
        }
    }

    private static Set<String> a(URLSpan[] uRLSpanArr) {
        Set hashSet = new HashSet();
        for (URLSpan url : uRLSpanArr) {
            hashSet.add(url.getURL());
        }
        return hashSet;
    }
}
