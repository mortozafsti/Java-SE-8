/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Domain.DailyCollection;
import Domain.DailyCollectionReport;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class DailyCollectionReportService {

    public static List<DailyCollectionReport> dailyCollectView(List<DailyCollection> list) {

        List<DailyCollectionReport> clist = new ArrayList<>();

        for (DailyCollection dc : list) {
            DailyCollectionReport dr = new DailyCollectionReport();
            dr.setName(dc.getName());
            dr.setCode(dc.getAddMember().getMcode());

            if (dc.getDay() == 1) {
                dr.setDayAmount1(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount2(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount3(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount4(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount5(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount6(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount7(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount8(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount9(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount10(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount11(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount12(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount13(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount14(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount15(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount16(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount17(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount18(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount19(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount20(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount21(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount22(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount23(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount24(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount25(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount26(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount27(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount28(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount29(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount30(dc.getCollectionAmount());
            } else if (dc.getDay() == 1) {
                dr.setDayAmount31(dc.getCollectionAmount());
            }
            clist.add(dr);
        }

        return clist;
    }
}
