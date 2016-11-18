package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import org.xmlpull.v1.XmlPullParser;

public final class xe extends MenuInflater {
    static final Class<?>[] f35637a;
    static final Class<?>[] f35638b;
    final Object[] f35639c;
    final Object[] f35640d = this.f35639c;
    Context f35641e;
    Object f35642f;

    static {
        Class[] clsArr = new Class[]{Context.class};
        f35637a = clsArr;
        f35638b = clsArr;
    }

    public xe(Context context) {
        super(context);
        this.f35641e = context;
        this.f35639c = new Object[]{context};
    }

    public void inflate(int i, Menu menu) {
        if (menu instanceof jt) {
            XmlResourceParser xmlResourceParser = null;
            try {
                xmlResourceParser = this.f35641e.getResources().getLayout(i);
                m41287a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            } catch (Throwable e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (Throwable e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (Throwable th) {
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            }
        } else {
            super.inflate(i, menu);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m41287a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        xg xgVar = new xg(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (eventType != 2) {
            eventType = xmlPullParser.next();
            if (eventType == 1) {
                break;
            }
        }
        String name = xmlPullParser.getName();
        if (name.equals("menu")) {
            eventType = xmlPullParser.next();
            Object obj = null;
            Object obj2 = null;
            int i = eventType;
            Object obj3 = null;
            while (obj3 == null) {
                Object obj4;
                String name2;
                switch (i) {
                    case 1:
                        throw new RuntimeException("Unexpected end of document");
                    case 2:
                        if (obj2 == null) {
                            name2 = xmlPullParser.getName();
                            if (!name2.equals("group")) {
                                if (!name2.equals("item")) {
                                    if (!name2.equals("menu")) {
                                        String str = name2;
                                        i = 1;
                                        break;
                                    }
                                    m41287a(xmlPullParser, attributeSet, xgVar.m41296c());
                                    obj4 = obj2;
                                    break;
                                }
                                xgVar.m41295b(attributeSet);
                                obj4 = obj2;
                                break;
                            }
                            xgVar.m41293a(attributeSet);
                            obj4 = obj2;
                            break;
                        }
                    case 3:
                        name2 = xmlPullParser.getName();
                        if (obj2 == null || !name2.equals(r2)) {
                            if (!name2.equals("group")) {
                                if (!name2.equals("item")) {
                                    if (name2.equals("menu")) {
                                        eventType = 1;
                                        obj4 = obj2;
                                        break;
                                    }
                                } else if (!xgVar.m41297d()) {
                                    if (xgVar.f35646a != null && xgVar.f35646a.e()) {
                                        xgVar.m41296c();
                                        obj4 = obj2;
                                        break;
                                    }
                                    xgVar.m41294b();
                                    obj4 = obj2;
                                    break;
                                }
                            }
                            xgVar.m41292a();
                            obj4 = obj2;
                            break;
                        }
                        obj = null;
                        obj4 = null;
                        break;
                        break;
                    default:
                        obj4 = obj2;
                        break;
                }
                Object obj5 = obj4;
                i = xmlPullParser.next();
                obj2 = obj5;
            }
            return;
        }
        throw new RuntimeException("Expecting menu, got " + name);
    }

    Object m41288a(Object obj) {
        Object obj2 = obj;
        while (!(obj2 instanceof Activity) && (obj2 instanceof ContextWrapper)) {
            obj2 = ((ContextWrapper) obj2).getBaseContext();
        }
        return obj2;
    }
}
