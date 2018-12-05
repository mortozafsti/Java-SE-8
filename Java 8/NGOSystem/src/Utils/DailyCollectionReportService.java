/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Domain.DailyCollection;
import Domain.DailyCollectionReport;
import Service.DailyCollectionService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author User
 */
public class DailyCollectionReportService {

    public static List<DailyCollectionReport> dailyCollectList(int month) {

        Set<DailyCollectionReport> sets = new HashSet<>();
        for (DailyCollection dcc : DailyCollectionService.getDailyCollectionByMonth(month)) {
            DailyCollectionReport dd = new DailyCollectionReport();
            dd.setCode(dcc.getAddMember().getMcode());
            sets.add(dd);
        }

        List<DailyCollectionReport> clist = new ArrayList<>();

      
        
        for (DailyCollectionReport dcr : sets) {
      
            DailyCollectionReport dr = new DailyCollectionReport();

            for (DailyCollection dc : DailyCollectionService.getDailyCollectionByMonthAndMCode(month, dcr.getCode())) {

                dr.setName(dc.getName());
                dr.setCode(dc.getAddMember().getMcode());

                if (dc.getDay() == 1) {
                    dr.setDayAmount1(dc.getCollectionAmount());
                } else if (dc.getDay() == 2) {
                    dr.setDayAmount2(dc.getCollectionAmount());
                } else if (dc.getDay() == 3) {
                    dr.setDayAmount3(dc.getCollectionAmount());
                } else if (dc.getDay() == 4) {
                    dr.setDayAmount4(dc.getCollectionAmount());
                } else if (dc.getDay() == 5) {
                    dr.setDayAmount5(dc.getCollectionAmount());
                } else if (dc.getDay() == 6) {
                    dr.setDayAmount6(dc.getCollectionAmount());
                } else if (dc.getDay() == 7) {
                    dr.setDayAmount7(dc.getCollectionAmount());
                } else if (dc.getDay() == 8) {
                    dr.setDayAmount8(dc.getCollectionAmount());
                } else if (dc.getDay() == 9) {
                    dr.setDayAmount9(dc.getCollectionAmount());
                } else if (dc.getDay() == 10) {
                    dr.setDayAmount10(dc.getCollectionAmount());
                } else if (dc.getDay() == 11) {
                    dr.setDayAmount11(dc.getCollectionAmount());
                } else if (dc.getDay() == 12) {
                    dr.setDayAmount12(dc.getCollectionAmount());
                } else if (dc.getDay() == 13) {
                    dr.setDayAmount13(dc.getCollectionAmount());
                } else if (dc.getDay() == 14) {
                    dr.setDayAmount14(dc.getCollectionAmount());
                } else if (dc.getDay() == 15) {
                    dr.setDayAmount15(dc.getCollectionAmount());
                } else if (dc.getDay() == 16) {
                    dr.setDayAmount16(dc.getCollectionAmount());
                } else if (dc.getDay() == 17) {
                    dr.setDayAmount17(dc.getCollectionAmount());
                } else if (dc.getDay() == 18) {
                    dr.setDayAmount18(dc.getCollectionAmount());
                } else if (dc.getDay() == 19) {
                    dr.setDayAmount19(dc.getCollectionAmount());
                } else if (dc.getDay() == 20) {
                    dr.setDayAmount20(dc.getCollectionAmount());
                } else if (dc.getDay() == 21) {
                    dr.setDayAmount21(dc.getCollectionAmount());
                } else if (dc.getDay() == 22) {
                    dr.setDayAmount22(dc.getCollectionAmount());
                } else if (dc.getDay() == 23) {
                    dr.setDayAmount23(dc.getCollectionAmount());
                } else if (dc.getDay() == 24) {
                    dr.setDayAmount24(dc.getCollectionAmount());
                } else if (dc.getDay() == 25) {
                    dr.setDayAmount25(dc.getCollectionAmount());
                } else if (dc.getDay() == 26) {
                    dr.setDayAmount26(dc.getCollectionAmount());
                } else if (dc.getDay() == 27) {
                    dr.setDayAmount27(dc.getCollectionAmount());
                } else if (dc.getDay() == 28) {
                    dr.setDayAmount28(dc.getCollectionAmount());
                } else if (dc.getDay() == 29) {
                    dr.setDayAmount29(dc.getCollectionAmount());
                } else if (dc.getDay() == 30) {
                    dr.setDayAmount30(dc.getCollectionAmount());
                } else if (dc.getDay() == 31) {
                    dr.setDayAmount31(dc.getCollectionAmount());
                }

            }

            clist.add(dr);

        }

        return clist;
    }

    public static List<DailyCollectionReport> dailyCollectForSinglememberView(List<DailyCollection> list) {

        List<DailyCollectionReport> clist = new ArrayList<>();
        DailyCollectionReport dr = new DailyCollectionReport();
        for (DailyCollection dc : list) {

            dr.setName(dc.getName());
            dr.setCode(dc.getAddMember().getMcode());

            if (dc.getDay() == 1) {
                dr.setDayAmount1(dc.getCollectionAmount());
            } else if (dc.getDay() == 2) {
                dr.setDayAmount2(dc.getCollectionAmount());
            } else if (dc.getDay() == 3) {
                dr.setDayAmount3(dc.getCollectionAmount());
            } else if (dc.getDay() == 4) {
                dr.setDayAmount4(dc.getCollectionAmount());
            } else if (dc.getDay() == 5) {
                dr.setDayAmount5(dc.getCollectionAmount());
            } else if (dc.getDay() == 6) {
                dr.setDayAmount6(dc.getCollectionAmount());
            } else if (dc.getDay() == 7) {
                dr.setDayAmount7(dc.getCollectionAmount());
            } else if (dc.getDay() == 8) {
                dr.setDayAmount8(dc.getCollectionAmount());
            } else if (dc.getDay() == 9) {
                dr.setDayAmount9(dc.getCollectionAmount());
            } else if (dc.getDay() == 10) {
                dr.setDayAmount10(dc.getCollectionAmount());
            } else if (dc.getDay() == 11) {
                dr.setDayAmount11(dc.getCollectionAmount());
            } else if (dc.getDay() == 12) {
                dr.setDayAmount12(dc.getCollectionAmount());
            } else if (dc.getDay() == 13) {
                dr.setDayAmount13(dc.getCollectionAmount());
            } else if (dc.getDay() == 14) {
                dr.setDayAmount14(dc.getCollectionAmount());
            } else if (dc.getDay() == 15) {
                dr.setDayAmount15(dc.getCollectionAmount());
            } else if (dc.getDay() == 16) {
                dr.setDayAmount16(dc.getCollectionAmount());
            } else if (dc.getDay() == 17) {
                dr.setDayAmount17(dc.getCollectionAmount());
            } else if (dc.getDay() == 18) {
                dr.setDayAmount18(dc.getCollectionAmount());
            } else if (dc.getDay() == 19) {
                dr.setDayAmount19(dc.getCollectionAmount());
            } else if (dc.getDay() == 20) {
                dr.setDayAmount20(dc.getCollectionAmount());
            } else if (dc.getDay() == 21) {
                dr.setDayAmount21(dc.getCollectionAmount());
            } else if (dc.getDay() == 22) {
                dr.setDayAmount22(dc.getCollectionAmount());
            } else if (dc.getDay() == 23) {
                dr.setDayAmount23(dc.getCollectionAmount());
            } else if (dc.getDay() == 24) {
                dr.setDayAmount24(dc.getCollectionAmount());
            } else if (dc.getDay() == 25) {
                dr.setDayAmount25(dc.getCollectionAmount());
            } else if (dc.getDay() == 26) {
                dr.setDayAmount26(dc.getCollectionAmount());
            } else if (dc.getDay() == 27) {
                dr.setDayAmount27(dc.getCollectionAmount());
            } else if (dc.getDay() == 28) {
                dr.setDayAmount28(dc.getCollectionAmount());
            } else if (dc.getDay() == 29) {
                dr.setDayAmount29(dc.getCollectionAmount());
            } else if (dc.getDay() == 30) {
                dr.setDayAmount30(dc.getCollectionAmount());
            } else if (dc.getDay() == 31) {
                dr.setDayAmount31(dc.getCollectionAmount());
            }

        }
        clist.add(dr);

        return clist;
    }
}
