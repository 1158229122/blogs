package com.gtcmaile.blogs.util;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * created by jim on 19-6-11 上午9:17
 */
public class StringUtils {
    public static Pattern p = Pattern.compile("\\s*|\t|\r|\n");

    public static String concat(String ...strings){
        StringBuffer sb = new StringBuffer();
        for (String string:strings) {
            sb.append(string);
        }
        return sb.toString();
    }
    public static boolean isListNull(List list){
        return list==null||list.size()==0;
    }
    public static boolean isListNoNull(List list){
        return !isListNull(list);
    }
    public static String ignoreBlank(String s){
        Matcher m = p.matcher(s);
        return m.replaceAll("");
    }

    public static boolean isNullOrEmpty(String ...strings){
        for (String str:strings) {
            if(StringUtils.isEmpty(str)){
                return true;
            }
        }
        return false;
    }
    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    public static String takeOutHtmlTag(String source){
        return source.replaceAll("<(S*?)[^>]*>.*?|<.*? />", "");
    }
}
