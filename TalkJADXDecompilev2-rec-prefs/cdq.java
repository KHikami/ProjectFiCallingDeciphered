package p000;

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
    private static final mjq<Class<? extends bxs>> f5086a = mjq.m32313a((Object) fwz.class);
    private final Context f5087b;
    private final ListView f5088c;
    private final int f5089d;
    private final iih f5090e;

    static void m7289a(Context context) {
        mjq mjq = f5086a;
        int size = mjq.size();
        int i = 0;
        while (i < size) {
            Object obj = mjq.get(i);
            i++;
            jyn.m25433b(context, (Class) obj);
        }
    }

    public cdq(Context context, ListView listView, int i) {
        this.f5087b = context;
        this.f5088c = listView;
        this.f5089d = i;
        this.f5090e = (iih) jyn.m25426a(context, iih.class);
    }

    public void m7291a(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo, MenuInflater menuInflater, fxa fxa) {
        if (view == this.f5088c) {
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
                    if (!(messageListItemWrapperView.m9526c() instanceof HangoutEventMessageListItemView)) {
                        if (messageListItemWrapperView.m9526c() instanceof MessageListItemView) {
                            messageListItemView = (MessageListItemView) messageListItemWrapperView.m9526c();
                            switch (messageListItemView.m9496r()) {
                                case 0:
                                case 1:
                                    int i3 = 1;
                                    break;
                                default:
                                    obj = null;
                                    break;
                            }
                            if (messageListItemView.m9497s() == 2) {
                                obj2 = 1;
                            }
                            boolean d = messageListItemView.m9482d();
                            int q = messageListItemView.m9495q();
                            for (fyj fyj : messageListItemView.m9493o()) {
                                i2 = ba.m4613b(fyj.f14387b) & i2;
                            }
                            this.f5090e.mo1979a(this.f5089d).mo1693b().mo1698a(Integer.valueOf(messageListItemView.m9465C().ordinal())).mo1714c(2936);
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
                                if (messageListItemWrapperView != null && (messageListItemWrapperView.m9526c() instanceof MessageListItemView)) {
                                    messageListItemView = (MessageListItemView) messageListItemWrapperView.m9526c();
                                    if (TextUtils.isEmpty(messageListItemView.m9484f())) {
                                        contextMenu.findItem(ba.as).setVisible(false);
                                    }
                                    if (messageListItemView.m9502x()) {
                                        findItem3 = contextMenu.findItem(1000);
                                        if (findItem3 != null) {
                                            findItem3.setVisible(false);
                                        }
                                    }
                                    if (!messageListItemView.m9494p()) {
                                        contextMenu.findItem(ba.eU).setVisible(false);
                                    }
                                    z = fdq.f12805u.m14370b(this.f5089d) && messageListItemView.m9496r() == -1;
                                    findItem4 = contextMenu.findItem(ba.az);
                                    findItem4.setVisible(z);
                                    if (z) {
                                        spannableString = new SpannableString(this.f5087b.getResources().getString(bc.go));
                                        spannableString.setSpan(new ForegroundColorSpan(-16776961), 0, spannableString.length(), 0);
                                        findItem4.setTitle(spannableString);
                                    }
                                    m7290a(contextMenu, messageListItemView);
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
                messageListItemView = (MessageListItemView) messageListItemWrapperView.m9526c();
                if (TextUtils.isEmpty(messageListItemView.m9484f())) {
                    contextMenu.findItem(ba.as).setVisible(false);
                }
                if (messageListItemView.m9502x()) {
                    findItem3 = contextMenu.findItem(1000);
                    if (findItem3 != null) {
                        findItem3.setVisible(false);
                    }
                }
                if (messageListItemView.m9494p()) {
                    contextMenu.findItem(ba.eU).setVisible(false);
                }
                if (!fdq.f12805u.m14370b(this.f5089d)) {
                }
                findItem4 = contextMenu.findItem(ba.az);
                findItem4.setVisible(z);
                if (z) {
                    spannableString = new SpannableString(this.f5087b.getResources().getString(bc.go));
                    spannableString.setSpan(new ForegroundColorSpan(-16776961), 0, spannableString.length(), 0);
                    findItem4.setTitle(spannableString);
                }
                m7290a(contextMenu, messageListItemView);
            }
            contextMenu.setHeaderTitle(bc.fU);
        }
    }

    private void m7290a(ContextMenu contextMenu, MessageListItemView messageListItemView) {
        CharSequence f = messageListItemView.m9484f();
        if (!TextUtils.isEmpty(f)) {
            CharSequence spannableString = new SpannableString(f);
            Linkify.addLinks(spannableString, 7);
            for (String str : cdq.m7288a((URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class))) {
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
                    r4 = glq.m18038i(this.f5087b, substring);
                    z = true;
                } else {
                    z = false;
                    r4 = substring;
                }
                if (z) {
                    contextMenu.add(0, 27, 0, this.f5087b.getString(bc.fO, new Object[]{obj})).setIntent(gwb.m1362A(substring)).setVisible(true);
                }
            }
        }
    }

    private static Set<String> m7288a(URLSpan[] uRLSpanArr) {
        Set hashSet = new HashSet();
        for (URLSpan url : uRLSpanArr) {
            hashSet.add(url.getURL());
        }
        return hashSet;
    }
}
