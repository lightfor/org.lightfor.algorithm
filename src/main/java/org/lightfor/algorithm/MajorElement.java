package org.lightfor.algorithm;

/**
 * select major element (above half), assume have it
 * https://zhihu.com/question/27547892/answer/131344319
 * Created by Light on 2017/5/17.
 */
public class MajorElement {

    public static Object handle(Object[] objects){
        Object major = null;
        int count = 0;
        for(Object object:objects){
            if(major != null && major.equals(object)){
                count++;
            } else if(count == 0){
                major = object;
            } else {
                count--;
            }
        }
        return major;
    }

}
