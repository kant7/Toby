package com.recipes;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Coupang
 * Date: 14. 7. 26
 * Time: 오전 1:08
 * To change this template use File | Settings | File Templates.
 */
public class SequenceGenerator {
    private String prefix;
    private String suffix;
    private int initial;
    private int counter;

    //private List<Object> suffixes;

    //private Set<Object> suffixes;

    private Map<Object, Object> suffixes;

    public SequenceGenerator() {}

    public SequenceGenerator(String prefix, String suffix, int initial) {
        this.prefix = prefix;
        this.suffix = suffix;
        this.initial = initial;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    /*public void setSuffixes(List<Object> suffixes) {
        this.suffixes = suffixes;
    }*/

    /*public void setSuffixes(Set<Object> suffixes) {
        this.suffixes = suffixes;
    }*/

    public void setSuffixes(Map<Object, Object> suffixes) {
        this.suffixes = suffixes;
    }

    public synchronized String getSequence() {
        StringBuffer buffer = new StringBuffer();
        //buffer.append(prefix);
        //buffer.append(initial + counter++);
        //buffer.append(suffix);

        /*for (Object suffix : suffixes) {
            buffer.append("_");
            buffer.append(suffix);
        }*/

        for (Map.Entry entry : suffixes.entrySet()) {
            buffer.append("-");
            buffer.append(entry.getKey());
            buffer.append("@");
            buffer.append(entry.getValue());
        }
        return  buffer.toString();

    }


}
