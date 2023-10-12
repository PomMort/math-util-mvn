
package com.giahuy.mathutil.core;

// class nay` se~ chua' cac' ham` static sinh ra de? lam` tool dung` chung cho
// cac noi khac
// cai gi` ma` dung` chung cho nhieu` noi, nhan info, tra? ve` info qua ham`,
// ma` ko can` luu tru~ gi` het', cai' do' nen la` STATIC
// DO` NAO` MA` LA` STATIC THI` GOI TRUC TIEP' QUA TEN CLASS
//KO BAO GIO` GOI STATIC QUA CON DUONG` NEW !!!!!!!!
public class MathUtility {
    public static final double PI=3.14;
    //C: public const double Pi = 3.14;// ko can` chu~ static ma` van~ la`
                                        // static neu' co' tu` khoa'
                                        // const C# ~ final Java
    
    //ham` tinh' n! = 1.2.3...n
    //KO CO' GIAI THUA` CUA? SO AM, N < 0 KO TINH' DC
    // NẾU N QUÁ LỚN THÌ TRÀN KIỂU LONG, LONG CHỈ CHỊU ĐC 18 SỐ 0
    // 20! VỪA ĐỦ 18 SỐ 0, DO ĐÓ: KO TÍNH GIAI THỪA TỪ 21 TRỜ ĐI
    // 0! = 1! = 1-QUY ƯỚC
    
    public static long getFactorial(int n){
        
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n, n must be between 0 to 20");
        if(n == 0 || n == 1)
            return 1;// nếu có thể kết thúc sớm, thì kết thúc ngay đi
        //sống sót đến chỗ này, sure n = 2 to 20. Vì nếu ko chết dọc đường
        // ở 2 cụm if ở trên rồi, KO CẦN ELSE NẾU TRC ĐÓ XÀI RETURN
        long result = 1; // giai thua` khoi? dau` la` 1
        //nhân dồn 2 3 4 5... n vào biến này thì thành n!
        for (int i = 2; i <= n; i++) {
             result *= i;
        }
        return result;
    
    }
}
