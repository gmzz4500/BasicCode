package com.yyds.a_waitandnotify;

import java.io.Serializable;
import java.util.Objects;

public class BaoZi implements Serializable {
    private static final long serialVersionUID = -3842246046173509222L;
    //
    private String xianer;
    //包子的状态
    private boolean flag = false;

    public BaoZi() {
    }

    public BaoZi(String xianer, boolean flag) {
        this.xianer = xianer;
        this.flag = flag;
    }

    public String getXianer() {
        return xianer;
    }

    public void setXianer(String xianer) {
        this.xianer = xianer;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaoZi baoZi = (BaoZi) o;
        return flag == baoZi.flag &&
                Objects.equals(xianer, baoZi.xianer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xianer, flag);
    }

    @Override
    public String toString() {
        return "BaoZi{" +
                "xianer='" + xianer + '\'' +
                ", flag=" + flag +
                '}';
    }
}
