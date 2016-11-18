package p000;

import com.google.api.client.util.GenericData;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;

public final class kfm {
    public static final Boolean f21570a = new Boolean(true);
    public static final String f21571b = new String();
    public static final Character f21572c = new Character('\u0000');
    public static final Byte f21573d = new Byte((byte) 0);
    public static final Short f21574e = new Short((short) 0);
    public static final Integer f21575f = new Integer(0);
    public static final Float f21576g = new Float(0.0f);
    public static final Long f21577h = new Long(0);
    public static final Double f21578i = new Double(0.0d);
    public static final BigInteger f21579j = new BigInteger("0");
    public static final BigDecimal f21580k = new BigDecimal("0");
    public static final kfr f21581l = new kfr(0);
    private static final ConcurrentHashMap<Class<?>, Object> f21582m;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f21582m = concurrentHashMap;
        concurrentHashMap.put(Boolean.class, f21570a);
        f21582m.put(String.class, f21571b);
        f21582m.put(Character.class, f21572c);
        f21582m.put(Byte.class, f21573d);
        f21582m.put(Short.class, f21574e);
        f21582m.put(Integer.class, f21575f);
        f21582m.put(Float.class, f21576g);
        f21582m.put(Long.class, f21577h);
        f21582m.put(Double.class, f21578i);
        f21582m.put(BigInteger.class, f21579j);
        f21582m.put(BigDecimal.class, f21580k);
        f21582m.put(kfr.class, f21581l);
    }

    public static <T> T m25718a(Class<?> cls) {
        int i = 0;
        T t = f21582m.get(cls);
        if (t == null) {
            synchronized (f21582m) {
                t = f21582m.get(cls);
                if (t == null) {
                    if (cls.isArray()) {
                        Class cls2 = cls;
                        do {
                            cls2 = cls2.getComponentType();
                            i++;
                        } while (cls2.isArray());
                        t = Array.newInstance(cls2, new int[i]);
                    } else if (cls.isEnum()) {
                        Object a = kfi.m25710a((Class) cls).m25712a(null);
                        bc.m4801a(a, "enum missing constant with @NullValue annotation: %s", cls);
                        t = a.m25758f();
                    } else {
                        t = gwb.m1991b((Class) cls);
                    }
                    f21582m.put(cls, t);
                }
            }
        }
        return t;
    }

    public static boolean m25722a(Object obj) {
        return obj != null && obj == f21582m.get(obj.getClass());
    }

    public static Map<String, Object> m25726b(Object obj) {
        if (obj == null || kfm.m25722a(obj)) {
            return Collections.emptyMap();
        }
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return new kfn(obj, false);
    }

    public static <T> T m25727c(T t) {
        if (t == null || kfm.m25723a(t.getClass())) {
            return t;
        }
        if (t instanceof GenericData) {
            return ((GenericData) t).clone();
        }
        Object newInstance;
        Class cls = t.getClass();
        if (cls.isArray()) {
            newInstance = Array.newInstance(cls.getComponentType(), Array.getLength(t));
        } else if (t instanceof kex) {
            newInstance = ((kex) t).m25699a();
        } else if ("java.util.Arrays$ArrayList".equals(cls.getName())) {
            newInstance = ((List) t).toArray();
            kfm.m25721a(newInstance, newInstance);
            return Arrays.asList(newInstance);
        } else {
            newInstance = gwb.m1991b(cls);
        }
        kfm.m25721a((Object) t, newInstance);
        return newInstance;
    }

    public static void m25721a(Object obj, Object obj2) {
        boolean z = true;
        int i = 0;
        Class cls = obj.getClass();
        bc.m4814a(cls == obj2.getClass());
        int i2;
        Object a;
        if (cls.isArray()) {
            if (Array.getLength(obj) != Array.getLength(obj2)) {
                z = false;
            }
            bc.m4814a(z);
            for (Object a2 : gwb.m1423M(obj)) {
                i2 = i + 1;
                Array.set(obj2, i, kfm.m25727c(a2));
                i = i2;
            }
        } else if (Collection.class.isAssignableFrom(cls)) {
            Collection<Object> collection = (Collection) obj;
            if (ArrayList.class.isAssignableFrom(cls)) {
                ((ArrayList) obj2).ensureCapacity(collection.size());
            }
            Collection collection2 = (Collection) obj2;
            for (Object c : collection) {
                collection2.add(kfm.m25727c(c));
            }
        } else {
            boolean isAssignableFrom = GenericData.class.isAssignableFrom(cls);
            if (isAssignableFrom || !Map.class.isAssignableFrom(cls)) {
                kfi a3 = isAssignableFrom ? ((GenericData) obj).classInfo : kfi.m25710a(cls);
                for (String a4 : a3.f21565b) {
                    kfu a5 = a3.m25712a(a4);
                    if (!(a5.m25756d() || (isAssignableFrom && a5.m25757e()))) {
                        a2 = a5.m25751a(obj);
                        if (a2 != null) {
                            a5.m25753a(obj2, kfm.m25727c(a2));
                        }
                    }
                }
            } else if (kex.class.isAssignableFrom(cls)) {
                kex kex = (kex) obj2;
                kex kex2 = (kex) obj;
                i2 = kex2.size();
                while (i < i2) {
                    kex.m25698a(i, kfm.m25727c(kex2.m25697a(i)));
                    i++;
                }
            } else {
                Map map = (Map) obj2;
                for (Entry entry : ((Map) obj).entrySet()) {
                    map.put((String) entry.getKey(), kfm.m25727c(entry.getValue()));
                }
            }
        }
    }

    public static boolean m25723a(Type type) {
        Type a;
        if (type instanceof WildcardType) {
            a = gwb.m1681a((WildcardType) type);
        } else {
            a = type;
        }
        if (!(a instanceof Class)) {
            return false;
        }
        Class cls = (Class) a;
        return cls.isPrimitive() || cls == Character.class || cls == String.class || cls == Integer.class || cls == Long.class || cls == Short.class || cls == Byte.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == kfr.class || cls == Boolean.class;
    }

    public static boolean m25728d(Object obj) {
        return obj == null || kfm.m25723a(obj.getClass());
    }

    public static Object m25719a(Type type, String str) {
        Class cls = type instanceof Class ? (Class) type : null;
        if (type == null || cls != null) {
            if (cls == Void.class) {
                return null;
            }
            if (str == null || cls == null || cls.isAssignableFrom(String.class)) {
                return str;
            }
            String valueOf;
            if (cls == Character.class || cls == Character.TYPE) {
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                valueOf = String.valueOf(cls);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 37).append("expected type Character/char but got ").append(valueOf).toString());
            } else if (cls == Boolean.class || cls == Boolean.TYPE) {
                return Boolean.valueOf(str);
            } else {
                if (cls == Byte.class || cls == Byte.TYPE) {
                    return Byte.valueOf(str);
                }
                if (cls == Short.class || cls == Short.TYPE) {
                    return Short.valueOf(str);
                }
                if (cls == Integer.class || cls == Integer.TYPE) {
                    return Integer.valueOf(str);
                }
                if (cls == Long.class || cls == Long.TYPE) {
                    return Long.valueOf(str);
                }
                if (cls == Float.class || cls == Float.TYPE) {
                    return Float.valueOf(str);
                }
                if (cls == Double.class || cls == Double.TYPE) {
                    return Double.valueOf(str);
                }
                if (cls == kfr.class) {
                    Matcher matcher = kfr.f21597b.matcher(str);
                    String str2;
                    if (matcher.matches()) {
                        int parseInt = Integer.parseInt(matcher.group(1));
                        int parseInt2 = Integer.parseInt(matcher.group(2)) - 1;
                        int parseInt3 = Integer.parseInt(matcher.group(3));
                        Object obj = matcher.group(4) != null ? 1 : null;
                        String group = matcher.group(9);
                        Object obj2 = group != null ? 1 : null;
                        int i = 0;
                        int i2 = 0;
                        int i3 = 0;
                        if (obj2 == null || obj != null) {
                            int parseInt4;
                            Calendar gregorianCalendar;
                            long timeInMillis;
                            Integer num;
                            boolean z;
                            if (obj != null) {
                                i = Integer.parseInt(matcher.group(5));
                                i2 = Integer.parseInt(matcher.group(6));
                                i3 = Integer.parseInt(matcher.group(7));
                                if (matcher.group(8) != null) {
                                    parseInt4 = (int) (((double) ((float) Integer.parseInt(matcher.group(8).substring(1)))) / Math.pow(10.0d, (double) (matcher.group(8).substring(1).length() - 3)));
                                    gregorianCalendar = new GregorianCalendar(kfr.f21596a);
                                    gregorianCalendar.set(parseInt, parseInt2, parseInt3, i, i2, i3);
                                    gregorianCalendar.set(14, parseInt4);
                                    timeInMillis = gregorianCalendar.getTimeInMillis();
                                    if (obj != null || obj2 == null) {
                                        num = null;
                                    } else {
                                        int i4;
                                        if (Character.toUpperCase(group.charAt(0)) == 'Z') {
                                            i4 = 0;
                                        } else {
                                            i4 = (Integer.parseInt(matcher.group(11)) * 60) + Integer.parseInt(matcher.group(12));
                                            if (matcher.group(10).charAt(0) == '-') {
                                                i4 = -i4;
                                            }
                                            timeInMillis -= ((long) i4) * 60000;
                                        }
                                        num = Integer.valueOf(i4);
                                    }
                                    if (obj != null) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    return new kfr(z, timeInMillis, num);
                                }
                            }
                            parseInt4 = 0;
                            gregorianCalendar = new GregorianCalendar(kfr.f21596a);
                            gregorianCalendar.set(parseInt, parseInt2, parseInt3, i, i2, i3);
                            gregorianCalendar.set(14, parseInt4);
                            timeInMillis = gregorianCalendar.getTimeInMillis();
                            if (obj != null) {
                            }
                            num = null;
                            if (obj != null) {
                                z = false;
                            } else {
                                z = true;
                            }
                            return new kfr(z, timeInMillis, num);
                        }
                        str2 = "Invalid date/time format, cannot specify time zone shift without specifying time: ";
                        valueOf = String.valueOf(str);
                        if (valueOf.length() != 0) {
                            valueOf = str2.concat(valueOf);
                        } else {
                            valueOf = new String(str2);
                        }
                        throw new NumberFormatException(valueOf);
                    }
                    str2 = "Invalid date/time format: ";
                    valueOf = String.valueOf(str);
                    throw new NumberFormatException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                } else if (cls == BigInteger.class) {
                    return new BigInteger(str);
                } else {
                    if (cls == BigDecimal.class) {
                        return new BigDecimal(str);
                    }
                    if (cls.isEnum()) {
                        return kfi.m25710a(cls).m25712a(str).m25758f();
                    }
                }
            }
        }
        String valueOf2 = String.valueOf(type);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf2).length() + 35).append("expected primitive class, but got: ").append(valueOf2).toString());
    }

    public static Collection<Object> m25724b(Type type) {
        Type a;
        Object rawType;
        if (type instanceof WildcardType) {
            a = gwb.m1681a((WildcardType) type);
        } else {
            a = type;
        }
        if (a instanceof ParameterizedType) {
            rawType = ((ParameterizedType) a).getRawType();
        } else {
            Type type2 = a;
        }
        Class cls = rawType instanceof Class ? (Class) rawType : null;
        if (rawType == null || (rawType instanceof GenericArrayType) || (cls != null && (cls.isArray() || cls.isAssignableFrom(ArrayList.class)))) {
            return new ArrayList();
        }
        if (cls == null) {
            String valueOf = String.valueOf(rawType);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 39).append("unable to create new instance of type: ").append(valueOf).toString());
        } else if (cls.isAssignableFrom(HashSet.class)) {
            return new HashSet();
        } else {
            if (cls.isAssignableFrom(TreeSet.class)) {
                return new TreeSet();
            }
            return (Collection) gwb.m1991b(cls);
        }
    }

    public static Map<String, Object> m25725b(Class<?> cls) {
        if (cls == null || cls.isAssignableFrom(kex.class)) {
            return new kex();
        }
        if (cls.isAssignableFrom(TreeMap.class)) {
            return new TreeMap();
        }
        return (Map) gwb.m1991b((Class) cls);
    }

    public static Type m25720a(List<Type> list, Type type) {
        Type a;
        if (type instanceof WildcardType) {
            a = gwb.m1681a((WildcardType) type);
        } else {
            a = type;
        }
        while (a instanceof TypeVariable) {
            Type a2 = gwb.m1682a((List) list, (TypeVariable) a);
            if (a2 == null) {
                a2 = a;
            }
            if (a2 instanceof TypeVariable) {
                a = ((TypeVariable) a2).getBounds()[0];
            } else {
                a = a2;
            }
        }
        return a;
    }
}
