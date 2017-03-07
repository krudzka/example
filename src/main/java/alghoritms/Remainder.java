//package alghoritms;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by RENT on 2017-02-27.
// */
//public class Remainder {
//    public static List<Integer> remainder(int x) {
//        int nominals[] = {10, 5, 2, 1};
//        int nominalIndex = 0;
//        List<Integer> list = new ArrayList<>();
//        while (x > 0) {
//            int currentNominal = nominals[nominalIndex];
//            if (x >= currentNominal) {
//                x -= currentNominal;
//            }
//            nominalIndex++;
//        }
//        return list;
//
//
//    }
//
//    public static List<Integer> remainderRecursive(int x) {
//        if (x <= 0) {
//            return new ArrayList<>();
//        } else {
//            int nominalsr[] = {10, 5, 2, 1};
//            int nominalIndexr = 0;
//
//            for (int nominalr : nominalsr) {
//                if (nominalr <= x) {
//                    x -= nominalr;
//                    List<Integer> listr = new ArrayList<>();
//                    listr.add(x);
//                    listr.addAll(remainderRecursive(x));
//
//                }
//
//            }
//
//        }
//        return listr;
//
//    }
//}
