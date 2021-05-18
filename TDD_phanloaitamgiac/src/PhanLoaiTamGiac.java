public class PhanLoaiTamGiac {

    public static String phanLoai(double a, double b, double c){
          if ( a==b && b==c){
              return "tam giác đều";
          }
          if ( (a==b  && b!=c) || (b==c && a!=b)){
              return "tam giác cân";
          }
          if ( a!=b && b!=c && a+b>c && a+c>b && b+c>a){
              return "tam giác thường";
          }
          return "không phải là tam giác";
    }
}
