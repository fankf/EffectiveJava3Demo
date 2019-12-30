package cn.fankf.ej3d.cat11;

import com.sun.nio.zipfs.ZipFileSystem;
import com.sun.nio.zipfs.ZipPath;
import sun.reflect.generics.tree.Tree;

import java.lang.reflect.Array;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.time.Instant;

public class StaticMethodReplaceContructor {

    public static void main(String[] args) {

        //from 类型转换
        Instant instant = Instant.now();
        Date from = Date.from(instant);
        System.out.println(from);

        //of 组合
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(date,time);
        System.out.println(localDateTime);

        EnumSet<Num> nums = EnumSet.of(Num.ONE, Num.THREE, Num.TWO);
        System.out.println(nums.toString());

        //valueOf
        String one = String.valueOf(1);
        System.out.println(one);

        //instance getInstance
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        Instance instance = Instance.instance();
        System.out.println(instance);

        //create newInstancegit
        Object newArray = Array.newInstance(Integer.class, 12);
        System.out.println(newArray);

        //getType
        //newType
        //type
    }

    private enum Num{
        ONE,TWO,THREE;
    }
}
